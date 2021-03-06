//Victor Vasconcellos Borba - 31716369
//Felipe Queiroz - 31725570
//Felipe Pena Sales - 31709850
public class empresa {
	funcionario[] func = new funcionario[100];
	
	public void adicionarFunc(funcionario f){
	
		for (int i = 0; i <= func.length - 1 ; i++){
				if (func[i] == null){
					func[i]=f;
					break;
				}			
		}
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
	
	public double calcularPgto(int id){
		double salario=0;
		for (int i = 0; i <= func.length; i++){ 
			if (func[i] == null){
				break;
			}else if (func[i].ID == id){
				salario=func[i].pagamento();
				return salario;
			}
		}
		return salario;
	}
	
	public boolean alterarDesconto(int id, double desct){
		for (int i = 0; i <= func.length; i++){
			if (func[i] == null){
				break;
		}
			if (func[i].ID == id){
				func[i].setDesconto(desct);
				return true;
			}
		}
		return false;
	}
	
	public String listaFunc(){
    String funcionarios = "Nome do Funcionario: |  Id do Funcionario  |  Desconto\n";
		for (int i = 0; i <= func.length; i++){
			if (func[i] == null){
				break;
			}
      funcionarios += func[i].nome  + "                  " + func[i].ID +  "                        " + func[i].desconto + "\n";
		}
    return funcionarios;
	}

}
