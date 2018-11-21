package serializado;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import objetos.CPregunta;

public class ConvertirObj {

	public byte[] getByteArrayObject(CPregunta pregunta){
	    
        byte[] byteArrayObject = null;
        try {
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(pregunta);
            
            oos.close();
            bos.close();
            byteArrayObject = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return byteArrayObject;
        }
        return byteArrayObject;
    }
    //converting byte[] to SimpleExample  
    public CPregunta getJavaObject(byte[] convertObject){
            CPregunta objetoPregunta = null;
            
            ByteArrayInputStream bais;
            ObjectInputStream ins;
            try {
            
            bais = new ByteArrayInputStream(convertObject);
            
            ins = new ObjectInputStream(bais);
             objetoPregunta =(CPregunta)ins.readObject();
            
            ins.close();

            }
            catch (Exception e) {
            e.printStackTrace();
            }
            return objetoPregunta;
    }
 
}
