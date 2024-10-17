public class Main {
    public static void main(String[] args) {
        ListaDuplamenteLigada biblioteca = new ListaDuplamenteLigada();

        // Adicionar livros no início e no fim
        biblioteca.adicionarNoInicio(new Livro(1, "O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        biblioteca.adicionarNoFim(new Livro(2, "Diário de um Banana", "Jeff Kinney"));
        biblioteca.adicionarNoFim(new Livro(3, "A Garota que Você Deixou para Trás", "Jojo Moyes"));

        // Imprimir livros na ordem original
        System.out.println("\n--- Livros na Ordem Original ---");
        biblioteca.imprimirEmOrdem();

        // Imprimir livros na ordem reversa
        System.out.println("\n--- Livros na Ordem Reversa ---");
        biblioteca.imprimirEmOrdemReversa();

        // Buscar livro por ID
        System.out.println("\n--- Busca por ID do Livro (ID: 2) ---");
        biblioteca.pesquisarPorId(2);

        // Remover livros
        System.out.println("\n--- Remover Primeiro Livro ---");
        biblioteca.removerNoInicio();

        System.out.println("\n--- Remover Último Livro ---");
        biblioteca.removerNoFim();

        // Imprimir livros após remoções
        System.out.println("\n--- Livros Após as Remoções ---");
        biblioteca.imprimirEmOrdem();
    }
}

