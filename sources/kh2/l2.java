package kh2;

import io.embrace.android.embracesdk.internal.ndk.jni.JniDelegateImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l2 implements k2 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79599h;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79600a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79601b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79602c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f79603d;

    /* renamed from: e, reason: collision with root package name */
    public final oh2.e f79604e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79605f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79606g;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(l2.class, "delegate", "getDelegate()Lio/embrace/android/embracesdk/internal/ndk/jni/JniDelegate;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79599h = new rl2.u[]{l0Var.g(d0Var), a.c.l(l2.class, "symbolService", "getSymbolService()Lio/embrace/android/embracesdk/internal/ndk/symbols/SymbolService;", 0, l0Var), a.c.l(l2.class, "sharedObjectLoader", "getSharedObjectLoader()Lio/embrace/android/embracesdk/internal/SharedObjectLoader;", 0, l0Var), a.c.l(l2.class, "nativeCrashHandlerInstaller", "getNativeCrashHandlerInstaller()Lio/embrace/android/embracesdk/internal/ndk/NativeCrashHandlerInstaller;", 0, l0Var), a.c.l(l2.class, "nativeInstallMessage", "getNativeInstallMessage()Lio/embrace/android/embracesdk/internal/ndk/NativeInstallMessage;", 0, l0Var)};
    }

    public l2(b1 initModule, o coreModule, v2 payloadSourceModule, l3 workerThreadModule, k configModule, d3 storageModule, o0 essentialServiceModule, q2 otelModule, Function0 delegateProvider, Function0 sharedObjectLoaderProvider, Function0 symbolServiceProvider) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(sharedObjectLoaderProvider, "sharedObjectLoaderProvider");
        Intrinsics.checkNotNullParameter(symbolServiceProvider, "symbolServiceProvider");
        ax1.a aVar = new ax1.a(27, delegateProvider);
        g1 g1Var = g1.LAZY;
        c0 c0Var = new c0(g1Var, aVar);
        this.f79600a = c0Var;
        c0 c0Var2 = new c0(g1Var, new j1.v0(symbolServiceProvider, coreModule, payloadSourceModule, initModule, 28));
        this.f79601b = c0Var2;
        this.f79602c = new c0(g1Var, new q0(sharedObjectLoaderProvider, initModule, 1));
        xk2.v b13 = xk2.m.b(new b(coreModule, initModule, 3));
        this.f79603d = b13;
        nf2.n a13 = a();
        d1 d1Var = (d1) initModule;
        lh2.b bVar = d1Var.f79456b;
        rl2.u[] uVarArr = f79599h;
        m3 m3Var = (m3) workerThreadModule;
        this.f79604e = new oh2.e(a13, bVar, (JniDelegateImpl) c0Var.a(this, uVarArr[0]), d1Var.a(), (ph2.a) c0Var2.a(this, uVarArr[1]), (xk2.k) b13.getValue(), m3Var.d(ki2.i.f79816b));
        this.f79605f = new c0(g1Var, new rr.c1(configModule, this, initModule, m3Var, essentialServiceModule, otelModule, 3));
        this.f79606g = new c0(g1Var, new jg2.h(storageModule, essentialServiceModule, payloadSourceModule, 16));
    }

    public final nf2.n a() {
        return (nf2.n) this.f79602c.a(this, f79599h[2]);
    }
}
