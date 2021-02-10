package com.bursi.jobfinding;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class Alert {
    public static void shows(Context context, String title, String messege, String positive, String negative){
        AlertDialog.Builder alertClose=new AlertDialog.Builder(context);
        alertClose.setTitle(title).
                setMessage(messege).
                setPositiveButton(positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       dialog.cancel();

                    }
                }).setNegativeButton(negative, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).show();
    }
}
