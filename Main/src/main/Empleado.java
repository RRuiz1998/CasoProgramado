
package main;

import javax.swing.JOptionPane;


public class Empleado {
    
    public String name;
    public int id;
    public String code;
    public String sucursalPerteneciente;
    public String vehiculo;

    public Empleado() {
        this.name = JOptionPane.showInputDialog("Introducir el nombre del agente de ventas: ");
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Introducir el id del agente de ventas: "));
        this.code = JOptionPane.showInputDialog("Introducir el codigo del agente de ventas: ");
        this.sucursalPerteneciente = JOptionPane.showInputDialog("Introducir la sucursal del agente de ventas: ");
        this.vehiculo = JOptionPane.showInputDialog("El agente de ventas tiene vehiculo: ");
    }

    public void prints (double totalSales, int totalPoints) {
        System.out.println("El Agente Vendedor "+this.name+" codigo "+this.code+"en el mes de xxxxxxxxxxx");
        System.out.println(" * Vendio un total de "+totalSales+" en facturas");
        System.out.println(" * Obtuvo un total en comisiones de xxxxxxxxxx");
        System.out.println(" * El agente vendedor xxxxxxxxxxx logro el objetivo de llegar al BONO EXTRA");
        System.out.println(" * Puntos obtenidos por el vendedor: xxxxxxxxxx");
        System.out.println(" * El Agente Vendedor "+this.vehiculo+" cuenta con vehiculo propio");
        System.out.println(" * Sucursal: "+this.sucursalPerteneciente);
    }
    
    public String monthWritten (int monthNumber) {
        String month = "";
        if (monthNumber == 1){
            month = "ENERO";
        } else if (monthNumber == 2){
            month = "FEBRERO";
        }else if (monthNumber == 3){
            month = "MARZO";
        }else if (monthNumber == 4){
            month = "ABRIL";
        }else if (monthNumber == 5){
            month = "MAYO";
        }else if (monthNumber == 6){
            month = "JUNIO";
        }else if (monthNumber == 7){
            month = "JULIO";
        }else if (monthNumber == 8){
            month = "AGOSTO";
        }else if (monthNumber == 9){
            month = "SETIEMBRE";
        }else if (monthNumber == 10){
            month = "OCTUBRE";
        }else if (monthNumber == 11){
            month = "NOVIEMBRE";
        }else if (monthNumber == 12){
            month = "DICIEMBRE";
        }else{
            System.out.println("Verifique la informacion introducida");
        }
        return month;
    }
                

            
    }
