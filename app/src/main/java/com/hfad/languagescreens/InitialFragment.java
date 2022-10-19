package com.hfad.languagescreens;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InitialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_initial, container, false);
        Button btnEnglish = view.findViewById(R.id.btnEnglish);
        Button btnSpanish = view.findViewById(R.id.btnSpanish);
        Button btnFrench = view.findViewById(R.id.btnFrench);

        btnEnglish.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_englishFragment)
        );

        btnSpanish.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_spanishFragment)
        );

        btnFrench.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_frenchFragment)
        );

        return view;
    }
}