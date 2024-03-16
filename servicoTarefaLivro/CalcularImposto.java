/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicoTarefaLivro;

import modeloTarefaLivro.Livro;


public class CalcularImposto {
    
    public static void calcularImposto(Livro livro)
    {
        System.out.println("calculando imposto livro");
        double imposto = livro.calcularImposto();
        System.out.println("Nome -> "+ livro.getNome() );
        System.out.println("Autor -> "+ livro.getAutor() );
        System.out.println("Id Livro -> "+ livro.getIdLivro());
        System.out.println("Numero de pagina -> "+ livro.getNumPaginas() );
        System.out.println("Valor -> "+ livro.getValor());
        System.out.println("Imposto -> "+ imposto);
    }
    
}
