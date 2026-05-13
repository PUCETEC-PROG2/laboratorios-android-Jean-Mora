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
            avatarURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSr1FEAkfTLz7PsGioXaxi0sqg8D8bf5d5T-w&s",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSr1FEAkfTLz7PsGioXaxi0sqg8D8bf5d5T-w&s",
            language = "Python"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSr1FEAkfTLz7PsGioXaxi0sqg8D8bf5d5T-w&s",
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