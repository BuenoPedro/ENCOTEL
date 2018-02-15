import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan;
	
	
	public static void main(String[] args) {
	
		scan  = new Scanner(System.in);
		String saida = null;
		//System.out.println("Digite uma frase para ser seu número");
		
		
		
		//if(scan.hasNext());
		
		while(scan.hasNext()) {
			String entrada = scan.next();
			
			
			
			
			if(entrada.equals(null) || entrada.equals("EOF")) {
				System.out.println("get out");
				break;
			}
			else {
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i<= entrada.length() -1; i++) {
					//char teste = entrada.charAt(i);
					switch (entrada.charAt(i)){
						case 'A':
							sb.append('2');
							break;
						case 'B':
							sb.append('2');
							break;
						case 'C':
							sb.append('2');
							break;
						case 'D':
							sb.append('3');
							break;
						case 'E':
							sb.append('3');
							break;
						case 'F':
							sb.append('3');
							break;
						case 'G':
							sb.append('4');
							break;
						case 'H':
							sb.append('4');
							break;
						case 'I':
							sb.append('4');
							break;
						case 'J':
							sb.append('5');
							break;
						case 'K':
							sb.append('5');
							break;
						case 'L':
							sb.append('5');
							break;
						case 'M':
							sb.append('6');
							break;
						case 'N':
							sb.append('6');
							break;
						case 'O':
							sb.append('6');
							break;
						case 'P':
							sb.append('7');
							break;
						case 'Q':
							sb.append('7');
							break;
						case 'R':
							sb.append('7');
							break;
						case 'S':
							sb.append('7');
							break;
						case 'T':
							sb.append('8');
							break;
						case 'U':
							sb.append('8');
							break;
						case 'V':
							sb.append('8');
							break;
						case 'W':
							sb.append('9');
							break;
						case 'X':
							sb.append('9');
							break;
						case 'Y':
							sb.append('9');
							break;
						case 'Z':
							sb.append('9');
							break;
						case '-':
							sb.append('-');
							break;
						case '0':
							sb.append('0');
							break;
						case '1':
							sb.append('1');
							break;
						case '2':
							sb.append('2');
							break;
						case '3':
							sb.append('3');
							break;
						case '4':
							sb.append('4');
							break;
						case '5':
							sb.append('5');
							break;
						case '6':
							sb.append('6');
							break;
						case '7':
							sb.append('7');
							break;
						case '8':
							sb.append('8');
							break;
						case '9':
							sb.append('9');
							break;
						default:
							break;
					}
					
					saida = sb.toString();
				}	

				System.out.println(saida);
				
			}

		}
	
		
	}

}
