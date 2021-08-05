package ru.vsu.travelguidbelgorod.ui.entertainment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EntertainmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EntertainmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}