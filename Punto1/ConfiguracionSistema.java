package Punto1;

public class ConfiguracionSistema {
    public static ConfiguracionSistema configuracion;

    public String directorioSalida;
    public String formatoPorDefecto;
    public boolean mostrarMarcaAgua;

    public ConfiguracionSistema(){}

    public static ConfiguracionSistema getconfiguracion(){
        if(configuracion == null){
            configuracion = new ConfiguracionSistema();
        }
        return configuracion;
    }
}
