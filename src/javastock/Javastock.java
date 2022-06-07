
package javastock;

import javastock.telas.Menu;

public class Javastock {

    public static void main(String[] args) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Menu().setVisible(true);
            }
        });
    }
    
}
