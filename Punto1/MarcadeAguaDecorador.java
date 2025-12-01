package Punto1;

public class MarcadeAguaDecorador extends ReporteDecorador{
    public MarcadeAguaDecorador (Reporte reporte){
        super(reporte);
    }

    //acceso a configuracionSistema (punto3)

    ConfiguracionSistema config = ConfiguracionSistema.getconfiguracion();


    @Override
    public String generacionContenido(){

        String contenidoBase = super.generacionContenido();
        if (config.mostrarMarcaAgua){
        return "Universidad Distrital :D salido de patron singleton"  + "\n" + contenidoBase;
        }

        return "Universidad Distrital :D"  + "\n" + super.generacionContenido();
    }
}
