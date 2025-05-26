package a;

import ads_mobile_sdk.ps2;
import ads_mobile_sdk.qs2;
import android.os.SystemClock;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class i8 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        WeakHashMap weakHashMap = qs2.f10249a;
        ps2 ps2Var = new ps2(null, SystemClock.currentThreadTimeMillis(), null);
        Thread currentThread = Thread.currentThread();
        WeakHashMap weakHashMap2 = qs2.f10249a;
        synchronized (weakHashMap2) {
        }
        return ps2Var;
    }
}
