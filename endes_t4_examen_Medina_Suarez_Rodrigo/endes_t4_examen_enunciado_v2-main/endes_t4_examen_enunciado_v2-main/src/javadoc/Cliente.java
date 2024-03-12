package javadoc;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase Cliente que representa un cliente de un banco<br/>
 * @author Rodrigo Medina Suárez<br/>
 * @version 1.0 | 12/03/2024<br/>
 */
public class Cliente {
    /**
     * Nombre del cliente<br/>
     * Atributo del la clase Cliente que representa mediante String el nombre del cliente<br/>
     */
    private String nombre;

    /**
     * Apellido del cliente<br/>
     * Atributo del la clase Cliente que representa mediante String el apellido del cliente<br/>
     */
    private String apellido;

    /**
     * ID del cliente<br/>
     * Atributo del la clase Cliente que representa mediante String el ID (identificador) del cliente<br/>
     */
    private String id;

    /**
     * Lista de Cuentas Bancarias del cliente<br/>
     */
    private List<CuentaBancaria> cuentas;


    /**
     * Constructor de la clase Cliente<br/>
     * Crea una instancia de la clase CLiente con todos los atributos necesarios<br/>
     * @param nombre Nombre del cliente, tipo String<br/>
     * @param apellido Apellido del cliente, tipo String<br/>
     * @param id ID del cliente, tipo String<br/>
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Método getter del Nombre del cliente<br/>
     * Método que devuelve un String con el Nombre del cliente<br/>
     * @return Nombre del cliente, tipo String<br/>
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter del Nombre del cliente<br/>
     * Método que establece el Nombre del cliente<br/>
     * @param nombre Nombre del cliente, tipo String<br/>
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Método getter del Apellido del cliente<br/>
     * Método que devuelve un String con el Apellido del cliente<br/>
     * @return Apellido del cliente, tipo String<br/>
     */
    public String getApellido() {
        return apellido;
    }


    /**
     * Método setter del Apellido del cliente<br/>
     * Método que establece el Apellido del cliente<br/>
     * @param apellido Apellido del cliente, tipo String<br/>
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    /**
     * Método getter del Id del cliente<br/>
     * Método que devuelve un String con el Id del cliente<br/>
     * @return Id del cliente, tipo String<br/>
     */
    public String getId() {
        return id;
    }


    /**
     * Método setter del Id del cliente<br/>
     * Método que establece el Id del cliente<br/>
     * @param id ID del cliente, tipo String<br/>
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Método getter para Cuentas<br/>
     * Método que devuelve la lista de cuentas<br/>
     * @return cuentas<br/>
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Método que agrega cuenta<br/>
     * Método que agrega una nueva cuenta a la lista de Cuentas<br/>
     * @param cuenta Cuenta Bancaria<br/>
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Método para cerrar una cuenta<br/>
     * Método que recibiendo como parámetro en número de Cuenta del cliente, borra la cuenta<br/>
     * @param numeroCuenta Numero de cuenta, tipo String<br/>
     * @return cuenta borrada<br/>
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }


    /**
     * Método toString con info del cliente<br/>
     * Método que devuelve toda la información detallada existente del CLiente<br/>
     * @return nombre,apellido,id,cuentas de cliente<br/>
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
