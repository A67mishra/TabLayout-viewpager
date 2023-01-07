package com.example.cepproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class MovieFragment extends Fragment {
    String[] mname={"Black Adam","Black Panther","Assassin","Morbius","Dvitva","Gladiator","The Tinder Swindler",
    "The Adam Project","The Sea Beast","Don't Look UP","The Gray Man","Purple Hearts","Hustle","Senior Year"};
    Integer[] mpic={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,
            R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,
            R.drawable.ten,R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen};
    String[] url={"https://www.imdb.com/title/tt6443346/","https://www.imdb.com/title/tt1825683/","https://www.imdb.com/title/tt3508840/"
    ,"https://www.imdb.com/title/tt5108870/","https://www.imdb.com/news/ni63378170","https://www.imdb.com/title/tt0172495/","https://www.imdb.com/title/tt6443346/","https://www.imdb.com/title/tt1825683/","https://www.imdb.com/title/tt3508840/"
            ,"https://www.imdb.com/title/tt5108870/","https://www.imdb.com/news/ni63378170","https://www.imdb.com/title/tt0172495/"};

    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView=getView().findViewById(R.id.list2);
        MyMovieAdapter myMovieAdapter=new MyMovieAdapter((Activity)getContext(),mname,mpic,url);
        listView.setAdapter(myMovieAdapter);
    }
}