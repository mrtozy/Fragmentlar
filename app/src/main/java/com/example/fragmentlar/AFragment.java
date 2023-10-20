package com.example.fragmentlar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentlar.databinding.FragmentABinding;
import com.example.fragmentlar.databinding.FragmentAnasayfaBinding;


public class AFragment extends Fragment {

    private FragmentABinding b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b= FragmentABinding.inflate(inflater,container, false);
        b.bGecisBtn.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.a_B_Ye_Gecis);
        });

        return b.getRoot();
    }
}