package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Adapter used to create the fragments for SelectCategory activity
 */
public class PageAdapter extends FragmentPagerAdapter {

    private int numberoftabs;

    public PageAdapter(@NonNull FragmentManager fm, int numberoftabs) {
        super(fm);
        this.numberoftabs = numberoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // show the categories depending on the tab that has been pressed
        switch (position) {
            case 0:
                return new DebtFragment();
            case 1:
                return new ExpenseFragment();
            case 2:
                return new IncomeFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return numberoftabs;
    }
}
