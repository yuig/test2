package s01;

import com.pinterest.api.model.b01;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h01;
import h32.b1;
import h32.c1;
import h32.f3;
import h32.g3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import nx.d1;
import tb.f;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f110296h;

    /* renamed from: i, reason: collision with root package name */
    public final b20.c f110297i;

    /* renamed from: j, reason: collision with root package name */
    public final d1 f110298j;

    /* renamed from: k, reason: collision with root package name */
    public final ro1.c f110299k;

    /* renamed from: l, reason: collision with root package name */
    public final j80.b f110300l;

    /* renamed from: m, reason: collision with root package name */
    public final c82.d f110301m;

    /* renamed from: n, reason: collision with root package name */
    public final n1 f110302n;

    /* renamed from: o, reason: collision with root package name */
    public final ur.a f110303o;

    public c(WeakReference pinalytics, b20.c clickthroughLoggingUtil, d1 trackingParamAttacher, ro1.c deepLinkAdUtil, j80.b carouselUtil, c82.d siteApi, n1 experiments, ur.a adsCoreDependencies) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(clickthroughLoggingUtil, "clickthroughLoggingUtil");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f110296h = pinalytics;
        this.f110297i = clickthroughLoggingUtil;
        this.f110298j = trackingParamAttacher;
        this.f110299k = deepLinkAdUtil;
        this.f110300l = carouselUtil;
        this.f110301m = siteApi;
        this.f110302n = experiments;
        this.f110303o = adsCoreDependencies;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x04b6, code lost:
    
        if (kotlin.text.StringsKt.toIntOrNull(r0) != null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ef, code lost:
    
        if ((r4 != null ? r4.l() : null) != null) goto L82;
     */
    @Override // tb.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s01.c.Y(java.lang.Object):void");
    }

    public final c1 n0(d dVar, f30 f30Var) {
        g3 g3Var;
        h01 W;
        b01 M6 = f30Var.M6();
        Double m13 = (M6 == null || (W = d7.b.W(M6)) == null) ? null : W.m();
        c1 c13 = dVar.c();
        f3 f3Var = (c13 == null || (g3Var = c13.f66921q) == null) ? new f3() : new f3(g3Var);
        if (m13 != null && m13.doubleValue() > 0.0d) {
            f3Var.f67005w = Long.valueOf((long) m13.doubleValue());
        }
        g3 a13 = f3Var.a();
        c1 c14 = dVar.c();
        b1 b1Var = c14 != null ? new b1(c14) : new b1();
        b1Var.f66872q = a13;
        vr.a aVar = ((ur.b) this.f110303o).f123059b;
        c1 c15 = dVar.c();
        b1Var.f66859e0 = ((vr.b) aVar).b(c15 != null ? c15.f66908e0 : null, f30Var, Integer.valueOf(dVar.d().getValue()), dVar.i());
        return b1Var.a();
    }
}
