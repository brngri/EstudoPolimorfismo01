/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTarefaLivro;

/**
 *
 */
public abstract class Livro implements Imposto {
  
    private String nome;
    private String autor;
    private int numPaginas;
    private int idLivro;
    private double valor;
    
    public Livro(String nome, String autor, int numPaginas, int idLivro, double valor)
    {
        this.nome = nome;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.idLivro = idLivro;
        this.valor = valor;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
     public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    
    public void setNumPaginas(int numPaginas)
    {
        this.numPaginas = numPaginas;
    }
    
    public int getNumPaginas()
    {
        return this.numPaginas;
    }
    
    public void setIdLivro(int idLivro)
    {
        this.idLivro = idLivro;
    }
    
    public int getIdLivro()
    {
        return this.idLivro;
    }
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
