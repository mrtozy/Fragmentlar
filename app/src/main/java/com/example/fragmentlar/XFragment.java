package com.example.fragmentlar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentlar.databinding.FragmentBBinding;
import com.example.fragmentlar.databinding.FragmentXBinding;


public class XFragment extends Fragment {


    private FragmentXBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            b= FragmentXBinding.inflate(inflater,container, false);
            b.yYeGecisBtn.setOnClickListener(view -> {
                Navigation.findNavController(view).navigate(R.id.x_Y_Ye_Gecis);
            });

            return b.getRoot();
    }
}