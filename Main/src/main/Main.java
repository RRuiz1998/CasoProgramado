
package main;


public class Main {


    public static void main(String[] args) {
                
        Empleado empleado1 = new Empleado();
        
        
        Factura factura1 = new Factura("Julio Sanchez",11202000,2351,20000,10,0,0,6);
        Factura factura2 = new Factura("Ramon Sanchez",11202001,2546,35000,10,3,0,0);
        Factura factura3 = new Factura("Julio Valdez",21202002,2700,60000,10,0,2,0);
        Factura factura4 = new Factura("Natalia Monge",41202003,2810,25000,10,2,2,1);
        Factura factura5 = new Factura("Jimena Pereira",31202004,2912,4500,10,1,2,0);
        

        //Obtener comisiones del agente de ventas 
        double bonusTotal = 0;
        bonusTotal = bonusTotal + factura1.pointsSystem(factura1.totalProducts());
        factura1.commissions(bonusTotal);
        
        
        double totalSales = factura1.sales();

        
        empleado1.prints(totalSales, 0);
        
        

        
        
        
        


    }
    
}
