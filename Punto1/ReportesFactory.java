package Punto1;

public class ReportesFactory {
    public static Reporte crearReporte(String tipo){

        //aca se hace el acceso a la configuracion desde la fabrica (punto 3)
        ConfiguracionSistema config = ConfiguracionSistema.getconfiguracion();
        if (tipo == null) {
            tipo = config.formatoPorDefecto;
        }
        if(tipo.equals("pdf")){
            return new ReportePDF();
        }
        if(tipo.equals("html")){
            return new ReporteHtml();
        }
        if(tipo.equals("excel")){
            return new ReporteExcel();
        }
        return null;
    }
}
