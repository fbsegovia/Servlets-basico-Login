package modelo.entidades;

public class Usuario {
private String nombre;
private String contrase�a;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getContrase�a() {
	return contrase�a;
}
public void setContrase�a(String contrase�a) {
	this.contrase�a = contrase�a;
}
@Override
public String toString() {
	return "Usuario [nombre=" + nombre + ", contrase�a=" + contrase�a + "]";
}



}
