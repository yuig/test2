package is1;

import android.app.Activity;
import android.location.LocationManager;
import com.pinterest.activity.task.activity.MainActivity;
import h32.f1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.d2;
import lh0.g1;
import lh0.z3;
import nx.r0;
import yq1.u1;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final b20.c f73620a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f73621b;

    /* renamed from: c, reason: collision with root package name */
    public final gz1.b f73622c;

    /* renamed from: d, reason: collision with root package name */
    public final lb0.q f73623d;

    /* renamed from: e, reason: collision with root package name */
    public final long f73624e;

    /* renamed from: f, reason: collision with root package name */
    public i f73625f;

    /* renamed from: g, reason: collision with root package name */
    public final uj2.a0 f73626g;

    /* renamed from: h, reason: collision with root package name */
    public final uj2.a0 f73627h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f73628i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f73629j;

    public l(b20.c experiments, tb0.h crashReporting, gz1.b googlePlayServices, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f73620a = experiments;
        this.f73621b = crashReporting;
        this.f73622c = googlePlayServices;
        this.f73623d = prefsManagerPersisted;
        this.f73624e = TimeUnit.MINUTES.toMillis(10L);
        uj2.a0 a0Var = tk2.e.f118017c;
        Intrinsics.checkNotNullExpressionValue(a0Var, "io(...)");
        this.f73626g = a0Var;
        uj2.a0 a13 = wj2.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "mainThread(...)");
        this.f73627h = a13;
        this.f73628i = new AtomicBoolean(false);
        this.f73629j = xk2.m.b(new r0(this, 27));
    }

    public final void a(Activity activity, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        qy1.c c13 = qy1.d.c(this.f73623d, activity);
        f1 f1Var = f1.LOCATION_PERMISSIONS_CURRENT_STATUS;
        HashMap hashMap = new HashMap();
        String analyticsName = c13.getAnalyticsName();
        Intrinsics.checkNotNullExpressionValue(analyticsName, "getAnalyticsName(...)");
        hashMap.put("value", analyticsName);
        Unit unit = Unit.f80348a;
        pinalytics.g(f1Var, null, hashMap, false);
    }

    public final void b(Activity activity, k22.m userService) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(userService, "userService");
        if (((Boolean) this.f73629j.getValue()).booleanValue() && qy1.d.c(this.f73623d, activity) == qy1.c.AUTHORIZED) {
            Object systemService = activity.getSystemService("location");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (i5.a.a((LocationManager) systemService)) {
                b20.c cVar = this.f73620a;
                d2 d2Var = (d2) cVar.f21278a;
                d2Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) d2Var.f83327a;
                if (!g1Var.o("android_blue_dot_logging", "enabled", z3Var) && !g1Var.l("android_blue_dot_logging")) {
                    d2 d2Var2 = (d2) cVar.f21278a;
                    d2Var2.getClass();
                    z3 z3Var2 = a4.f83297a;
                    g1 g1Var2 = (g1) d2Var2.f83327a;
                    if (!g1Var2.o("android_blue_dot_request", "enabled", z3Var2) && !g1Var2.l("android_blue_dot_request")) {
                        return;
                    }
                }
                userService.h().r(this.f73626g).l(this.f73627h).o(new or1.j(8, new fn1.k(this, activity, userService, 5)), new or1.j(9, j.f73609j));
            }
        }
    }

    public final void c(MainActivity activity, nx.d0 pinalytics, k22.m userService) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userService, "userService");
        if (!((Boolean) this.f73629j.getValue()).booleanValue() || ff0.j.b()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f73628i;
        if (atomicBoolean.get()) {
            return;
        }
        new kk2.k(new a.g0(20, this, activity), 1).r(this.f73626g).l(this.f73627h).o(new zq1.c0(21, new k(this, activity, pinalytics, userService)), new zq1.c0(22, new u1(this, 8)));
        atomicBoolean.set(true);
    }
}
