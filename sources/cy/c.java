package cy;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tb.l;
import xk2.m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f53390a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static ms0.b f53391b;

    /* renamed from: c, reason: collision with root package name */
    public static ox.b f53392c;

    /* renamed from: d, reason: collision with root package name */
    public static long f53393d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f53394e;

    static {
        m.b(b.f53389i);
        f53391b = new ms0.b();
        f53394e = true;
    }

    public static void a(com.pinterest.analytics.kibana.i log) {
        boolean z13;
        Intrinsics.checkNotNullParameter(log, "log");
        synchronized (f53391b) {
            try {
                f53391b.b(log);
                ox.b bVar = f53392c;
                if (f53391b.e() < 15 && (!f53394e || System.currentTimeMillis() - f53393d < 20000)) {
                    z13 = false;
                    if (bVar != null && z13) {
                        ((vy.m) bVar).i(f53391b, ox.a.f97979i);
                        f53391b = new ms0.b();
                        f53393d = System.currentTimeMillis();
                    }
                    Unit unit = Unit.f80348a;
                }
                z13 = true;
                if (bVar != null) {
                    ((vy.m) bVar).i(f53391b, ox.a.f97979i);
                    f53391b = new ms0.b();
                    f53393d = System.currentTimeMillis();
                }
                Unit unit2 = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void b(vy.m analyticsApi, l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        if (telemetryPreferences.x()) {
            f53392c = analyticsApi;
        }
    }
}
