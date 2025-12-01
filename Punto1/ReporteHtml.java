package Punto1;

public class ReporteHtml implements Reporte{
    @Override
    public String generacionContenido() {
        return "Contenido generado del reporte en formato HTML :D";
    }
}
