package br.com.caelum.conexaojava;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import br.com.caelum.conexaojava.modelo.BuscadorDePerguntas;
import br.com.caelum.conexaojava.modelo.Pergunta;
import br.com.caelum.conexaojava2014.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		List<Pergunta> perguntas = new BuscadorDePerguntas().getPerguntas();

		ListView lista = (ListView) findViewById(R.id.lista);

		ArrayAdapter<Pergunta> adapterDaLista = new ArrayAdapter<Pergunta>(this,
				android.R.layout.simple_list_item_1, perguntas);
		lista.setAdapter(adapterDaLista);

		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view,
					int posicao, long id) {

				Toast.makeText(MainActivity.this, "Posicao clicada " + posicao,
						Toast.LENGTH_SHORT).show();
			}
		});

	}
}
