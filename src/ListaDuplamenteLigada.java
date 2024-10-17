public class ListaDuplamenteLigada {
    private Livro inicio;
    private Livro fim;

    // Adicionar Livro no Início
    public void adicionarNoInicio(Livro livro) {
        if (inicio == null) {
            inicio = fim = livro;
        } else {
            livro.proximo = inicio;
            inicio.anterior = livro;
            inicio = livro;
        }
    }

    // Adicionar Livro no Fim
    public void adicionarNoFim(Livro livro) {
        if (fim == null) {
            inicio = fim = livro;
        } else {
            fim.proximo = livro;
            livro.anterior = fim;
            fim = livro;
        }
    }

    // Remover Livro do Início
    public void removerNoInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Removendo: " + inicio);
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null; // Lista está vazia
        }
    }

    // Remover Livro do Fim
    public void removerNoFim() {
        if (fim == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Removendo: " + fim);
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null; // Lista está vazia
        }
    }

    // Pesquisar Livro por ID
    public void pesquisarPorId(int id) {
        Livro atual = inicio;
        while (atual != null) {
            if (atual.id == id) {
                System.out.println("Livro encontrado: " + atual);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    // Imprimir Livros na Ordem Original
    public void imprimirEmOrdem() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        Livro atual = inicio;
        System.out.println("Livros na ordem original:");
        while (atual != null) {
            System.out.println(atual);
            atual = atual.proximo;
        }
    }

    // Imprimir Livros na Ordem Reversa
    public void imprimirEmOrdemReversa() {
        if (fim == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        Livro atual = fim;
        System.out.println("Livros na ordem reversa:");
        while (atual != null) {
            System.out.println(atual);
            atual = atual.anterior;
        }
    }
}
