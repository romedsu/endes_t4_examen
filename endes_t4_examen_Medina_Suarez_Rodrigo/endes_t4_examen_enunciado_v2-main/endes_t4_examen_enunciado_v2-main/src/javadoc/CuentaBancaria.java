package javadoc;


/**
 * Clase Cuenta Bancaria que representa un cuenta bancaria de un cliente<br/>
 * @author Rodrigo Medina Suárez<br/>
 *  @version 1.0 | 12/03/2024<br/>
 */
public class CuentaBancaria {

    /**
     * Numero de Cuenta<br/>
     * Atributo del la clase Cuenta Bancaria que representa mediante String el numero de la cuenta del cliente<br/>
     */
    private String numeroCuenta;

    /**
     * Saldo de la Cuenta<br/>
     * Atributo del la clase Cuenta Bancaria que representa mediante un decimal el saldo de la cuenta del cliente<br/>
     */
    private double saldo;

    /**
     * Propietario de la Cuenta<br/>
     * Atributo del la clase Cuenta Bancaria que representa el propietario de la cuenta bancaria<br/>
     */
    private Cliente propietario;


    /**
     * Constructor de la Clase Cuenta Bancaria<br/>
     * Crea una instancia de la clase Cuenta Bancaria con todos los atributos necesarios<br/>
     * @param numeroCuenta Numero de Cuenta<br/>
     * @param saldo Saldo de la Cuenta<br/>
     * @param propietario Propietario de la Cuenta<br/>
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }


    /**
     * Método getter del Numero de Cuenta del cliente<br/>
     * Método que devuelve un String con el Numero de Cuenta del cliente<br/>
     * @return Numero de Cuenta, tipo String<br/>
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    /**
     * Método setter del Numero de cuenta del cliente<br/>
     * Método que establece el Numero de cuenta del cliente<br/>
     * @param numeroCuenta Numero de Cuenta del cliente, tipo String<br/>
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Método getter del Saldo de la Cuenta Bancaria del cliente<br/>
     * Método que devuelve un String con el saldo la Cuenta Bancaria del cliente<br/>
     * @return Saldo de la Cuenta Bancaria del cliente, tipo double<br/>
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     * Método setter del Saldo de la Cuenta Bancaria del cliente<br/>
     * Método que establece el saldo la Cuenta Bancaria del cliente<br/>
     * @param saldo Saldo de la Cuenta Bancaria del cliente, tipo double<br/>
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter del propietario de la Cuenta Bancaria<br/>
     * Método que devuelve el propietario de la Cuenta Bancaria<br/>
     * @return propietario de la  Cuenta Bancaria<br/>
     */
    public Cliente getPropietario() {
        return propietario;
    }


    /**
     * Método setter del propietario de la  Cuenta Bancaria<br/>
     * Método que establece el propietario de la  Cuenta Bancaria<br/>
     * @param propietario propietario de la  Cuenta Bancaria<br/>
     */

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Método para añadir un depósito a la cuenta<br/>
     * Metodo que suma el depostio al saldo total<br/>
     * @param cantidad cantidad a añadir al saldo, tipo double<br/>
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Método para retirar una cantidad a la cuenta<br/>
     * Metodo para aceptar si es posible  la retirada al saldo total<br/>
     * @param cantidad cantidad a retirar al saldo, tipo double<br/>
     * @return booleano si es posible o no. si el saldo es mayor que la cantidad a retirar<br/>
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }


    /**
     * Método toString con info de la Cuenta Bancaria<br/>
     * Método que devuelve toda la información detallada existente de la Cuenta BAncaria<br/>
     * @return numeroCuenta,saldo,propietario<br/>
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}
