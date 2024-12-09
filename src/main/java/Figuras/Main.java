package Figuras;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4,5,3);
        Triangulo triangulo = new Triangulo(5,3);
        Circulo circulo = new Circulo(3);


        System.out.println("El area del rectangulo es");
        System.out.println(rectangulo.calcularArea());

        System.out.println("El perimetro del rectangulo es");
        System.out.println(rectangulo.calcularPerimetro());

        //triangulo
        System.out.println("El area del triangulo es");
        System.out.println(triangulo.calcularArea());

        System.out.println("El perimetro del triangulo es");
        System.out.println(triangulo.calcularPerimetro());
        //circulo
        System.out.println("El area del circulo es");
        System.out.println(circulo.calcularArea());

        System.out.println("El perimetro del triangulo es");
        System.out.println(circulo.calcularPerimetro());



    }
}
