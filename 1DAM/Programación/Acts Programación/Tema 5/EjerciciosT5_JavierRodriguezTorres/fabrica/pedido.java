package fabrica;


public class pedido {
    private final producto producto1;
    private final producto producto2;
    private final producto producto3;
    
    pedido(){
        producto1= new producto();
        producto2= new producto();
        producto3= new producto();
    }
    
    void pedirProducto(int numero){
                switch(numero){
            case 1:
                producto1.pedirNombre();
                producto1.pedirPrecio();
                break;
            case 2:
                producto2.pedirNombre();
                producto2.pedirPrecio();
                break;
            case 3:
                producto3.pedirNombre();
                producto3.pedirPrecio();
                break;
            default:
                System.out.println("El número de pedido introducido no es válido");
                break;
        }  
    }
    
    private double total(){
        double total= producto1.getPrecio()+producto2.getPrecio()+producto3.getPrecio();
        return total;
    }
    
    void mostrarPedido(){
        producto1.resumen();
        producto2.resumen();
        producto3.resumen();
        System.out.println("TOTAL: "+total());
    }
    
    public static void main(String[]args){
        pedido pedido1 = new pedido();
        pedido1.pedirProducto(1);
        pedido1.pedirProducto(2);
        pedido1.pedirProducto(3);
        if(pedido1.producto1.iguales(pedido1.producto3)){
            System.out.println("Pedido 1 y 3 son iguales");
        }else{
            System.out.println("Pedido 1 y 3 son distintos");
        }
        pedido1.mostrarPedido();
        
    }
}
