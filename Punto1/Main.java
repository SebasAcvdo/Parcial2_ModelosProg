package Punto1;

public class Main {
    public static void main(String[] args) {

        //acá se implementa el factory y se prueba(punto1)

        Reporte reportePDF = ReportesFactory.crearReporte("pdf");
        System.out.println(reportePDF.generacionContenido());

        Reporte reporteExcel = ReportesFactory.crearReporte("excel");
        System.out.println(reporteExcel.generacionContenido());

        Reporte reporteHtml = ReportesFactory.crearReporte("html");
        System.out.println(reporteHtml.generacionContenido());


        //aca se usan los decoradores (punto2)
        Reporte base = ReportesFactory.crearReporte("pdf");
        Reporte decorado = 
        new PieConFechaDecorador(new MarcadeAguaDecorador(new EncabezadoDecorador(base)));


        System.out.println(decorado.generacionContenido());

        //aca se hace la implementacion de ConfiguacionSistema (punto3)
        ConfiguracionSistema config = ConfiguracionSistema.getconfiguracion();
        config.directorioSalida = "reportes";
        config.formatoPorDefecto = "pdf";

        //si esto esta false va a mostrar universidad distrital tambien
        //pero no es la implementada del patron singleton sino la que se tenia anteriormente
        config.mostrarMarcaAgua = true;

        Reporte r1 = ReportesFactory.crearReporte(null);

        Reporte decorado1 = new MarcadeAguaDecorador(r1);

        System.out.println(decorado1.generacionContenido());
    }
}
