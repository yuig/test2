package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ht2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final cn1 f6080a;

    public ht2(cn1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.f6080a = nativeVideoViewabilityMonitor;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        cn1 cn1Var = this.f6080a;
        cn1Var.f3978g.getAndSet(true);
        Object a13 = cn1Var.a(cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (a13 != aVar) {
            a13 = Unit.f80348a;
        }
        return a13 == aVar ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_TRACK_ACTIVE_VIEW_UNIT;
    }
}
