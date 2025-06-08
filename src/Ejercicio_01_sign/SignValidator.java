package Ejercicio_01_sign;

import Materia.StackGen;

public class SignValidator {

    public boolean isValid(String caracterEnv) {
        StackGen<Character> pilaCaracteres = new StackGen<Character>();
        char top = '\0';

        for (int i = 0; i < caracterEnv.length(); i++) {
            char simbolo = caracterEnv.charAt(i);

            if (simbolo == '(') {
                pilaCaracteres.push(simbolo);

            } else if (simbolo == '[') {
                pilaCaracteres.push(simbolo);

            } else if (simbolo == '{') {
                pilaCaracteres.push(simbolo);
            }

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
