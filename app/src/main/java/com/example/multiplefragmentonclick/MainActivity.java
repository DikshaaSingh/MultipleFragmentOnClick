package com.example.multiplefragmentonclick;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import java.util.List;
//import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements Change {
    Toolbar toolbar;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Fragment1");

        setSupportActionBar(toolbar);

        FragmentOne fragmentOne = new FragmentOne();
        final FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container_a, fragmentOne);
        transaction.addToBackStack(null);
        transaction.commit();
manager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
    @Override
    public void onBackStackChanged() {
        List<Fragment> fragmentList=manager.getFragments();
        Fragment fragment=fragmentList.get(0);
       String currentfrag=fragment.getClass().getSimpleName();
        show(currentfrag);

    }
});
    }

    private void show(String currentfrag) {
        switch (currentfrag){

            case "FragmentOne":
                toolbar.setTitle(currentfrag);
                break;
            case "FragmentTwo":
                toolbar.setTitle(currentfrag);
                break;
            case "FragmentThree":
                toolbar.setTitle(currentfrag);
                break;

        }

    }


    @Override
    public void changefrag(Fragment fragment,String title) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        toolbar.setTitle(title);
        transaction.replace(R.id.container_a, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}




