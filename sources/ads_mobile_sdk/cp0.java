package ads_mobile_sdk;

import android.view.ViewTreeObserver;
import ao2.j0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cp0 implements a.cd, a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f3993a;

    /* renamed from: b, reason: collision with root package name */
    public final gm1 f3994b;

    /* renamed from: c, reason: collision with root package name */
    public final a.v7 f3995c;

    public cp0(j0 uiScope, gm1 nativePolicyValidatorState, a.o8 nativeAdCore) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(nativePolicyValidatorState, "nativePolicyValidatorState");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.f3993a = uiScope;
        this.f3994b = nativePolicyValidatorState;
        this.f3995c = nativeAdCore;
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        ym0 ym0Var = (ym0) this.f3994b.f5618d.get();
        if (ym0Var == null) {
            return Unit.f80348a;
        }
        Object a13 = a(ym0Var, kotlin.collections.z0.d(), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_HIDE_VALIDATOR_OVERLAY;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        kotlin.jvm.internal.j.z(this.f3993a, null, null, new bp0(ym0Var, this, null), 3);
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f3994b.f5616b.get();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f3994b.f5617c.get();
        if (onScrollChangedListener != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        } else {
            Intrinsics.checkNotNullParameter("Failed to detach scroll changed listener.", "message");
            ft2.a(true, "Failed to detach scroll changed listener.", null);
        }
        gm1 gm1Var = this.f3994b;
        WeakReference weakReference = new WeakReference(null);
        gm1Var.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        gm1Var.f5615a = weakReference;
        gm1 gm1Var2 = this.f3994b;
        WeakReference weakReference2 = new WeakReference(null);
        gm1Var2.getClass();
        Intrinsics.checkNotNullParameter(weakReference2, "<set-?>");
        gm1Var2.f5616b = weakReference2;
        gm1 gm1Var3 = this.f3994b;
        WeakReference weakReference3 = new WeakReference(null);
        gm1Var3.getClass();
        Intrinsics.checkNotNullParameter(weakReference3, "<set-?>");
        gm1Var3.f5617c = weakReference3;
        Object a13 = ym0Var.a(cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
