package in.srain.cube.views.ptr.demo.ui.activity;

import android.os.Bundle;
import in.srain.cube.mints.base.MintsBaseActivity;
import in.srain.cube.views.ptr.demo.R;
import in.srain.cube.views.ptr.demo.ui.HomeFragment;

public class HomeActivity extends MintsBaseActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        pushFragmentToBackStack(HomeFragment.class, null);
    }

    @Override
    protected int getFragmentContainerId() {
        return R.id.id_fragment;
    }
}