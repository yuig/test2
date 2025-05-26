package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vc1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12437a;

    public vc1(q70 q70Var) {
        this.f12437a = q70Var;
    }

    @Override // a.v7
    public final Object get() {
        n1 adEventEmitter = (n1) this.f12437a.get();
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        kh2.a1.p(adEventEmitter);
        return adEventEmitter;
    }
}
