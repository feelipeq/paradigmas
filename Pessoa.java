//Victor Vasconcellos Borba - 31716369
//Felipe Queiroz - 31725570
//Felipe Pena Sales - 31709850
class Pessoa{

  protected int ID;
  protected String nome;
  protected int departamento;
  protected double salario;
  
public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getDepartamento() {
	return departamento;
}

public void setDepartamento(int departamento) {
	this.departamento = departamento;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public Pessoa(){
	
}
  public Pessoa(int ID, String nome, int departamento, double salario){
    this.ID = ID;
    this.nome = nome;
    this.salario = salario;
  }

public double pagamento(){
    // Calcula o salário líquido
    return(this.salario);
  }
}
