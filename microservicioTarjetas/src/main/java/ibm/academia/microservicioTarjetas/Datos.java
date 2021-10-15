package ibm.academia.microservicioTarjetas;

public class Datos {
    private String pasion;
    private int edad;
    private double salario;

    public int getEdad() {
        return edad;
    }
    public String getPasion() {
        return pasion;
    }
    public double getSalario() {
        return salario;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPasion(String pasion) {
        this.pasion = pasion;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
