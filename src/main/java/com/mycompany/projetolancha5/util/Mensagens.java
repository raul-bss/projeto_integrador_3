/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolancha5.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author administrator
 */
public class Mensagens {
    public static void mostraMensagem(Component componente,String msg){
        JOptionPane.showMessageDialog(componente, msg);
    }
}
