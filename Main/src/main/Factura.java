
package main;

import javax.swing.JOptionPane;


public class Factura {
    
    public String customerName;
    public int customerId;
    public int receiptcode;
    public double receiptAmount;
    public int month;
    public int electronicsProductsIndicador;
    public int automotrizProductsIndicador;
    public int constructionProductsIndicador;

    public Factura(String customerName, int customerId, int receiptcode, int receiptAmount, int month, int electronicsProductsIndicador, int automotrizProductsIndicador, int constructionProductsIndicador) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.receiptcode = receiptcode;
        this.receiptAmount = receiptAmount;
        this.month = month;
        this.electronicsProductsIndicador = electronicsProductsIndicador;
        this.automotrizProductsIndicador = automotrizProductsIndicador;
        this.constructionProductsIndicador = constructionProductsIndicador;
    }
    
    public int totalProducts () {
        int totalProductsSum = this.electronicsProductsIndicador + this.automotrizProductsIndicador + this.constructionProductsIndicador;
        return totalProductsSum;
    }
    
    
    
    public double basicBonus (int totalProductsSum) {
        double bonus = 0;
        if (totalProductsSum >= 3){
            bonus = (this.receiptAmount/100) * 10;
            pointsSystem(3);
        }
        return bonus;
    }
    
    public double electronicProductsBonus () {
        double bonus = 0;
        if (this.electronicsProductsIndicador >= 3) {
            bonus = (this.receiptAmount/100) * 4;
            pointsSystem(1);
        } else {
            bonus = (this.receiptAmount/100) * 2;
        }
        return bonus;
    }
    
    public double automotrizProductsBonus () {
        double bonus = 0;
        if (this.automotrizProductsIndicador > 0) {
            bonus = (this.receiptAmount/100) * 8;
            pointsSystem(1);
        } else {
            bonus = 0;
        }
        return bonus;
    }
    
    public double constructionProductsBonus () {
        double bonus = 0;
        if (this.constructionProductsIndicador >= 3) {
            bonus = (this.receiptAmount/100) * 4;
            pointsSystem(2);
        } else {
            bonus = (this.receiptAmount/100) * 2;
        }
        return bonus;
    }
    
    public double fiveTbonus () {
        double bonus = 0;
        if (this.receiptAmount > 50000) {
            bonus = (this.receiptAmount/100) * 5;
            pointsSystem(1);
        } else {
            bonus = 0;
        }
        return bonus;
    }
    
    
    public double extraBonus () {
        double bonus = 0;
        if (this.receiptAmount > 300000) {
            bonus = 20000;
        } else {
            bonus = 0;
        }
        return bonus;
    }
    
    
    public int pointsSystem (int points) {
        int totalPoints = 0;
        totalPoints = totalPoints + points;
        return totalPoints;
    }
    
    public double commissions(double bonus){
        double  totalCommissions = 0;
        totalCommissions = totalCommissions + bonus;
        System.out.println(totalCommissions);
        return totalCommissions;
    }
    
    public double sales () {
        double totalSales = 0;
        OUTER:
        while (true) {
            int firstMenu = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar las facturas al agente de ventas? 1. Si 2. No"));
            if (firstMenu == 1) {
                int secondMenu = Integer.parseInt(JOptionPane.showInputDialog("Indique cuales facturas fueron realizadas por el agente de ventas: 1.factura 2351 2. factura 2546 3. factura 2700 4. factura 2810 5. 2912 6. Salir"));
                switch (secondMenu) {
                    case 1:
                        totalSales = totalSales + 20000;
                        break;
                    case 2:
                        totalSales = totalSales + 35000;
                        break;
                    case 3:
                        totalSales = totalSales + 60000;
                        break;
                    case 4:
                        totalSales = totalSales + 25000;
                        break;
                    case 5:
                        totalSales = totalSales + 45000;
                        break;
                    case 6:
                        break OUTER;
                    default:
                        System.out.println("Verifique la informacion introducida");
                        break;
                }
                
            } else {
                break;
            }
        }
        return totalSales;
    }
    

    
}
    
