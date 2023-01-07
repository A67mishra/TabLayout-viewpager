package com.example.cepproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewpagerAdapter extends FragmentStateAdapter {

    public MyViewpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new  EducationFragment();
            case 1:
                return new MovieFragment();
            case 2:
                return new WebserieFragment();

        }
        return new EducationFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
