package com.example.jim.dyapp.attention;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jim.dyapp.R;

/**
 * Created by jim on 2018/1/25.
 * 关注
 */
public class AttentionFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_attention, null);
        return inflate;

    }
    
}
