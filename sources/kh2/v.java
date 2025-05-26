package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79719d;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79720a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79721b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79722c;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(v.class, "crashMarker", "getCrashMarker()Lio/embrace/android/embracesdk/internal/crash/CrashFileMarker;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79719d = new rl2.u[]{l0Var.g(d0Var), a.c.l(v.class, "crashDataSource", "getCrashDataSource()Lio/embrace/android/embracesdk/internal/capture/crash/CrashDataSource;", 0, l0Var), a.c.l(v.class, "lastRunCrashVerifier", "getLastRunCrashVerifier()Lio/embrace/android/embracesdk/internal/crash/LastRunCrashVerifier;", 0, l0Var)};
    }

    public v(b1 initModule, d3 storageModule, o0 essentialServiceModule, k configModule, a androidServicesModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        int i13 = 1;
        u uVar = new u(storageModule, i13);
        g1 g1Var = g1.LAZY;
        this.f79720a = new c0(g1Var, uVar);
        this.f79721b = new c0(g1Var, new q4.h(essentialServiceModule, androidServicesModule, configModule, initModule, this, 13));
        this.f79722c = new c0(g1Var, new t(this, i13));
    }
}
