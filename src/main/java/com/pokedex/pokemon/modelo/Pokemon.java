package com.pokedex.pokemon.modelo;


import javax.persistence.*;


@Entity
@Table(name = "datos_pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nombre;
    private String tipo;
    private int peso;
    private int altura;
    private String descripcion;
    private int vida;
    private int ataque;
    private int defensa;
    private int especial;
    private int velocidad;
    private String nombremovimiento;
    private String descripcionmovimiento;
    private int precisionmovimiento;
    private int carga;
    private String nombreevolucion;
    private String descripciomevolucion;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, String tipo, int peso, int altura, String descripcion, int vida, int ataque, int defensa, int especial, int velocidad, String nombre_movimiento, String descripcion_movimiento, int precision_movimiento, int carga, String nombre_evolucion, String descripciom_evolucion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.descripcion = descripcion;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.especial = especial;
        this.velocidad = velocidad;
        this.nombremovimiento = nombre_movimiento;
        this.descripcionmovimiento = descripcion_movimiento;
        this.precisionmovimiento = precision_movimiento;
        this.carga = carga;
        this.nombreevolucion = nombre_evolucion;
        this.descripciomevolucion = descripciom_evolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre_movimiento() {
        return nombremovimiento;
    }

    public void setNombre_movimiento(String nombre_movimiento) {
        this.nombremovimiento = nombre_movimiento;
    }

    public String getDescripcion_movimiento() {
        return descripcionmovimiento;
    }

    public void setDescripcion_movimiento(String descripcion_movimiento) {
        this.descripcionmovimiento = descripcion_movimiento;
    }

    public int getPrecision_movimiento() {
        return precisionmovimiento;
    }

    public void setPrecision_movimiento(int precision_movimiento) {
        this.precisionmovimiento = precision_movimiento;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getNombre_evolucion() {
        return nombreevolucion;
    }

    public void setNombre_evolucion(String nombre_evolucion) {
        this.nombreevolucion = nombre_evolucion;
    }

    public String getDescripciom_evolucion() {
        return descripciomevolucion;
    }

    public void setDescripciom_evolucion(String descripciom_evolucion) {
        this.descripciomevolucion = descripciom_evolucion;
    }

}
