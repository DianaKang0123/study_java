package gui;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.util.function.DoubleToIntFunction;

public class Swing {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "your height " + height + "cm");
    }
}
