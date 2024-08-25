package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model;



public class Empleado {
    private String nombre;
    private String apellido;
    private String idEmpleado;
    private Cita citaAsociada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Cita getCitaAsociada() {
        return citaAsociada;
    }

    public void setCitaAsociada(Cita citaAsociada) {
        this.citaAsociada = citaAsociada;
    }

    public Empleado(String nombre, String apellido, String idEmpleado, Cita citaAsociada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idEmpleado = idEmpleado;
        this.citaAsociada = citaAsociada;
    }

    public Empleado() {
    }
}
