package i2;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public static final long f71080a;

    /* renamed from: b */
    public static final /* synthetic */ int f71081b = 0;

    static {
        long j13;
        xk2.m.b(b.f71075i);
        try {
            j13 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j13 = -1;
        }
        f71080a = j13;
    }
}
