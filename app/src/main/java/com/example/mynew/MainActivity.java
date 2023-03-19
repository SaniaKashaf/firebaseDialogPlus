package com.example.mynew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.mynew.databinding.ActivityMainBinding;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MainActivity extends AppCompatActivity {
FOODADAPTER foodadapter;
ActivityMainBinding binding;
MEDICINEADAPTER medicineadapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
binding.recycler.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(this);
        binding.medicinerecycler.setLayoutManager(linearLayoutManager2);




        Query query=FirebaseDatabase.getInstance().getReference().child("second");
        FirebaseRecyclerOptions<FOODMODEL> options=new FirebaseRecyclerOptions.Builder<FOODMODEL>()
                .setQuery(query,FOODMODEL.class).build();

        Query query1=FirebaseDatabase.getInstance().getReference().child("FolderName");
        FirebaseRecyclerOptions<MEDICINEMODEL> options1=new FirebaseRecyclerOptions.Builder<MEDICINEMODEL>()
                .setQuery(query1,MEDICINEMODEL.class).build();



        foodadapter=new FOODADAPTER(options);
binding.recycler.setAdapter(foodadapter);

        medicineadapter=new MEDICINEADAPTER(options1);
        binding.medicinerecycler.setAdapter(medicineadapter);

    }

    @Override
    protected void onStart(){
        super.onStart();
        foodadapter.startListening();
        medicineadapter.startListening();
    }
    @Override
    protected void onStop(){
        super.onStop();
        foodadapter.stopListening();
        medicineadapter.stopListening();
    }




}