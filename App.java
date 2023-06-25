public class App {
    public static void main(String[] args) {
        
        Lista l = new Lista();
        l.qtd = 0;

        System.out.println("\n\n|| Está vazia ||");
        System.out.println(l.estaVazia());

        System.out.println("\n|| Insere último ||");
        l.insereUltimo(10);
        l.insereUltimo(20);
        l.insereUltimo(30);
        l.mostrar();

        System.out.println("\n\n|| Insere Primeiro ||");
        l.inserePrimeiro(5);
        l.mostrar();

        System.out.println("\n\n|| Insere último (intercalado com Insere Primeiro) ||");
        l.insereUltimo(55);
        l.mostrar();

        System.out.println("\n\n|| Insere Depois ||");
        No no1 = l.getPrimeiro().getProx().getProx();
        l.insereDepois(no1, 111);
        l.mostrar();

        System.out.println("\n\n|| Remove o primeiro ||");
        System.out.println("Removido o primeiro item: " + l.removePrimeiro().getInfo());
        l.mostrar();

        System.out.println("\n\n|| Remove o nó depois de outro nó ||");
        System.out.println("Valor escolhido para ser removido: " + l.getPrimeiro().getProx().getInfo());
        l.removeDepois(l.getPrimeiro().getProx());
        l.mostrar();

        System.out.println("\n\n|| Remove o último nó ||");
        l.removeUltimo(l);
        l.mostrar();
        System.out.println("\n");
    }
}
