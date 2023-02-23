public class teste {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        //testando inserção/população do vetor
        try{
            vetor.adiciona("elemento jk");
            vetor.adiciona("elemento b");
            vetor.adiciona("elemento c");
            vetor.adiciona("elemento d");
            vetor.adiciona("elemento e");
            vetor.adiciona("elemento f");
            vetor.adiciona("elemento g");
            vetor.adiciona("elemento h");
        }catch (Exception e){
            e.printStackTrace();
        }

        //testando adição de elemento no inicio do vetor, posição 0
        System.out.println(vetor.adicionaInicio(0, "elemento-a"));

        //identificando o tamanho do vetor
        System.out.println(vetor.tamanho());

        //imprimindo os elementos do vetor
        System.out.println(vetor.toString());

        //buscando elemento por posição
        System.out.println(vetor.busca(2));

        //buscando posição por elemento
        System.out.println(vetor.busca1("elemento c"));


    }
}
