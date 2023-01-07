package com.example.cepproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyWebseriesAdapter extends ArrayAdapter<String> {
    String[] wname;
    Integer[] wimage;
    String[] url;
    Activity context;

    public MyWebseriesAdapter(Activity context, String[] wname, Integer[] wimage, String[] url) {
        super(context,R.layout.customlist3,wname);
        this.wimage=wimage;
        this.wname=wname;
        this.url=url;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.customlist3,null,true);

        CircleImageView imageView=rowView.findViewById(R.id.wimage);
        TextView textView=rowView.findViewById(R.id.wtext);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url[position]));
                context.startActivity(intent);
            }
        });
        imageView.setImageResource(wimage[position]);
        textView.setText(wname[position]);
        return rowView;
    }
}
