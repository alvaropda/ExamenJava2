package EjercicioServivo;

public class Humano extends Servivo{
    private String nombre;

    public Humano(int edad, String nombre) {
        super(edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Humano mayor(Humano humano2){
        if ( super.getEdad()> humano2.getEdad()){
            return this;
        }
        else{
            return humano2;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Nombre='" + nombre + '\'' +
                '}';
    }
}
