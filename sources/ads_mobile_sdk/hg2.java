package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hg2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final xf1 f5971b;

    /* renamed from: c, reason: collision with root package name */
    public final cn1 f5972c;

    public hg2(CoroutineContext uiContext, xf1 nativeAdCore, cn1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.f5970a = uiContext;
        this.f5971b = nativeAdCore;
        this.f5972c = nativeVideoViewabilityMonitor;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        Object M;
        ym0 ym0Var2 = (ym0) this.f5971b.f13641c.get();
        return (ym0Var2 == null || (M = kotlin.jvm.internal.j.M(cVar, this.f5970a, new gg2(this, ym0Var2, null))) != cl2.a.COROUTINE_SUSPENDED) ? Unit.f80348a : M;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_SHOW_OVERLAY;
    }
}
