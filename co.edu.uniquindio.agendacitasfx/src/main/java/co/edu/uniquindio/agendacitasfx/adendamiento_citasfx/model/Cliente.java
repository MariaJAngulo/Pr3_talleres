package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model;



public class Cliente {
    private String nombre;
    private String cedula;
    private String telefono;
    private Cita citaAsociado;

    public Cliente(String nombre, String cedula, String telefono, Cita citaAsociado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.citaAsociado = citaAsociado;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cita getCitaAsociado() {
        return citaAsociado;
    }

    public void setCitaAsociado(Cita citaAsociado) {
        this.citaAsociado = citaAsociado;
    }
}
