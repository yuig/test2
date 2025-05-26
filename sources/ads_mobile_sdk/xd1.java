package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xd1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.y4 f13615a;

    public xd1(a.y4 mraidEventEmitter) {
        Intrinsics.checkNotNullParameter(mraidEventEmitter, "mraidEventEmitter");
        this.f13615a = mraidEventEmitter;
    }

    public final Unit a(kc1 kc1Var) {
        Object c13 = this.f13615a.c(kc1Var);
        if (c13 != cl2.a.COROUTINE_SUSPENDED) {
            c13 = Unit.f80348a;
        }
        return (Unit) c13;
    }
}
