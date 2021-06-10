package app;

import model.Fila;

public class TesteFila {

    public static void main(String[] args) {
        Fila<String> f = new Fila<>();
        
        f.Inserir("A");
        f.Inserir("B");
        f.Inserir("C");
        f.Inserir("D");
        f.Inserir("E");
        System.out.println("Tamanho: " + f.tamanho());
        System.out.println(f);
        System.out.println("Existe D?: " + f.existeDado("D"));
        System.out.println("Está vazia?: " + f.isEmpty());
        System.out.println("Recuperar inicio da fila: " + f.Recuperar());
        System.out.println("Alterar inicio da fila! A1 "); f.Alterar("A1");
        System.out.println(f);
        System.out.println("Removendo inicio!"); f.Remover();
        System.out.println(f);
        System.out.println("Tamanho: " + f.tamanho());
        System.out.println("Limpando!"); f.limpa();
        System.out.println(f);
        System.out.println("Existe B?: " + f.existeDado("B"));
        
    }
}
