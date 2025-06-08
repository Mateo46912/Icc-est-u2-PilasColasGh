
# Práctica de Pilas y Colas - Versión 2.0.2

## 📌 Información General

- **Título:** Práctica Aplicacion de Pilas y Colas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Mateo Cordero
- **Fecha:**  08/06/2025
- **Profesor:** Ing. Pablo Torres
- **Versión:** 2.0.2
- **Mensaje de versión:** "Estructuras Lineales - Ejercicios"

---

## 🛠️ Descripción Técnica

## 🔍 Ejercicio 01: Validación de Signos

### 🏗️ **Clase:** `SignValidator`

### ⚙️ Algoritmo
Utiliza una estructura de pila para verificar el balanceo correcto de:
- Paréntesis: `()`
- Llaves: `{}`
- Corchetes: `[]`

### ⏱️ Complejidad
`O(n)` - Tiempo lineal

### 🧪 Casos de Prueba
```java
"{[]}{}" → true   ✅ Correctamente balanceado
"{()}"   → false  ❌ Desbalanceado
"([)]"   → false  ❌ Orden incorrecto
```
## 📦 Ejercicio 02: Ordenamiento de Pila

### 🏗️ **Clase:** `StackSorter`

### ⚙️ Algoritmo
Ordena una pila usando únicamente estructuras de pila adicionales, cumpliendo con:
- Principio LIFO (Last-In-First-Out)
- Solo operaciones push/pop/peek/isEmpty

### ⏱️ Complejidad
`O(n²)` - **Tiempo cuadrático**  

### ⚠️ Restricción
```diff
- No se permiten arrays, listas u otras estructuras de datos
+ Solo se pueden usar Stacks auxiliares  
```
### 🔄 Ejemplo de Operación

```diff
Input (tope):  [5] → [1] → [4] → [2]
Output (tope): [1] → [2] → [4] → [5]
```

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
--EJERCICIO 01--
Se ingreso los caracteres --> ([]){} <--
Esto es: true

Se ingreso los caracteres --> ({)} <--
Esto es: false

--EJERCICIO 02--
Stack Desordenado: (Tope)-->|5|1|4|2|
Stack Ordenado: (Tope)-->|1|2|4|5|