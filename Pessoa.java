class Pessoa{
  protected int ID;
  protected String nome;
  protected int departamento;
  protected double salario;

  public Pessoa(int ID, String nome, int departamento, double salario){
    this.ID = ID;
    this.nome = nome;
    this.salario = salario;
  }

  double pagamento(){
    // Calcula o salário líquido
    return(this.salario);
  }
}