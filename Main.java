class Main {
  public static void main(String[] args) {
	double salario;
	empresa e = new empresa();
    System.out.println("Hello world!");
    funcionario f = new funcionario(0,"Felipe Queiroz",1,1.200,0.02);
    e.adicionarFunc(f);
    e.listaFunc();
    e.calcularPgto(0);
    e.alterarDesconto(0, 1.03);
    System.out.println(e.calcularPgto(0));
    //e.removerFunc(0);
    e.listaFunc();
  }
}