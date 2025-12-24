/**
 * Problema: Concatenation of Array
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Array Manipulation
 * Tags: Company Tags
 * 
 * Descrição:
 * You are given an integer array nums of length n. Create an array ans of length
 * 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * 
 * Specifically, ans is the concatenation of two nums arrays.
 * 
 * Return the array ans.
 * 
 * Tradução:
 * Você recebe um array de inteiros nums de comprimento n. Crie um array ans de
 * comprimento 2n onde ans[i] == nums[i] e ans[i + n] == nums[i] para 0 <= i < n
 * (indexado em 0).
 * 
 * Especificamente, ans é a concatenação de dois arrays nums.
 * 
 * Retorne o array ans.
 * 
 * Explicação:
 * - Criar um novo array com o dobro do tamanho do original
 * - Primeira metade = cópia do array original
 * - Segunda metade = cópia do array original novamente
 * 
 * Exemplo:
 * Input:  nums = [1,2,1]
 * Output: ans = [1,2,1,1,2,1]
 *               └─────┘└─────┘
 *               nums[0..2] + nums[0..2]
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre o array original uma vez
 * - Espaço: O(n) - cria array de tamanho 2n
 * 
 * Empresas: Company Tags (não especificadas)
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length * 2];
        
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = nums[i%nums.length];
        }
        
        return newArr;
    }
}
