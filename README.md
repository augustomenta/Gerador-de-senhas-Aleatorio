# 🔐 Gerador de Senhas Aleatórias em Java

Um gerador de senhas simples, seguro e interativo desenvolvido em Java. O projeto permite que o usuário defina o comprimento da senha desejada, utilizando a classe `SecureRandom` para garantir a imprevisibilidade dos caracteres.

---

## 🚀 Funcionalidades

* **Customização de Tamanho:** O usuário escolhe quantos caracteres a senha deve ter.
* **Segurança:** Utiliza `java.security.SecureRandom` em vez do `Random` padrão.
* **Mix de Caracteres:** Gera senhas contendo letras maiúsculas, minúsculas, números e símbolos.
* **Eficiência:** Construído utilizando `StringBuilder` para otimização de memória.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Entrada de Dados:** `java.util.Scanner`
* **Segurança:** `java.security.SecureRandom`
* **Estrutura de Strings:** `java.lang.StringBuilder`

---

## 📋 Como Executar

1. **Certifique-se de ter o JDK instalado** em sua máquina.
2. **Clone o repositório** ou copie o código do arquivo `.java`.
3. **Compile o arquivo**:
   ```bash
   javac GeradorInterativo.java
