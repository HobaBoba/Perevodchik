package com.example.perevodchik.renderer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perevodchik.R;

import java.util.List;

public class TranslateRenderer extends RecyclerView.Adapter<TranslateRenderer.TranslateViewHolder> {

    /*public TranslateRenderer(List<Translate> data){
        this.data=data;
    }*/
    private List<Translate> data;


    //создаем новый обьект ViewHolder когда это необходимо
    @NonNull
    @Override
    public TranslateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.translate_item, null);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.translate_item,parent,false);
        return new TranslateViewHolder(view);
    }

    //Заполняем объект ViewHolder необходимыми данными
    @Override
    public void onBindViewHolder(@NonNull TranslateViewHolder holder, int position) {
        Translate translate = data.get(position);
        holder.bind(translate);
    }

    public void setData(List<Translate> data) {
        this.data = data;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TranslateViewHolder extends RecyclerView.ViewHolder {
        TextView word;
        TextView translate;

        public TranslateViewHolder(@NonNull View view) {
            super(view);
            word = view.findViewById(R.id.word);
            translate = view.findViewById(R.id.translate);
        }

        public void bind(Translate translate) {
            this.word.setText(translate.getWord());
            this.translate.setText((translate.getTranslate()));
        }

    }
}
