/**
 * Problema: Group Anagrams
 * Fonte: Codeintuition
 * Dificuldade: Medium
 * Padrão: Hash Table
 * Tags: Company Tags
 * 
 * Descrição:
 * Given an array of strings strs, group all anagrams together into sublists.
 * You may return the output in any order.
 * 
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 * 
 * Tradução:
 * Dado um array de strings strs, agrupe todos os anagramas juntos em sublistas.
 * Você pode retornar a saída em qualquer ordem.
 * 
 * Um anagrama é uma string que contém exatamente os mesmos caracteres de outra
 * string, mas a ordem dos caracteres pode ser diferente.
 * 
 * Estratégia:
 * - Usar HashMap onde a chave é a "assinatura" do anagrama
 * - Assinatura = contagem de frequência de cada caractere
 * - Usar array de 26 posições (a-z) para contar frequência
 * - Converter array para String para usar como chave
 * - Agrupar strings com mesma assinatura
 * 
 * Exemplo:
 * Input:  ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 
 * Assinaturas:
 * "eat" → [1,0,0,0,1,0,...,1] → "1 0 0 0 1 0...1"
 * "tea" → [1,0,0,0,1,0,...,1] → "1 0 0 0 1 0...1" (mesma!)
 * "ate" → [1,0,0,0,1,0,...,1] → "1 0 0 0 1 0...1" (mesma!)
 * 
 * Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
 * 
 * Complexidade:
 * - Tempo: O(n * k) - n strings, k comprimento médio
 * - Espaço: O(n * k) - armazena todas as strings agrupadas
 * 
 * Empresas: Company Tags (não especificadas)
 */

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
