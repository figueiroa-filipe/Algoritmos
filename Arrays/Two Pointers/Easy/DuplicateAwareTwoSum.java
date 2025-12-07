/**
 * Problema: Target Limited Two Sum
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Reduction)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given an array arr consisting of non negative integers and an integer target,
 * write a function to find the maximum possible sum such that there exist two
 * distinct indices i and j, satisfying the condition A[i] + A[j] = sum and the
 * sum is less than the target. If there are no such indices i and j that satisfy
 * the equation, return -1.
 * 
 * Tradução:
 * Dado um array arr contendo inteiros não negativos e um inteiro target (alvo),
 * escreva uma função para encontrar a soma máxima possível tal que existam dois
 * índices distintos i e j, satisfazendo a condição A[i] + A[j] = soma e a soma
 * é menor que o alvo. Se não existirem tais índices i e j que satisfaçam a
 * equação, retorne -1.
 * 
 * Objetivo:
 * - Encontrar a MAIOR soma possível
 * - Que seja MENOR que target
 * - Usando dois números distintos do array
 * 
 * Restrições:
 * - Array contém apenas inteiros não negativos
 * - Soma deve ser estritamente menor que target (soma < target)
 * - Índices devem ser distintos
 * 
 * Complexidade:
 * - Tempo: O(n log n) - sort + O(n) para two pointers
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Amazon, Google
 */

import java.util.Arrays;

class Solution {
    public int targetLimitedTwoSum(int[] arr, int target) {
        int esquerda = 0;
        int direita = arr.length - 1;
        int maximo = -1;
        
        Arrays.sort(arr);
        
        while (esquerda < direita) {
            int soma = arr[esquerda] + arr[direita];
            
            if(soma >= target) {
                if (arr[esquerda] > arr[direita]) esquerda++;
                else direita--;
            } else {
                maximo = Math.max(maximo, soma);
                if (arr[esquerda] < arr[direita]) esquerda++;
                else direita--;
            }
        }
        
        return maximo;
    }
}
