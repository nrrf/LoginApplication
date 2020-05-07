/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author LENOVO
 */

import Entidad.Sistema;
import Entidad.Usuario;
import Frontera.FramePrincipal;
public class ValidarLogin {
    
    private Sistema sistema = FramePrincipal.sistema;
    
    public ValidarLogin() {
    }
    
    public String verificarLogin (Usuario usuario){
        if(!verificarLongitudNombre(usuario.getNombre()) && !verificarLongitudPassword(usuario.getPassword()) ){
            return ("Longitud nombre incorrecto\nLongitudContraseña incorrecta");
        }else if(!verificarLongitudPassword(usuario.getPassword())){
            return ("Longitud contraseña incorrecta");
        }else if(!verificarLongitudNombre(usuario.getNombre()) ){
            return ("Longitud nombre incorrecto");
        }
        
        for (Usuario u : sistema.getUsuario()) {
            if(u.getNombre().equals(usuario.getNombre()) && u.getPassword().equals(usuario.getPassword())){
                return ("Bienvenido");
            }
        }
        
        return ("Datos incorrectos");
    }
    
    public boolean verificarLongitudNombre (String nombre){
        return (nombre.length()>1 && nombre.length()<=6);
    }
    
     public boolean verificarLongitudPassword (String password){
        return (password.length() >=3 && password.length()<6);
    }
     
     
}
