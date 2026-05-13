public class Ejercicio3_Binario2 {

    public static int calcularAltura(Nodo raiz) {
        // Caso base: árbol vacío
        if (raiz == null) {
            return 0;
        }

        // Altura de subárbol izquierdo
        int alturaIzq = calcularAltura(raiz.izquierdo);

        // Altura de subárbol derecho
        int alturaDer = calcularAltura(raiz.derecho);

        // Tomamos la mayor + 1 (nodo actual)
        return 1 + Math.max(alturaIzq, alturaDer);
    }

    public static void main(String[] args) {
        //        1
        //         \
        //          2
        //         /
        //        3
        Nodo raiz = new Nodo(1);
        raiz.derecho = new Nodo(2);
        raiz.derecho.izquierdo = new Nodo(3);

        System.out.println("--- Prueba Ejercicio 3 ---");
        System.out.println("Altura esperada: 3");
        System.out.println("Altura calculada: " + calcularAltura(raiz));
        System.out.println("Altura de árbol nulo (esperado 0): " + calcularAltura(null));
    }
}