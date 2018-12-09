package com.example.genone.recv4.view;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.genone.recv4.R;
import com.example.genone.recv4.model.Movie;


public class ViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView director;
    private TextView year;

    public ViewHolder (View itemView) {
        super(itemView);

        //constructor inheriting from recycler view parent
        //viewh older is template
        //model is d@a
        title = (TextView) itemView.findViewById(R.id.movie_title_textview);
        director = (TextView) itemView.findViewById(R.id.movie_director_textview);
        year = (TextView) itemView.findViewById(R.id.movie_year_textview);
    }

    public void onBind(Movie movie) {
        title.setText("Title: " + movie.getTitle());
        director.setText("Director: " + movie.getDirector());
        year.setText("Year: " + movie.getYear());
    }

}