package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.Utils;

import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model.Cita;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model.Cliente;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model.Empleado;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.model.Salon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class SalonUtils {
    private Salon salon;

    public static Salon inicializarDatos(){
        Salon salon = new Salon();

        salon.setNombre("Perfect Nails");

        Empleado empleado = new Empleado();
        empleado.setNombre("karen");
        empleado.setApellido("Muñoz");
        empleado.setIdEmpleado("123456");
        salon.getEmpleados().add(empleado);

        Empleado empleado1 = new Empleado();
        empleado.setNombre("Sara");
        empleado.setApellido("Macarenna");
        empleado.setIdEmpleado("123456");
        salon.getEmpleados().add(empleado);

        Cliente cliente= new Cliente();
        cliente.setNombre("xiomara");
        cliente.setCedula("12345678");
        cliente.setTelefono("31374563");
        salon.getClientes().add(cliente);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Cita cita= new Cita();
        cita.setFecha(LocalDate.parse("25/08/2024", formatter));
        cita.setClienteAsociado(cliente);
        cita.setEmpleadoAsociado(empleado);
        salon.getCitas().add(cita);

        return salon;

    }
}
