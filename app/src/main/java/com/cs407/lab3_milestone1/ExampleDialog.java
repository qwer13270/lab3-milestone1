package com.cs407.lab3_milestone1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
                .setMessage("This is Dialog")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int which){

                   }
                });
        return builder.create();

    }
}
