# Two Pointers Pattern (Técnica dos Dois Ponteiros)

## 📋 Visão Geral

A técnica dos dois ponteiros é um padrão de algoritmo eficiente para resolver problemas em arrays e strings. Utilizamos dois índices (ponteiros) que percorrem a estrutura de dados de forma inteligente, evitando comparações desnecessárias.

## 🎯 Conceito

Imagine ter **dois marcadores** em posições diferentes de um array. Em vez de verificar todas as combinações possíveis (força bruta), movemos esses ponteiros estrategicamente baseado em certas condições, reduzindo drasticamente o tempo de execução.

### Exemplo Visual
```
Array ordenado: [2, 3, 4, 5, 6, 7, 8]
                 ↑                 ↑
               left             right
```

## 🔧 Como Funciona

### Algoritmo Básico

1. Inicialize dois ponteiros (geralmente `left` e `right`)
2. Posicione-os conforme o problema (início/fim, ambos no início, etc.)
3. Execute operações com os valores apontados
4. Mova os ponteiros baseado em uma condição:
   - Se resultado < alvo → mova `left` para direita
   - Se resultado > alvo → mova `right` para esquerda
   - Se resultado == alvo → retorne a solução

### Exemplo Prático

**Problema:** Encontrar dois números que somados resultam em 9
```javascript
const arr = [2, 3, 4, 5, 6, 7, 8];
let left = 0, right = arr.length - 1;

while (left < right) {
  const sum = arr[left] + arr[right];
  
  if (sum === 9) return [left, right];      // ✓ Encontrou!
  else if (sum < 9) left++;                 // Aumenta a soma
  else right--;                             // Diminui a soma
}
```

**Passos:**
```
[2, 3, 4, 5, 6, 7, 8]  →  2 + 8 = 10 (muito!)  →  right--
 ↑                 ↑

[2, 3, 4, 5, 6, 7, 8]  →  2 + 7 = 9 ✓ Solução encontrada!
 ↑              ↑
```

## ✅ Quando Usar

**Use Two Pointers quando:**
- Array/string está **ordenado** (ou pode ser ordenado)
- Precisa encontrar pares/triplas com condição específica
- Trabalha com subarrays ou subsequências
- Verifica palíndromos ou simetria
- Remove duplicatas

**Não use quando:**
- Dados não ordenados e ordenação é custosa
- Precisa manter ordem original
- Problema requer busca em estruturas complexas

## 📊 Análise de Complexidade

| Caso | Complexidade de Tempo | Complexidade de Espaço |
|------|----------------------|------------------------|
| Melhor Caso | O(n) | O(1) |
| Caso Médio | O(n) | O(1) |
| Pior Caso | O(n) | O(1) |

**Comparação com Força Bruta:**
- Força Bruta: O(n²) - verifica todas as combinações
- Two Pointers: O(n) - percorre apenas uma vez ⚡

## 🎪 Aplicações Comuns

- **Par com soma específica** - Two Sum em array ordenado
- **Verificar palíndromo** - Comparar caracteres das extremidades
- **Remover duplicatas** - Em array ordenado
- **Container com mais água** - Problema clássico de arrays
- **Encontrar triplas** - Three Sum problem
- **Mesclar arrays ordenados** - Merge de estruturas

## 💻 Implementação Básica

### Template Genérico
```javascript
function twoPointers(arr) {
  let left = 0;
  let right = arr.length - 1;
  
  while (left < right) {
    // Processar valores
    const condition = /* sua lógica */;
    
    if (condition) {
      // Solução encontrada
      return result;
    } else if (/* mover left */) {
      left++;
    } else {
      right--;
    }
  }
  
  return null; // Sem solução
}
```

### Variação: Ambos no Início
```javascript
function slowFastPointers(arr) {
  let slow = 0;
  let fast = 0;
  
  while (fast < arr.length) {
    // Lógica específica
    if (/* condição */) {
      slow++;
    }
    fast++;
  }
  
  return slow;
}
```
