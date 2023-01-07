package com.example.cepproject;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class EducationFragment extends Fragment {
    ListView listView;
    Integer[] image={R.drawable.cbse,R.drawable.icse,R.drawable.gseb,
            R.drawable.upb,R.drawable.mpb,R.drawable.assam,R.drawable.bseb,
            R.drawable.cgbse,R.drawable.bseh,R.drawable.hpbose,R.drawable.jac,R.drawable.jkbose,R.drawable.kseb,
            R.drawable.maharastra,R.drawable.manipur};
    String[] name={"CBSE","ICSE","GSEB","UPMSP","MPBSE","AHSEC","BSEB","CGBSE","BSEH","HPBOSE","JAC","JKBOSE","KSEB","MSBSHSE","BSEM"};
    String[] url={"https://t.me/CBSEbot","https://t.me/ICSEbot","https://t.me/GSEBBOT"
            ,"https://t.me/upmspboardofficial","https://t.me/Mpbsebot","https://t.me/AHSECBot","https://t.me/Bsebbot","https://t.me/Cgbse_bot",
    "https://t.me/HBSE_ebooks","https://t.me/himindiaeducation","https://t.me/Class8thto12th","https://t.me/jkbosegov","http://www.dhsekerala.gov.in/"
    ,"https://t.me/maharashtra_state_boardbooks","https://bsem.nic.in/"};
    String[] detail={"Central Board of Secondary Education","Indian Certificate of Secondary Education","Gujarat Secondary and Higher Secondary Education Board",
    "Uttar Pradesh Madhyamik Shiksha Parishad","Madhya Pradesh Board of Secondary Education",
            "Assam Higher Secondary Education Council","Bihar School Examination Board","Chhattisgarh Board of Secondary Education","Board of School Education Haryana","Himachal Pradesh Board of School Education",
    "JHARKHAND ACADEMIC COUNCIL","Jammu and Kashmir Board of School Education","Directorate of Higher Secondary Education","Maharashtra State Board of Secondary and Higher Secondary Education","Board of Secondary Education Manipur"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_education, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView=getView().findViewById(R.id.list1);
        MyEducationAdapter myEducationAdapter=new MyEducationAdapter((Activity)getContext(),name,image,url,detail);
        listView.setAdapter(myEducationAdapter);

    }
}