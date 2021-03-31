package secdesalud;
/**
 *
 * @author Liz
 */
public class Paciente extends Persona implements Interface{
    private int codigo;
    private String direccion;
    private String residencia;
    private String lugarConsulta;
    private String motivoConsulta;
    private String medicoConsulta;
    private String fechaConsulta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getLugarConsulta() {
        return lugarConsulta;
    }

    public void setLugarConsulta(String lugarConsulta) {
        this.lugarConsulta = lugarConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMedicoConsulta() {
        return medicoConsulta;
    }

    public void setMedicoConsulta(String medicoConsulta) {
        this.medicoConsulta = medicoConsulta;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Paciente(int codigo, String direccion, String residencia, String lugarConsulta, String motivoConsulta, String medicoConsulta, String fechaConsulta, String nombre, String apellido, String sexo) {
        super(nombre, apellido, sexo);
        this.codigo = codigo;
        this.direccion = direccion;
        this.residencia = residencia;
        this.lugarConsulta = lugarConsulta;
        this.motivoConsulta = motivoConsulta;
        this.medicoConsulta = medicoConsulta;
        this.fechaConsulta = fechaConsulta;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos del paciente."+
                "\nNombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nSexo: "+getSexo()+
                "\nCódigo: "+codigo+
                "\nDirección: "+direccion+
                "\nResidencia: "+residencia+
                "\nLugar donde fue atendido: "+lugarConsulta+
                "\nMotivo de consulta: "+motivoConsulta+
                "\nMédico que atendió: "+medicoConsulta+
                "\nFecha: "+fechaConsulta);
    }
  
}
