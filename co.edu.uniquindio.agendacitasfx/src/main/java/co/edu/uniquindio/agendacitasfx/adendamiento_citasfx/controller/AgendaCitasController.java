package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.controller;

import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.Mappings.Mapper.Dto.CitaDto;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.Mappings.Mapper.Dto.ClienteDto;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.Factory.ModelFactory;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.Services.Observer;
import co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.viewController.AgendacitasViewController;
import javafx.scene.control.DatePicker;

import java.util.List;

public class AgendaCitasController {
    static ModelFactory modelFactory;

    public AgendaCitasController() {

        modelFactory = ModelFactory.getInstance();
    }


    public boolean disponibilidadFecha(DatePicker dateInfo) {

        return modelFactory.disponibilidadFecha(dateInfo);
    }

    public void crearCita(ClienteDto clienteDto, DatePicker dateFecha) {

        modelFactory.crearCita(clienteDto, dateFecha);
    }

    public List<CitaDto> obtenerCitasDto() {
        return modelFactory.obtenerCitasDto();
    }

    public void agregarObserver(Observer agendacitasViewController) {
        modelFactory.agregarObserver(agendacitasViewController);
    }

    public void eliminarCita(String fecha) {
        modelFactory.eliminarCita(fecha);
    }
}
