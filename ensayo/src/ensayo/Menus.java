/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensayo;

import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class Menus {
    public void menuPrincipal(){
        Menu menu = new Menu();
        menu.setTitle("Menu");
        menu.setResizable(false);
        menu.setLocationRelativeTo(menu);
        menu.setVisible(true);
    }
    public void menuPrincipal(ArrayList <Personas> lista){
        Menu menu = new Menu(lista);
        menu.setTitle("Menu");
        menu.setResizable(false);
        menu.setLocationRelativeTo(menu);
        menu.setVisible(true);
    }
    public void ingresar(ArrayList <Personas> lista){
        Nuevo nuevo = new Nuevo(lista);
        nuevo.setTitle("Ingreso de personas");
        nuevo.setResizable(false);
        nuevo.setLocationRelativeTo(nuevo);
        nuevo.setVisible(true);
        
    }
    public void ver(ArrayList <Personas> lista){
        Ver ver = new Ver(lista);
        ver.setTitle("Personas");
        ver.setResizable(false);
        ver.setLocationRelativeTo(ver);
        ver.setVisible(true);
        
    }
    
}
