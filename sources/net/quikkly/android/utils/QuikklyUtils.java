package net.quikkly.android.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class QuikklyUtils {
    private QuikklyUtils() {
    }

    public static boolean launchAppSettings(@NonNull Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return safeLaunchIntent(intent, context);
    }

    public static boolean resolveIntent(@NonNull Intent intent, @NonNull Context context) {
        try {
            return context.getPackageManager().resolveActivity(intent, 65536) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean safeLaunchIntent(@NonNull Intent intent, @NonNull Context context) {
        if (!resolveIntent(intent, context)) {
            return false;
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
