/**
 * Problema: Largest Container
 * Fonte: Codeintuition
 * Dificuldade: Medium
 * Padrão: Two Pointers (Reduction)
 * Tempo estimado: 20min
 * 
 * Descrição:
 * You are given an integer array heights, where height[i] represents the height
 * of a wall at position i. Write a function to find two walls that, together with
 * the x-axis, form a container holding the maximum water and return the area of
 * this container.
 * 
 * Tradução:
 * Você recebe um array de inteiros heights, onde height[i] representa a altura
 * de uma parede na posição i. Escreva uma função para encontrar duas paredes que,
 * junto com o eixo x, formam um contêiner que contém a quantidade máxima de água
 * e retorne a área deste contêiner.
 * 
 * Explicação:
 * - A área é calculada como: largura * altura_mínima
 * - Largura = distância entre os dois índices (direita - esquerda)
 * - Altura = o menor dos dois valores (Math.min)
 * - Objetivo: maximizar a área
 * 
 * Restrições:
 * - Array contém alturas de paredes
 * - Não pode inclinar o container (área limitada pela menor altura)
 * - Precisa encontrar a MAIOR área possível
 * 
 * Complexidade:
 * - Tempo: O(n) - passa uma vez pelo array
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Amazon, Apple, Google, Facebook, Microsoft, Adobe
 */

import java.util.*;

class Solution {
    public int largestContainer(int[] heights) {
        int esquerda = 0;
        int direita = heights.length - 1;
        int area = Integer.MIN_VALUE;
        
        while (esquerda < direita) {
            int tempArea = Math.min(heights[esquerda], heights[direita]) * (direita - esquerda);
            area = Math.max(area, tempArea);
            
            if (heights[esquerda] < heights[direita]) {
                esquerda++;
            } else if (heights[esquerda] > heights[direita]) {
                direita--;
            } else {
                esquerda++;
                direita--;
            }
        }
        
        return area;
    }
}
