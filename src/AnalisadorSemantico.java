import java.util.ArrayList;
import java.util.List;

public class AnalisadorSemantico {

	public List<String> tabelaSimbolos;

	public AnalisadorSemantico() {
		tabelaSimbolos = new ArrayList();
	}

	public void Analisar(String linha, List<String> dicionario) {
		linha = linha.replace(";", "");
		String[] token = linha.split(" ");
		
		if (token[0].equals("ephelele")) {

			// adicionar na tabela de simbolos
			if (estaNaTabelaSimbolos(token[1].toString())) {
				System.out.println("Variavel j� declarada:" + token[1]);
				return;
			}
			tabelaSimbolos.add(token[1]);
			return;
		}

		int countAspas = 0;
		// percorre todas as palavras da linha
		for (int i = 0; i < token.length; i++) {
			
			char aspas = '"';
			
			//verifica se esta dentro de um print ou de uma string
			if(token[i].contains(String.valueOf(aspas))) {
				if(countAspas == 1) {
					countAspas = 0;
				}else {
					countAspas = 1;
				}
			}
			
			// verificar se � uma vari�vel
			if (ehVariavel(token[i].toString(), dicionario) && countAspas == 0) {
				if (estaNaTabelaSimbolos(token[i].toString())) {
					return;
				} else {
					System.out.println("Variavel nao declarada:" + token[i]);
				}
			}
		}
	}

	public Boolean ehVariavel(String palavra, List<String> dicionario) {

		if (palavra.matches("[a-z][a-z0-9]{0,9}")) {
			for (int i = 0; i < dicionario.size(); i++) {
				if (dicionario.get(i).toString().equals(palavra)) {
					return false;
				}
			}
			return true;
		}
		return false;

	}

	public Boolean estaNaTabelaSimbolos(String palavra) {

		for (int i = 0; i < tabelaSimbolos.size(); i++) {
			if (tabelaSimbolos.get(i).toString().equals(palavra)) {
				return true;
			}
		}
		return false;
	}
}
