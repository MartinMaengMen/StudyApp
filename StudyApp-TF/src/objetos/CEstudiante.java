package objetos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import serializado.ConexionDB;
public class CEstudiante {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private int DNI;
	private String contrasenia;
	private String correo;
	private int CSede;
	
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getCSede() {
		return CSede;
	}

	public void setCSede(int cSede) {
		CSede = cSede;
	}



	public void Registrar(String Email,String Contrasenia,String Nombre,String Apellido,int Edad,String Codigo,int Ciclo,String Universidad) throws SQLException{
            ConexionDB con=new ConexionDB();
            Statement st = con.getConection().createStatement();
            ResultSet rs=st.executeQuery("select TEmail from Estudiante where TEmail="+"'"+Email+"'");
            while(rs.next()){
                String em=rs.getString(1);
                if(Email.equals(em))               
                    System.out.println("El Email ya se encuentra en uso");
               else{
                    //contrasenia=Contrasenia;
                    //nombre=Nombre;
                    //apellido=Apellido;
                    //edad=Edad;
                    //codigo=Codigo;
                    //email=Email;
                    //ciclo=Ciclo;   
                    //universidad=Universidad;
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
	
	
	
}
