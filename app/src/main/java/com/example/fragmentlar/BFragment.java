package com.example.fragmentlar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentlar.databinding.FragmentABinding;
import com.example.fragmentlar.databinding.FragmentBBinding;


public class BFragment extends Fragment {

    private FragmentBBinding b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b= FragmentBBinding.inflate(inflater,container, false);
        b.bYGecisBtn.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.b_Y_Ye_Gecis);
        });

        return b.getRoot();
    }
}