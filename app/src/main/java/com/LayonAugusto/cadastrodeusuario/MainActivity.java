package com.LayonAugusto.cadastrodeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.joaovinicius.cadastrodeusuario.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   // declaração dos componentes visuais e do adptador da lista
    RecyclerView recyclerView;

    UserAdapter adapter;

    Button btnCadastrar;

    // ATENÇÃO atributo estatico(static) permite que os dados persistam na memoria
    // enquanto o app estiver aberto e sejam acessados diretamente por outras telas
    public static List<String> listaNomes = new ArrayList<>();

    // metodo de inicialização da activity(ponto de entrada da tela)

    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        // Vincula o arquivo de layout XML(Activy_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        // regra de negocio: insere um texto no topo da lista caso ela estaje vazia
        if (listaNomes.isEmpty()){
            listaNomes.add("Nomes de Cadastros");
        }

        //mapeando dos componentes do RecyclerView do XML para o objeto java
        recyclerView = findViewById(R.id.recycle_view);

        // Define o layoutManager: organiza itens da lista numa coluna vertical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Instancia o adaptador passando a nossa lista de nomes
        adapter = new UserAdapter(listaNomes);

        //Conecta o adaptador ao RecyclaerView para que os dados sejam desenhados na tela
        recyclerView.setAdapter(adapter);

        // mapeia o botão de cadastro
        btnCadastrar = findViewById(R.id.btnCadastrar);

        //Configura o evento de clique usando a expressão lambda(java 8+)
        btnCadastrar.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CreateUser.class));
        });

    }

}