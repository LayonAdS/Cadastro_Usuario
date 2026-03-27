package com.LayonAugusto.cadastrodeusuario;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

   // declaração dos componentes visuais e do adptador da lista
    RecyclerView recyclerView;

    UserAdapter adapter;

    Button btnCadastrar;
}