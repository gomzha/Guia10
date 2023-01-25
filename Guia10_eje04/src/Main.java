/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
        geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
        dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
        dos métodos para calcular el área, el perímetro y el valor de PI como constante.
        Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
        calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
        resultado final.
        Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
        Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
*/


import Entidad.Circulo;
import Entidad.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double radio, diametro, base, altura;
        System.out.println("Ingrese el el radio del circulo");
        radio = leer.nextDouble();
        System.out.println("Ingrese el diametro del circulo");
        diametro = leer.nextDouble();

        Circulo circulo = new Circulo(radio, diametro);
        System.out.println("el resultado del area es: " + circulo.area());
        System.out.println("el resultado del perimetro es: " + circulo.perimetro());

        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.println("el resultado del area es: " + rectangulo.area());
        System.out.println("el resultado del perimetro es: " + rectangulo.perimetro());

    }
}