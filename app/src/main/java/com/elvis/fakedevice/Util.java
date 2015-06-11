package com.elvis.fakedevice;

import android.util.Log;

/**
 * Created by elvis on 15/6/10.
 */
public class Util {

    public static void log(XHook hook, int priority, String msg) {

        priority=Log.DEBUG;
        // Log if enabled
     //   if (priority != Log.DEBUG && (priority == Log.INFO ? false : true))
            if (hook == null)
                Log.println(priority, "XPrivacy", msg);
            else
                Log.println(priority, String.format("XPrivacy/%s", hook.getClass().getSimpleName()), msg);
    }

    public static void bug(XHook hook, Throwable ex) {
        Log.println(Log.DEBUG,hook.getClass().getSimpleName(),ex.getMessage().toString());
    }
}