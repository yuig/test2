package ac2;

import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.k4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class f implements p1 {

    /* renamed from: d, reason: collision with root package name */
    public static long f1948d;

    /* renamed from: a, reason: collision with root package name */
    public static final f f1945a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f1946b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f1947c = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final xk2.k f1949e = xk2.m.a(xk2.n.NONE, e.f1941j);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f1950f = true;

    public static String a(String pinUid, b60.a activeUidProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(activeUidProvider, "activeUidProvider");
        String g13 = ((b60.d) activeUidProvider).g();
        if (g13 == null) {
            g13 = "";
        }
        return g13 + "-" + pinUid + "-" + UUID.randomUUID();
    }

    public static boolean b() {
        return ((kc2.b) ((kc2.a) lc2.c.f82903a.getValue())).f79189a.f("PREF_AUTOPLAY_OVER_MOBILE_DATA", true);
    }

    public static void d(boolean z13, boolean z14) {
        if (f1950f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j13 = f1948d;
            if (j13 == 0 || elapsedRealtime - j13 > 5000) {
                f1948d = elapsedRealtime;
                f1946b.set(z13);
                f1947c.set(z14);
            }
        }
    }

    public static void e(i iVar) {
        k4 k4Var = iVar.f1970a;
        k4Var.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) k4Var.f83410a;
        if (g1Var.o("android_early_video_warmup", "enabled", z3Var) || g1Var.l("android_early_video_warmup")) {
            return;
        }
        vb0.j.f125466a.O("performWarmUp", tb0.p.VIDEO_PLAYER);
        g a13 = iVar.a();
        if (a13 == null) {
            return;
        }
        a13.f1954a.newUrlRequestBuilder("https://v1.pinimg.com/_/_/warm", new h(), a13.f1955b).build().start();
    }

    public final boolean c() {
        if (f1950f) {
            return ((f1946b.get() && ((kc2.b) ((kc2.a) lc2.c.f82903a.getValue())).f79190b.f("PREF_AUTOPLAY_OVER_WIFI", true)) || (f1947c.get() && b())) && (((Boolean) f1949e.getValue()).booleanValue() ^ true);
        }
        return false;
    }
}
