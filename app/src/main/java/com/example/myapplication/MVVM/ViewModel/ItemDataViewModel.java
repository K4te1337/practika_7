package com.example.myapplication.MVVM.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.MVVM.Model.DataList;
import com.example.myapplication.MVVM.Repositoriy.Repositoriy;

public class ItemDataViewModel extends ViewModel {
    private Repositoriy repository = new Repositoriy();
    public LiveData<DataList> getItem(int itemId) {
        return repository.getItem(itemId);
    }
}