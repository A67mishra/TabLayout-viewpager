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

public class MyEducationAdapter extends ArrayAdapter<String> {
    String[] detail;
    String[] name;
    Integer[] image;
    String[] url;
    Activity context;

    public MyEducationAdapter(Activity context, String[] name, Integer[] image, String[] url, String[] detail) {
        super(context,R.layout.customlist1,name);
        this.name=name;
        this.image=image;
        this.detail=detail;
        this.url= url;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View colView=inflater.inflate(R.layout.customlist1,null,true);
        
        CircleImageView imageView=colView.findViewById(R.id.action_image);
        TextView textView=colView.findViewById(R.id.text);
        TextView textView1=colView.findViewById(R.id.textView);
        textView1.setText(detail[position]);
        textView.setText(name[position]);
        imageView.setImageResource(image[position]);
        colView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url[position]));
                context.startActivity(intent);
            }
        });
        return colView;
    }
}
