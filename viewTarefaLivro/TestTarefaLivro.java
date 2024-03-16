/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewTarefaLivro;

import modeloTarefaLivro.LivroA;
import servicoTarefaLivro.CalcularImposto;

/**
 *
 * @author bruna
 */
public class TestTarefaLivro {
    public static void main(String[] args) {
        LivroA livroA = new LivroA("Sherlock Holmes","Sir Arthur Doyle", 170, 123331, 25);
        CalcularImposto.calcularImposto(livroA);
    }
}
