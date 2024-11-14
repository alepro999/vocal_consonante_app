import  java.util.Scanner;

/*

    @Autor: Carlos Palomar y Alejandra Sanchez

*/

public class VocalConsonante {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String opcion;
        String palabra;
        char ch;
        int vocal, consonante;
        
        do {            
            
            System.out.println("Que quieres saber: v o c");
            opcion = in.nextLine();
            System.out.println("dime tu palabra");
            palabra = in.nextLine();
            vocal = 0;
            consonante = 0;
            
            switch (opcion) {
                
                case "v":
                    
                    for (int i = 0; i < palabra.length(); i++) {

                        ch = palabra.charAt(i);

                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){

                            vocal ++;

                        } else { 

                            consonante ++;

                        }

                    }
                    
                    System.out.println("En la palabra " + palabra + " hay " + vocal + " vocales");
                    
                    break;
                
                case "c":
                    
                    for (int i = 0; i < palabra.length(); i++) {

                        ch = palabra.charAt(i);

                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){

                            vocal ++;

                        } else { 

                            consonante ++;

                        }

                    }
                    
                    System.out.println("En la palabra " + palabra + " hay " + consonante + " consonantes");
                    
                    break;
                
                default:
                    throw new AssertionError();
            
            }
            
            System.out.println("Para salir preciona q, para continuar preciona cualquier letra");
            
            opcion = in.nextLine();
            
        } while (!opcion.contains("q"));
        
    }
            
    
}
