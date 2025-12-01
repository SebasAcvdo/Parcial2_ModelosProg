package Punto1;

public class EncabezadoDecorador extends ReporteDecorador {
    public EncabezadoDecorador (Reporte reporte){
        super(reporte);
    }

    @Override
    public String generacionContenido(){
        return "este es un encabezado personalizado "  + "\n" + super.generacionContenido();
    }
}

