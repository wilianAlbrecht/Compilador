import java.util.Scanner;

public class GeradorByteCode {

	public GeradorByteCode() {
		// TODO Auto-generated constructor stub
	}

	public String gerar(String linha) {
		
		String[] token = linha.split(" ");
		
		String linhaConvertida = "";
		boolean naoAdd = false;
		
		for(int x = 0; x < token.length; x++) {
			
			if (token[x].equals("ephelele")) {
				linhaConvertida += "int ";
			}

			else if (token[x].equals("funda")) {
				linhaConvertida += token[x+1].replace(";", "") + "=teclado.nextInt();";
				naoAdd = true;
			}

			//estrutura para o for
			else if  (token[x].equals("okwe")) {
				linhaConvertida += "for( ";
			}
			
			else if  (token[x].equals("phakathi") || token[x].equals("kuze")) {
				linhaConvertida += ";";
			}
			else if  (token[x].equals("yenza")) {
				linhaConvertida += "){";
			}
			//fim para
			else if  (token[x].equals("ukuphelaku")) {
				linhaConvertida += "}";
			}
			
			//operadores
			else if  (token[x].equals("=")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("*")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("+")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("-")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("/")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("!=")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("==")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals(">")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals(">=")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("<")) {
				linhaConvertida += token[x];
			}
			else if  (token[x].equals("<=")) {
				linhaConvertida += token[x];
			}
			
			
			//estrutura do if
			else if  (token[x].equals("uma") || token[x].equals(" uma") ) {
				linhaConvertida += "if(";
			}
			else if  (token[x].equals("bese")) {
				linhaConvertida += "){";
			}
			//fim se
			else if  (token[x].equals("ukuphelauma")) {
				linhaConvertida += "}";
			}
			
			//print
			else if  (token[x].equals("ukubhala")) {
				String novaLinha = linha.replace(";", "");
				if(novaLinha.contains("\"")) {
					int primeiraPosiçao = novaLinha.indexOf("\"");
					int ultimaPosiçao = novaLinha.lastIndexOf("\"");
					novaLinha = novaLinha.substring(primeiraPosiçao + 1, ultimaPosiçao + 1);
				}else {
					novaLinha = novaLinha.replace("ukubhala", "");
					novaLinha = novaLinha.replace(" ", "");
				}
				linhaConvertida += "System.out.println(" + novaLinha + ");";
				break;
			}
			
			
			//return
			else if  (token[x].equals("buyela")) {
				linhaConvertida += "return ";
			}
			
			//caso seja uma variavel retorne ela mesmo
			else {
				if(naoAdd == true) {
					naoAdd = false;
				}else {
					linhaConvertida += token[x];
				}
			}
			
			
		}
		
		//no fim retorna a linha convertida
		return linhaConvertida;
		
		
		
		
		
		
		//logica antiga

//		if (token[0].equals("ephelele")) {
//			return "int " + token[1];
//		}
//
//		if (token[0].equals("funda")) {
//			return token[1].replace(";", "") + "=teclado.nextInt();";
//		}
//
//		if (token[0].equals("okwe")) {
//			return "for( " + token[1];
//		}
//		if (token[0].equals("ukuphelaku")) {
//			return "}";
//		}
//
//		// caso busque posiçoes no vetor a cima de 0 é necessario esse if para não dar erro
//		for (String obj : token) {
//
//			if (obj.equals("=")) {
//				return linha;
//			}
//
//			if (obj.equals("*")) {
//				return linha;
//			}
//			if (obj.equals("+")) {
//				return linha;
//			}
//			if (obj.equals("-")) {
//				return linha;
//			}
//			if (obj.equals("/")) {
//				return linha;
//			}
//			if (obj.equals("!=")) {
//				return linha;
//			}
//			if (obj.equals("==")) {
//				return linha;
//			}
//		}
//
//		// tratamento para o for
//
//		for (String obj : token) {
//
//			if (obj.equals("phakathi") || obj.equals("kuze")) {
//				return ";";
//			}
//			if (obj.equals("yenza")) {
//				return "){";
//			}
//		}
//
//		return "";

	}

}
