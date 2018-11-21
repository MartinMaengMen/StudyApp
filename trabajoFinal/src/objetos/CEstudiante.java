package objetos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import serializado.ConexionDB;
public class CEstudiante {
	public int id;
	public String nombre;
	public String apellido;
	public int edad;
	public String codigo;
	public int ciclo;
	public String email;
	public String contrasenia;
	public CPregunta pregunta;
	public CRespuesta respuesta;
        public String universidad;
	EstudianteBuider estudiantebuider;
	
	public void Registrar(String Email,String Contrasenia,String Nombre,String Apellido,int Edad,String Codigo,int Ciclo,String Universidad) throws SQLException{
            ConexionDB con=new ConexionDB();
            Statement st = con.getConection().createStatement();
            ResultSet rs=st.executeQuery("select TEmail from Estudiante where TEmail="+"'"+Email+"'");
            while(rs.next()){
                String em=rs.getString(1);
                if(Email.equals(em))               
                    System.out.println("El Email ya se encuentra en uso");
               else{
                    contrasenia=Contrasenia;
                    nombre=Nombre;
                    apellido=Apellido;
                    edad=Edad;
                    codigo=Codigo;
                    email=Email;
                    ciclo=Ciclo;   
                    universidad=Universidad;
                    System.out.println("Se ha registrado correctamente");
                }
            }
        }
//        public void Get_instancia_unica(String Email) throws SQLException{
//            ConexionDB con=new ConexionDB();
//            Statement st = con.getConection().createStatement();
//            ResultSet rs=st.executeQuery("select TEmail from Estudiante where TEmail="+"'"+Email+"'");
//            while(rs.next()){
//                String em=rs.getString(1);
//                if(Email.equals(em)){                
//                    System.out.println("El Email ya se encuentra en uso");
//                }
//               else{
//                    System.out.println("Disponible");
//                }
//            }
//        }
	public void Eliminar_Estudiante(){}
}
