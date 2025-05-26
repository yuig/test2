package ha;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import r4.n;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final n f68355a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f68356b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static k f68357c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(context, packageManager).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static k b(int i13, boolean z13, boolean z14, boolean z15) {
        k kVar = new k(i13);
        f68357c = kVar;
        f68355a.j(kVar);
        return f68357c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:33|34|35|(2:74|75)(1:37)|38|(8:45|(1:49)|(1:56)|57|(2:64|65)|61|62|63)|(1:71)(1:(1:73))|(1:49)|(3:51|54|56)|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
    
        r5 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.l.c(android.content.Context, boolean):void");
    }
}
