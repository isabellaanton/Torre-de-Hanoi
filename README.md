# 🗼 Torre de Hanói em Java

Este repositório contém uma implementação em **Java** para resolver o clássico quebra-cabeça matemático da **Torre de Hanói**. O projeto foi desenvolvido para estudar e demonstrar os conceitos de **recursão** e **análise de complexidade de algoritmos**.

---

## 📋 Sobre o Desafio

O objetivo da Torre de Hanói é mover todos os discos de uma torre inicial (Origem) para uma torre final (Destino), usando uma torre intermediária (Auxiliar). 

As regras são:
1. Mover apenas um disco por vez.
2. Um disco maior nunca pode ficar em cima de um disco menor.

---

## 🛠️ Como Funciona o Algoritmo

O código resolve o problema dividindo-o em três subproblemas recursivos:
1. Move n-1 discos da **Origem** para a torre **Auxiliar**.
2. Move o maior disco restante diretamente da **Origem** para o **Destino**.
3. Move os n-1 discos da torre **Auxiliar** para o **Destino**.

---

## 📊 Análise de Complexidade

O código possui anotações sobre o custo computacional de cada linha:

* **Complexidade de Tempo:** \(O(2^n)\) — O tempo de execução cresce de forma exponencial. Cada novo disco dobra o número de movimentos necessários.
* **Operações Constantes O(1):** A impressão no console e o incremento da variável `movimentos` possuem tempo de execução constante.

---

## 💻 Código Fonte

```java
public class Hanoi {
    static int movimentos = 0;

    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n > 0) {
            hanoi(n - 1, origem, auxiliar, destino); // T(n-1)
            
            System.out.println("Moveu de " + origem + " para " + destino); // O(1)
            movimentos++; // O(1)
            
            hanoi(n - 1, auxiliar, destino, origem); // T(n-1)
        }
    }

    public static void main(String[] args) {
        int n = 3; // Quantidade de discos
        long t0 = System.currentTimeMillis();
        
        hanoi(n, 'A', 'C', 'B');
        
        long t1 = System.currentTimeMillis();
        System.out.println("Movimentos: " + movimentos + " | Tempo: " + (t1 - t0) + " ms");
    }
}
```

---

## 🚀 Exemplo de Saída (Para 3 Discos)

Quando o programa é executado com 3 discos, o resultado no console é:

```text
Moveu de A para C
Moveu de A para B
Moveu de C para B
Moveu de A para C
Moveu de B para A
Moveu de B para C
Moveu de A para C
Movimentos: 7 | Tempo: 1 ms
```

---
Desenvolvido para fins de estudos de estruturas de dados e algoritmos. 🚀
