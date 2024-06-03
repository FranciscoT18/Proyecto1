public class Clientes {

    //Atributos

    private int idClientes;

    private String nombre;

    private String direccion;

    private String telefono;

    private String correo;

    private int edad;

    private int ordendelpedido;  

    //Métodos

    public void agregarPedido(){
        System.out.println("Se ha agregado el pedido");
    }

    public void elimiarPedido(){
        System.out.println("Se ha elimino el pedido");
    }

    public void actualizarDatos(){
        System.out.println("Actualizar el pedido");
    }

    public void verHistorial(){
        System.out.println("Ver el historial del pedido");
    }

    //Getter y Setter

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo; 
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getOrdendelpedido() {
        return ordendelpedido;
    }

    public void setOrdendelpedido(int ordendelpedido) {
        this.ordendelpedido = ordendelpedido;
    }

    //Constructor

    public Clientes(int idClientes, String nombre, String direccion, String telefono, String correo, int edad,int ordendelpedido) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.ordendelpedido = ordendelpedido;
    }
}
