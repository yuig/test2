package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zo0 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14846a;

    /* renamed from: b, reason: collision with root package name */
    public final xf1 f14847b;

    /* renamed from: c, reason: collision with root package name */
    public final cn1 f14848c;

    public zo0(j0 uiScope, xf1 nativeAdCore, cn1 nativeVideoViewabilityMonitor) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeVideoViewabilityMonitor, "nativeVideoViewabilityMonitor");
        this.f14846a = uiScope;
        this.f14847b = nativeAdCore;
        this.f14848c = nativeVideoViewabilityMonitor;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        kotlin.jvm.internal.j.z(this.f14846a, null, null, new yo0(this, null), 3);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_HIDE_OVERLAY;
    }
}
