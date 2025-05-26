package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rb1 implements a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final kd1 f10572a;

    public rb1(kd1 mraidResizeHandler) {
        Intrinsics.checkNotNullParameter(mraidResizeHandler, "mraidResizeHandler");
        this.f10572a = mraidResizeHandler;
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        this.f10572a.a(true);
        return Unit.f80348a;
    }
}
