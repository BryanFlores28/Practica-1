/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author lalap
 */
public class Login implements Serializable {
    
        private String usuario;
        private String contraseña;
 
   public Login() {
        usuario = "";
        contraseña = "";
        }
   public Login(String usuario, String contraseña) {
            
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
   public String getUsuario() { 
       return usuario;
    
    }
   public void setUsuario(String usuario){
       this.usuario = usuario;
        
   }
    public String getContraseña() { 
       return contraseña;
    
    }
   public void setContraseña(String contraseña){
       this.contraseña = contraseña;
       
       
   }
        
        }  


