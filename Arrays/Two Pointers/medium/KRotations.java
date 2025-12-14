/**
 * Problema: K Rotations
 * Fonte: Codeintuition
 * Dificuldade: Medium
 * Padrão: Two Pointers (Subproblem)
 * Tempo estimado: 20min
 * 
 * Descrição:
 * Given an array arr and a non-negative number k, write a function to rotate
 * the array by k steps to the right.
 * 
 * Tradução:
 * Dado um array arr e um número não negativo k, escreva uma função para rotacionar
 * o array k passos para a direita.
 * 
 * Restrições:
 * - Your function must do it by modifying the input array in-place
 * - O(1) space complexity
 * - (Você deve fazer modificando o array de entrada in-place, com complexidade
 *   de espaço O(1))
 * 
 * Explicação da Solução (3 Reversões):
 * 1. Reverter todo o array
 * 2. Reverter os primeiros k elementos
 * 3. Reverter os elementos restantes (de k até o fim)
 * 
 * Exemplo:
 * arr = [1,2,3,4,5,6,7], k = 3
 * 1. Reverter tudo:     [7,6,5,4,3,2,1]
 * 2. Reverter 0 a k-1:  [5,6,7,4,3,2,1]
 * 3. Reverter k a n-1:  [5,6,7,1,2,3,4] ✅
 * 
 * Complexidade:
 * - Tempo: O(n) - três passadas de O(n)
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Amazon, Apple, Microsoft, Bloomberg
 */

class Solution {
    public void reverse(int[] arr, int esquerda, int direita) {
        while (esquerda < direita) {
            int temp = arr[esquerda];
            arr[esquerda] = arr[direita];
            arr[direita] = temp;
            esquerda++;
            direita--;
        }
    }
    
    public void kRotations(int[] arr, int k) {
        int n = arr.length;
        
        k = k % n;
        
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
}
