package com.gmail.eamosse.imdb.ui.aboutUs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gmail.eamosse.imdb.R
import kotlinx.android.synthetic.main.fragment_about_us.*

class AboutUsFragment : Fragment() {

    private lateinit var aboutUsViewModel: AboutUsViewModel
    private lateinit var titre: TextView
    private lateinit var description: TextView
    private lateinit var membres: TextView
    private lateinit var membre1: TextView
    private lateinit var membre2: TextView
    private lateinit var membre3: TextView
    private lateinit var membre4: TextView
    private lateinit var membre1Image: ImageView
    private lateinit var membre2Image: ImageView
    private lateinit var membre3Image: ImageView
    private lateinit var membre4Image: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aboutUsViewModel =
            ViewModelProviders.of(this).get(AboutUsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_about_us, container, false)
        titre = root.findViewById(R.id.titre)
        titre.text = "Girls of MBDS - Projet android Movie App"
        description = root.findViewById(R.id.description)
        description.text = "Projet de développement de l'application AnneFlix permettant aux utilisateurs de choisir une catégorie, de voir les films associés à chaque catégorie, et de voir le détail de chaque film de la base de données. Pour cela, nous avons exploité la base de données TheMoovieDB."
        membres = root.findViewById(R.id.membres)
        membres.text = "Les membres du groupe sont :"
        membre1 = root.findViewById(R.id.membre1)
        membre1.text = "Bouanou Soumaya"
        membre2 = root.findViewById(R.id.membre)
        membre2.text = "Aanaya Nouhaila"
        membre3 = root.findViewById(R.id.membre2)
        membre3.text = "Chah Asmae"
        membre4 = root.findViewById(R.id.membre3)
        membre4.text = "Tcherguizova Khadijat"
        membre1Image = root.findViewById(R.id.imageView3)
        membre2Image = root.findViewById(R.id.imageView4)
        membre3Image = root.findViewById(R.id.imageView5)
        membre4Image = root.findViewById(R.id.imageView6)

        val context = membre1Image
        Glide.with(context)
            .load("https://media-exp1.licdn.com/dms/image/C4D03AQFUV_uaSifpng/profile-displayphoto-shrink_400_400/0/1632218940791?e=1645056000&v=beta&t=3eiLqaZdBiUNFsoaZhDTmSFWGzZhcCmquYmItC9bmK8")
            .apply(RequestOptions.circleCropTransform())
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_baseline_group_24)
            .skipMemoryCache(false)
            .into(context)

        val context2 = membre2Image
        Glide.with(context)
            .load("https://media-exp1.licdn.com/dms/image/C4D03AQFKGg5Cq9Ur0A/profile-displayphoto-shrink_400_400/0/1632426820118?e=1645056000&v=beta&t=i_3UtcQlf0xduFcM3hS7GfjaRAq7iOQk95wDc7bttuo")
            .apply(RequestOptions.circleCropTransform())
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_baseline_group_24)
            .skipMemoryCache(false)
            .into(context2)

        val context3 = membre3Image
        Glide.with(context)
            .load("https://media-exp1.licdn.com/dms/image/C4D03AQFLGdYRtLq0Uw/profile-displayphoto-shrink_400_400/0/1598610263037?e=1645056000&v=beta&t=Ypeq4TQ1yfXn9nA018xvf0_FId4wA9ZvfYKN9yDIlVQ")
            .apply(RequestOptions.circleCropTransform())
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_baseline_group_24)
            .skipMemoryCache(false)
            .into(context3)

        val context4 = membre4Image
        Glide.with(context)
            .load(R.drawable.photo_membre4_background)
            .apply(RequestOptions.circleCropTransform())
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_baseline_group_24)
            .skipMemoryCache(false)
            .into(context4)

        return root
    }
}
