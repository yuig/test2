package a41;

import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.TopPinsView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements se0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nl1.d f550b;

    public /* synthetic */ c(nl1.d dVar, int i13) {
        this.f549a = i13;
        this.f550b = dVar;
    }

    @Override // se0.k
    public final void V1() {
        int i13 = this.f549a;
        nl1.d dVar = this.f550b;
        switch (i13) {
            case 0:
                r this$0 = (r) dVar;
                int i14 = r.P1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f670u1 = System.currentTimeMillis();
                l0 l0Var = this$0.f668t1;
                if (l0Var != null) {
                    ((d0) l0Var).w3();
                }
                com.pinterest.framework.screens.a Z7 = this$0.Z7();
                com.pinterest.feature.profile.b bVar = Z7 instanceof com.pinterest.feature.profile.b ? (com.pinterest.feature.profile.b) Z7 : null;
                if (bVar != null) {
                    bVar.D6();
                    return;
                }
                return;
            case 1:
                ow1.g this$02 = (ow1.g) dVar;
                fy1.e eVar = ow1.g.O0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((ow1.j) this$02.f8()).B3();
                return;
            case 2:
                zw1.c this$03 = (zw1.c) dVar;
                int i15 = zw1.c.f142942r0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                zw1.i iVar = this$03.f142949p0;
                if (iVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                iVar.q3();
                TopPinsView topPinsView = this$03.f142948o0;
                if (topPinsView == null) {
                    Intrinsics.r("topPinsOverview");
                    throw null;
                }
                topPinsView.j();
                InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = this$03.f142946m0;
                if (initialLoadSwipeRefreshLayout != null) {
                    initialLoadSwipeRefreshLayout.n(false);
                    return;
                } else {
                    Intrinsics.r("swipeRefresh");
                    throw null;
                }
            case 3:
                ax1.e this$04 = (ax1.e) dVar;
                int i16 = ax1.e.f20647h0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.Y7().f24120g.e().a(bx1.j.f24108a);
                TopPinsView topPinsView2 = this$04.f20650e0;
                if (topPinsView2 == null) {
                    Intrinsics.r("topPinsOverview");
                    throw null;
                }
                topPinsView2.j();
                InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout2 = this$04.f20651f0;
                if (initialLoadSwipeRefreshLayout2 != null) {
                    initialLoadSwipeRefreshLayout2.n(false);
                    return;
                } else {
                    Intrinsics.r("swipeRefresh");
                    throw null;
                }
            case 4:
                dx1.f this$05 = (dx1.f) dVar;
                int i17 = dx1.f.A0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                ex1.l lVar = this$05.f56506y0;
                if (lVar != null) {
                    lVar.r3();
                    return;
                }
                return;
            case 5:
                vx1.c this$06 = (vx1.c) dVar;
                int i18 = vx1.c.f126828o0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.V7(cy1.a.REFRESH, null);
                this$06.a8(cy1.f.REFRESH, null);
                return;
            default:
                yx1.j this$07 = (yx1.j) dVar;
                int i19 = yx1.j.H0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                yx1.d dVar2 = this$07.D0;
                if (dVar2 != null) {
                    ((yx1.p) dVar2).t3();
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
        }
    }
}
