package io.androidedu.hoop.util

import androidx.core.view.OneShotPreDrawListener.add
import io.androidedu.hoop.R
import io.androidedu.hoop.models.ChatModel

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {


        val chatModel = ChatModel(
            R.drawable.ic_photo_camera_white,
            "Duygu",
            "Message",
            "Yesterday"
        )
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)

    }
}