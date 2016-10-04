/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareappt1;

/**
 *
 * @author DAVID
 */
public class LMayuscula extends Simbolo_AsciiArt {

    @Override
    public String getFila1() {
        return Fila1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFila2() {
        return Fila2;
    }

    @Override
    public String getFila3() {
        return Fila3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFila4() {
        return Fila4; //To change body of generated methods, choose Tools | Templates.
    }

    public LMayuscula() {
        super.Fila1 = "  |    ";
        super.Fila2 = "  |    ";
        super.Fila3 = " ____| ";
        super.Fila4 = "       ";
    }

    @Override
    public void PintarAscii() {
        System.out.println(Fila1);
        System.out.println(Fila2);
        System.out.println(Fila3);
        System.out.println(Fila4);
    }
    
    
    
    
    
    

}
