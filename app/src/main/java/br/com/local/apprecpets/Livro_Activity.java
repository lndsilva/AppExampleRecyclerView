package br.com.local.apprecpets;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Livro_Activity extends AppCompatActivity {

    private TextView txtTitulo, txtDescricao, txtCategoria;
    private ImageView imagemLivro;
    Toolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.livro_layout);

        txtTitulo = findViewById(R.id.txtIdTitulo);
        txtDescricao = findViewById(R.id.txtIdDescricao);
        txtCategoria = findViewById(R.id.txtIdCategoria);
        imagemLivro = findViewById(R.id.idImgLivroN);
        idToolBar = findViewById(R.id.idToolBarLivros);

        //Inserir ação na seta de retorno da janela
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
            }
        });


        //Intent que irá receber os valores da outra janela.
        Intent intent = getIntent();

        //As variáveis que irão receber os valores da outra janela.
        String titulo, descricao, categoria;
        int miniatura;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");
        miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtCategoria.setText(categoria);
        imagemLivro.setImageResource(miniatura);

    }
}