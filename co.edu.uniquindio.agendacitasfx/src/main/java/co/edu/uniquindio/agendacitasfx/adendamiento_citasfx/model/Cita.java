package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model;


import java.time.LocalDate;



public class Cita {
    private LocalDate fecha;
    private Cliente ClienteAsociado;
    private Empleado EmpleadoAsociado;

    public Cita() {

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getClienteAsociado() {
        return ClienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        ClienteAsociado = clienteAsociado;
    }

    public Empleado getEmpleadoAsociado() {
        return EmpleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        EmpleadoAsociado = empleadoAsociado;
    }

    public Cita(LocalDate fecha, Cliente clienteAsociado, Empleado empleadoAsociado) {
        this.fecha = fecha;
        ClienteAsociado = clienteAsociado;
        EmpleadoAsociado = empleadoAsociado;
    }
}
