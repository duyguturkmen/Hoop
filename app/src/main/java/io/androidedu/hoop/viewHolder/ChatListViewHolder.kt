package io.androidedu.hoop.viewHolder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.models.ChatModel
import io.androidedu.hoop.R
import kotlinx.android.synthetic.main.adapter_item_chat_list.view.*

class ChatListViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_item_chat_list,
            parent,
            false
        )
    ) {

    private val imageProfile: ImageView by lazy { itemView.findViewById<ImageView>(R.id.imgProfile) }
    private val txtUserName: TextView by lazy { itemView.findViewById<TextView>(R.id.txtUserName) }
    private val txtUserMessage: TextView by lazy { itemView.findViewById<TextView>(R.id.txtUserMessage) }
    private val txtDate: TextView by lazy { itemView.findViewById<TextView>(R.id.txtDate) }


    fun bind(chatModel: ChatModel, onItemClickListener: (chatModel: ChatModel) -> Unit) {

        imageProfile.setBackgroundResource(chatModel.profilePhoto)
        txtUserName.text = chatModel.userName
        txtUserMessage.text = chatModel.userMessage
        txtDate.text = chatModel.date

        itemView.setOnClickListener {
            onItemClickListener(chatModel)

        }

    }

}