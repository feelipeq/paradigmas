class Pessoa{
  private int ID;
  private String nome;
  private int departamento;
  private double salario;

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