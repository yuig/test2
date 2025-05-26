package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rc2 implements a.qe {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f10585a;

    public rc2(n1 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.f10585a = adEventEmitter;
    }

    @Override // a.qe
    public final Object a(boolean z13, bl2.c cVar) {
        Object o13;
        return (z13 && (o13 = this.f10585a.o(cVar)) == cl2.a.COROUTINE_SUSPENDED) ? o13 : Unit.f80348a;
    }
}
