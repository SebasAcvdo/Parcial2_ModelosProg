package Punto1;

public class ReporteDecorador implements Reporte {
    public Reporte reporte;

    public ReporteDecorador(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String generacionContenido() {
        return reporte.generacionContenido();
    }
    
}
