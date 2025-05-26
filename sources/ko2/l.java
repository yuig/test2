package ko2;

import ho2.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f80334a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f80335b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f80336c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f80337d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f80338e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f80339f;

    static {
        String str;
        int i13 = x.f69791a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f80334a = str;
        f80335b = ue.c.F("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i14 = x.f69791a;
        if (i14 < 2) {
            i14 = 2;
        }
        f80336c = ue.c.G("kotlinx.coroutines.scheduler.core.pool.size", i14, 1, 0, 8);
        f80337d = ue.c.G("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f80338e = TimeUnit.SECONDS.toNanos(ue.c.F("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f80339f = h.f80329a;
    }
}
