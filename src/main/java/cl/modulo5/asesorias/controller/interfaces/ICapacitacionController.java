package cl.modulo5.asesorias.controller.interfaces;
import java.util.List;

import cl.modulo5.asesorias.model.entity.Capacitacion;


public interface ICapacitacionController {
  //listar todas las capacitaciones
  public List<Capacitacion> findAllCapacitaciones();
  // crear capacitacion
  public Capacitacion saveCapacitacion(Capacitacion capacitacion);
  // eliminar capacitacion
  public void deleteCapacitacionById(int id);
  // actualizar capacitacion
  public Capacitacion updateCapacitacion(Capacitacion capacitacion);
 
  // buscar capacitacion
  public Capacitacion findByIdCapacitacion(int id);
  
}