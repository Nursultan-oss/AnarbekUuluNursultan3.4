package com.example.anarbekuulunursultan34;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
public class Mainland {
    private int imageMainland;
    private String textViewMainland;

    public Mainland(int imageMainland, String textViewMainland) {
        this.imageMainland = imageMainland;
        this.textViewMainland = textViewMainland;
    }

    public int getImageMainland() {
        return imageMainland;
    }

    public void setImageMainland(int imageMainland) {
        this.imageMainland = imageMainland;
    }

    public String getTextViewMainland() {
        return textViewMainland;
    }

    public void setTextViewMainland(String textViewMainland) {
        this.textViewMainland = textViewMainland;
    }
}



