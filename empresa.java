
public class empresa {
	funcionario[] func = new funcionario[100];
	
	public void adicionarFunc(funcionario f){
	
		//for (int i = 0; i <= func.length - 1 ; i++){
				//if (func[i].nome == null){
					func[0]=f;
				//}
				
		//}
	}

	public boolean removerFunc(int f){
		
		if (func[f] == null){  
			return false;
		}else{ // Se encontrar objeto
			for (int j=f; j < func.length - 1; j++ ){
				func[f] = func[f+1]; //remanejar elementos a frente
				}
			return true;
		}
	}
	
	public void calcularPgto(funcionario f){
		
	}
	
	public void alterarDesconto(funcionario f){
		
	}
	
	public void listaFunc(){
		for (int i = 0; i <= 100; i++){
			if (func[i] == null){
				break;
			}
				System.out.println(func[i].nome);
		}
	}

}
