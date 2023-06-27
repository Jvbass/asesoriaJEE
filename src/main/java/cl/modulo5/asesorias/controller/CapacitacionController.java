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
		System.out.println(capacitacion+ "desde capacitacion controller");
		return CapacitacionService.saveCapacitacion(capacitacion);
	}

	@Override
	public void deleteCapacitacion(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Capacitacion updateCapacitacion(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capacitacion findByIdCapacitacion(int id) {
		// TODO Auto-generated method stub
		return null;
	}	
}