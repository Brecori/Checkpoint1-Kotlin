package carreiras.com.github.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.R
import carreiras.com.github.orgs.model.Integrante

class ListaIntegrantesAdapter(
    private val context: Context,
    private val integrantes: List<Integrante>
) : RecyclerView.Adapter<ListaIntegrantesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(integrante: Integrante) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = integrante.nome

            val rm  = itemView.findViewById<TextView>(R.id.rm)
            rm.text = integrante.rm.toString();

            val valor = itemView.findViewById<TextView>(R.id.profissao)
            valor.text = integrante.profissao;
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaIntegrantesAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.integrante, parent, false)
        return ListaIntegrantesAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = integrantes.size

    override fun onBindViewHolder(holder: ListaIntegrantesAdapter.ViewHolder, position: Int) {
        val integrante = integrantes[position]
        holder.vincula(integrante)
    }
}
