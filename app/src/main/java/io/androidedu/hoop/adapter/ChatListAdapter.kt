package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.models.ChatModel
import io.androidedu.hoop.viewHolder.ChatListViewHolder

class ChatListAdapter(val chatList: ArrayList<ChatModel>, val onItemClickListener: (chatModel: ChatModel) -> Unit) :
    RecyclerView.Adapter<ChatListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder {

        return ChatListViewHolder(parent)

    }

    override fun getItemCount(): Int = chatList.size

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }


    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {

        holder.bind(chatList[position], onItemClickListener)


    }

}
