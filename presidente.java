public class presidente extends Pessoa{
  private double adicional_whisky, adicional_helicoptero,previdencia,
  adicional_adicional;

  public presidente( int ID, String nome, int departamento, double salario){
    super(ID, nome, departamento, salario);
    this.adicional_whisky=0.9;
    this.adicional_helicoptero=0.7;
    this.adicional_adicional=3.8;
  }

  void setAdicional(double novo_percentual){
    adicional_whisky=0.9*(1+novo_percentual);
    adicional_helicoptero=0.7*(1+novo_percentual);
    adicional_adicional=3.8*(1+novo_percentual);
  }

  @Override
public
  double pagamento(){
    // Calcula o salário líquido
    return(salario*(1-this.previdencia+this.adicional_whisky+this.adicional_helicoptero + this.adicional_adicional));
  }
}