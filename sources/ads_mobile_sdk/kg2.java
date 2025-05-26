package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kg2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f7307a;

    /* renamed from: b, reason: collision with root package name */
    public final xf1 f7308b;

    public kg2(CoroutineContext uiContext, xf1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.f7307a = uiContext;
        this.f7308b = nativeAdCore;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        Object M;
        ym0 ym0Var2 = (ym0) this.f7308b.f13642d.get();
        return (ym0Var2 == null || (M = kotlin.jvm.internal.j.M(cVar, this.f7307a, new jg2(ym0Var2, null))) != cl2.a.COROUTINE_SUSPENDED) ? Unit.f80348a : M;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_SHOW_VALIDATOR_OVERLAY;
    }
}
