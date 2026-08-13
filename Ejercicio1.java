public class Ejercicio1 {
    public static void main(String[] args) {
        Producto h1Producto = new Producto(22, "Alfajor",  0);
        h1Producto.mostrarDatos();
    }
}
class Producto{
    private double id;
    private String Nombre;
    private double precio;
    private int Stock;
    public Producto(double id, String Nombre, double precio){
        this.id = id ;
        this.Nombre = Nombre;
        this.precio = precio;
        this.Stock = 0 ;
    }
    public void mostrarDatos(){
        System.out.println("id del producto: " + id);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.Stock);
    }
}