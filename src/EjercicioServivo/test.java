package EjercicioServivo;

public class test {
    public static void main(String[] args) {
        Servivo s1 = new Servivo(3);
        Servivo s2 = new Servivo(7);

        Humano h1 = new Humano(34, "paco");
        Humano h2 = new Humano(7, "pepe");

        System.out.println(s1.mayor(s2));
        System.out.println(h1.mayor(h2));
    }
}
