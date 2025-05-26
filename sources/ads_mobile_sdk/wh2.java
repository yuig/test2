package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wh2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13045a;

    public wh2(a.o8 o8Var) {
        this.f13045a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        dj.e signalRequest = (dj.e) this.f13045a.get();
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        return signalRequest instanceof vi.e ? h92.f5900f : signalRequest instanceof bj.p ? h92.f5903i : h92.f5898d;
    }
}
