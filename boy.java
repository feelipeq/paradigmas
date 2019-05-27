//Victor Vasconcellos Borba - 31716369
//Felipe Queiroz - 31725570
//Felipe Pena Sales - 31709850
public class boy extends Pessoa{
  private double desconto, previdencia;
  
  public boy (int ID, String nome, int departamento, double salario, double adicional){
	super(ID, nome, departamento, salario);
	this.previdencia=0.05; // Desconto fixo de um sistema de previdência da empresa
    this.desconto =0.02;
  }

  void setDesconto(double desconto){
    this.desconto=desconto;
  }
  
  public double pagamento(){
	    // Calcula o salÃ¡rio lÃ­quido
	  return(salario*(1- this.previdencia-this.desconto));
	  }
}
