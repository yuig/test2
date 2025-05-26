package c5;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c extends d5.a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25774b = 0;

    public static void e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new u0.n(activity, 5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Activity activity, String[] strArr, int i13) {
        HashSet hashSet = new HashSet();
        for (int i14 = 0; i14 < strArr.length; i14++) {
            if (TextUtils.isEmpty(strArr[i14])) {
                throw new IllegalArgumentException(a.a.p(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i14], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i14));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i15 = 0;
            for (int i16 = 0; i16 < strArr.length; i16++) {
                if (!hashSet.contains(Integer.valueOf(i16))) {
                    strArr2[i15] = strArr[i16];
                    i15++;
                }
            }
        }
        if (activity instanceof b) {
            ((b) activity).validateRequestPermissionsRequestCode(i13);
        }
        activity.requestPermissions(strArr, i13);
    }

    public static boolean g(String str, Activity activity) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i13 < 32 && i13 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
