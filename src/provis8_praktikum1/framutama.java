/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis8_praktikum1;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class framutama extends JFrame{
    public framutama() {
        this.setSize(300, 300);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void tampil() {
        this.setVisible(true);
    }
    
    public void tampil(String nama) {
        this.setTitle(nama);
        this.setVisible(true);
    }
}
