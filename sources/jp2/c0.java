package jp2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f77316a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static int f77317b;

    public static String a(Context context) {
        int i13;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append('/');
        synchronized (f77316a) {
            if (f77317b == 0) {
                try {
                    f77317b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i13 = f77317b;
        }
        sb3.append(i13);
        sb3.append(" (Linux; U; Android ");
        sb3.append(Build.VERSION.RELEASE);
        sb3.append("; ");
        sb3.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb3.append("; ");
            sb3.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb3.append("; Build/");
            sb3.append(str2);
        }
        sb3.append("; Cronet/119.0.6045.31)");
        return sb3.toString();
    }
}
