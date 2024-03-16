/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTarefaLivro;


public class LivroA extends Livro{

    public static final double VALOR_IMPOSTO_PORCENTAGEM = 0.06;
    
    public LivroA(String nome, String autor, int numPaginas, int idLivro, double valor) {
        super(nome, autor, numPaginas, idLivro, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto Sherlock");
        return this.getValor() * VALOR_IMPOSTO_PORCENTAGEM;
    }
    
    
}
