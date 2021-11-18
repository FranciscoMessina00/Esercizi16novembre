package esercizio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroRoC {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double reale=0, imm=0;
		String numeroStringa="";
		boolean ok, immNegativo=false;
		do {
			reale=0;
			try {
				
				ok=true;
				numeroStringa=input.nextLine();
				if(numeroStringa.matches(".*[a-zA-Z]+.*")) throw new InputMismatchException();
				reale=Double.parseDouble(numeroStringa);
			}
			catch(InputMismatchException e) {
				numeroStringa.replaceAll("[+]", " +");
				if(numeroStringa.contains("+j")) {
					String[] numeri=numeroStringa.split("\\+j");
					reale=Double.parseDouble(numeri[0]);
					imm=Double.parseDouble(numeri[1]);
					immNegativo=false;
					ok=true;
					
				}else if (numeroStringa.contains("-j")) {
					String[] numeri=numeroStringa.split("-j");
					reale=Double.parseDouble(numeri[0]);
					imm=Double.parseDouble(numeri[1]);
					immNegativo=true;
					ok=true;
				} else if(numeroStringa.contains("j")) {
					String[] numeri=numeroStringa.split("j");
					reale=0;
					imm=Double.parseDouble(numeri[1]);
					immNegativo=false;
					ok=true;
				}
				else {
					System.out.println("Non hai inserito un numero valido.");
					ok=false;
				}
				
			}
		}while(!ok);
		if(imm==0) {
			System.out.println("Reale= "+ reale);
		}else if(immNegativo) {
			System.out.println("Reale= "+reale+"\nImm= -"+imm);
		}else System.out.println("Reale= "+reale+"\nImm= "+imm);
		input.close();
	}

}
