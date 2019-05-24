package com.example.multiplefragmentonclick;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTwo extends Fragment {
    Change change;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_two,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        change = (Change) getActivity();
        button = getActivity().findViewById(R.id.btnFragment2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change.changefrag(new FragmentThree(),"Fragment three");
            }
        });


    }

}

