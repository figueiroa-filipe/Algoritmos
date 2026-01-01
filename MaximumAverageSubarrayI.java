/**
 * Problema: 643. Maximum Average Subarray I
 * Fonte: LeetCode / Codeintuition
 * Dificuldade: Easy
 * Padrão: Sliding Window (Fixed Size)
 * Tags: Topics, Companies
 * 
 * Descrição:
 * You are given an integer array nums consisting of n elements, and an integer k.
 * 
 * Find a contiguous subarray whose length is equal to k that has the maximum
 * average value and return this value. Any answer with a calculation error less
 * than 10^-5 will be accepted.
 * 
 * Tradução:
 * Você recebe um array de inteiros nums consistindo de n elementos, e um inteiro k.
 * 
 * Encontre um subarray contíguo cujo comprimento seja igual a k que tenha o valor
 * médio máximo e retorne este valor. Qualquer resposta com erro de cálculo menor
 * que 10^-5 será aceita.
 * 
 * Estratégia - Sliding Window de Tamanho Fixo:
 * 1. Calcular a soma da primeira janela (primeiros k elementos)
 * 2. Deslizar a janela: remover primeiro elemento, adicionar próximo
 * 3. Atualizar o máximo a cada passo
 * 4. Retornar média máxima (soma máxima / k)
 * 
 * Exemplo:
 * Input:  nums = [1,12,-5,-6,50,3], k = 4
 * 
 * Janela 1: [1, 12, -5, -6] = 2       → avg = 2/4 = 0.5
 * Janela 2: [12, -5, -6, 50] = 51    → avg = 51/4 = 12.75 (máximo!)
 * Janela 3: [-5, -6, 50, 3] = 42     → avg = 42/4 = 10.5
 * 
 * Output: 12.75000
 * 
 * Otimização:
 * Em vez de recalcular soma toda hora:
 * novaSoma = somaAnterior - nums[i-k] + nums[i]
 * (remove o primeiro da janela, adiciona o novo)
 * 
 * Complexidade:
 * - Tempo: O(n) - uma passada pelo array
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Topics, Companies
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sumValues = 0;
        double maxAverage = 0;
        
        // sliding window até k elementos
        for (int i = 0; i < k; i++) {
            sumValues += nums[i];
        }
        maxAverage = sumValues/(1.0*k);
        
        for (int i = k; i < nums.length; i++) {
            sumValues += nums[i] - nums[i - k]; // sliding window
            maxAverage = Math.max(maxAverage, (sumValues/(1.0*k)));
        }
        
        return maxAverage;
    }
}
