package fragment;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/7/15.
 */
public class HealthFragment extends Fragment {
    private View indicatorId;
    private LinearLayout.LayoutParams layoutParams;
    private LinearLayout modelLayout;
    private HorizontalScrollView hScrollView;
    private ViewPager viewPa;
    private List<Fragment> fragmentList=new ArrayList<Fragment>();
    private MyPagerAdapter adapter;
    private RadioGroup rg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.healthbar,null);
        indicatorId = v.findViewById(R.id.indicatorId);
        layoutParams = ((LinearLayout.LayoutParams)indicatorId.getLayoutParams());
       modelLayout = ((LinearLayout) v.findViewById(R.id.modelLayoutId));
        hScrollView = ((HorizontalScrollView) v.findViewById(R.id.hScrollViewId));
        viewPa = ((ViewPager) v.findViewById(R.id.viewPagerId));
        adapter = new MyPagerAdapter(getActivity().getSupportFragmentManager());
        viewPa.setAdapter(adapter);
        rg = ((RadioGroup) v.findViewById(R.id.modelLayoutId));
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //选中的RadioButton播放动画
                ScaleAnimation sAnim=new ScaleAnimation(1,1.1f,1,1.1f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                sAnim.setDuration(2000);
                sAnim.setFillAfter(true);
                //遍历所有的RadioButton
                for (int i = 0; i <group.getChildCount(); i++) {
                    RadioButton radoiBtn=(RadioButton)group.getChildAt(i);
                    if (radoiBtn.isChecked()) {
                        radoiBtn.startAnimation(sAnim);
                    }else{
                        radoiBtn.clearAnimation();
                    }
                }
                switch (checkedId){
                    case R.id.title1Id:
                        viewPa.setCurrentItem(0);
                        break;
                    case R.id.title2Id:
                        viewPa.setCurrentItem(1);
                        break;
                    case R.id.title3Id:
                        viewPa.setCurrentItem(2);
                        break;
                    case R.id.title4Id:
                        viewPa.setCurrentItem(3);
                        break;
                    case R.id.title5Id:
                        viewPa.setCurrentItem(4);
                        break;
                    case R.id.title6Id:
                        viewPa.setCurrentItem(5);
                        break;
                    case R.id.title7Id:
                        viewPa.setCurrentItem(6);
                        break;





                }

            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);


    }
    class MyPagerAdapter extends FragmentPagerAdapter{

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
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
}
