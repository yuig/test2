package he;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final double f68948a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f68949b = 0;

    public static double a(long j13) {
        return (SystemClock.elapsedRealtimeNanos() - j13) * f68948a;
    }
}
