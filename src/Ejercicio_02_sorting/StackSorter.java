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

            stackTemp.push(tmp);
        }
        while (!stackTemp.isEmpty())
            stackOrdenar.push(stackTemp.pop());
    }

}
