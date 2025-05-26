package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10661a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f10662b;

    public rj2(a.o8 o8Var, a.o8 o8Var2) {
        this.f10661a = o8Var;
        this.f10662b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        m3 adServicesExtensionVersionSignalSource = (m3) this.f10661a.get();
        oh0 flags = (oh0) this.f10662b.get();
        Intrinsics.checkNotNullParameter(adServicesExtensionVersionSignalSource, "adServicesExtensionVersionSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        ci2 ci2Var = ci2.f3928a;
        return new ul(adServicesExtensionVersionSignalSource, jh2.f6819b, gj2.f5594a, yk2.f14301b.f14306a, new a.a7(flags, 0));
    }
}
