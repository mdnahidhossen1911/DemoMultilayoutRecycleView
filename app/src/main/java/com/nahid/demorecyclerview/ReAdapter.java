package com.nahid.demorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReAdapter extends RecyclerView.Adapter {

    ArrayList<Datamodel> arrayList ;

    public ReAdapter(ArrayList<Datamodel> arrayList) {
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType ==2){

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product,parent,false);
        }else if (viewType==1){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner,parent,false);
        }else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.searchitem,parent,false);
        }

        return new Viewhold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if(arrayList.get(position).getLayoutType() == "product"){
            return 2;
        }else if(arrayList.get(position).getLayoutType() == "banner"){
            return 1;
        }else {
            return 0;
        }
    }

    public class Viewhold extends RecyclerView.ViewHolder {

        public Viewhold(@NonNull View itemView) {
            super(itemView);
        }
    }


}
