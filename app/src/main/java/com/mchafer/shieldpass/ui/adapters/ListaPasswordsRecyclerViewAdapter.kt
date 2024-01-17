package com.example.test_nocompose.ui.adapters

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mchafer.shieldpass.R
import com.mchafer.shieldpass.dat.PasswordDat
import com.mchafer.shieldpass.databinding.ItemRecyclerviewListapasswordsBinding
import com.mchafer.shieldpass.ui.adapters.ListaPasswordsInterface
import com.mchafer.shieldpass.utils.Constantes

class ListaPasswordsRecyclerViewAdapter(private val listaPasswordDats:List<PasswordDat?>, private val listaPasswordsInterface: ListaPasswordsInterface) :
    RecyclerView.Adapter<ListaPasswordsRecyclerViewAdapter.ListaPasswordsRecyclerViewViewHolder>() {

    // Se va a llamar con cada item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaPasswordsRecyclerViewViewHolder {
        Log.d(Constantes.TAG,"[ListaPasswordsRecyclerViewAdapter.onCreateViewHolder]");
        val layoutInflater = LayoutInflater.from(parent.context)
        return ListaPasswordsRecyclerViewViewHolder(layoutInflater.inflate(R.layout.item_recyclerview_listapasswords,parent,false))
    }

    override fun onBindViewHolder(holder: ListaPasswordsRecyclerViewViewHolder, position: Int) {
        Log.d(Constantes.TAG,"[ListaPasswordsRecyclerViewAdapter.onBindViewHolder]");
        val item = listaPasswordDats[position]
        holder.render(item, listaPasswordsInterface)
    }

    // Tamaño de la lista
    override fun getItemCount() = listaPasswordDats.size

    class ListaPasswordsRecyclerViewViewHolder(view: View)  :RecyclerView.ViewHolder(view){


        // Elementos de la IU
        val binding = ItemRecyclerviewListapasswordsBinding.bind(view)

        fun render(contactoDat: PasswordDat?, listaContactosInterface: ListaPasswordsInterface){

            /*

            // Nombre del contacto
            binding.nombreTxtVwContacto.setText(contactoDat?.nombre)
            binding.nombreTxtVwContacto.setTypeface(null, Typeface.BOLD)

            // Información de la comunidad
            binding.apellidosTxtVwContacto.setText(contactoDat?.apellidos)
            binding.telefonoTxtVwContacto.setText(contactoDat?.telefono.toString())

            // Botones
            binding.llamarBtnContacto.setOnClickListener {listaContactosInterface.llamarContacto(contactoDat)}
            binding.eliminarTxtVwContacto.setOnClickListener {
                // Usamos el metodo de la interfaz
                listaContactosInterface.eliminarContacto(contactoDat);
            }

             */



        }
    }

}