package com.example.capstone01.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.capstone01.Adapter.SampleData;
import com.example.capstone01.Adapter.SocialAdapter;
import com.example.capstone01.R;

public class SocialFragment extends Fragment {

    private RecyclerView recyclerView;
    private SocialAdapter adapter = new SocialAdapter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_social,container, false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        adapter.setItems(new SampleData().getItems());

        return rootView;
    }
}
