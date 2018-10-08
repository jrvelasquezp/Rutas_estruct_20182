package rutas;

public class Administrador {
	//Variables
	String nombre;
	String apellido;
	long id;
	String nombre_usuario;
	String contrasena;
	//Constructor
	public Administrador(String nam, String lastn, long doc)
	{
		setNombre(nam);
		setApellido(lastn);
		setID(doc);
	}
	//Métodos
	public void setNombre(String nam)
	{
		nombre=nam;
	}
	public void setApellido(String lastn)
	{
		apellido=lastn;
	}
	public void setID(long doc)
	{
		id=doc;
	}
	public void setNomUsuario(String user)
	{
		nombre_usuario=user;
	}
	public void setPwd(String pwd)
	{
		contrasena=pwd;
	}
	public String getNombre()
	{
		return nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public long getID()
	{
		return id;
	}
	public String getNomUsuario()
	{
		return nombre_usuario;
	}
	public String getPwd()
	{
		return contrasena;
	}
}