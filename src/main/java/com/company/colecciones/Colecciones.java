/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.colecciones;

// Importa la interfaz List, que se usa para manejar listas de elementos en un orden específico.
import java.util.List;

// Importa la implementación ArrayList de List, que permite almacenar y manipular listas dinámicas.
import java.util.ArrayList;

// Importa la implementación HashMap de Map, que almacena pares de llave-valor sin un orden específico.
import java.util.HashMap;

// Importa la interfaz Set, que se usa para manejar colecciones de elementos únicos sin un orden específico.
import java.util.Set;

// Importa la implementación HashSet de Set, que almacena elementos únicos y no garantiza un orden específico.
import java.util.HashSet;

// Importa la interfaz Queue, que se usa para manejar colecciones de elementos que se procesan en orden FIFO (primero en entrar, primero en salir).
import java.util.Queue;

// Importa la implementación LinkedList de Queue, que permite usar la Queue con una estructura de lista enlazada, eficiente para añadir y eliminar elementos.
import java.util.LinkedList;

// Importa la interfaz Map, que almacena pares de llave-valor, permitiendo asociar un valor único a cada llave.
import java.util.Map;

// Importa la implementación TreeMap de Map, que almacena pares de llave-valor en un orden específico basado en las llaves.
import java.util.TreeMap;

/**
 *
 * @author andres
 */
public class Colecciones {

    public static void main(String[] args) {
        System.out.println("Inicio!");
        //List
        // Crear una lista de Strings
        List<String> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");
        lista.add("Banana"); // Elemento duplicado

        // Imprimir el segundo elemento
        System.out.println("Elemento en el índice 1: " + lista.get(1));

        // Mostrar todos los elementos de la lista
        System.out.println("Lista completa: " + lista);

        //SET SET SET SET SET SET SET SET SET SET SET SET SET SET SET 
        // Crear un Set de Strings usando HashSet
        Set<String> set = new HashSet<>();
        /*
        Aquí se crea un Set de tipo String utilizando HashSet, que es una 
        implementación común de Set que no garantiza el orden de los elementos.
         */
        // Agregar elementos al Set
        set.add("Manzana"); // Elemento 1
        set.add("Banana");  // Elemento 2
        set.add("Naranja"); // Elemento 3
        set.add("Banana");  // Elemento duplicado, no se agrega

        // Mostrar todos los elementos del Set
        System.out.println("Elementos del Set: " + set);
        //QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE 
        // Crear una Queue de Strings usando LinkedList
        Queue<String> colaClientes = new LinkedList<>();
        /*
        Aquí se crea una Queue de tipo String utilizando LinkedList, que es 
        una implementación común de Queue que sigue el orden FIFO.
        LinkedList es una colección que almacena elementos en nodos 
        conectados, permitiendo inserciones y eliminaciones rápidas.
        Se pone Queue al inicio para definir el tipo de colección (
        como una cola), y LinkedList al final para especificar cómo se 
        implementa esa colección. LinkedList permite añadir, eliminar y acceder 
        a elementos de manera eficiente.
        */
        
        /*
        colaClientes usa LinkedList para gestionar una fila de clientes. Los 
        clientes se añaden al final y se atienden desde el principio, siguiendo 
        el orden de llegada.
        */
        
        // Agregar clientes a la cola
        colaClientes.add("Cliente 1"); // Primer cliente en llegar
        colaClientes.add("Cliente 2"); // Segundo cliente en llegar
        colaClientes.add("Cliente 3"); // Tercer cliente en llegar

        // Atender al primer cliente en la fila
        System.out.println("Atendiendo: " + colaClientes.poll()); // Imprime: Cliente 1

        // Mostrar los clientes que quedan en la cola
        System.out.println("Clientes restantes en la cola: " + colaClientes);
        
        
        //MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP MAP 
         // Crear un Map de ID (Integer) a nombres (String) usando HashMap
        Map<Integer, String> empleados = new HashMap<>();
        /*
        Aquí se crea un Map que asocia enteros (Integer) a cadenas de texto (String). HashMap es una implementación que no garantiza un orden específico de los elementos.
        */

        // Agregar empleados al Map
        empleados.put(1, "Juan Pérez");   // ID 1 asociado al nombre "Juan Pérez"
        empleados.put(2, "Ana Gómez");    // ID 2 asociado al nombre "Ana Gómez"
        empleados.put(3, "Luis Martínez"); // ID 3 asociado al nombre "Luis Martínez"
        //Se añaden pares de llave-valor al Map. En este caso, cada entero representa un ID único de empleado y cada cadena representa el nombre del emplead
        
        // Obtener y mostrar el nombre del empleado con ID 2
        System.out.println("Empleado con ID 2: " + empleados.get(2)); // Imprime: Ana Gómez

        // Mostrar todos los empleados en el Map
        System.out.println("Todos los empleados: " + empleados);
        
        //TREEMAP TREEMAP TREEMAP TREEMAP TREEMAP TREEMAP TREEMAP TREEMAP 
        // Crear un TreeMap para almacenar el nombre de los empleados (llave) y sus edades (valor)
        Map<String, Integer> edadesEmpleados = new TreeMap<>();

        // Agregar empleados y sus edades al TreeMap
        edadesEmpleados.put("Juan Pérez", 30);    // Nombre "Juan Pérez" con edad 30
        edadesEmpleados.put("Ana Gómez", 25);     // Nombre "Ana Gómez" con edad 25
        edadesEmpleados.put("Luis Martínez", 35); // Nombre "Luis Martínez" con edad 35

        // Mostrar todos los empleados y sus edades en orden alfabético de los nombres
        System.out.println("Edades de los empleados en orden alfabético:");
        for (Map.Entry<String, Integer> entry : edadesEmpleados.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }
    }
}
