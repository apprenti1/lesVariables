package main.java.ecrireDansUnFichier;
import jdk.jshell.execution.Util;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;
import java.awt.FileDialog;
import java.awt.*;
import java.awt.event.*;

class keyEvent implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("gg");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("hh");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("jj");
    }
}
public class dfghftsdh {
    public static void main(String[] args) throws InterruptedException {
        String gg = "ertgergergdddooopppppp";
        System.out.println(gg);
        gg.replace("ddd","hhh");
        System.out.println(gg.replace("ddd","hhh"));
        while (true){
            Thread.sleep(5000);
        }


    }
}

