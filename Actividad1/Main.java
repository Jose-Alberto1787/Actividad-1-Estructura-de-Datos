import  java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void menu(){
        System.out.println("1. Agregar libro al inicio");
        System.out.println("2. Agregar libro al final");
        System.out.println("3. Insertar en posición");
        System.out.println("4. Mostrar libros");
        System.out.println("5. Buscar libro");
        System.out.println("6. Consultar libro por posición");
        System.out.println("7. Eliminar libro");
        System.out.println("8. Eliminar por posición");
        System.out.println("9. Mostrar cantidad de libros");
        System.out.println("10. Salir");
        System.out.println("Escoga una opcion(Ingrese el numero)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int eleccion=0;
        String Libro;
        while(eleccion !=10){
            menu();
            eleccion= sc.nextInt();
            sc.nextLine();
            if(eleccion==1){
                System.out.println("Escriba el libro que desea agregar");
                Libro= sc.nextLine(); 
                list.insertAtBeggining(Libro);
            }
            if(eleccion==2){
                System.out.println("Escriba el libro que desea agregar");
                Libro= sc.nextLine(); 
                list.insertAtEnd(Libro);
            }
            if(eleccion==3){
                System.out.println("Escriba el libro que desea agregar");
                Libro= sc.nextLine(); 
                System.out.println("Escriba la posicion en la que desea agregarlo(solo numero)");
                int index = sc.nextInt(); 
                sc.nextLine();
                list.insertAt(index, Libro); 
            }
            if(eleccion==4){
                System.out.println("Lista de libros");
                list.display();
            }
            if(eleccion==5){
                System.out.println("Escriba el libro que desea ver");
                Libro = sc.nextLine(); 
                System.out.println(list.search(Libro));
            }
            if(eleccion==6){
                System.out.println("Escriba la posicion que desea ver");
                int index = sc.nextInt();
                sc.nextLine(); 
                System.out.println(list.get(index));
            }
            if(eleccion==7){
                System.out.println("Escriba el libro que desea eliminar");
                Libro = sc.nextLine(); 
                list.delete(Libro);
            }
            if(eleccion==8){
                System.out.println("Escriba la posicion que desea eliminar(solo numero)");
                int index = sc.nextInt();
                sc.nextLine();
                if (index<=list.size()){
                    list.deleteIndex(index);
                }
            }
            if(eleccion==9){
                System.out.println("Tamaño de lista:");
                System.out.println(list.size());
            }
            if(eleccion==10){
                System.out.println("SALIR");
            }
        }
        sc.close();
    }
}
