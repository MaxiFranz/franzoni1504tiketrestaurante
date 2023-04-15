
package franzoni1504tiketrestaurante;

        //importamos metodo
        import java.util.Scanner;

public class Franzoni1504tiketrestaurante {

    
    public static void main(String[] args) {
        
        //creamos objeto para ingreso de data
        Scanner teclado = new Scanner(System.in);
        
        //declaramos cabecera como constante
        String cAbeceratk = new String 
       ("================================\n"
        + "AL USO NOSTRO PASTAS\n"
        + "Avenida Roma 2345, C1425 CABA\n"       
        + "================================");
        
        //declaramos menu o comanda como constante
        String cOmanda = new String
        ("================================\n"
        + "1 Gaseosa\n"
        + "1 Tallarines con salsa a la Rossini\n" 
        + "1 Flan con Crema\n"
        + "1 cafe\n"
        + "================================");

        //creamos variables necesarias
        String nMozo;
        
        //por si ponen importes con centavos
        Double tOtal;
        Double sUbtotal;
        Double reCodesc;
        
        int mPago;
        int cUotas;
        
        //numero de tarjeta tiene 16 numeros
        long nUmtarjeta;
        
        //Bienvenida para ingreso de datos
        System.out.println("-------------------------------");
        System.out.println("----Programa de Facturacion----");
        System.out.println("------Al Uso Nostro Pastas-----");
        System.out.println("-------------------------------");
        
        //Ingreso de datos
        System.out.print("Ingrese nombre de Mozo : ");
            nMozo = teclado.nextLine();
        System.out.print("Ingrese monto total : ");
            sUbtotal = teclado.nextDouble();
        
        //mostramos menu formas de pago
        System.out.println("-------------------------------");
        System.out.println("---- Medios de pago -----------");
        System.out.println("---- 01 - Efectivo ------------");
        System.out.println("---- 02 - Tarjeta de credito --");
        System.out.println("---- 03 - Tarjeta de debito ---");
        System.out.println("-------------------------------");
        
        //solicitamos que elija modo de pago
        System.out.print("Seleccione Medio de pago : ");
        mPago = teclado.nextInt();

        /*
        Segun medio de pago calculamos:
        - descuento o recargo
        - total a pagar
        - Si es tarjeta se solicita numero
        - Si es credito se solicita numero de cuotas
        - armamos detalle del ticket
        */

       
            if (mPago == 1){//********************* EFECTIVO *******************
            //calcula descuento 30%
            reCodesc = 30 * sUbtotal / 100;
            //calcula total
            tOtal = sUbtotal - reCodesc;
            
            //imprimimos ticket!!!!!!
            System.out.println(""+cAbeceratk);
            
            System.out.println("Caja # 1 - Ticket # 1");
            System.out.println("LO ATENDIO : " +nMozo);
            System.out.println("30/04/2010 11:46:47 AM");
            
            System.out.println(""+cOmanda);
            
            //detalle de facturacion
            System.out.println("SUBTOTAL : " +sUbtotal);
            System.out.println("FORMA DE PAGO : EFECTIVO"); 
            System.out.println("DESCUENTO : " +reCodesc);
            System.out.println("TOTAL : " +tOtal);   

            } else if (mPago == 2){//********************* CREDITO *******************
            //calculamos recargo 10%
            reCodesc = 10 * sUbtotal / 100;
            //calcula total
            tOtal = sUbtotal + reCodesc;
            //solicitamos numero de tarjeta
            System.out.print("Ingrese el numero de tarjeta : ");
            //guardamos nro de tarjeta
            nUmtarjeta = teclado.nextLong();
            //solicitamos cantidad de cuotas
            System.out.print("Indique cantidad de cuotas  : ");
            cUotas = teclado.nextInt();
            
             //imprimimos ticket!!!!!!
            System.out.println(""+cAbeceratk);
            
            System.out.println("Caja # 1 - Ticket # 1");
            System.out.println("LO ATENDIO : " +nMozo);
            System.out.println("30/04/2010 11:46:47 AM");
            
            System.out.println(""+cOmanda);
            
            //detalle de facturacion
            System.out.println("SUBTOTAL : " +sUbtotal);
            System.out.println("FORMA DE PAGO : TARJETA DE CREDITO");
            System.out.println("NUMERO DE TARJETA : " +nUmtarjeta);
            System.out.println("CUOTAS : " +cUotas);
            System.out.println("TOTAL : " +tOtal);
            
            } else {//********************* DEBITO *******************
            //calculamos descuento 10%
            reCodesc = 10 * sUbtotal / 100;
            tOtal = sUbtotal - reCodesc;
            //solicitamos numero de tarjeta
            System.out.print("Ingrese el numero de tarjeta : ");
            //guardamos nro de tarjeta
            nUmtarjeta = teclado.nextLong();
            
            //imprimimos ticket!!!!!!
            System.out.println(""+cAbeceratk);
            
            System.out.println("Caja # 1 - Ticket # 1");
            System.out.println("LO ATENDIO : " +nMozo);
            System.out.println("30/04/2010 11:46:47 AM");
            
            System.out.println(""+cOmanda);
            
            //detalle de facturacion
            System.out.println("SUBTOTAL : " +sUbtotal);
            System.out.println("FORMA DE PAGO : TARJETA DE DEBITO");
            System.out.println("NUMERO DE TARJETA : " +nUmtarjeta);
            System.out.println("DESCUENTO : " +reCodesc);
            System.out.println("TOTAL : " +tOtal);
            } 
        
        //cierre de ticket
        System.out.println("================================");
        System.out.println("Gracias por su visita");
        System.out.println("================================");


            
       }
            
        
}
    

