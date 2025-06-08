import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.StackGen;
public class App {
    public static void main(String[] args) {
        //Ejercicio_01_sign
        //Instancia
        SignValidator ejercicio01 = new SignValidator();
        //Ejecucion
        System.out.println("--EJERCICIO 01--");
        System.out.println("Se ingreso los caracteres --> ([]){} <--");
        boolean resultado = ejercicio01.isValid("([]){}");
        System.out.print("Esto es: " + resultado);
        System.out.println();

        System.out.println("Se ingreso los caracteres --> ({)} <--");
        boolean resultado2 = ejercicio01.isValid("({)}");
        System.out.print("Esto es: " + resultado2);
        System.out.println();
        System.out.println();

        //Ejercicio_02_sorting 
        //Instancias
        StackSorter ejercicio02 = new StackSorter();
        StackGen<Integer> stackOrdenar = new StackGen<Integer>();
        //Ejecuciom
        System.out.println("--EJERCICIO 02--");
        stackOrdenar.push(2);
        stackOrdenar.push(4);
        stackOrdenar.push(1);
        stackOrdenar.push(5);
        System.out.print("Stack Desordenado: (Tope)-->" + "|");
        stackOrdenar.printStack();
        ejercicio02.sortStack(stackOrdenar);
        System.out.print("Stack Ordenado: (Tope)-->" + "|");
        stackOrdenar.printStack();
    }
}

