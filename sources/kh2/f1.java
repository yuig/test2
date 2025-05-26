package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79484e;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79485a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79486b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79487c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79488d;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(f1.class, "embraceInternalInterface", "getEmbraceInternalInterface()Lio/embrace/android/embracesdk/internal/EmbraceInternalInterface;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79484e = new rl2.u[]{l0Var.g(d0Var), a.c.l(f1.class, "reactNativeInternalInterface", "getReactNativeInternalInterface()Lio/embrace/android/embracesdk/internal/ReactNativeInternalInterface;", 0, l0Var), a.c.l(f1.class, "unityInternalInterface", "getUnityInternalInterface()Lio/embrace/android/embracesdk/internal/UnityInternalInterface;", 0, l0Var), a.c.l(f1.class, "flutterInternalInterface", "getFlutterInternalInterface()Lio/embrace/android/embracesdk/internal/FlutterInternalInterface;", 0, l0Var)};
    }

    public f1(b1 initModule, q2 openTelemetryModule, k configModule, v2 payloadSourceModule, h1 logModule, lf2.i embrace, s crashModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(logModule, "logModule");
        Intrinsics.checkNotNullParameter(embrace, "embrace");
        Intrinsics.checkNotNullParameter(crashModule, "crashModule");
        q4.h hVar = new q4.h(embrace, initModule, logModule, configModule, openTelemetryModule, 20);
        g1 g1Var = g1.LAZY;
        this.f79485a = new c0(g1Var, hVar);
        this.f79486b = new c0(g1Var, new q4.h(embrace, this, crashModule, payloadSourceModule, initModule, 21));
        this.f79487c = new c0(g1Var, new e1(embrace, this, payloadSourceModule, initModule, 1));
        this.f79488d = new c0(g1Var, new e1(embrace, this, payloadSourceModule, initModule, 0));
    }

    public final nf2.g a() {
        return (nf2.g) this.f79485a.a(this, f79484e[0]);
    }
}
