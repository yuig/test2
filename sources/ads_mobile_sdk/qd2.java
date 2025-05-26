package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qd2 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final dj.e f10050a;

    public qd2(dj.e signalRequest) {
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        this.f10050a = signalRequest;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.SCAR_SIGNAL_TYPE;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        return new pk0(new pd2(this.f10050a.f55120k));
    }
}
