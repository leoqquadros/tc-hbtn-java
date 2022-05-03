package livraria;
import exceptions.*;
public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws exceptions.LivroInvalidoException, exceptions.AutorInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws exceptions.LivroInvalidoException {
        if (titulo.length() > 3) {
            this.titulo = titulo;
        } else {
            throw new exceptions.LivroInvalidoException("Titulo de livro invalido");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws exceptions.AutorInvalidoException {
        if (autor.contains(" ")) {
            this.autor = autor;
        } else {
            throw new exceptions.AutorInvalidoException("Nome de autor invalido");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws exceptions.LivroInvalidoException {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new exceptions.LivroInvalidoException("Preco de livro invalido");
        }

    }

}
