public class funcionarioSindicalizado extends Pessoa{
  private double desconto, adicional, desconto_sindicato, previdencia;
  
  public funcionarioSindicalizado (int ID, String nome, int departamento, double salario,
    double adicional){
    super(ID, nome, departamento, salario);
    this.desconto =0.02;
    this.previdencia=0.05; // Desconto fixo de um sistema de previd�ncia da empresa
    this.adicional = adicional; // adicional caso o funcionário seja por exemplo chefe.
    this.desconto_sindicato = 0.1;
  }

  void setDesconto(double desconto){
    this.desconto =desconto;
  }
  
  void setAdicional(double novo_percentual){
    this.adicional = adicional*(1+novo_percentual);
  }

  @Override
  double pagamento(){
    // Calcula o salário líquido
    return(salario*(1-this.previdencia-this.desconto+
    this.adicional-this.desconto_sindicato));
  }
}