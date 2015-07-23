package fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



/**
 * Created by Administrator on 2015/7/15.
 */
public class FragmentWel extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        int pos = bundle.getInt("POS");
        ImageView img = null;
        switch (pos) {
            case 0:
                img = new ImageView(getActivity());
                img.setBackgroundResource(R.mipmap.welcomeyi);
                break;
            case 1:
                img = new ImageView(getActivity());
                img.setBackgroundResource(R.mipmap.welcomeer);
                break;
            case 2:
                img = new ImageView(getActivity());
                img.setBackgroundResource(R.mipmap.welcomesan);
                break;

        }
        return img;

    }



}
