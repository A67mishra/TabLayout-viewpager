package com.example.cepproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyMovieAdapter extends ArrayAdapter<String> {
    String[] mname;
    Integer[] mpic;
    String[] url;
    Activity context;

    public MyMovieAdapter(Activity context, String[] mname, Integer[] mpic, String[] url) {
        super(context,R.layout.customlist2,mname);
        this.mname=mname;
        this.mpic=mpic;
        this.url=url;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowview=inflater.inflate(R.layout.customlist2,null,true);

        CircleImageView imageView=rowview.findViewById(R.id.image);
        TextView textView=rowview.findViewById(R.id.text2);

        rowview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url[position]));
                context.startActivity(intent);
            }
        });
        imageView.setImageResource(mpic[position]);
        textView.setText(mname[position]);
        return  rowview;
    }
}
