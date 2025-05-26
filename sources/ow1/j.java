package ow1;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.i5;
import com.pinterest.api.model.m5;
import com.pinterest.api.model.o4;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kh2.b0;
import kh2.m0;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.m2;
import m60.w;
import mw1.m;
import nx.d0;
import sw0.u;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;
import yk1.v;
import zx.l;

/* loaded from: classes4.dex */
public abstract class j extends t implements uw1.a, ey1.a {

    /* renamed from: o, reason: collision with root package name */
    public static final List f97959o = f0.j(ww1.c.ENGAGEMENT_RATE, ww1.c.PIN_CLICK_RATE, ww1.c.OUTBOUND_CLICK_RATE, ww1.c.SAVE_RATE);

    /* renamed from: a, reason: collision with root package name */
    public final v f97960a;

    /* renamed from: b, reason: collision with root package name */
    public final w f97961b;

    /* renamed from: c, reason: collision with root package name */
    public final yx.d f97962c;

    /* renamed from: d, reason: collision with root package name */
    public ww1.c f97963d;

    /* renamed from: e, reason: collision with root package name */
    public m f97964e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f97965f;

    /* renamed from: g, reason: collision with root package name */
    public uw1.c f97966g;

    /* renamed from: h, reason: collision with root package name */
    public final float f97967h;

    /* renamed from: i, reason: collision with root package name */
    public final float f97968i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f97969j;

    /* renamed from: k, reason: collision with root package name */
    public tf.g f97970k;

