package carreiras.com.github.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.R
import carreiras.com.github.orgs.model.Integrante
import carreiras.com.github.orgs.ui.recyclerview.adapter.ListaIntegrantesAdapter

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaIntegrantesAdapter(
            context = this,
            integrantes = listOf(
                Integrante("André", 94306, "Desenvolvedor"),
                Integrante("Giulia", 92799, "Analista"),
                Integrante("Panays", 95736, "Infraestrutura"),
                Integrante("Lucca", 94267, "Infraestrutura"),
                Integrante("Pedro", 95929, "Estudante"),
                Integrante("Gabriel", 93977, "Estudante"),
                Integrante("Vinicius", 93146, "Desenvolvedor"),
                Integrante("Guilherme", 92910, "Estudante"),
                Integrante("Breno", 93435, "Desenvolvedor"),
                Integrante("Gustavo", 96059, "Desenvolvedor"),
            )
        )
        // Pode ser configurado no layout
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}