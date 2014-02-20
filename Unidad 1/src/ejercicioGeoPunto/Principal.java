package ejercicioGeoPunto;

class Principal {
    public static void main(String[] main) {
        GeoPunto p1;
        GeoPunto p2;
        p1 = new GeoPunto(1.5, 3.0);
        p2 = new GeoPunto(2.2, 2.4);
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        System.out.println("Distancia: " + p1.distancia(p2));
    }
}
