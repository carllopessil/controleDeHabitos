public class teste {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);


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

        System.out.println(vetor.adicionaInicio(0, "elemento-a"));

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());


        System.out.println(vetor.busca(2));

        System.out.println(vetor.busca1("elemento c"));


    }
}
