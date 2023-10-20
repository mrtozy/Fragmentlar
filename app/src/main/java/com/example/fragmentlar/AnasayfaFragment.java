package com.example.fragmentlar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentlar.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {



    private FragmentAnasayfaBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b=FragmentAnasayfaBinding.inflate(inflater,container, false);
        b.buttonA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.a_Gecis);
        });
        b.buttonX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.x_Gecis);
        });
        return b.getRoot();
    }
}