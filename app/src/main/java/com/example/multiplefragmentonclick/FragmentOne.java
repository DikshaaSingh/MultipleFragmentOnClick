package com.example.multiplefragmentonclick;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.multiplefragmentonclick.R;

public class FragmentOne extends Fragment {
Change change;
Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_one,container,false);


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        change= (Change) getActivity();
        button=getActivity().findViewById(R.id.btnFragment1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change.changefrag(new FragmentTwo(),"Fragment Two");
            }
        });

    }
}
