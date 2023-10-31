public class Livro {
    private int isbn;
    private String autor;
    private String editora;
    private String titulo;

    public Livro(int isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
