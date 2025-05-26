package yx1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.components.OverallPerformanceView;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinMetadataCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinStatsBusinessAccountUpsell;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinVideoMetricsEmptyCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.SaveToBoardCard;
import h32.d4;
import h32.i0;
import h32.w3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import so.h1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyx1/j;", "Lyk1/k;", "Lyx1/e;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends a implements e {
    public static final /* synthetic */ int H0 = 0;
    public OverallPerformanceView A0;
    public InfoAboutDataView B0;
    public PinStatsBusinessAccountUpsell C0;
    public d D0;
    public final d4 G0;

    /* renamed from: j0, reason: collision with root package name */
    public h1 f140360j0;

    /* renamed from: k0, reason: collision with root package name */
    public a11.d f140361k0;

    /* renamed from: l0, reason: collision with root package name */
    public uk1.e f140362l0;

    /* renamed from: m0, reason: collision with root package name */
    public rg0.s f140363m0;

    /* renamed from: n0, reason: collision with root package name */
    public gw1.f f140364n0;

    /* renamed from: o0, reason: collision with root package name */
    public gw1.f f140365o0;

    /* renamed from: p0, reason: collision with root package name */
    public g70.h f140366p0;

    /* renamed from: t0, reason: collision with root package name */
    public InitialLoadSwipeRefreshLayout f140370t0;

    /* renamed from: u0, reason: collision with root package name */
    public PinMetadataCard f140371u0;

    /* renamed from: v0, reason: collision with root package name */
    public ToplineMetricsCard f140372v0;

    /* renamed from: w0, reason: collision with root package name */
    public ToplineMetricsCard f140373w0;

    /* renamed from: x0, reason: collision with root package name */
    public ProductTagCard f140374x0;

    /* renamed from: y0, reason: collision with root package name */
    public PinVideoMetricsEmptyCard f140375y0;

    /* renamed from: z0, reason: collision with root package name */
    public SaveToBoardCard f140376z0;

    /* renamed from: q0, reason: collision with root package name */
    public final xk2.v f140367q0 = xk2.m.b(new f(this, 4));

    /* renamed from: r0, reason: collision with root package name */
    public final xk2.v f140368r0 = xk2.m.b(new f(this, 2));

    /* renamed from: s0, reason: collision with root package name */
    public final xk2.v f140369s0 = xk2.m.b(new f(this, 5));
    public final xk2.v E0 = xk2.m.b(new f(this, 0));
    public final xk2.v F0 = xk2.m.b(new f(this, 1));

    public j() {
        this.E = com.pinterest.partnerAnalytics.e.pin_stats_fragment;
        this.G0 = d4.PIN_ANALYTICS;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(requireContext().getString(com.pinterest.partnerAnalytics.g.pin_stats_title));
        gestaltToolbarImpl.P(drawableRes, eo1.b.color_themed_text_default);
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.U(new wq1.a(this, 17));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        h1 h1Var = this.f140360j0;
        if (h1Var != null) {
            return h1Var.a((uk1.d) this.f140369s0.getValue(), b8());
        }
        Intrinsics.r("presenterPinStatsFactory");
        throw null;
    }

    public final boolean b8() {
        return ((Boolean) this.f140368r0.getValue()).booleanValue();
    }

    public final void c8(f0.h viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (Intrinsics.d(viewState, q.f140405b) || Intrinsics.d(viewState, q.f140406c) || !(viewState instanceof r)) {
            return;
        }
        cy1.d t03 = ((r) viewState).t0();
        PinMetadataCard pinMetadataCard = this.f140371u0;
        if (pinMetadataCard == null) {
            Intrinsics.r("pinMetadata");
            throw null;
        }
        pinMetadataCard.j(t03);
        String string = getString(b8() ? com.pinterest.partnerAnalytics.g.detail_screen_chart_data : com.pinterest.partnerAnalytics.g.overview_screen_chart_data_basic_info);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InfoAboutDataView infoAboutDataView = this.B0;
        if (infoAboutDataView == null) {
            Intrinsics.r("aboutChartData");
            throw null;
        }
        infoAboutDataView.i(string);
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = this.f140370t0;
        if (initialLoadSwipeRefreshLayout != null) {
            initialLoadSwipeRefreshLayout.n(false);
        } else {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
    }

    public final void d8(e0.t viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (!(viewState instanceof c)) {
            if (Intrinsics.d(viewState, b.f140351m)) {
                return;
            }
            Intrinsics.d(viewState, b.f140352n);
        } else {
            ToplineMetricsCard toplineMetricsCard = this.f140372v0;
            if (toplineMetricsCard != null) {
                toplineMetricsCard.a(((c) viewState).e1());
            } else {
                Intrinsics.r("pinMetrics");
                throw null;
            }
        }
    }

    public final void e8(ig1.b viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (!(viewState instanceof w)) {
            if (Intrinsics.d(viewState, v.f140413b)) {
                return;
            }
            Intrinsics.d(viewState, v.f140414c);
        } else {
            PinMetadataCard pinMetadataCard = this.f140371u0;
            if (pinMetadataCard != null) {
                pinMetadataCard.i(((w) viewState).s1());
            } else {
                Intrinsics.r("pinMetadata");
                throw null;
            }
        }
    }

    public final void f8(jk.r viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (!(viewState instanceof y)) {
            if (Intrinsics.d(viewState, x.f140416a)) {
                SaveToBoardCard saveToBoardCard = this.f140376z0;
                if (saveToBoardCard != null) {
                    saveToBoardCard.setVisibility(8);
                    return;
                } else {
                    Intrinsics.r("pinSaveToBoard");
                    throw null;
                }
            }
            if (Intrinsics.d(viewState, x.f140417b)) {
                SaveToBoardCard saveToBoardCard2 = this.f140376z0;
                if (saveToBoardCard2 != null) {
                    saveToBoardCard2.setVisibility(8);
                    return;
                } else {
                    Intrinsics.r("pinSaveToBoard");
                    throw null;
                }
            }
            return;
        }
        SaveToBoardCard saveToBoardCard3 = this.f140376z0;
        if (saveToBoardCard3 == null) {
            Intrinsics.r("pinSaveToBoard");
            throw null;
        }
        saveToBoardCard3.setVisibility(0);
        SaveToBoardCard saveToBoardCard4 = this.f140376z0;
        if (saveToBoardCard4 == null) {
            Intrinsics.r("pinSaveToBoard");
            throw null;
        }
        y yVar = (y) viewState;
        saveToBoardCard4.a(yVar.E());
        SaveToBoardCard saveToBoardCard5 = this.f140376z0;
        if (saveToBoardCard5 != null) {
            saveToBoardCard5.b(yVar.D());
        } else {
            Intrinsics.r("pinSaveToBoard");
            throw null;
        }
    }

    public final void g8(jk.v viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (viewState instanceof a0) {
            ToplineMetricsCard toplineMetricsCard = this.f140373w0;
            if (toplineMetricsCard == null) {
                Intrinsics.r("videoMetrics");
                throw null;
            }
            toplineMetricsCard.setVisibility(0);
            PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard = this.f140375y0;
            if (pinVideoMetricsEmptyCard == null) {
                Intrinsics.r("videoMetricsEmptyView");
                throw null;
            }
            pinVideoMetricsEmptyCard.setVisibility(8);
            ToplineMetricsCard toplineMetricsCard2 = this.f140373w0;
            if (toplineMetricsCard2 != null) {
                toplineMetricsCard2.a(((a0) viewState).g0());
                return;
            } else {
                Intrinsics.r("videoMetrics");
                throw null;
            }
        }
        if (Intrinsics.d(viewState, z.f140420b)) {
            ToplineMetricsCard toplineMetricsCard3 = this.f140373w0;
            if (toplineMetricsCard3 == null) {
                Intrinsics.r("videoMetrics");
                throw null;
            }
            toplineMetricsCard3.setVisibility(8);
            PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard2 = this.f140375y0;
            if (pinVideoMetricsEmptyCard2 != null) {
                pinVideoMetricsEmptyCard2.setVisibility(8);
                return;
            } else {
                Intrinsics.r("videoMetricsEmptyView");
                throw null;
            }
        }
        if (viewState instanceof b0) {
            ToplineMetricsCard toplineMetricsCard4 = this.f140373w0;
            if (toplineMetricsCard4 == null) {
                Intrinsics.r("videoMetrics");
                throw null;
            }
            toplineMetricsCard4.setVisibility(8);
            PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard3 = this.f140375y0;
            if (pinVideoMetricsEmptyCard3 == null) {
                Intrinsics.r("videoMetricsEmptyView");
                throw null;
            }
            pinVideoMetricsEmptyCard3.b(new f(this, 3));
            PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard4 = this.f140375y0;
            if (pinVideoMetricsEmptyCard4 == null) {
                Intrinsics.r("videoMetricsEmptyView");
                throw null;
            }
            pinVideoMetricsEmptyCard4.a(((b0) viewState).g0());
            PinVideoMetricsEmptyCard pinVideoMetricsEmptyCard5 = this.f140375y0;
            if (pinVideoMetricsEmptyCard5 != null) {
                pinVideoMetricsEmptyCard5.setVisibility(0);
            } else {
                Intrinsics.r("videoMetricsEmptyView");
                throw null;
            }
        }
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        w3 w3Var = new w3();
        w3Var.b((String) this.f140367q0.getValue());
        return new i0(this.G0, null, w3Var.a(), null, null, null);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF87992j0() {
        return this.G0;
    }

    public final void o3(gh0.b viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (!(viewState instanceof u)) {
            if (Intrinsics.d(viewState, t.f140409b)) {
                ProductTagCard productTagCard = this.f140374x0;
                if (productTagCard != null) {
                    productTagCard.setVisibility(8);
                    return;
                } else {
                    Intrinsics.r("productTags");
                    throw null;
                }
            }
            if (viewState instanceof s) {
                ProductTagCard productTagCard2 = this.f140374x0;
                if (productTagCard2 != null) {
                    productTagCard2.setVisibility(8);
                    return;
                } else {
                    Intrinsics.r("productTags");
                    throw null;
                }
            }
            return;
        }
        ProductTagCard productTagCard3 = this.f140374x0;
        if (productTagCard3 == null) {
            Intrinsics.r("productTags");
            throw null;
        }
        productTagCard3.setVisibility(0);
        ProductTagCard productTagCard4 = this.f140374x0;
        if (productTagCard4 == null) {
            Intrinsics.r("productTags");
            throw null;
        }
        u uVar = (u) viewState;
        productTagCard4.f(uVar.t0(), new g(this));
        ProductTagCard productTagCard5 = this.f140374x0;
        if (productTagCard5 == null) {
            Intrinsics.r("productTags");
            throw null;
        }
        productTagCard5.c(uVar.t0(), new h(this, 0));
        ProductTagCard productTagCard6 = this.f140374x0;
        if (productTagCard6 == null) {
            Intrinsics.r("productTags");
            throw null;
        }
        productTagCard6.d(new h(this, 1));
        ProductTagCard productTagCard7 = this.f140374x0;
        if (productTagCard7 != null) {
            productTagCard7.b(uVar.r0(), uVar.s0());
        } else {
            Intrinsics.r("productTags");
            throw null;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.swipeRefreshLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f140370t0 = (InitialLoadSwipeRefreshLayout) findViewById;
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinMetadata);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140371u0 = (PinMetadataCard) findViewById2;
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinMetrics);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f140372v0 = (ToplineMetricsCard) findViewById3;
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.videoMetrics);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f140373w0 = (ToplineMetricsCard) findViewById4;
        View findViewById5 = v13.findViewById(com.pinterest.partnerAnalytics.d.productTags);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f140374x0 = (ProductTagCard) findViewById5;
        View findViewById6 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinVideoMetricsEmptyCard);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f140375y0 = (PinVideoMetricsEmptyCard) findViewById6;
        View findViewById7 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinSaveToBoard);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f140376z0 = (SaveToBoardCard) findViewById7;
        View findViewById8 = v13.findViewById(com.pinterest.partnerAnalytics.d.overallPerformance);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.A0 = (OverallPerformanceView) findViewById8;
        View findViewById9 = v13.findViewById(com.pinterest.partnerAnalytics.d.aboutDataView);
        InfoAboutDataView infoAboutDataView = (InfoAboutDataView) findViewById9;
        infoAboutDataView.setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.B0 = infoAboutDataView;
        View findViewById10 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinStatsBizAccountUpsell);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.C0 = (PinStatsBusinessAccountUpsell) findViewById10;
        OverallPerformanceView overallPerformanceView = this.A0;
        if (overallPerformanceView == null) {
            Intrinsics.r("overallPerformance");
            throw null;
        }
        int i13 = 0;
        overallPerformanceView.setVisibility(b8() ? 0 : 8);
        ToplineMetricsCard toplineMetricsCard = this.f140372v0;
        if (toplineMetricsCard == null) {
            Intrinsics.r("pinMetrics");
            throw null;
        }
        i iVar = new i(this, i13);
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        toplineMetricsCard.f50115i = iVar;
        ToplineMetricsCard toplineMetricsCard2 = this.f140373w0;
        if (toplineMetricsCard2 == null) {
            Intrinsics.r("videoMetrics");
            throw null;
        }
        i iVar2 = new i(this, 1);
        Intrinsics.checkNotNullParameter(iVar2, "<set-?>");
        toplineMetricsCard2.f50115i = iVar2;
        d0 d0Var = ((uk1.d) this.f140369s0.getValue()).f122379a;
        OverallPerformanceView overallPerformanceView2 = this.A0;
        if (overallPerformanceView2 == null) {
            Intrinsics.r("overallPerformance");
            throw null;
        }
        overallPerformanceView2.f50055a = d0Var;
        PinMetadataCard pinMetadataCard = this.f140371u0;
        if (pinMetadataCard == null) {
            Intrinsics.r("pinMetadata");
            throw null;
        }
        pinMetadataCard.f50201d = d0Var;
        SaveToBoardCard saveToBoardCard = this.f140376z0;
        if (saveToBoardCard == null) {
            Intrinsics.r("pinSaveToBoard");
            throw null;
        }
        saveToBoardCard.f50224a = d0Var;
        ProductTagCard productTagCard = this.f140374x0;
        if (productTagCard == null) {
            Intrinsics.r("productTags");
            throw null;
        }
        productTagCard.f50085a = d0Var;
        g70.h hVar = this.f140366p0;
        if (hVar == null) {
            Intrinsics.r("boardNavigator");
            throw null;
        }
        saveToBoardCard.f50225b = hVar;
        String str = (String) this.f140367q0.getValue();
        if (str != null) {
            d dVar = this.D0;
            if (dVar == null) {
                Intrinsics.r("listener");
                throw null;
            }
            ((p) dVar).p3(str);
        }
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = this.f140370t0;
        if (initialLoadSwipeRefreshLayout == null) {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
        int i14 = 6;
        initialLoadSwipeRefreshLayout.f44880n = new a41.c(this, i14);
        if (!b8()) {
            InfoAboutDataView infoAboutDataView2 = this.B0;
            if (infoAboutDataView2 == null) {
                Intrinsics.r("aboutChartData");
                throw null;
            }
            bs1.c.X0(infoAboutDataView2);
            ToplineMetricsCard toplineMetricsCard3 = this.f140372v0;
            if (toplineMetricsCard3 == null) {
                Intrinsics.r("pinMetrics");
                throw null;
            }
            bs1.c.X0(toplineMetricsCard3);
            PinStatsBusinessAccountUpsell pinStatsBusinessAccountUpsell = this.C0;
            if (pinStatsBusinessAccountUpsell == null) {
                Intrinsics.r("pinStatsBusinessAccountUpsell");
                throw null;
            }
            pinStatsBusinessAccountUpsell.L(new f(this, i14));
            bs1.c.U1(pinStatsBusinessAccountUpsell);
        }
        rg0.n nVar = (rg0.n) this.E0.getValue();
        if (nVar != null) {
            if (nVar.f108060b == i32.l.ANDROID_PIN_STATS_PINNER_INTRO_EDUCATION.getValue()) {
                f7().d(new jc0.v(new zp.t(nVar), false, 0L, 30));
            }
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(com.pinterest.partnerAnalytics.d.brio_toolbar);
    }
}
