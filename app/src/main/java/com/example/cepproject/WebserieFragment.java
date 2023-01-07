package com.example.cepproject;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

public class WebserieFragment extends Fragment {
    String[] wname={"Breaking Bad","Game of Thrones","Dark","Money Heist","Peaky Blinder","Mirzapur","Family Man","Sacred Games","The Boys",
    "Asur:Welcome to The Dark Side","Love,Death & Robot","I Am Not Okay with This","Never Have I ever","The Walking Dead"};
    Integer[] wimage={R.drawable.wnine,R.drawable.wone,R.drawable.wtwo,R.drawable.wthree,R.drawable.wfour,R.drawable.wfive,
            R.drawable.wsix,R.drawable.wseven,R.drawable.weight,R.drawable.wten,
            R.drawable.weleven,R.drawable.wtwlwve,R.drawable.wthirteen,R.drawable.wfourteen};
    String[] url={"https://www.imdb.com/title/tt0903747/","https://www.imdb.com/title/tt0944947/","https://www.imdb.com/title/tt5753856/","https://www.imdb.com/title/tt6468322/",
    "https://www.imdb.com/title/tt2442560/","https://www.imdb.com/title/tt6473300/","https://www.imdb.com/title/tt9544034/",
    "https://www.imdb.com/title/tt6077448/","https://www.imdb.com/title/tt1190634/",
    "https://www.imdb.com/title/tt11912196/","https://www.imdb.com/title/tt9561862/","https://www.imdb.com/title/tt9446688/","https://www.imdb.com/title/tt10062292/",
    "https://www.imdb.com/title/tt1520211/"};
    GridView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_webserie, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView=getView().findViewById(R.id.list3);
        MyWebseriesAdapter myWebseriesAdapter=new MyWebseriesAdapter((Activity)getContext(),wname,wimage,url);
        listView.setAdapter(myWebseriesAdapter);
    }
}