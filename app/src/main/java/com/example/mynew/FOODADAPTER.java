package com.example.mynew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mynew.databinding.FoodItemBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class FOODADAPTER extends FirebaseRecyclerAdapter<FOODMODEL,FOODADAPTER.viewholder> {
    public FOODADAPTER(@NonNull FirebaseRecyclerOptions<FOODMODEL> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewholder holder, int position, @NonNull FOODMODEL model) {
holder.binding.foodName.setText(model.getTitle());
holder.binding.foodid.setText(String.valueOf(model.getId()));

String url=null;
url=model.getUrl();

        Glide.with(holder.itemView.getContext()).load(model.getUrl())
                .into(holder.binding.image);


    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item,parent,false);
        return new viewholder(view);

    }

    public class viewholder extends RecyclerView.ViewHolder{
FoodItemBinding binding;

        public viewholder(@NonNull View itemView) {
            super(itemView);

binding=FoodItemBinding.bind(itemView);


        }
    }






}
