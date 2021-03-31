package secdesalud;
/**
 *
 * @author Liz
 */
public class Medico extends Persona implements Interface{
    private String especialidad;

    public Medico(String especialidad, String nombre, String apellido, String sexo) {
        super(nombre, apellido, sexo);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\nDatos del médico."+
                "\nNombre del médico: "+getNombre()+
                "\nApellidos del médico: "+getApellido()+
                "\nSexo: "+getSexo()+
                "\nEspecialidad: "+especialidad);
    }

}
