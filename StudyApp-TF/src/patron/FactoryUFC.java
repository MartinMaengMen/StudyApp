package patron;

import objetos.CCarrera;
import objetos.CFacultad;
import objetos.CUniversidad;

public abstract class FactoryUFC {
 
	CUniversidad universidad;
	CFacultad facultad;
	CCarrera carrera;
	
	public void getUniversidad(){}
	public void getFacultad(){}
	public void getCarrera(){}
}
