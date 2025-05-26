package kh2;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j3 implements h3 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79575g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f79576a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79577b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79578c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79579d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79580e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79581f;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(j3.class, "activityManager", "getActivityManager()Landroid/app/ActivityManager;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79575g = new rl2.u[]{l0Var.g(d0Var), a.c.l(j3.class, "powerManager", "getPowerManager()Landroid/os/PowerManager;", 0, l0Var), a.c.l(j3.class, "connectivityManager", "getConnectivityManager()Landroid/net/ConnectivityManager;", 0, l0Var), a.c.l(j3.class, "storageManager", "getStorageManager()Landroid/app/usage/StorageStatsManager;", 0, l0Var), a.c.l(j3.class, "windowManager", "getWindowManager()Landroid/view/WindowManager;", 0, l0Var)};
    }

    public j3(o coreModule, ii2.d versionChecker) {
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        this.f79576a = ((q) coreModule).b();
        i3 i3Var = new i3(this, 0);
        g1 g1Var = g1.LAZY;
        this.f79577b = new c0(g1Var, i3Var);
        this.f79578c = new c0(g1Var, new i3(this, 2));
        this.f79579d = new c0(g1Var, new i3(this, 1));
        this.f79580e = new c0(g1Var, new fe2.a(27, versionChecker, this));
        this.f79581f = new c0(g1Var, new i3(this, 3));
    }

    public static final Object a(j3 j3Var, String str) {
        Object m13;
        j3Var.getClass();
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = j3Var.f79576a.getSystemService(str);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof xk2.r) {
            return null;
        }
        return m13;
    }
}
