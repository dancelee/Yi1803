package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2015/7/15.
 */
public class AdapterWel extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;

    public AdapterWel(FragmentManager fm,List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);


    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
