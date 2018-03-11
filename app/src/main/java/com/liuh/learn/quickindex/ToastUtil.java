package com.liuh.learn.quickindex;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by huan on 2018/3/11.
 */

public class ToastUtil {

    private static Toast toast;

    public static void showToast(Context context, String msg) {

        if (toast == null) {
            toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }

        toast.setText(msg);
        toast.show();
    }

}
