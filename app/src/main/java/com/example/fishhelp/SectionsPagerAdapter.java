package com.example.fishhelp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fishhelp.fragments.FirstFragment;
import com.example.fishhelp.fragments.FourthFragment;
import com.example.fishhelp.fragments.SecondFragment;
import com.example.fishhelp.fragments.ThirdFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1,R.string.tab_text_2,
            R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                FirstFragment tab1 = new FirstFragment();
                return tab1;

            case 1:
                SecondFragment tab2 = new SecondFragment();
                return tab2;

            case 2:
                ThirdFragment tab3 = new ThirdFragment();
                return tab3;

            case 3:
                FourthFragment tab4 = new FourthFragment();
                return tab4;

            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}
