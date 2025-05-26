package ads_mobile_sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h6 implements a.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f5859a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5860b;

    public h6(n1 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.f5859a = adEventEmitter;
        this.f5860b = new AtomicBoolean(false);
    }

    @Override // a.l8
    public final Object a(hy2 hy2Var, bl2.c cVar) {
        if (!hy2Var.f6144b || !this.f5860b.compareAndSet(false, true)) {
            return Unit.f80348a;
        }
        Object o13 = this.f5859a.o(cVar);
        return o13 == cl2.a.COROUTINE_SUSPENDED ? o13 : Unit.f80348a;
    }
}
