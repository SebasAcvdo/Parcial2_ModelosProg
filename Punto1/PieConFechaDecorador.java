package Punto1;

public class PieConFechaDecorador extends ReporteDecorador{
    public PieConFechaDecorador (Reporte reporte){
        super(reporte);
    }

    @Override
    public String generacionContenido(){
        return "fecha del pie: 1/12/2025" +"\n" + super.generacionContenido() ;
    }
}
