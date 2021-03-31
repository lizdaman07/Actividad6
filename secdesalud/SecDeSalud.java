package secdesalud;
/**
 *
 * @author Liz
 */
public class SecDeSalud {
    
    public static void main(String[] args) {
        Paciente paciente = new Paciente(001, "Carrera 10 #15D-24", "Los Cerezos", "Santa Barbara", "Cirugía plástica reconstructiva", "Alejandro Ordoñez", "23/05/2020", "Laura Daniela", "Acosta Lopez", "Femenino");
        Medico medico = new Medico("Cirujano plástico", "Alejandro", "Ordoñez Garcia", "Masculino");
        CentroMedico centroMedico = new CentroMedico("Servisalud");
        paciente.mostrarDatos();
        medico.mostrarDatos();
        centroMedico.mostrarDatos();
    }
    
}
