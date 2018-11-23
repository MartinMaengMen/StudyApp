package vista;
import java.sql.SQLException;
import java.util.Scanner;
import objetos.CEstudiante;
import DAO.EstudianteDAO;
import DAO.EstudianteDAOImpl;
import DAO.PreguntaDAO;
import fabrica_dao.FabricaDao;
public class Aplicacion {
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {

		
		//PRUEBA DE QUE CONECTA A LA BASE DE DATOS: EXITO, LISTA A LOS ESTUDIANTES
		FabricaDao fabrica = FabricaDao.getFabricaDAO(1);
		PreguntaDAO preg = fabrica.getUsuarioDAO();
		preg.listar();
		
		
		
        CEstudiante estudiante=new CEstudiante();
        System.out.println("Ingresar(1)");
		System.out.println("Registrarse(2)");
		System.out.println("Salir(3)");
		
		Scanner entrada=new Scanner(System.in);
		
		int opcion=entrada.nextInt();    
		switch(opcion){
		case 1:break;
		case 2:
                System.out.println("Ingrese su Email: ");
                String Email=entrada.next();		
                Email.toString();
                estudiante.setCorreo(Email);
                
                System.out.println("Ingrese una contraseña: ");
                String Contrasenia=entrada.next();//
                Contrasenia.toString();
                estudiante.setContrasenia(Contrasenia);
                
                
                System.out.println("Nombre: ");
                String Nombre=entrada.next();//
                Nombre.toString();
                estudiante.setNombre(Nombre);
                
                System.out.println("Apellido: ");
                String Apellido=entrada.next();//
                Apellido.toString();
                estudiante.setApellido(Apellido);
                
                System.out.println("Edad: ");
                int Edad=entrada.nextInt();
                estudiante.setEdad(Edad);
              
                System.out.println("DNI: ");
                int Codigo=entrada.nextInt();
                estudiante.setDNI(Codigo);
                
                System.out.println("Marcar el número de la sede a la que corresponde:"+
                					"\n1. San Isidro"+
                					"\n2. Monterrico"+
                					"\n3. San Miguel"+
                					"\n4. Villa");
                int Sede=entrada.nextInt();
                estudiante.setCSede(Sede);
                
                estudiante.setId(200);
                
                //-----Culmina el SET de los datos dentro del objeto estudiante------
                //ahora se pueden insertar los datos a la DB
                System.out.println(""+
                estudiante.getId()+" "+estudiante.getNombre()+"\n "+estudiante.getApellido()+" "+estudiante.getContrasenia()+
                " "+ estudiante.getCorreo()+ "\n "+ estudiante.getDNI() + " "+estudiante.getEdad()+" "+estudiante.getCSede());
                
                
                
                EstudianteDAO estudianteDAO = new EstudianteDAOImpl();
                estudianteDAO.insertar(estudiante);
                entrada.close();
                    break;
		case 3:System.exit(0);break;
		}
	}

}
