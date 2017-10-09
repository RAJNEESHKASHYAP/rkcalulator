package com.example.rajjikash.rkcalulator.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rajji kash on 10/7/2017.
 */

public class AppState {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    String screen = "SCREEN";

    public AppState(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("rkcalculator", 0);            // rkcalculator is the name of the shared preferences and 0 is to denote private mode.
        editor = sharedPreferences.edit();
    }

    public void setScreen(String screenValue){
        editor.putString(screen, screenValue);
        editor.commit();                                                                // editor.apply();
    }

    public String getScreen(){
        return sharedPreferences.getString(screen, "");
    }

}
