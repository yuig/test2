package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o2 implements n2 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79631e;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79632a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79633b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79634c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79635d;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(o2.class, "nativeThreadSamplerService", "getNativeThreadSamplerService()Lio/embrace/android/embracesdk/internal/anr/ndk/NativeThreadSamplerService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79631e = new rl2.u[]{l0Var.g(d0Var), a.c.l(o2.class, "nativeAnrOtelMapper", "getNativeAnrOtelMapper()Lio/embrace/android/embracesdk/internal/anr/ndk/NativeAnrOtelMapper;", 0, l0Var), a.c.l(o2.class, "nativeThreadSamplerInstaller", "getNativeThreadSamplerInstaller()Lio/embrace/android/embracesdk/internal/anr/ndk/NativeThreadSamplerInstaller;", 0, l0Var), a.c.l(o2.class, "nativeCrashService", "getNativeCrashService()Lio/embrace/android/embracesdk/internal/ndk/NativeCrashService;", 0, l0Var)};
    }

    public o2(b1 initModule, o0 essentialServiceModule, k configModule, v2 payloadSourceModule, a androidServicesModule, l3 workerThreadModule, k2 nativeCoreModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(nativeCoreModule, "nativeCoreModule");
        q4.h hVar = new q4.h(this, configModule, workerThreadModule, payloadSourceModule, nativeCoreModule, 25);
        g1 g1Var = g1.LAZY;
        this.f79632a = new c0(g1Var, hVar);
        this.f79633b = new c0(g1Var, new fe2.a(20, this, initModule));
        this.f79634c = new c0(g1Var, new jg2.h(this, configModule, nativeCoreModule, 17));
        this.f79635d = new c0(g1Var, new q4.h(configModule, nativeCoreModule, androidServicesModule, essentialServiceModule, initModule, 24));
    }

    public final qf2.e a() {
        return (qf2.e) this.f79632a.a(this, f79631e[0]);
    }
}
