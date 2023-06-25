public class Lista {
    public No primeiro;
    public No ultimo;
    public int qtd;

    public Lista(){
        primeiro = null;
    }

    public boolean estaVazia(){
        return primeiro == null;
    }

    public No getPrimeiro(){
        return primeiro;
    }

    public No getUltimo(){
        return ultimo;
    }

    public void inserePrimeiro(int info){
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(primeiro);
        primeiro = auxiliar;
    }

    public void insereDepois(No no, int info){
        No no1 = new No();
        no1.setInfo(info);
        no1.setProx(no.getProx());
        no.setProx(no1);
    }

    public void insereUltimo(int info){
        if(estaVazia()){
            inserePrimeiro(info);
        }
        else{
            No auxiliar_ultimo = primeiro;
            while(auxiliar_ultimo!=null && auxiliar_ultimo.getProx()!=null){
                auxiliar_ultimo = auxiliar_ultimo.getProx();
            }
            if(auxiliar_ultimo.getProx()==null){
                No novo = new No();
                novo.setInfo(info);
                auxiliar_ultimo.setProx(novo);
            }
        }
    }

    public No removePrimeiro(){
        if(estaVazia()){
            System.out.println("Lista vazia, não há item para remover.");
            return null;
        }
        else{
            No cursor = primeiro;
            primeiro = primeiro.getProx();
            return cursor;
        }
    }

    public void removeUltimo(Lista l){

        No aux = l.primeiro;
        No ant = l.primeiro;
        if(estaVazia()){
            System.out.println("Lista vazia, não há item para remover.");
        }
        else{
            while(aux.getProx()!=null && aux.getProx()!=null){
                ant = aux;
                aux = aux.getProx();
            }
            if(aux.getProx()==null){
                System.out.println("Ultimo nó [" + aux.getInfo() + "] encontrado e removido.");
                ant.setProx(null);
                l.ultimo = ant;
                l.qtd--;
            }
        }
    }

    public void removeDepois(No no){
        if(estaVazia()){
            System.out.println("Lista vazia, não há item para remover.");
        }
        else{
            No anterior = null;
            No cursor = primeiro;
            while(cursor.getProx()!=null){
                anterior = cursor;
                cursor = cursor.getProx();
                if(cursor.equals(no)){
                    System.out.println("Nó encontrado e removido.");
                    anterior.setProx(cursor.getProx());
                }
            }
        }
    }

    public void mostrar(){
        No auxiliar_mostrar = primeiro;
        while(auxiliar_mostrar!=null){
            System.out.print(auxiliar_mostrar.getInfo()+", ");
            auxiliar_mostrar = auxiliar_mostrar.getProx();
        }
    }
}
