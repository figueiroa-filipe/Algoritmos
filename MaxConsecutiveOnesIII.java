/**
 * Problema: 1004. Max Consecutive Ones III
 * Fonte: LeetCode / Codeintuition
 * Dificuldade: Medium
 * Padrão: Sliding Window (Variable Size)
 * Tags: Topics, Companies, Hint
 * 
 * Descrição:
 * Given a binary array nums and an integer k, return the maximum number of
 * consecutive 1's in the array if you can flip at most k 0's.
 * 
 * Tradução:
 * Dado um array binário nums e um inteiro k, retorne o número máximo de 1's
 * consecutivos no array se você pode inverter no máximo k 0's.
 * 
 * Estratégia - Sliding Window Variável:
 * 1. Usar duas pointers: esquerda e direita
 * 2. Expandir janela para direita
 * 3. Contar zeros dentro da janela
 * 4. Quando zeros > k, contrair janela pela esquerda
 * 5. Calcular tamanho máximo da janela válida
 * 
 * Exemplo 1:
 * Input:  nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * 
 * Podemos flipar até 2 zeros
 * Melhor janela: [1,1,1,0,0,0,1,1,1,1] (flipa os dois 0's do meio)
 *                     └─────────────┘
 * Comprimento: 6 (de índice 4 a 9)
 * 
 * Output: 6
 * 
 * Exemplo 2:
 * Input:  nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * 
 * Lógica da Janela:
 * - zeros <= k: janela válida (pode flipar todos os zeros)
 * - zeros > k: janela inválida (precisa encolher)
 * - tamanho = direita - esquerda + 1
 * 
 * Complexidade:
 * - Tempo: O(n) - cada elemento visitado no máximo 2 vezes
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Companies (não especificadas)
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int esquerda = 0;
        int zeros = 0;
        int tamanhoMax = 0;
        
        for (int direita = 0; direita < nums.length; direita++){
            if (nums[direita] == 0) zeros++;
            
            while (zeros > k) {
                if (nums[esquerda] == 0) {
                    zeros--;
                }
                esquerda++;
            }
            
            tamanhoMax = Math.max(tamanhoMax, direita - esquerda + 1);
        }
        
        return tamanhoMax;
    }
}
