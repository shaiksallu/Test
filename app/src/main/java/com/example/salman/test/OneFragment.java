package com.example.salman.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salman on 6/13/2017.
 */

public class OneFragment extends Fragment {
    View mView;
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    private List<Movie> movieList = new ArrayList<>();


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView= inflater.inflate(R.layout.fragment_one, container, false);

        recyclerView = (RecyclerView)mView.findViewById(R.id.rv_movilist);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();



        return mView;
    }


    private void prepareMovieData() {
        Movie movie = new Movie("EMPTINESS FT.", "Lorem ipsum is simply dummy text ", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Lorem ipsum is simply dummy text", "20 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Star Wars: Episode VII", "Action", "15 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Shaun the Sheep", "Animation", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("The Martian", "Science Fiction & Fantasy", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Mission: Impossible", "Lorem ipsum is simply dummy", "10 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Up", "Animation", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "10 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("The LEGO Movie", "Lorem ipsum is simply dummy text", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Chicken Run", "Animation", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "18 HOURS AGO");
        movieList.add(movie);

        movie = new Movie("Guardians", "Science Fiction & Fantasy", "18 HOURS AGO");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }

}