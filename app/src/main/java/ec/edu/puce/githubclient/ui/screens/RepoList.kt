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
            avatarURL = "https://www.google.com/imgres?q=imagenes&imgurl=https%3A%2F%2Fwww.hazunaweb.com%2Fimagenes%2Fprueba.jpg&imgrefurl=https%3A%2F%2Fwww.hazunaweb.com%2Fcurso-de-html%2Fimagenes%2F&docid=r1Bdi-hfppC9FM&tbnid=ParQpPe1iWmS0M&vet=12ahUKEwi89ZftkreUAxX1fjABHXBeCTg4ChCc8A56BAhiEAE..i&w=400&h=300&hcb=2&ved=2ahUKEwi89ZftkreUAxX1fjABHXBeCTg4ChCc8A56BAhiEAE",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://www.google.com/imgres?q=imagenes&imgurl=https%3A%2F%2Fwww.tooltyp.com%2Fwp-content%2Fuploads%2F2014%2F10%2F1900x920-8-beneficios-de-usar-imagenes-en-nuestros-sitios-web.jpg&imgrefurl=https%3A%2F%2Fwww.tooltyp.com%2F8-beneficios-de-usar-imagenes-en-nuestros-sitios-web%2F&docid=53-N2MbZIY2M8M&tbnid=QyjckPLcTSohTM&vet=12ahUKEwjvxqe3kreUAxVR48kDHWhrDGkQnPAOegQIHhAB..i&w=1900&h=920&hcb=2&ved=2ahUKEwjvxqe3kreUAxVR48kDHWhrDGkQnPAOegQIHhAB",
            language = "Python"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://www.google.com/imgres?q=imagenes&imgurl=https%3A%2F%2Fneliosoftware.com%2Fes%2Fwp-content%2Fuploads%2Fsites%2F3%2F2018%2F07%2Faziz-acharki-549137-unsplash-1200x775.jpg&imgrefurl=https%3A%2F%2Fneliosoftware.com%2Fes%2Fblog%2Fimagenes-gratuitas-para-tu-blog%2F&docid=YGl5kRGw4lfrHM&tbnid=QUOv_rpoZt4zCM&vet=12ahUKEwjvxqe3kreUAxVR48kDHWhrDGkQnPAOegQILhAB..i&w=1200&h=775&hcb=2&ved=2ahUKEwjvxqe3kreUAxVR48kDHWhrDGkQnPAOegQILhAB",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://www.google.com/imgres?q=imagenes&imgurl=https%3A%2F%2Fstatic.vecteezy.com%2Fsystem%2Fresources%2Fthumbnails%2F004%2F125%2F202%2Fsmall%2Fpanorama-of-night-sky-with-clouds-and-full-moon-photo.jpg&imgrefurl=https%3A%2F%2Fes.vecteezy.com%2Ffotos-gratis%2Fnoche&docid=QpgcyZqE98wyGM&tbnid=JorxlGyICWaz8M&vet=12ahUKEwjvxqe3kreUAxVR48kDHWhrDGkQnPAOegQIGBAB..i&w=758&h=350&hcb=2&ved=2ahUKEwjvxqe3kreUAxVR48kDHWhrDGkQnPAOegQIGBAB",
            language = "Kotlin"
        )

        RepoItem(
            name = "repositorio de android",
            description = "repositorio creado por kotlin",
            avatarURL = "https://www.hazunaweb.com/curso-de-html/imagenes/",
            language = "Kotlin"
        )
    }
}