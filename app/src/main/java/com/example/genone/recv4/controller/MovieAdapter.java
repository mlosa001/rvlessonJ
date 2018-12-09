package com.example.genone.recv4.controller;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.genone.recv4.R;
import com.example.genone.recv4.model.Movie;
import com.example.genone.recv4.view.ViewHolder;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<ViewHolder>{
    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_itemview, parent, false);
        return new ViewHolder(childView);    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = movieList.get(position);

        holder.onBind(movie);



    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}

//separating concerns mvc

// adapter passing d@a 2 b bound on inflated item view, sets on txt views d d@a