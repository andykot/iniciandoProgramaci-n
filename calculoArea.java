import java.util.*;
import javax.swing.*;
public class calculoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        float calc=0;
		Scanner geometria = new Scanner(System.in);
		 System.out.println("� escribael numero que acompa�a a la  figura quiere calcularle el �rea");
		 System.out.println("1_cuadrado");
		 System.out.println("2_rectangulo");
		 System.out.println("3_triangulo");
		 System.out.println("4_circulo");
		 
		 int figura = geometria.nextInt();
		 
		 switch(figura) {
		 
		 case (1):
			 
			 String lado = JOptionPane.showInputDialog("valor del lado");
		     
		    float lado1=Float.parseFloat(lado);
		   
		     calc=(lado1*lado1);
		    break;
		    
		   case(2):
		   //voy a usar metodo simplificado del caso 1
			   
			float ladoCor=Float.parseFloat(JOptionPane.showInputDialog("Introduce valor lado corto"));
		   float ladoLar=Float.parseFloat(JOptionPane.showInputDialog("Introduce lado largo"));
			
		 
		   calc=(ladoCor*ladoLar);
		   break;
		     
		 default: System.out.println("el c�lculo del �re del triangulo o circulo es para version premium, revisa que no hayas marcado valor invalido");
		 		
		 	 
		 }
		 
		 //me da ladilla seguir con triangulo y circulo salgo del case
		 
		 if(figura==1 || figura==2) {
		System.out.println("el valor del area es "+ calc + " unidades");
		 }
	}

}
