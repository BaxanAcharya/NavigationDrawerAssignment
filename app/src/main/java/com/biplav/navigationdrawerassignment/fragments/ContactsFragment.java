package com.biplav.navigationdrawerassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.biplav.navigationdrawerassignment.R;
import com.biplav.navigationdrawerassignment.adapter.ContactsAdapter;
import com.biplav.navigationdrawerassignment.model.Contacts;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {
    private RecyclerView recyclerView;

    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_contacts, container, false);


        recyclerView=view.findViewById(R.id.recycleview);
        //making list
        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Bhuwan", "9845895452", R.drawable.bhuwan));
        contactsList.add(new Contacts("Dahayang", "9845203157", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat", "9812457820", R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan", "9845895452", R.drawable.bhuwan));
        contactsList.add(new Contacts("Dahayang", "9845203157", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat", "9812457820", R.drawable.saugat));
        ContactsAdapter contactsAdapter=new ContactsAdapter(getContext(), contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return  view;

    }

}
