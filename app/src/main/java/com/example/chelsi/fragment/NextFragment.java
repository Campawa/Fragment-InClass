package com.example.chelsi.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NextFragment extends Fragment {

    TextView textView;
    View rootView;


    public NextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_next, container, false);

        Bundle bundle = getArguments();
        String str = bundle.getString("text");
        textView = (TextView) rootView.findViewById(R.id.nextFragText);
        textView.setText(str);


        return rootView;
    }

}
