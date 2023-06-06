import java.util.Scanner;

public class GeradorByteCode {

	public GeradorByteCode() {
		// TODO Auto-generated constructor stub
	}
	
	public String gerar(String linha) {
		String[] token = linha.split(" ");
		
		if (token[0].equals("ephelele")){
			return "int " + token[1];
		}
		
		if (token[0].equals("funda")) {
			return token[1].replace(";","") + "=teclado.nextInt();";
		}
		
		if (token[0].equals("okwe")){
			return "for( " + token[1];
		}
		if (token[0].equals("ukuphelaku")){
			return "}";
		}
		
		//caso busque posiçoes no vetor a cima de 0 é necessario esse if para não dar erro
		if(token.length > 1) {
			
			if (token[1].equals("=")) {
				return linha;
			}
			if(token.length > 3) {
				
				if (token[3].equals("*")) {
					return linha;
				}
				if (token[3].equals("+")) {
					return linha;
				}
				if (token[3].equals("-")) {
					return linha;
				}
				if (token[3].equals("/")) {
					return linha;
				}
				if (token[3].equals("!=")) {
					return linha;
				}
				if (token[3].equals("==")) {
					return linha;
				}
			}
			
			//tratamento para o for
			if(token.length > 6) {
				
				if (token[2].equals("phakathi") || token[4].equals("kuze")){
					return ";";
				}
				if (token[6].equals("yenza")){
					return "){";
				}
			}
			
		}
		
	
		return "";
		
	}

}
