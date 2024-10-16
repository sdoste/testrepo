// introduce la clase animal
public class Animal {
    // Atributos de la clase Animal
    private String nombre;
    private int edad;
    private String tipo;

    // Constructor de la clase Animal
    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para hacer que el animal haga un sonido
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Método para mostrar la información del animal
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tipo: " + tipo
