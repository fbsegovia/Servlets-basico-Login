package modelo.negocio;

import modelo.entidades.Usuario;

public class GestorUsuarios {

	public boolean validar(Usuario usuario){
		boolean validado = false;
		if(usuario.getNombre()==null || usuario.getContrase�a()==null){
			return false;
		}
		if(usuario.getNombre().equals("pepe")){
			if(usuario.getContrase�a().equals("1234")){
				validado = true;
			}
		}
		return validado;
	}
	
}
