package com.example.mynew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mynew.databinding.FoodItemBinding;
import com.example.mynew.databinding.MedicineItemBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MEDICINEADAPTER extends FirebaseRecyclerAdapter<MEDICINEMODEL,MEDICINEADAPTER.VIEWHOLDER> {

    public MEDICINEADAPTER(@NonNull FirebaseRecyclerOptions<MEDICINEMODEL> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull VIEWHOLDER holder, int position, @NonNull MEDICINEMODEL model) {

       holder.binding.medicineName.setText(model.getBody());
       holder.binding.medicineprice.setText(model.getTitle());
       holder.binding.medicineid.setText(String.valueOf(model.getId()));

       /* Glide.with(holder.itemView.getContext()).load(model.getMedicineimage())
                .into(holder.binding.medicineimage);*/
    }

    @NonNull
    @Override
    public VIEWHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1= LayoutInflater.from(parent.getContext()).inflate(R.layout.medicine_item,parent,false);

        return new VIEWHOLDER(view1);
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder{
      MedicineItemBinding binding;

        public VIEWHOLDER(@NonNull View itemView) {
            super(itemView);

        binding=MedicineItemBinding.bind(itemView);


        }
    }
}
