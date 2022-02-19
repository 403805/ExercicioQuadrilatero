package dio.innovation.one;

public class Main {

    public static void main(String[] args) {

        //Retorno

        System.out.println("Exercico Retornos");


        double areaQuadrado  = Quadrilatero.area(3);
        System.out.println(" Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Áera do trapézio:" + areaTrapezio);

    }
}
