package Punto1;

public class ReportePDF implements Reporte {
    @Override
    public String generacionContenido() {
        return "Contenido generado del reporte en formato PDF :D";
    }
    
}
