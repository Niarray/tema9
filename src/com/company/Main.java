package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Nia";
        cliente.edad = 28;
        cliente.telefono = 987654234;
        cliente.credito = 200.30;
        System.out.println("nombre " + cliente.nombre + " edad " + cliente.edad + " telefono " + cliente.telefono
                + " credito " + cliente.credito);

        trabajador.nombre = "Alex";
        trabajador.edad = 44;
        trabajador.telefono = 23456789;
        trabajador.salario = 120.20;
        System.out.println("nombre " + trabajador.nombre + " edad " + trabajador.edad + " telefono " + trabajador.telefono
                + " salario " + trabajador.salario);


    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}
class Trabajador extends Persona {
    double salario;
}