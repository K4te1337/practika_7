package com.example.myapplication.UI.DATA;
public class DataLayer {
    private String dataFrom1to2;
    public DataLayer(){
        this.dataFrom1to2="Переданные данные c 1 фрагмента";
    }
    public DataLayer(String dataFrom1to2,String dataFrom2to3){
        this.dataFrom1to2=dataFrom1to2;
    }
    public void setDataFrom1to2(String dataFrom1to2) {
        this.dataFrom1to2 = dataFrom1to2;
    }
    public String getDataFrom1to2() {
        return dataFrom1to2;
    }
}
