package EjercicioServivo;

public class Servivo {
    private int edad;

    public Servivo(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Servivo mayor(Servivo otro) {
        if (edad > otro.edad) {
            return this;
        }
        else{
            return otro;
        }
    }

    @Override
    public String toString() {
        return "Servivo{" +
                "edad=" + edad +
                '}';
    }
}
