package com.jasbirsingh.firstlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Jasbir Singh on 7/3/2016.
 */
public class FirstLibrary {
    private static FirstLibrary ourInstance = new FirstLibrary();

    public static FirstLibrary getInstance() {
        return ourInstance;
    }

    private FirstLibrary() {
    }

    public void makeMeAwesome(Context context, String data)
    {
        Toast.makeText(context, "Awesome " +data, Toast.LENGTH_LONG).show();
    }
}
