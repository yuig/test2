package bj;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import wi.e0;

/* loaded from: classes3.dex */
public final class o extends wi.m {

    /* renamed from: j, reason: collision with root package name */
    public List f22918j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f22919k;

    /* renamed from: l, reason: collision with root package name */
    public d f22920l;

    /* renamed from: m, reason: collision with root package name */
    public wi.d f22921m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f22922n;

    /* renamed from: o, reason: collision with root package name */
    public final q0 f22923o;

    public o() {
        Intrinsics.checkNotNullParameter("signal_type_ad_manager_s2s", "signalType");
        q0 q0Var = q0.f80391a;
        this.f22918j = q0Var;
        this.f22919k = q0Var;
        this.f22920l = d.UNKNOWN;
        this.f22921m = wi.d.TOP_RIGHT;
        this.f22923o = q0Var;
    }

    public final p c() {
        return new p(this.f129972i, this.f129964a, this.f129965b, this.f129966c, this.f129967d, this.f129968e, this.f129969f, this.f129970g, this.f129971h, this.f22918j, this.f22919k, false, this.f22920l, this.f22921m, this.f22922n, this.f22923o);
    }

    public final void d(wi.d adChoicesPlacement) {
        Intrinsics.checkNotNullParameter(adChoicesPlacement, "adChoicesPlacement");
        this.f22921m = adChoicesPlacement;
    }

    public final void e(d mediaAspectRatio) {
        Intrinsics.checkNotNullParameter(mediaAspectRatio, "mediaAspectRatio");
        this.f22920l = mediaAspectRatio;
    }

    public final void f(List nativeAdTypes) {
        Intrinsics.checkNotNullParameter(nativeAdTypes, "nativeAdTypes");
        this.f22918j = CollectionsKt.F0(nativeAdTypes);
    }
}
