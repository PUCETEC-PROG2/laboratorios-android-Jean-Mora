package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList(
    modifier: Modifier= Modifier
){
    Column (
        modifier = Modifier
    ){
        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://cdn.pixabay.com/photo/2023/03/16/08/42/camping-7856198_640.jpg",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://unsplash-assets.imgix.net/modules/asset-edit/photo.png?auto=format&fit=crop&q=60",
            language = "Python"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://static.vecteezy.com/system/resources/thumbnails/004/125/202/small/panorama-of-night-sky-with-clouds-and-full-moon-photo.jpg",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmiopXZQ8AJQI7fpxahzh-FwX-SAw_nEiLnQ&s",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://www.hazunaweb.com/imagenes/prueba.jpg",
            language = "Kotlin"
        )
    }
}