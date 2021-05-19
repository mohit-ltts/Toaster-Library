package com.training.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void ownToast(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

}
