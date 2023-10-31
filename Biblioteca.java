import java.util.ArrayList;
import java.util.List;

public class Biblioteca extends Livro {

    List<Livro> livros = new ArrayList<Livro>();

    public Biblioteca(int isbn, String autor, String editora, String titulo) {
        super(isbn, autor, editora, titulo);
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void removeLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> imprimeLivros() {
        return livros;
    }

    public List<Livro> verificaLivro(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<Livro>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> obtemLivros(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<Livro>();
        for (Livro livro : livros) {
            if (livro.getAutor().equals(titulo)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> verificarListaVazia() {
        List<Livro> livrosEncontrados = new ArrayList<Livro>();
        if (livros.isEmpty()) {
            return livrosEncontrados;
        } else {
            return livros;
        }
    }



}
