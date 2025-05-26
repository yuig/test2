package dx1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents.MetricsSelectorView;
import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.PinsListEmptyView;
import ex1.h;
import ex1.i;
import ex1.j;
import ex1.l;
import h32.d4;
import java.util.List;
import kh2.b0;
import kh2.s0;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.b1;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldx1/f;", "Lyk1/k;", "Lex1/j;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends a implements j {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public final v f56491j0 = m.b(c.f56487i);

    /* renamed from: k0, reason: collision with root package name */
    public List f56492k0 = q0.f80391a;

    /* renamed from: l0, reason: collision with root package name */
    public int f56493l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f56494m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltToolbarImpl f56495n0;

    /* renamed from: o0, reason: collision with root package name */
    public PinsListEmptyView f56496o0;

    /* renamed from: p0, reason: collision with root package name */
    public InitialLoadSwipeRefreshLayout f56497p0;

    /* renamed from: q0, reason: collision with root package name */
    public Switch f56498q0;

    /* renamed from: r0, reason: collision with root package name */
    public MetricsSelectorView f56499r0;

    /* renamed from: s0, reason: collision with root package name */
    public RecyclerView f56500s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltText f56501t0;

    /* renamed from: u0, reason: collision with root package name */
    public InfoAboutDataView f56502u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltSpinner f56503v0;

    /* renamed from: w0, reason: collision with root package name */
    public b1 f56504w0;

    /* renamed from: x0, reason: collision with root package name */
    public gw1.f f56505x0;

    /* renamed from: y0, reason: collision with root package name */
    public l f56506y0;

    /* renamed from: z0, reason: collision with root package name */
    public final d4 f56507z0;

    public f() {
        this.E = com.pinterest.partnerAnalytics.e.fragment_top_pins_closeup;
        this.f56507z0 = d4.ANALYTICS_OVERVIEW;
    }

    @Override // ex1.j
    public final void F1(kh2.d viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (Intrinsics.d(viewState, h.f60400b)) {
            InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = this.f56497p0;
            if (initialLoadSwipeRefreshLayout != null) {
                initialLoadSwipeRefreshLayout.n(true);
                return;
            }
            return;
        }
        int i13 = 0;
        if (!(viewState instanceof i)) {
            if (Intrinsics.d(viewState, h.f60399a)) {
                InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout2 = this.f56497p0;
                if (initialLoadSwipeRefreshLayout2 == null) {
                    Intrinsics.r("swipeRefresh");
                    throw null;
                }
                initialLoadSwipeRefreshLayout2.n(false);
                b8(true);
                GestaltSpinner gestaltSpinner = this.f56503v0;
                if (gestaltSpinner != null) {
                    dl2.b.X2(gestaltSpinner, ln1.e.NONE);
                    return;
                } else {
                    Intrinsics.r("loadingView");
                    throw null;
                }
            }
            return;
        }
        b8(false);
        RecyclerView recyclerView = this.f56500s0;
        if (recyclerView == null) {
            Intrinsics.r("topPinsList");
            throw null;
        }
        Context requireContext = requireContext();
        List r13 = ((i) viewState).r1();
        ww1.c cVar = (ww1.c) this.f56492k0.get(this.f56493l0);
        Intrinsics.f(requireContext);
        recyclerView.H2(new ex1.g(requireContext, r13, cVar, new e(this, i13)));
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout3 = this.f56497p0;
        if (initialLoadSwipeRefreshLayout3 == null) {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
        initialLoadSwipeRefreshLayout3.n(false);
        GestaltSpinner gestaltSpinner2 = this.f56503v0;
        if (gestaltSpinner2 != null) {
            dl2.b.X2(gestaltSpinner2, ln1.e.LOADED);
        } else {
            Intrinsics.r("loadingView");
            throw null;
        }
    }

    @Override // ex1.j
    public final void L2(l presenterListener) {
        Intrinsics.checkNotNullParameter(presenterListener, "presenterListener");
        this.f56506y0 = presenterListener;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        b1 b1Var = this.f56504w0;
        if (b1Var != null) {
            return b1Var.a(s7(), 50, this.f56494m0, ww1.c.IMPRESSION);
        }
        Intrinsics.r("topPinsPresenterFactory");
        throw null;
    }

    @Override // ex1.j
    public final void Y5(String dateRange, String filterInfo) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(filterInfo, "filterInfo");
        GestaltToolbarImpl gestaltToolbarImpl = this.f56495n0;
        if (gestaltToolbarImpl != null) {
            b0.Y1(gestaltToolbarImpl, dateRange, filterInfo);
        } else {
            Intrinsics.r("toolbar");
            throw null;
        }
    }

    public final void b8(boolean z13) {
        RecyclerView recyclerView = this.f56500s0;
        if (recyclerView == null) {
            Intrinsics.r("topPinsList");
            throw null;
        }
        recyclerView.setVisibility(z13 ^ true ? 0 : 8);
        PinsListEmptyView pinsListEmptyView = this.f56496o0;
        if (pinsListEmptyView != null) {
            pinsListEmptyView.setVisibility(z13 ? 0 : 8);
        } else {
            Intrinsics.r("pinListEmpty");
            throw null;
        }
    }

    @Override // ex1.j
    public final void c0(String disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        GestaltText gestaltText = this.f56501t0;
        if (gestaltText != null) {
            a0.p(gestaltText, disclaimer);
        } else {
            Intrinsics.r("metricUpdatedDateDisclaimer");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.f56507z0;
    }

    @Override // ex1.j
    public final void h1(List metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.f56492k0 = metrics;
        if (this.f56499r0 != null) {
            int i13 = this.f56493l0;
            ww1.c cVar = (ww1.c) ((i13 < 0 || i13 > f0.i(metrics)) ? (ww1.c) d7.b.F(this.f56492k0) : metrics.get(i13));
            MetricsSelectorView metricsSelectorView = this.f56499r0;
            if (metricsSelectorView != null) {
                metricsSelectorView.a(cVar.getDescription());
            } else {
                Intrinsics.r("metricsSelector");
                throw null;
            }
        }
    }

    @Override // ex1.j
    public final void j0() {
        this.f56506y0 = null;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.f56493l0 = bundle != null ? bundle.getInt("METRIC_TYPE_POSITION_SELECTED") : 0;
        this.f56494m0 = bundle != null ? bundle.getBoolean("RECENT_PINS_IS_CHECKED") : false;
        super.onCreate(bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        l lVar = this.f56506y0;
        if (lVar != null) {
            lVar.r3();
        }
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Switch r03 = this.f56498q0;
        if (r03 != null) {
            outState.putBoolean("RECENT_PINS_IS_CHECKED", r03.isChecked());
        } else {
            Intrinsics.r("recentPins");
            throw null;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.brio_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) findViewById;
        this.f56495n0 = gestaltToolbarImpl;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl.X(vn1.c.DEFAULT);
        GestaltToolbarImpl gestaltToolbarImpl2 = this.f56495n0;
        if (gestaltToolbarImpl2 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl2.m();
        GestaltToolbarImpl gestaltToolbarImpl3 = this.f56495n0;
        if (gestaltToolbarImpl3 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        final int i13 = 0;
        gestaltToolbarImpl3.f49713m = new View.OnClickListener(this) { // from class: dx1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f56486b;

            {
                this.f56486b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                f this$0 = this.f56486b;
                switch (i14) {
                    case 0:
                        int i15 = f.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((ku1.j) this$0.o7()).f();
                        return;
                    default:
                        int i16 = f.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list = this$0.f56492k0;
                        int i17 = this$0.f56493l0;
                        ww1.c cVar = (ww1.c) ((i17 < 0 || i17 > f0.i(list)) ? (ww1.c) d7.b.F(this$0.f56492k0) : list.get(i17));
                        gw1.f fVar = this$0.f56505x0;
                        if (fVar != null) {
                            fVar.c(cVar, this$0.f56492k0, new e(this$0, 1));
                            return;
                        } else {
                            Intrinsics.r("metricsSelectionActionSheetHandler");
                            throw null;
                        }
                }
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i14 = 2;
        b0.K(gestaltToolbarImpl3, requireContext, new yv1.i(this, i14));
        View findViewById2 = v13.findViewById(com.pinterest.partnerAnalytics.d.metricsSelector);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f56499r0 = (MetricsSelectorView) findViewById2;
        View findViewById3 = v13.findViewById(com.pinterest.partnerAnalytics.d.recent_pins_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f56498q0 = (Switch) findViewById3;
        View findViewById4 = v13.findViewById(com.pinterest.partnerAnalytics.d.metricUpdatedDateDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f56501t0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(com.pinterest.partnerAnalytics.d.top_pins_closeup_recyclerview);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f56500s0 = (RecyclerView) findViewById5;
        View findViewById6 = v13.findViewById(com.pinterest.partnerAnalytics.d.analyticsTopPinsSwipeRefresh);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f56497p0 = (InitialLoadSwipeRefreshLayout) findViewById6;
        View findViewById7 = v13.findViewById(com.pinterest.partnerAnalytics.d.metric_description_text);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = v13.findViewById(com.pinterest.partnerAnalytics.d.pinListEmpty);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f56496o0 = (PinsListEmptyView) findViewById8;
        View findViewById9 = v13.findViewById(com.pinterest.partnerAnalytics.d.aboutDataView);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f56502u0 = (InfoAboutDataView) findViewById9;
        View findViewById10 = v13.findViewById(com.pinterest.partnerAnalytics.d.loadingView);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById10;
        this.f56503v0 = gestaltSpinner;
        if (gestaltSpinner == null) {
            Intrinsics.r("loadingView");
            throw null;
        }
        s0.w(gestaltSpinner, d.f56488i);
        InfoAboutDataView infoAboutDataView = this.f56502u0;
        if (infoAboutDataView == null) {
            Intrinsics.r("aboutChartData");
            throw null;
        }
        infoAboutDataView.setPinalytics(s7());
        RecyclerView recyclerView = this.f56500s0;
        if (recyclerView == null) {
            Intrinsics.r("topPinsList");
            throw null;
        }
        g41.a aVar = new g41.a(this, 17);
        requireContext();
        recyclerView.R2(new PinterestLinearLayoutManager(aVar));
        RecyclerView recyclerView2 = this.f56500s0;
        if (recyclerView2 == null) {
            Intrinsics.r("topPinsList");
            throw null;
        }
        recyclerView2.f19254t = false;
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = this.f56497p0;
        if (initialLoadSwipeRefreshLayout == null) {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
        initialLoadSwipeRefreshLayout.f44880n = new a41.c(this, 4);
        PinsListEmptyView pinsListEmptyView = this.f56496o0;
        if (pinsListEmptyView == null) {
            Intrinsics.r("pinListEmpty");
            throw null;
        }
        pinsListEmptyView.setPinalytics(s7());
        MetricsSelectorView metricsSelectorView = this.f56499r0;
        if (metricsSelectorView == null) {
            Intrinsics.r("metricsSelector");
            throw null;
        }
        metricsSelectorView.setVisibility(0);
        List list = this.f56492k0;
        int i15 = this.f56493l0;
        ww1.c cVar = (ww1.c) ((i15 < 0 || i15 > f0.i(list)) ? (ww1.c) d7.b.F(this.f56492k0) : list.get(i15));
        MetricsSelectorView metricsSelectorView2 = this.f56499r0;
        if (metricsSelectorView2 == null) {
            Intrinsics.r("metricsSelector");
            throw null;
        }
        metricsSelectorView2.a(cVar.getDescription());
        MetricsSelectorView metricsSelectorView3 = this.f56499r0;
        if (metricsSelectorView3 == null) {
            Intrinsics.r("metricsSelector");
            throw null;
        }
        final int i16 = 1;
        metricsSelectorView3.setOnClickListener(new View.OnClickListener(this) { // from class: dx1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f56486b;

            {
                this.f56486b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i16;
                f this$0 = this.f56486b;
                switch (i142) {
                    case 0:
                        int i152 = f.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((ku1.j) this$0.o7()).f();
                        return;
                    default:
                        int i162 = f.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list2 = this$0.f56492k0;
                        int i17 = this$0.f56493l0;
                        ww1.c cVar2 = (ww1.c) ((i17 < 0 || i17 > f0.i(list2)) ? (ww1.c) d7.b.F(this$0.f56492k0) : list2.get(i17));
                        gw1.f fVar = this$0.f56505x0;
                        if (fVar != null) {
                            fVar.c(cVar2, this$0.f56492k0, new e(this$0, 1));
                            return;
                        } else {
                            Intrinsics.r("metricsSelectionActionSheetHandler");
                            throw null;
                        }
                }
            }
        });
        Switch r73 = this.f56498q0;
        if (r73 == null) {
            Intrinsics.r("recentPins");
            throw null;
        }
        r73.setOnCheckedChangeListener(new nj.a(this, i14));
        Switch r74 = this.f56498q0;
        if (r74 != null) {
            r74.setChecked(this.f56494m0);
        } else {
            Intrinsics.r("recentPins");
            throw null;
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
