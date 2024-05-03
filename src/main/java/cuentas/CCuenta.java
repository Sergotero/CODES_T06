package cuentas;

/**
 * @author Sergio Otero
 * @version 2
 */

public class CCuenta {
    
    /**
     * Estos son los atributos de la clase:
     * nombre: es un String que almacena el nombre de la cuenta.
     * cuenta: es un String que almacena el número de la cuenta.
     * saldo: es un double que almacena el saldo de la cuenta.
     * tipoInterés: es un double que almacena el tipo de interés de la cuenta.
     */
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor que inicializa los atributos a cero y a null.
     */
    
    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa los atributos con los valores de los siguientes parámetros:
     * @param nom String con el nombre del titular de la cuenta.
     * @param cue String con el número de la cuenta.
     * @param sal double con el saldo de la cuenta.
     * @param tipo double con el tipo de interés de la cuenta de la cuenta. Por defecto se inicializa en 0.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que permite conocer el estado de la cuenta.
     * @return devuelve un double que se corresponde con el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que permite ingresar dinero en la cuenta.
     * @param cantidad es un double con el valor a ingresar.
     * @throws Exception es lanzada cuando el valor a ingresar es inferior a cero.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que permite retirar dinero de la cuenta.
     * @param cantidad es un double con el valor a retirar.
     * @throws Exception  es lanzada cuando el valor a retirar es negativo o cuando el montante es superior al saldo de la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    /**
     * Getter 
     * @return devuelve un String con el nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre asigna un valor de tipo String a nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     * @return devuelve un String con el número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter
     * @param cuenta asigna un valor de tipo String a cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter
     * @return devuelve un double con el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter
     * @param saldo asigna un valor de tipo double a saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter
     * @return devuelve un double con el tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter
     * @param tipoInterés asigna un valor de tipo double a tipoInterés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
