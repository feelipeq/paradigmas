public class funcionario extends Pessoa{
  protected double desconto, adicional, previdencia;

  public funcionario(int ID, String nome, int departamento, double salario, double adicional){
    super(ID, nome, departamento, salario);;
    this.desconto=0.02;
    this.previdencia=0.05; // Desconto fixo de um sistema de previd�ncia da empresa
    this. adicional = adicional; // adicional caso o funcionário seja por exemplo chefe.
  }

  void setDesconto(double desconto){
    this.desconto =desconto;
  }

  void setAdicional(double novo_percentual){
    this.adicional = adicional*(1+novo_percentual);
  }
  
  
 @Override
public double pagamento(){
    // Calcula o salário líquido
    return(salario*(1- this.previdencia- this.desconto+ this.adicional));
}

public double getPrevidencia() {
	return previdencia;
}

public void setPrevidencia(double previdencia) {
	this.previdencia = previdencia;
}

public double getDesconto() {
	return desconto;
}

public double getAdicional() {
	return adicional;
}
}