import java.util.Arrays;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;
    
    //construindo/tornando acessivel a classe/objeto
    public VetorObjeto(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho=0;
    }

    //metodo que adiciona elementos dentro do objeto
    public void adiciona(Object elemento)throws Exception{
        this.aumentaCapacidade();

        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
        }else{
            throw new Exception("O Vetor já está cheio, "
            + "Não é possivel adicionar novos elementos!");
        }
    }
    public int tamanho(){
        return this.tamanho;
    }


    //metodo que apresenta os elementos presentes no objeto
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }


    //metodo que busca um elemento em especifico baseado em sua posição
    public Object busca(int posicao)throws Exception{
        if(posicao>=0 && posicao< tamanho){
            return elementos[posicao];
        }else{
            throw new Exception("posição invalida.");
        }
    }


    //metodo que busca um elemento em especifico basedo no proprio elemento
    public int busca1(String elemento){
        for (int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //metodo que adiciona elemento no inicio do vetor (na posição 0) mesmo que ela esteja ocupada, ela converte todos os elementos para a posição ao lado (+1) e deixa livre a posição 0 para ser preenchida
    public Boolean adicionaInicio (int posicao, String elemento) throws Exception {
        this.aumentaCapacidade();

        if(posicao>=0 && posicao<tamanho){
           for(int i=this.tamanho-1; i>posicao; i--){
            this.elementos[i+1]=this.elementos[i];
           }
           this.elementos[posicao]= elemento;
           this.tamanho++;
        }else{
            throw new Exception ("posição invalida.");
        }
        return true;
    }

    //metodo que aumenta a capacidade do vetor, dobrando sempre que necessario ao atingir o limite dele.
    private void aumentaCapacidade(){
        if(this.tamanho==this.elementos.length){
            Object[] elementosNovos = new Object [this.elementos.length*2];
            for(int i=0; i<this.elementos.length; i++){
                elementosNovos[i]= this.elementos[i];
            }
        this.elementos=elementosNovos;    
        }
    }

    //metodo que remove elemento baseado em sua posição
    public void remove(int posicao) throws Exception{
        if (posicao>=0 && posicao < tamanho){
            for(int i=posicao; i<this.tamanho-1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        }else{
            throw new Exception("posição invalida");
        }
    }
}

