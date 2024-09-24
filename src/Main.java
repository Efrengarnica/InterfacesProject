
public class Main {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("T", 87, 121, 110);
		imprimirCalculo(t1);
		imprimirCalculo(t);
		Cuadrado cuadrado= new Cuadrado("Cuadrado", 10);
		Rectangulo rectangulo=new Rectangulo("Rectangulo", 10, 5);
		Rombo rombo= new Rombo("Rombo", 6, 5, 8);
		Romboide romboide=new Romboide("Romboide", 10, 5);
		Trapecio trapecio=new Trapecio("Trapecio", 2,3,4,5,8,12,6);
				
		imprimirCalculo(cuadrado);
		imprimirCalculo(rectangulo);
		imprimirCalculo(rombo);
		imprimirCalculo(romboide);
		imprimirCalculo(trapecio);
		
	}//main
	
	public static void imprimirCalculo(FigurasGeometricas t) {
		System.out.println(t);
		System.out.println("+------------------------------------");
		System.out.println("El área de [" + t.getNombre()
				+ "] es: " + t.calcularArea());
		System.out.println("El perímetro de [" + t.getNombre()
				+ "] es: " + t.calcularPerimetro());
		System.out.println("+------------------------------------");
	}//imprimirCalculo
}// class Main
