package com.gmail.eamosse.imdb.ui.home

import androidx.fragment.app.Fragment

class MovieDetailFragment : Fragment() {
    /*private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentMovieDetailBinding
    //private val args: MovieDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(homeViewModel) {
            token.observe(
                viewLifecycleOwner,
                Observer {
                    // récupérer la liste des films par categorie
                    getMovieListByCategory(args.categoryId)
                }
            )

            movielistes.observe(
                viewLifecycleOwner,
                Observer {
                    binding.movieList.adapter = MovieListAdapter(
                        it,
                        MovieListAdapter.OnClickListener {
                        }
                    )
                }
            )

            error.observe(
                viewLifecycleOwner,
                Observer {
                    // afficher l'erreur
                }
            )
        }
    }*/
}
