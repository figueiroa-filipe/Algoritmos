/**
 * Problema: 66. Plus One
 * Fonte: LeetCode
 * Dificuldade: Easy
 * 
 * Descrição:
 * Você recebe um número inteiro grande representado como um array de dígitos `digits`,
 * onde cada elemento representa um dígito do número.
 * 
 * Os dígitos estão ordenados do mais significativo para o menos significativo
 * e não há zeros à esquerda.
 * 
 * Incremente o número em 1 e retorne o array resultante.
 * 
 * Exemplo:
 * Entrada: digits = [9,9]
 * Saída: [1,0,0]
 * 
 * Abordagem:
 * - Percorre o array do final para o início
 * - Se o dígito for menor que 9, incrementa e retorna
 * - Caso contrário, zera o dígito e continua
 * - Se todos os dígitos forem 9, cria um novo array com tamanho +1
 * 
 * Complexidade:
 * Tempo: O(n)
 * Espaço: O(n)
 */

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
