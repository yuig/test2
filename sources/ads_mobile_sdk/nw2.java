package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nw2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final cn1 f9022a;

    public nw2(cn1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.f9022a = nativeVideoViewabilityMonitor;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        this.f9022a.f3978g.getAndSet(false);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_UNTRACK_ACTIVE_VIEW_UNIT;
    }
}
