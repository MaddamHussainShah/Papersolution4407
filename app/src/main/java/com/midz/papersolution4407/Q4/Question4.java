package com.midz.papersolution4407.Q4;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.midz.papersolution4407.R;

import java.util.ArrayList;
import java.util.List;

public class Question4 extends AppCompatActivity {   private RecyclerView recyclerContacts;
    private ContactAdapter contactAdapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        recyclerContacts = findViewById(R.id.recyclerContacts);
        loadContacts();
    }

    private void loadContacts() {   contactList = new ArrayList<>();

        //Adding Contacts in contactList
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person_24,"Maddam Hussain","12345678910"));


        contactAdapter = new ContactAdapter(Question4.this, contactList);

        //Adding Layout To Recycler View
        recyclerContacts.setLayoutManager(new LinearLayoutManager(Question4.this));
        //Setting Adapter
        recyclerContacts.setAdapter(contactAdapter);
    }

}