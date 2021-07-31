package reporting;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Report {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(20000);
        //donde va agenerar file.json
        String ruta= new File(".").getAbsolutePath().replace(".","")+"build\\reports\\cucumber\\";
        File reportFolder = new File(ruta+"MovileRerport");

        List<String> jsonList = new ArrayList<>();
        jsonList.add(ruta+"report.json");

        //configuraciones
        Configuration configuration = new Configuration(reportFolder,"Modulo Reporte");
        configuration.setBuildNumber("000001");
        configuration.addClassifications("Owner","UCB");
        configuration.addClassifications("Branch","Master");
        configuration.addClassifications("OS","Windows10");
        configuration.addClassifications("Suite","Appium");



        //Crearion reporte
        ReportBuilder reportBuilder = new ReportBuilder(jsonList,configuration);
        reportBuilder.generateReports();

    }
}
