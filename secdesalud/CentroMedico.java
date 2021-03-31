package secdesalud;
/**
 *
 * @author Liz
 */
public class CentroMedico implements Interface {
    private String centroMedico;
    
    public CentroMedico(String centroMedico){
        this.centroMedico = centroMedico;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\nInformación centro de servicio."+
                "\nNombre del centro de servicio: "+centroMedico);
    }
    
}
