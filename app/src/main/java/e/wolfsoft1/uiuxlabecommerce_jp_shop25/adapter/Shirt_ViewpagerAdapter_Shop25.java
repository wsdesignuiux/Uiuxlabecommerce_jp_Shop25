package e.wolfsoft1.uiuxlabecommerce_jp_shop25.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop25.fragment.Fragmemt_Viewpager_shop25;

public class Shirt_ViewpagerAdapter_Shop25 extends FragmentPagerAdapter {
    public Shirt_ViewpagerAdapter_Shop25(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragmemt_Viewpager_shop25();
                break;
            case 1:

                fragment = new Fragmemt_Viewpager_shop25();
                break;
            case 2:

                fragment = new Fragmemt_Viewpager_shop25();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

