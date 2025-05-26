package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i92 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final tu1 f6286a;

    public i92(tu1 paidLifecycleWrapper) {
        Intrinsics.checkNotNullParameter(paidLifecycleWrapper, "paidLifecycleWrapper");
        this.f6286a = paidLifecycleWrapper;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        this.f6286a.a();
        this.f6286a.b();
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_RESET_PAID;
    }
}
