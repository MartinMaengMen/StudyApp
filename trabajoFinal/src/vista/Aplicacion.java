package vista;
import java.sql.SQLException;
import java.util.Scanner;
import objetos.CEstudiante;
import DAO.PreguntaDAO;
import fabrica_dao.FabricaDao;
import objetos.CPregunta;
import serializado.ConvertirObj;
public class Aplicacion {
public static void Inicio(){
	
	
	System.out.println("Ingresar(1)");
		System.out.println("Registrarse(2)");
		System.out.println("Salir(3)");
		Scanner entrada=new Scanner(System.in);
		int opcion=entrada.nextInt();
		switch(opcion){
		case 1:break;
		case 2:break;
		case 3:break;		
		}
}

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Ap�ndice de m�todo generado autom�ticamente
/*
		CPregunta pregunta = new CPregunta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pregunta:");
		String input = sc.nextLine();
		pregunta.setTitulo(input);
		System.out.println("Comentario adicional:");
		input = sc.nextLine();
		pregunta.setContexto(input);

		
		ConvertirObj conv = new ConvertirObj();
		 byte[] byteArrayObject = conv.getByteArrayObject(pregunta);
		
		System.out.println("Titulo: "+ pregunta.getTitulo() + "\nComentario: "+
				pregunta.getContexto());
		*/
		
		FabricaDao fabrica = FabricaDao.getFabricaDAO(1);
		PreguntaDAO preg = fabrica.getUsuarioDAO();
		preg.insertar();
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
                Scanner dato1=new Scanner(System.in);
                String Email=dato1.toString();
                System.out.println("Ingrese una contraseña: ");
                Scanner dato2=new Scanner(System.in);
                String Contrasenia=dato2.toString();
                System.out.println("Nombre: ");
                Scanner dato3=new Scanner(System.in);
                String Nombre=dato3.toString();
                System.out.println("Apellido: ");
                Scanner dato4=new Scanner(System.in);
                String Apellido=dato4.toString();
                System.out.println("Edad: ");
                Scanner dato5=new Scanner(System.in);
                Apellido=dato5.toString();
                int Edad;
                System.out.println("Codigo: ");
                Scanner dato6=new Scanner(System.in);
                Edad=dato6.nextInt();
                String Codigo;
                System.out.println("Universidad: ");
                Scanner dato7=new Scanner(System.in);
                Codigo=dato7.toString();
                String Universidad;
                Scanner dato8=new Scanner(System.in);
                Universidad=dato8.toString();
                int Ciclo;
                Scanner dato9=new Scanner(System.in);
                Ciclo=dato9.nextInt();
                    estudiante.Registrar(Email,Contrasenia,Nombre,Apellido,Edad,Codigo,Ciclo,Universidad);
                    break;
		case 3:System.exit(0);break;
		}
	}

}
