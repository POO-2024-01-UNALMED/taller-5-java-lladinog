package zooAnimales;



public class Main {
    public static void main(String[] args) {
       
    	Animal a1 = new Anfibio();
        new Anfibio();
        new Mamifero();
        Animal a3 = new Mamifero();
        new Mamifero();
        Animal a5=new Reptil();
        Animal a4 = new Pez();
        Animal a2 =new Ave();
        Ave a=new Ave("paloma", 5, "ciudad", "F", "gris");
        
        
        
        System.out.println(Animal.totalPorTipo());
        System.out.println("--------------------");
        System.out.println("Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println(a1.movimiento()+"saltar");
	    System.out.println(a2.movimiento()+"volar");
	    System.out.println(a3.movimiento()+"desplazarse");
	    System.out.println(a4.movimiento()+"nadar");
	    System.out.println(a5.movimiento()+"reptar");
	    System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println(a.toString());
        System.out.println("Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F");
        
    }
}
