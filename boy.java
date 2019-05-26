public class boy extends Pessoa{
  private double desconto;
  
  public boy (int ID, String nome, int departamento, double salario, double adicional){
	super(ID, nome, departamento, salario);
    this.desconto =0.02;
  }

  void setDesconto(double desconto){
    this.desconto=desconto;
  }
}