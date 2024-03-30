package com.example.myapplication.MVVM.Repositoriy;
import androidx.lifecycle.LiveData;

import com.example.myapplication.MVVM.Model.DataList;
import com.example.myapplication.MVVM.Model.Item;
import java.util.List;

public interface DataSource {
    LiveData<List<DataList>> getItems();
    LiveData<DataList> getItem(int itemId);
}