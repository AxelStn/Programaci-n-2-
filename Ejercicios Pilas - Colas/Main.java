public class Main {
    public static void main(String[] args) {
        PilaTDA p = new PilaTF();

        p.InicializarPila();

        p.Apilar(8);
        p.Apilar(3);
        p.Apilar(12);
        p.Desapilar();
        p.Apilar(7);
        p.Apilar(5);
        p.Desapilar();

        System.out.println(p.Tope());

        p.Desapilar();
        System.out.println(p.Tope());

        p.Apilar(15);
        System.out.println(p.Tope());

        int total = cantidadElementos(p);
        System.out.println("El largo de la pila es de: " + total);
    }

    public static int cantidadElementos(PilaTDA p) {

        PilaTDA aux = new  PilaTF();
        aux.InicializarPila();
        int cant = 0;

        // Pasamos a aux y contamos
        while (!p.PilaVacia()) {
            aux.Apilar(p.Tope());
            p.Desapilar();
            cant++;
        }

        // Restauramos p
        while (!aux.PilaVacia()) {
            p.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return cant;
    }

    public static boolean contiene(PilaTDA p, int x) {

        PilaTDA aux = new  PilaTF();
        aux.InicializarPila();
        boolean encontrado = false;

        while (!p.PilaVacia()) {

            if (p.Tope() == x) {
                encontrado = true;
            }
            aux.Apilar(p.Tope());
            p.Desapilar();
        }

        while (!aux.PilaVacia()) {
            p.Apilar(aux.Tope());
            aux.Desapilar();
        }
        return encontrado;

    }
}

interface PilaTDA {
    void InicializarPila();
    void Apilar(int x);
    void Desapilar();
    int Tope();
    boolean PilaVacia();
}

class PilaTF implements PilaTDA {
    private int[] a;
    private int cant;

    public void InicializarPila() {
        a = new int[100];
        cant = 0;
    }

    public void Apilar(int x) {
        a[cant] = x;
        cant++;
    }

    public void Desapilar() {
        cant--;
    }

    public int Tope() {
        return a[cant - 1];
    }

    public boolean PilaVacia() {
        return (cant == 0);
    }
}