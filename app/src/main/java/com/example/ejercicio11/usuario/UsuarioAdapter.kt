package com.example.ejercicio11.usuario

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio11.R

class UsuarioAdapter (
    private val usuarios: List<Usuario>
) : RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>(){
    //  guarda las referencias a los componentes de item_usuario.xml
    class UsuarioViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val nombre: TextView =
            itemView.findViewById(R.id.txtNombre)

        val apellido: TextView =
            itemView.findViewById(R.id.txtApellido)

        val edad: TextView =
            itemView.findViewById(R.id.txtEdad)
    }


    // Crea el layout que se utilizara para cada usuario
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UsuarioViewHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_usuario,
                parent,
                false
            )

        return UsuarioViewHolder(view)
    }


    // Relaciona los atributos del usuario con los textView y los "acomoda" en el layout
    override fun onBindViewHolder(
        holder: UsuarioViewHolder,
        position: Int
    ) {
        // se "obtiene" el objeto correspondiente a
        val usuario = usuarios[position]

        holder.nombre.text = usuario.nombre
        holder.apellido.text = usuario.apellido
        holder.edad.text = usuario.edad.toString()
    }


    // Indicamos cuántos elementos tiene la lista
    override fun getItemCount(): Int {

        return usuarios.size
    }
}