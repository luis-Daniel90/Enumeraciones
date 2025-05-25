package com.logica.main;
import com.logica.enumeraciones.*;

/*
 * EJERCICIO:
 * Empleando tu lenguaje, explora la definición del tipo de dato
 * que sirva para definir enumeraciones (Enum).
 * Crea un Enum que represente los días de la semana del lunes
 * al domingo, en ese orden. Con ese enumerado, crea una operación
 * que muestre el nombre del día de la semana dependiendo del número entero
 * utilizado (del 1 al 7).
 */


public final class Main {
    private Main() {
       
        
    }

    
    public static void main(String[] args) {
        Dia hoy = Dia.MIERCOLES;

        hoy.diaSemana(1);

        /*************** DIFICULTAD EXTRA (opcional): *******************************/
        /*
         * Crea un pequeño sistema de gestión del estado de pedidos.
         * Implementa una clase que defina un pedido con las siguientes características:
         * - El pedido tiene un identificador y un estado.
         * - El estado es un Enum con estos valores: PENDIENTE, ENVIADO, ENTREGADO y
         * CANCELADO.
         * - Implementa las funciones que sirvan para modificar el estado:
         * - Pedido enviado
         * - Pedido cancelado
         * - Pedido entregado
         * (Establece una lógica, por ejemplo, no se puede entregar si no se ha enviado,
         * etc...)
         * - Implementa una función para mostrar un texto descriptivo según el estado
         * actual.
         * - Crea diferentes pedidos y muestra cómo se interactúa con ellos.
         */
        Pedido orden = new Pedido(1);
        orden.mostrarInfo();
        orden.Enviado();        
        orden.Entregado();        
        orden.Cancelado();
        
}
}
