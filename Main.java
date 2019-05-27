import java.util.Scanner;
class Main {
	
  public static void main(String[] args) {	  
	boolean menu=false;
	boolean resposta=false;
	int opt=0;
	double salario;
	empresa e = new empresa();
    //funcionario f = new funcionario(0,"Felipe Queiroz",1,1.200,0.02);
    //e.adicionarFunc(f);
    e.calcularPgto(0);
    e.alterarDesconto(0, 1.03);
    //System.out.println(e.calcularPgto(0));
    //e.removerFunc(0);
    e.listaFunc();
    
    while (!menu){
    	resposta=false;
    	Scanner sc = new Scanner(System.in);
    	System.out.print("\n                       Bem vindo a Aplicação Empresa\n"
    			+ "                Selecione abaixo Qual opção quer utilizar\n"
    			+ "\n                 --------------------------------------------"
    			+ "\n        	|       1) Adicionar Funcionario"
    			+ "\n		|	2) Remover Funcionario"
    			+ "\n		|	3) Calcular Pagamento do Funcionario"
    			+ "\n		|	4) Alterar Desconto do Funcionario"
    			+ "\n		|	5) Listar os Funcionarios da Empresa"
    			+ "\n		|	6) Sair do Progama"
    			+ "\n                 --------------------------------------------\n");
    	
    	opt = sc.nextInt();
    	
    	if (opt == 1) {
    		
    		while (!resposta){
    			
	    		System.out.flush();
	    		System.out.println("\nDigite o ID do Funcionario:");
				int id = sc.nextInt();
				
				System.out.println("\nDigite o Nome do Funcionario:");
				String nome = sc.next();
				
				System.out.println("\nDigite o Departamento do Funcionario:");
				int dpto = sc.nextInt();
				
				System.out.println("\nDigite o Salario do Funcionario:");
				double sal = sc.nextDouble();
				
				System.out.println("\nDigite o Adicional do Funcionario:");
				double adc = sc.nextDouble();
				
				funcionario f = new funcionario(id,nome,dpto,sal,adc);
				e.adicionarFunc(f);
				System.out.println("\nFuncionario: " + f.nome + " inserido com Sucesso\n");
				f=null;
				System.out.println("\nVoltar ao menu inicial ? \n"
						+ "\n1) Sim"
						+ "\n2) Não");
				opt = sc.nextInt();
				if (opt==1){
					resposta=true;
				}
    		}
    	}
		if (opt == 2) {
		    		
		}
		
		if (opt == 3) {
			
		}
		
		if (opt == 4) {
			
		}
		
		if (opt == 5) {
			
			while (!resposta){
				System.out.flush();
				System.out.println("Funcionários Apresentados Abaixo: \n");
				e.listaFunc();
				
				System.out.println("\nVoltar ao menu inicial ? \n"
						+ "\n1) Sim"
						+ "\n2) Não");
				opt = sc.nextInt();
				if (opt==1){
					resposta=true;
				}
			}
		}
		
    	if (opt == 6) {
    		menu=true;
    	}
		    		
    }
  }
}