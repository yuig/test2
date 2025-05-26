package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ql1 implements a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final ol1 f10165a;

    public ql1(ol1 nativeOnePointFiveOverlayFactory) {
        Intrinsics.checkNotNullParameter(nativeOnePointFiveOverlayFactory, "nativeOnePointFiveOverlayFactory");
        this.f10165a = nativeOnePointFiveOverlayFactory;
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        ol1 ol1Var = this.f10165a;
        ol1Var.getClass();
        Object b13 = ol1.b(ol1Var, cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }
}
