package cl.modulo5.asesorias.controller;

import java.util.List;

import cl.modulo5.asesorias.controller.interfaces.ICapacitacionController;
import cl.modulo5.asesorias.model.entity.Capacitacion;
import cl.modulo5.asesorias.services.CapacitacionService;

public class CapacitacionController implements ICapacitacionController {

	@Override
	public List<Capacitacion> findAllCapacitaciones() {
	    return CapacitacionService.findAllCapacitaciones();
	}

	@Override
	public Capacitacion saveCapacitacion(Capacitacion capacitacion) {
		return CapacitacionService.saveCapacitacion(capacitacion);
	}

	@Override
	public void deleteCapacitacionById(int id) {
	    boolean isDeleted = CapacitacionService.deleteCapacitacionById(id);
	    if(isDeleted) {
	        System.out.println("Capacitacion borrada");
	      } else {
	        System.out.println("Error al borrar capacitacion");
	      }
	}

	@Override
	public Capacitacion updateCapacitacion(Capacitacion capacitacion) {
	    return CapacitacionService.updateCapacitacion(capacitacion);
	}

	@Override
	public Capacitacion findByIdCapacitacion(int id) {
		return CapacitacionService.findByIdCapacitacion(id);
	}	
}
