package com.gmail.eamosse.imdb.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gmail.eamosse.idbdata.data.Movie
import com.gmail.eamosse.imdb.databinding.MovieListItemBinding
import kotlinx.android.synthetic.main.fragment_movie_detail.view.*

class MovieListAdapter(private val items: List<Movie>, private val onClickListener: MovieListAdapter.OnClickListener) :

    RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: MovieListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movie) {
            binding.item = item
            val context = binding.movielistImg
            Glide.with(context)
                .load("https://www.themoviedb.org/t/p/w600_and_h900_bestv2"+item.poster_path)
                .into(context)
        }
    }

    class OnClickListener(val clickListener: (meme: Movie) -> Unit) {
        fun onClick(meme: Movie) = clickListener(meme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(MovieListItemBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            onClickListener.onClick(items[position])
        }
        holder.bind(items[position])
    }

}
