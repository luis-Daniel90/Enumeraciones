package com.logica.enumeraciones;

 public enum Pedidos {   

    PENDIENTE("El pedido está en espera"),
    ENVIADO("El pedido ha sido enviado"),
    CANCELADO("El pedido ha sido cancelado"),
    ENTREGADO("El pedido ha sido entregado");

    private final String descripcion; // Campo para almacenar la descripción    

    // Constructor
    Pedidos(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }

    




}


