/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizsantiagogit;

import javax.swing.JOptionPane;

/**
 *
 * @author compr
 */
public class QUIZSANTIAGOGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite ña cantidad de empleados"));
        double SEM = 0.0925;
        double IVM = 0.00508;
        double totalSEM= 0;
        double totalIVM=0;
        
        
        for (int i = 0; i < numEmpleados; i++) {
            int salary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
            
            double montoSEM= salary*SEM;
            double montoIVM = salary*IVM;
            
            totalSEM+=montoSEM;
            totalIVM+=montoIVM;
            
        }
        
         double  pagoT= totalSEM+totalIVM;
         JOptionPane.showMessageDialog(null,"la empresa debera abonar a la CCSS el monto de "+pagoT+"por concepto de IVM y SEM");
        
        
     
    }
    
}
