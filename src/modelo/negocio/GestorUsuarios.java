package modelo.negocio;

import modelo.entidades.Usuario;

public class GestorUsuarios {

	public boolean validar(Usuario usuario){
		boolean validado = false;
		if(usuario.getNombre()==null || usuario.getContraseña()==null){
			return false;
		}
		if(usuario.getNombre().equals("pepe")){
			if(usuario.getContraseña().equals("1234")){
				validado = true;
			}
		}
		return validado;
	}
	
}
