import java.util.Date;

public class Pedidos {

    //Atributos

    private int idPedidos;

    private Date fecha;

    private double total;

    private String estado;

    private String registro;

    private String productovendido;

    private String pedidosentregados;

    //Métodos

    public void Solicitar(){
        this.estado = "Solicitado";

        System.out.println("El pedido a sido solicitado");
    }

    public void cancelarPedido(){
        System.out.println("Ingresar la fecha del pedido" + " " + fecha);
    }

    public double calcularTotal(){
        System.out.println("Calcular el total de los pedidos" + " " + total); 

        return this.total;
    }

    public void cambiarEstado(){
        this.estado = "Procesado";
 
        System.out.println("Cambiar el estado del pedido" + " " + estado);
    }

    //Geter y Setter
    
    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getProductovendido() {
        return productovendido;
    }

    public void setProductovendido(String productovendido) {
        this.productovendido = productovendido;
    }

    public String getPedidosentregados() {
        return pedidosentregados;
    }

    public void setPedidosentregados(String pedidosentregados) {
        this.pedidosentregados = pedidosentregados;
    }

    //Constructor
    public Pedidos(int idPedidos, Date fecha, double total, String estado, String registro, String productovendido, String pedidosentregados) {
        this.idPedidos = idPedidos;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.registro = registro;
        this.productovendido = productovendido;
        this.pedidosentregados = pedidosentregados;
    }
}
