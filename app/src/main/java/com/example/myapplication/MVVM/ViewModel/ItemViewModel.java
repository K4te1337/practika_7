package com.example.myapplication.MVVM.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.MVVM.Model.DataList;
import com.example.myapplication.MVVM.Repositoriy.Repositoriy;
import java.util.List;

public class ItemViewModel extends ViewModel {
    private Repositoriy repository = new Repositoriy();
    public LiveData<List<DataList>> getItems() {
        return repository.getItems();
    }
}