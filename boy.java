public class boy extends Pessoa{
  private double desconto, previdencia;
  
  public boy (int ID, String nome, int departamento, double salario, double adicional){
	super(ID, nome, departamento, salario);
	this.previdencia=0.05; // Desconto fixo de um sistema de previd�ncia da empresa
    this.desconto =0.02;
  }

  void setDesconto(double desconto){
    this.desconto=desconto;
  }
  
  double pagamento(){
	    // Calcula o salário líquido
	  return(salario*(1- this.previdencia-this.desconto));
	  }
}