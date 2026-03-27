# 📱 Cadastro de Usuário

Aplicativo Android desenvolvido para fins de aprendizado em Desenvolvimento Mobile. O projeto permite cadastrar usuários e exibir seus nomes em uma lista dinâmica utilizando **RecyclerView**.

---

## 🚀 Funcionalidades

* **Tela Principal (MainActivity):**

  * Exibe uma lista de nomes cadastrados.
  * Utiliza **RecyclerView** com **LinearLayoutManager** para organização vertical.
  * Atualiza automaticamente a lista ao retornar de outra tela.

* **Cadastro de Usuário (CreateUser):**

  * Permite inserir novos usuários (nome e e-mail).
  * Os dados são adicionados à lista compartilhada.

* **Atualização Dinâmica:**

  * A lista é atualizada no método `onResume()` garantindo que novos usuários apareçam automaticamente.

* **Persistência Temporária:**

  * Os dados são armazenados em uma lista estática (`listaNomes`), permanecendo disponíveis enquanto o app estiver em execução.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Android SDK**
* **RecyclerView** para listagem eficiente
* **LinearLayoutManager** para organização dos itens
* **Material Design** (TextInputLayout, TextInputEditText)
* **Layouts XML** (ConstraintLayout / LinearLayout)

---

## 📂 Estrutura do Projeto

* **MainActivity**

  * Responsável por exibir a lista de usuários
  * Controla o RecyclerView e o botão de cadastro
  * Atualiza a lista ao voltar para a tela

* **CreateUser**

  * Tela de cadastro de novos usuários

* **UserAdapter**

  * Adaptador do RecyclerView
  * Responsável por:

    * Criar as views dos itens (`onCreateViewHolder`)
    * Vincular dados (`onBindViewHolder`)
    * Informar o tamanho da lista (`getItemCount`)
  * Utiliza o layout padrão `simple_list_item_1`

* **ViewHolder (interno ao Adapter)**

  * Mantém referência ao `TextView` de cada item
  * Melhora a performance evitando múltiplos `findViewById`

* **Layouts**

  * `activity_main.xml`: Tela principal com RecyclerView e botão
  * `create_user.xml`: Formulário de cadastro

---

## ⚙️ Funcionamento Interno

* A lista de usuários é mantida em:

  ```java
  public static List<String> listaNomes = new ArrayList<>();
  ```

* Um item padrão é adicionado caso a lista esteja vazia:

  ```java
  if (listaNomes.isEmpty()){
      listaNomes.add("Nomes de Cadastros");
  }
  ```

* A navegação entre telas é feita via `Intent`:

  ```java
  startActivity(new Intent(MainActivity.this, CreateUser.class));
  ```

* A atualização da lista ocorre com:

  ```java
  adapter.notifyDataSetChanged();
  ```

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto no **Android Studio**
3. Aguarde a sincronização do Gradle
4. Execute em:

   * Emulador Android
   * Ou dispositivo físico (Android 5.0+)

---

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com foco em aprendizado dos conceitos fundamentais de:

* RecyclerView
* Adapter e ViewHolder
* Navegação entre Activities
* Manipulação de listas em memória
* Estrutura básica de apps Android

---

## 👨‍💻 Autor

Projeto desenvolvido durante aulas de **Desenvolvimento Mobile**.

