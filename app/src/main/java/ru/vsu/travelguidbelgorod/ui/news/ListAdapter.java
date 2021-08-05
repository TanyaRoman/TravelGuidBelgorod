package ru.vsu.travelguidbelgorod.ui.news;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import ru.vsu.travelguidbelgorod.R;

public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_news, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return New.news.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mItemTitle;
        private TextView mItemText;
        private ImageView mItemImage;
        private TextView address;

        public ListViewHolder(View itemView) {
            super(itemView);
            mItemTitle = (TextView) itemView.findViewById(R.id.newTitle);
            mItemImage = (ImageView) itemView.findViewById(R.id.newImage);
            mItemText = (TextView) itemView.findViewById(R.id.newText);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemTitle.setText(New.news[position].getTitle());
            mItemImage.setImageResource(New.news[position].getPhoto());
            mItemText.setText(New.news[position].getText());
        }

        public void onClick(View view){

        }
    }
}
