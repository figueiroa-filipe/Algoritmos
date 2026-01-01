/**
 * Problema: 1480. Running Sum of 1d Array
 * Fonte: LeetCode
 * Dificuldade: Easy
 * 
 * Descrição:
 * Dado um array `nums`, o running sum é definido como:
 * runningSum[i] = nums[0] + nums[1] + ... + nums[i]
 * 
 * Retorne o running sum de `nums`.
 * 
 * Exemplo:
 * Entrada: nums = [1,2,3,4]
 * Saída: [1,3,6,10]
 * 
 * Abordagem:
 * - Itera a partir do índice 1
 * - Soma o valor atual com o valor acumulado anterior
 * - Atualiza o próprio array
 * 
 * Complexidade:
 * Tempo: O(n)
 * Espaço: O(1)
 */

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
