package com.example.diginhunter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numberTabs;


    public PageAdapter(@NonNull FragmentManager fm, int numberTabs) {
        super(fm);
        this.numberTabs = numberTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new bronze();
            case 1:
                return new silver();
            case 2:
                return new gold();

        }
        return null;
    }

    @Override
    public int getCount() {
        return numberTabs;
    }
}
