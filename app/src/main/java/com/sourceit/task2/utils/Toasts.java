package com.sourceit.task2.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wenceslaus on 23.01.16.
 */
public class Toasts {

    private static Context context;

    public static void init(Context cont) {
        context = cont;
    }

    public static void show(String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
