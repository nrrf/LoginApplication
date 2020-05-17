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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Entidad.Usuario; 
import static Frontera.FramePrincipal.sistema;
import java.util.*;

public class TestLogin {
    
    private static ValidarLogin validarLogin = new ValidarLogin();
    
    private String LONG_NOMBRE_INCORRECTA = "Longitud nombre incorrecta"; 
    private String LONG_PASSWORD_INCORRECTA = "Longitud contraseña incorrecta"; 
    private String DATOS_INCORRECTOS = "Datos incorrectos"; 
    private String USUARIO_AUTORIZADO = "Bienvenido"; 
    
    public TestLogin() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception{
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
   @Test
    public void testContrasenia() {
        
    }
    
    @Test
    public void testDatos() {
        
    }
    
    @Test
    public void testLongitudContrasenia() {
        Usuario u = new Usuario();
        
        u.setNombre("Pepe");
        u.setPassword("12");
        
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
        
        u.setNombre("Pepe");
        u.setPassword("123456");
        
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
        
    }
    
    @Test
    public void testLongitudNombre() {
        Usuario u = new Usuario();
        
        u.setNombre("R");
        u.setPassword("123456");
        
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
        u.setNombre("Roberto");
        u.setPassword("123456");
        
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
    }
    
    @Test
    public void todoCorrecto() {
        Usuario u = new Usuario();
        
        u.setNombre("juan");
        u.setPassword("1234");
        
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
        
        u.setNombre("pedro");
        u.setPassword("123");
        
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
        u.setNombre("maria");
        u.setPassword("12345");
        
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
    }
    
    @Test
    public void testNombre() {
        Usuario u = new Usuario();
        
        u.setNombre("Henry");
        u.setPassword("12345");
        
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    
}