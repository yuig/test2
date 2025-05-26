package ih;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f72262b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f72263c = false;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f72261a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f72264d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f72263c) {
                try {
                    PackageInfo d2 = ph.b.a(context).d(64, "com.google.android.gms");
                    g.b(context);
                    if (d2 == null || g.e(d2, false) || !g.e(d2, true)) {
                        f72262b = false;
                    } else {
                        f72262b = true;
                    }
                    f72263c = true;
                } catch (PackageManager.NameNotFoundException e13) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e13);
                    f72263c = true;
                }
            }
            return f72262b || !"user".equals(Build.TYPE);
        } catch (Throwable th3) {
            f72263c = true;
            throw th3;
        }
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
