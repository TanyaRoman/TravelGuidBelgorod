package ru.vsu.travelguidbelgorod.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.vsu.travelguidbelgorod.R;

public class NewFragment extends Fragment {

    private String title;
    private String text;
    private int photo;
    private String address;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            title = savedInstanceState.getString("title");
            text = savedInstanceState.getString("text");
            photo = savedInstanceState.getInt("photo");
            address = savedInstanceState.getString("address");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_news_item, container, false);
        return layout;
    }


}
