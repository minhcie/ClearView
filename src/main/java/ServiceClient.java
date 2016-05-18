package src.main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.AddressingFeature;

import org.apache.log4j.Logger;

public class ServiceClient {

    private static final Logger log = Logger.getLogger(ServiceClient.class.getName());

    static void usage() {
        System.err.println("");
        System.err.println("usage: java -jar ClearView.jar <data.txt>");
        System.err.println("");
        System.exit(-1);
    }

    public static void main(String[] args) {
        if (args.length == 0 || args.length < 1) {
            usage();
        }

        try {
            // Parse data file.
            String fileName = args[0];
            log.info("Parsing data file (" + fileName + ")...");
            File f = new File(fileName);
            if (!f.exists()) {
                log.error("Data file not found!");
                System.exit(-1);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            List<String> dataTypes = new ArrayList<String>();
            List<String> dataValues = new ArrayList<String>();
            Date importDate = new Date();

            Charset charset = Charset.forName("US-ASCII");
            BufferedReader reader = Files.newBufferedReader(f.toPath(), charset);
            String line = null;
            int i = 0;
            while ((line = reader.readLine()) != null && (i < 4)) {
                if (i == 0) {
                    String[] parts = line.split("\t");
                    if (parts[1] != null && parts[1].trim().length() > 0) {
                        log.info("Date: " + parts[1]);
                        Date dt = sdf.parse(parts[1]);
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(dt);
                        cal.set(Calendar.HOUR_OF_DAY, 9);
                        cal.set(Calendar.MINUTE, 0);
                        cal.set(Calendar.SECOND, 0);
                        importDate = cal.getTime();
                    }
                }
                else if (i == 2) {
                    String[] parts = line.split("\t");
                    for (int n = 0; n < parts.length; n++) {
                        String str = parts[n];
                        switch (n) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 13:
                                log.info(str);
                                dataTypes.add(str);
                                break;
                            default:
                                break;
                        }
                    }
                }
                else if (i == 3) {
                    String[] parts = line.split("\t");
                    for (int n = 0; n < parts.length; n++) {
                        String str = parts[n];
                        switch (n) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 13:
                                log.info(str);
                                dataValues.add(str);
                                break;
                            default:
                                break;
                        }
                    }
                }
                else {
                    log.info(line);
                }
                i++;
            }

            // Build custom data list.
            boolean addDayCount = false;
            sdf = new SimpleDateFormat("yyyyMMdd");
            ArrayOfCustomData arrData = new ArrayOfCustomData();
            for (i = 0; i <= dataTypes.size(); i++) {
                CustomData cd = new CustomData();
                cd.setCallDate(dateToXMLGregorianCalendar(importDate));
                cd.setDataID(Long.parseLong(sdf.format(importDate)));
                cd.setEmpGroup1ID(0);
                cd.setEmpGroup2ID(0);
                cd.setEmpGroup3ID(1);
                cd.setEmpGroup4ID(1);
                cd.setEmpGroup5ID(0);
                cd.setRecGroup1ID(0);
                cd.setRecGroup2ID(0);
                cd.setRecGroup3ID(2);
                cd.setRecGroup4ID(1);
                cd.setRecGroup5ID(0);
                cd.setDataType("WSImport"); // For production user Inbound Calls.

                if ( i < dataTypes.size()) {
                    String acdName = dataTypes.get(i);
                    float value = Float.valueOf(dataValues.get(i));
                    cd.setACDName(acdName);
                    cd.setDataCategory(acdName);
                    cd.setDataValue(value);
                    if (acdName.equalsIgnoreCase("ACD Calls") && value > 0) {
                        addDayCount = true;
                    }
                }
                else {
                    if (addDayCount) {
                        cd.setACDName("Day Count");
                        cd.setDataCategory("Day Count");
                        cd.setDataValue(1);
                    }
                }
                arrData.getCustomData().add(cd);
            }

            // Build Request/Query/Soap Client.
            log.info("Building soap request...");
            AuthHeader header = new AuthHeader();
            header.setCompanyName("211sandiego");
            header.setWebKey("3459014E-3184-4A4E-BC4C-F05BD7D43974");

            WS211SanDiego service = new WS211SanDiego();
            WS211SanDiegoSoap client = service.getWS211SanDiegoSoap();

            log.info("Establishing connection to ClearView web service...");
            boolean connected = client.testConnection(header);
            if (connected) {
                log.info("Importing custom data...");
                ArrayOfErrorNotifications arrErrors = client.importCustomData(arrData, header);
                List<ErrorNotifications> errors = arrErrors.getErrorNotifications();
                if (errors != null && errors.size() > 0) {
                    log.info("Failed to import custom data:");
                    for (i = 0; i < errors.size(); i++) {
                        ErrorNotifications err = errors.get(i);
                        log.error(err.getFailureReason() + " : " + err.getDataID());
                    }
                }
                else {
                    log.info("Custom data has been imported successfully");
                }
            }
            else {
                log.info("Failed to connect to the ClearView web service!");
            }
        }
        catch (IOException e ) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e ) {
            log.error(e.getMessage());
        }
    }

    private static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) {
        try {
            GregorianCalendar gc = (GregorianCalendar)GregorianCalendar.getInstance();
            gc.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        }
        catch (DatatypeConfigurationException e) {
            log.error(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
