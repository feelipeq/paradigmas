class Main {
  public static void main(String[] args) {
	empresa e = new empresa();
    System.out.println("Hello world!");
    funcionario f = new funcionario(0,"Felipe Queiroz",1,1.200,0.02);
    e.adicionarFunc(f);
    e.listaFunc();
  }
}