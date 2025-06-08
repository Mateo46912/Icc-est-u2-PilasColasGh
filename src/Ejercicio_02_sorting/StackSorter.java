package Ejercicio_02_sorting;

import Materia.StackGen;

public class StackSorter {

    public void sortStack(StackGen<Integer> stackOrdenar) {
        StackGen<Integer> stackTemp = new StackGen<>();

        while (!stackOrdenar.isEmpty()) {
            int tmp = stackOrdenar.pop();

            while (!stackTemp.isEmpty() && stackTemp.peek() > tmp) {
                int ordenado = stackTemp.pop();
                stackOrdenar.push(ordenado);
            }

            stackTemp.push(tmp);                    //Agregar siempre que no se cumpla el segundo while
        }
        while (!stackTemp.isEmpty())
            stackOrdenar.push(stackTemp.pop());     //Retornamos los valores del stack temporal al stack que queremos ordenar
    }

}
