package com.joaovinicius.cadastrodeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter {
    // Classe Adapter: Gerencia a criacao e o preenchimento dos itens na RecycleView
    public class UserAdapter extends RecyclerView
            .Adapter<UserAdapter.ViewHolder> {
        // Atributo privado que armazena a referencia dos dados que serao exibidos
        private List<String> listaUsuarios;

        // Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
        public UserAdapter(List<String> listaUsuarios) {
            this.listaUsuarios = listaUsuarios;
        }

        // Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
        @NotNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                             int viewType) {
            // LayoutInflater o arquivo XML em um objeto View Java
            // Aqui usamos um layout padrão do android (simple_list_item1) para facilitar
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);

            // Retorna uma nova instância da nossa classe interna ViewHolder com view criada
            return new ViewHolder(view);

        }
        // metodo 2: vincular os dados de um objeto de lista a uma linha especifica da tela
        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
            // recupera os dados da lista de acordo com a posição que o andriod esta desenhando agora
            String nome = listaUsuarios.get(position);

            // define o texto no componente visual que esta guardado dentro de 'holder'
            holder.tvHome.setText(nome);

        }

        // metodo: 3 informa ao android quantos itens de listas possui ao todo

        @Override
        public int getItemCount(){
            // se a lista existir retorna o tamanho se não retorna zero

            return listaUsuarios != null ? listaUsuarios.size():0;

        }
        // Classe interna ViewHolder: servir para segurar as referências dos componentes de cada linha
        // Evitar chamadas respectivas ao findViewByid, melhorando a perfome do RecycleView

        public class ViewHolder extends RecyclerView.ViewHolder{
            // referencia pata TextViewq da linha
            TextView tvNome;

            public ViewHolder(@NonNull View itemView){
                super(itemView);
                // faz o mapeamento do id do layout para o objeto java
                // android.R.id.text1 eo id padrão do layout 'simple_list_item_1'

                tvNome = itemView.findViewById(android.R.id.text1);
            }

        }
    }
}

