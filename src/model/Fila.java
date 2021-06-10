package model;

public class Fila<T> {

    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public Fila() {
    }

    public void Inserir(T elemento) {
        if (this.totalDeElementos == 0) {
            if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    public boolean existeDado(T elemento) {
        Celula atual = this.primeira;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public boolean isEmpty() {
        return totalDeElementos == 0;
    }

    public T Recuperar() {
        return (T) this.primeira.getElemento();
    }

    public void Alterar(T elemento) {
        if (totalDeElementos == 0) {
            throw new IllegalArgumentException("Não há dados para alterar");
        }

    Remover();
        
   if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
       }

    public void Remover() {
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Posição não existe");
        }

        this.primeira = this.primeira.getProxima();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public int tamanho() {
        return totalDeElementos;
    }

    public void limpa() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;

    }

    
    @Override
    public String toString() {
        // Verificando se a Lista está vazia
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        Celula atual = primeira;

        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append("[" + atual.getElemento() + "]->");

            atual = atual.getProxima();
        }

        // último elemento
        builder.append("[" + atual.getElemento() + "]");

        return builder.toString();
    }
}
