package com.logica.enumeraciones;

public class Pedido {
    
    Pedidos pedidos = Pedidos.PENDIENTE;
    private int id;
    private Pedidos estado;

    public Pedido(int id) {
        this.id = id;
        this.estado = pedidos;
    }

    public void Enviado() {
        if (estado == pedidos.PENDIENTE) {
            estado = pedidos.ENVIADO;
            System.out.println("El pedido: " + id + " ha sido enviado");
            mostrarInfo(); 
        } else {
            System.out.println("No se puede enviar el pedido: " + id + " " + pedidos.getDescripcion());
            mostrarInfo(); 
        }

    }

    public void Entregado() {
        if (estado == pedidos.ENVIADO) {
            estado = pedidos.ENTREGADO;
            System.out.println("El pedido: " + id + " ha sido entregado");
            mostrarInfo(); 
        } else {
            System.out.println("No se puede entregar el pedido: " + id + " " + pedidos.getDescripcion());
            mostrarInfo(); 
        }

    }

    public void Cancelado() {
        if (estado != pedidos.ENTREGADO) {
            estado = pedidos.CANCELADO;
            System.out.println(("El pedido: " + id + " ha sido cancelado"));
            mostrarInfo(); 
        } else {
            System.out.println("No se puede cancelar el pedido: " + id + " " + pedidos.getDescripcion());
            mostrarInfo(); 
        }

    }

    public void mostrarInfo() {
        System.out.println("Pedido #" + id + " - Estado: " + estado + " (" + estado.getDescripcion() + ")");
    }

}
