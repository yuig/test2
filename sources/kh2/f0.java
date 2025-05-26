package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79481c = {kotlin.jvm.internal.k0.f80436a.g(new kotlin.jvm.internal.d0(f0.class, "dataCaptureOrchestrator", "getDataCaptureOrchestrator()Lio/embrace/android/embracesdk/internal/arch/DataCaptureOrchestrator;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79482a;

    /* renamed from: b, reason: collision with root package name */
    public final tf2.b f79483b;

    public f0(b1 initModule, l3 workerThreadModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        c0 c0Var = new c0(g1.LAZY, new e0(workerThreadModule, initModule, 0));
        this.f79482a = c0Var;
        this.f79483b = (tf2.b) c0Var.a(this, f79481c[0]);
    }
}
