package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FirstFragment extends Fragment {
    private TextView nol;
    private int counterValue = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nol = view.findViewById(R.id.nol);
        TextView plus = view.findViewById(R.id.plus);
        TextView minus = view.findViewById(R.id.minus);
        plus.setOnClickListener(v -> {
            counterValue++;
            updateCounterText();
        });
        minus.setOnClickListener(v -> {
            counterValue--;
            updateCounterText();
        });
        updateCounterText();
    }
    private  void  updateCounterText(){
        nol.setText(String.valueOf(counterValue));
    }

}