
public class Rotulo {

	public static void main(String[] args) {
		int[][] vendas = new int[3][5];
		String[][] ordemVendas = new String[3][5];
		int ordem = 0;
		
		for(int linha = 0; linha < vendas.length; linha++){
			for(int coluna = 0; coluna < vendas[0].length; coluna++){
				vendas[linha][coluna] = 0;
			}
		}
		
		for(int linha = 0; linha < ordemVendas.length; linha++){
			for(int coluna = 0; coluna < vendas[0].length; coluna++){
				ordem++;
				ordemVendas[linha][coluna] = (ordem+"º");
			}
		}
		
		System.out.println("Array sales:\n");
		
		for(int linha = 0; linha < vendas.length; linha++){
			for(int coluna = 0; coluna < vendas[0].length; coluna++){
				System.out.printf("%d\t", vendas[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println("\nOrdem array sales:\n");
		
		for(int linha = 0; linha < vendas.length; linha++){
			for(int coluna = 0; coluna < vendas[0].length; coluna++){
				System.out.printf("%s\t",ordemVendas[linha][coluna]);
			}
			System.out.println();
		}
	}

}