    /* renamed from: l, reason: collision with root package name */
    public i5 f97971l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f97972m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f97973n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v viewResources, q networkStateStream, w eventManager, m2 experiments, yx.d filterAdapter, uk1.d presenterPinalytics, ww1.c currentMetricType, m currentSplitType, Context context) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(filterAdapter, "filterAdapter");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(currentMetricType, "currentMetricType");
        Intrinsics.checkNotNullParameter(currentSplitType, "currentSplitType");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97960a = viewResources;
        this.f97961b = eventManager;
        this.f97962c = filterAdapter;
        this.f97963d = currentMetricType;
        this.f97964e = currentSplitType;
        this.f97965f = context;
        this.f97967h = 5.0f;
        this.f97968i = 2.0f;
        this.f97970k = new tf.g();
        this.f97972m = new ArrayList();
        this.f97973n = true;
    }

    public final void B3() {
        this.f97973n = true;
        p3();
    }

    public final void D3(ww1.c metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        if (this.f97963d != metric) {
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.DROPDOWN_CHANGE;
            g0 g0Var = g0.ANALYTICS_TIMESERIES_GRAPH;
            u0 u0Var = u0.ANALYTICS_METRIC_SELECTLIST;
            HashMap hashMap = new HashMap();
            hashMap.put("analytics_previous_value", this.f97963d.name());
            hashMap.put("analytics_next_value", metric.name());
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            this.f97963d = metric;
            this.f97973n = true;
            p3();
        }
    }

    public final void F3(m split) {
        Intrinsics.checkNotNullParameter(split, "split");
        if (!Intrinsics.d(this.f97964e, split)) {
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.DROPDOWN_CHANGE;
            g0 g0Var = g0.ANALYTICS_TIMESERIES_GRAPH;
            u0 u0Var = u0.ANALYTICS_SPLIT_SELECTLIST;
            HashMap hashMap = new HashMap();
            hashMap.put("analytics_previous_value", this.f97964e.f88442a);
            hashMap.put("analytics_next_value", split.f88442a);
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            this.f97964e = split;
            this.f97973n = true;
            p3();
        }
    }

    @Override // ey1.a
    public final void c1() {
        this.f97973n = false;
        p3();
    }

    public abstract void p3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0c77  */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.collections.q0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tf.g q3(com.pinterest.api.model.o4 r19) {
        /*
            Method dump skipped, instructions count: 3448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ow1.j.q3(com.pinterest.api.model.o4):tf.g");
    }

    public final zx.d r3() {
        return this.f97962c.c().c().f142974b;
    }

    public final uw1.c s3() {
        uw1.c cVar = this.f97966g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("graphDataSetHandler");
        throw null;
    }

    public final List t3() {
        return CollectionsKt.x0(this.f97972m, new u(9));
    }

    public final m5 u3() {
        ww1.c metricType = this.f97963d;
        i5 i5Var = this.f97971l;
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        switch (uw1.f.f123233a[metricType.ordinal()]) {
            case 1:
                if (i5Var != null) {
                    return i5Var.F();
                }
                return null;
            case 2:
                if (i5Var != null) {
                    return i5Var.C();
                }
                return null;
            case 3:
                if (i5Var != null) {
                    return i5Var.I();
                }
                return null;
            case 4:
                if (i5Var != null) {
                    return i5Var.G();
                }
                return null;
            case 5:
                if (i5Var != null) {
                    return i5Var.Q();
                }
                return null;
            case 6:
                if (i5Var != null) {
                    return i5Var.D();
                }
                return null;
            case 7:
                if (i5Var != null) {
                    return i5Var.J();
                }
                return null;
            case 8:
                if (i5Var != null) {
                    return i5Var.H();
                }
                return null;
            case 9:
                if (i5Var != null) {
                    return i5Var.R();
                }
                return null;
            case 10:
                if (i5Var != null) {
                    return i5Var.S();
                }
                return null;
            case 11:
                if (i5Var != null) {
                    return i5Var.E();
                }
                return null;
            case 12:
                if (i5Var != null) {
                    return i5Var.O();
                }
                return null;
            case 13:
                if (i5Var != null) {
                    return i5Var.T();
                }
                return null;
            case 14:
                if (i5Var != null) {
                    return i5Var.W();
                }
                return null;
            case 15:
                if (i5Var != null) {
                    return i5Var.P();
                }
                return null;
            case 16:
                if (i5Var != null) {
                    return i5Var.V();
                }
                return null;
            case 17:
                if (i5Var != null) {
                    return i5Var.X();
                }
                return null;
            case 18:
                if (i5Var != null) {
                    return i5Var.U();
                }
                return null;
            case 19:
                if (i5Var != null) {
                    return i5Var.L();
                }
                return null;
            case 20:
                if (i5Var != null) {
                    return i5Var.K();
                }
                return null;
            case 21:
                if (i5Var != null) {
                    return i5Var.N();
                }
                return null;
            case 22:
                if (i5Var != null) {
                    return i5Var.M();
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void v3(o4 metrics) {
        Intrinsics.checkNotNullParameter(metrics, "analyticsMetrics");
        if (isBound()) {
            this.f97972m.clear();
            l c13 = this.f97962c.c().c();
            uw1.b bVar = (uw1.b) getView();
            fy1.a xAxisFormat = c13.f142973a.f142969a == zx.f.HOURS_24 ? fy1.a.RELATIVE : fy1.a.ABSOLUTE;
            f0.h yAxisFormat = m0.x(this.f97963d.getMetricFormatType());
            boolean z13 = this.f97973n;
            g gVar = (g) bVar;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            Intrinsics.checkNotNullParameter(xAxisFormat, "xAxisFormat");
            Intrinsics.checkNotNullParameter(yAxisFormat, "yAxisFormat");
            tf.g q33 = ((j) gVar.f8()).q3(metrics);
            if (z13) {
                gVar.b8();
            }
            vw1.a aVar = gVar.f97955x0;
            if (aVar == null) {
                Intrinsics.r("chartView");
                throw null;
            }
            aVar.I.f112466x = false;
            aVar.i();
            sf.m mVar = aVar.f30156h;
            pb0.d dVar = gVar.f97941j0;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            mVar.o(new fy1.b(xAxisFormat, dVar));
            aVar.K(q33);
            aVar.I.o(yAxisFormat);
            aVar.I.f112460r = q33.f117503a > 0.0f;
            float defaultMaxYAxis = gVar.g8().getMetricFormatType().getDefaultMaxYAxis();
            if (defaultMaxYAxis > q33.f117503a) {
                aVar.I.h(defaultMaxYAxis);
            }
            aVar.invalidate();
            gVar.l8(((j) gVar.f8()).t3(), null);
            ww1.c g83 = gVar.g8();
            GestaltText gestaltText = gVar.J0;
            if (gestaltText == null) {
                Intrinsics.r("metricInfo");
                throw null;
            }
            gestaltText.setText(gVar.getText(g83.getMetricInfo()));
            m5 u33 = ((j) gVar.f8()).u3();
            boolean d2 = u33 != null ? Intrinsics.d(u33.g(), Boolean.TRUE) : false;
            long doubleValue = u33 != null ? (long) u33.h().doubleValue() : 0L;
            if (d2) {
                GestaltText gestaltText2 = gVar.K0;
                if (gestaltText2 == null) {
                    Intrinsics.r("dataStatusInfo");
                    throw null;
                }
                gestaltText2.setText(gVar.getText(com.pinterest.partnerAnalytics.g.updated_in_real_time));
            } else if (doubleValue > 0) {
                Date date = new Date(doubleValue);
                GestaltText gestaltText3 = gVar.K0;
                if (gestaltText3 == null) {
                    Intrinsics.r("dataStatusInfo");
                    throw null;
                }
                Resources resources = gVar.requireContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                gestaltText3.setText(pp2.a.t(date, resources));
            }
            GestaltText gestaltText4 = gVar.K0;
            if (gestaltText4 == null) {
                Intrinsics.r("dataStatusInfo");
                throw null;
            }
            gestaltText4.setVisibility(0);
            InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = gVar.L0;
            if (initialLoadSwipeRefreshLayout == null) {
                Intrinsics.r("swipeRefresh");
                throw null;
            }
            initialLoadSwipeRefreshLayout.n(false);
            if (!z13) {
                gVar.k8();
            }
            n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            x3((uw1.b) view);
        }
    }

    public final boolean w3() {
        return this.f97969j;
    }

    public final void x3(uw1.b view) {
        String dateRange;
        Intrinsics.checkNotNullParameter(view, "view");
        l c13 = this.f97962c.c().c();
        v viewResources = this.f97960a;
        String filterInfo = u2.T(c13, viewResources);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        zx.f fVar = c13.f142973a.f142969a;
        if (fVar == zx.f.CUSTOM) {
            dateRange = c13.g();
        } else {
            dateRange = ((yk1.a) viewResources).f139224a.getString(fVar.getDescription());
        }
        g gVar = (g) view;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(filterInfo, "filterInfo");
        GestaltToolbarImpl gestaltToolbarImpl = gVar.f97947p0;
        if (gestaltToolbarImpl != null) {
            b0.Y1(gestaltToolbarImpl, dateRange, filterInfo);
        }
    }

    @Override // yk1.p
    /* renamed from: z3, reason: merged with bridge method [inline-methods] */
    public final void r3(uw1.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        g gVar = (g) view;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        gVar.f97949r0 = this;
        x3(view);
        p3();
    }
}
