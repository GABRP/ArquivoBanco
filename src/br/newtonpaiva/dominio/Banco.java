package br.newtonpaiva.dominio;

import br.newtonpaiva.dominio.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public double calcularSaldoTotal() {
        double total = 0;
        for (Conta conta : contas) {
            total += conta.getSaldo();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}