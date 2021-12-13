package com.gmail.eamosse.imdb.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gmail.eamosse.imdb.R
import com.gmail.eamosse.imdb.databinding.FragmentMovieDetailBinding

import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieDetailFragment : Fragment() {
    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentMovieDetailBinding
    private val args: MovieDetailFragmentArgs by navArgs()
   // private val posterPath: ImageView =binding.moviePoster
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(homeViewModel) {
            token.observe(
                viewLifecycleOwner,
                Observer {
                    // récupérer le detail du film
                    getMovieDetail(args.movieId)
                }
            )

            moviedetail.observe(
                viewLifecycleOwner,
                Observer {
                    binding.title.text = moviedetail.value?.title
                    binding.voteCount.text = " - " + moviedetail.value?.vote_count + " / 10"
                    binding.originalLanguage.text = moviedetail.value?.original_language
                    binding.overview.text = moviedetail.value?.overview


                    Glide.with(view.rootView)
                        .load("https://www.themoviedb.org/t/p/w600_and_h900_bestv2"+moviedetail.value?.poster_path)
                        .into(binding.posterPath)



                }
            )

            error.observe(
                viewLifecycleOwner,
                Observer {
                    // afficher l'erreur
                }
            )
        }
    }


}
