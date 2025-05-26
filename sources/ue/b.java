package ue;

import android.app.Application;
import df.v;
import df.y;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f121938a;

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f121939b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile ScheduledFuture f121940c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f121941d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f121942e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile l f121943f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f121944g;

    /* renamed from: h, reason: collision with root package name */
    public static String f121945h;

    /* renamed from: i, reason: collision with root package name */
    public static long f121946i;

    /* renamed from: j, reason: collision with root package name */
    public static int f121947j;

    /* renamed from: k, reason: collision with root package name */
    public static WeakReference f121948k;

    static {
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f121938a = canonicalName;
        f121939b = Executors.newSingleThreadScheduledExecutor();
        f121941d = new Object();
        f121942e = new AtomicInteger(0);
        f121944g = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (f121941d) {
            try {
                if (f121940c != null && (scheduledFuture = f121940c) != null) {
                    scheduledFuture.cancel(false);
                }
                f121940c = null;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final UUID b() {
        l lVar;
        if (f121943f == null || (lVar = f121943f) == null) {
            return null;
        }
        return lVar.f121965c;
    }

    public static final boolean c() {
        return f121947j == 0;
    }

    public static final void d(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        int i13 = 1;
        if (f121944g.compareAndSet(false, true)) {
            y yVar = y.f54881a;
            y.a(new a.e(25), v.CodelessEvents);
            f121945h = str;
            application.registerActivityLifecycleCallbacks(new se.b(i13));
        }
    }
}
