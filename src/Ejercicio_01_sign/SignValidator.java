package Ejercicio_01_sign;

import Materia.StackGen;

public class SignValidator {

    public boolean isValid(String caracterEnv) {
        StackGen<Character> pilaCaracteres = new StackGen<Character>();
        char top = '\0';
        //Bucle para guardar en un char cada elemento del String
        for (int i = 0; i < caracterEnv.length(); i++) {
            char simbolo = caracterEnv.charAt(i);

            //Guardar en el stack los sigos de apertura
            if (simbolo == '(') {
                pilaCaracteres.push(simbolo);

            } else if (simbolo == '[') {
                pilaCaracteres.push(simbolo);

            } else if (simbolo == '{') {
                pilaCaracteres.push(simbolo);
            }

            //Si da el simbolo de cierre y el top es el de apertura devolvemos true quiere decir que es correcto
            else if (simbolo == ')') {
                if (pilaCaracteres.isEmpty())
                    return false;
                top = pilaCaracteres.pop();
                if (top == '(')
                    return true;

            } else if (simbolo == ']') {
                if (pilaCaracteres.isEmpty())
                    return false;
                top = pilaCaracteres.pop();
                if (top == '[')
                    return true;

            } else if (simbolo == '}') {
                if (pilaCaracteres.isEmpty())
                    return false;
                top = pilaCaracteres.pop();
                if (top == '{')
                    return true;
            }
        }
        return false;
    }
}
