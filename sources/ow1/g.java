package ow1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.Entry;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.CustomEntry;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents.MetricsSelectorView;
import h32.d4;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kh2.b0;
import kh2.g3;
import kh2.m0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;
import pk.a0;
import rm1.q;
import sf.l;
import sf.p;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Low1/g;", "Lyk1/k;", "Luw1/b;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class g extends k implements uw1.b {
    public static final fy1.e O0 = new fy1.e(fy1.d.BIG_NUMBERS);
    public LinearLayout A0;
    public GestaltText B0;
    public GestaltText C0;
    public GestaltText D0;
    public LinearLayout E0;
    public MetricsSelectorView F0;
    public MetricsSelectorView G0;
    public GestaltText H0;
    public FrameLayout I0;
    public GestaltText J0;
    public GestaltText K0;
    public InitialLoadSwipeRefreshLayout L0;
    public ProductTagCard M0;
    public InfoAboutDataView N0;

    /* renamed from: j0, reason: collision with root package name */
    public pb0.d f97941j0;

    /* renamed from: k0, reason: collision with root package name */
    public gw1.f f97942k0;

    /* renamed from: l0, reason: collision with root package name */
    public gw1.f f97943l0;

    /* renamed from: n0, reason: collision with root package name */
    public Integer f97945n0;

    /* renamed from: o0, reason: collision with root package name */
    public Integer f97946o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltToolbarImpl f97947p0;

    /* renamed from: r0, reason: collision with root package name */
    public uw1.a f97949r0;

    /* renamed from: v0, reason: collision with root package name */
    public FrameLayout f97953v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f97954w0;

    /* renamed from: x0, reason: collision with root package name */
    public vw1.a f97955x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltText f97956y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltText f97957z0;

    /* renamed from: m0, reason: collision with root package name */
    public final v f97944m0 = m.b(d.f97935i);

    /* renamed from: q0, reason: collision with root package name */
    public final v f97948q0 = m.b(new c(this, 1));

    /* renamed from: s0, reason: collision with root package name */
    public List f97950s0 = q0.f80391a;

    /* renamed from: t0, reason: collision with root package name */
    public final v f97951t0 = m.b(new c(this, 3));

    /* renamed from: u0, reason: collision with root package name */
    public final v f97952u0 = m.b(new c(this, 0));

    public g() {
        this.E = com.pinterest.partnerAnalytics.e.fragment_analytics_graph_detail;
    }

    public final void b8() {
        vw1.a aVar = this.f97955x0;
        if (aVar == null) {
            Intrinsics.r("chartView");
            throw null;
        }
        List J2 = aVar.J();
        if (J2 != null) {
            J2.clear();
        }
        vw1.a aVar2 = this.f97955x0;
        if (aVar2 != null) {
            aVar2.L(false);
        } else {
            Intrinsics.r("chartView");
            throw null;
        }
    }

    public void c8() {
    }

    public String d8() {
        return (String) this.f97944m0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    public final List e8() {
        ?? r13;
        ArrayList<String> M;
        if (this.f97950s0.isEmpty()) {
            Navigation navigation = this.I;
            if (navigation == null || (M = navigation.M("METRIC_TYPES_EXTRA_KEY")) == null) {
                r13 = q0.f80391a;
            } else {
                r13 = new ArrayList(g0.q(M, 10));
                for (String str : M) {
                    Intrinsics.f(str);
                    r13.add(ww1.c.valueOf(str));
                }
            }
            this.f97950s0 = r13;
        }
        return this.f97950s0;
    }

    public final uw1.a f8() {
        uw1.a aVar = this.f97949r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("presenterListener");
        throw null;
    }

    public final ww1.c g8() {
        if (this.f97945n0 == null) {
            Navigation navigation = this.I;
            String v03 = navigation != null ? navigation.v0("METRIC_TYPE_EXTRA_KEY") : null;
            return v03 != null ? ww1.c.valueOf(v03) : ww1.c.IMPRESSION;
        }
        List e83 = e8();
        Integer num = this.f97945n0;
        int intValue = num != null ? num.intValue() : 0;
        return (ww1.c) ((intValue < 0 || intValue > f0.i(e83)) ? (ww1.c) d7.b.F(e8()) : e83.get(intValue));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF98673x0() {
        return j8();
    }

    public final mw1.m h8() {
        if (this.f97946o0 == null) {
            return mw1.j.f88439c;
        }
        List i83 = i8();
        Integer num = this.f97946o0;
        Intrinsics.f(num);
        return (mw1.m) i83.get(num.intValue());
    }

    public final List i8() {
        return (List) this.f97951t0.getValue();
    }

    public d4 j8() {
        return d4.ANALYTICS_OVERVIEW;
    }

    public final void k8() {
        vw1.a aVar = this.f97955x0;
        if (aVar == null) {
            Intrinsics.r("chartView");
            throw null;
        }
        List J2 = aVar.J();
        vw1.a aVar2 = this.f97955x0;
        if (aVar2 == null) {
            Intrinsics.r("chartView");
            throw null;
        }
        aVar2.t(J2 != null ? (vf.c[]) J2.toArray(new vf.c[0]) : null);
        vw1.a aVar3 = this.f97955x0;
        if (aVar3 != null) {
            aVar3.L(true);
        } else {
            Intrinsics.r("chartView");
            throw null;
        }
    }

    public final void l8(List legendEntries, Entry entry) {
        Double e13;
        Intrinsics.checkNotNullParameter(legendEntries, "legendEntries");
        n8(entry);
        int i13 = 8;
        if (legendEntries.size() > 1) {
            GestaltText gestaltText = this.f97956y0;
            if (gestaltText == null) {
                Intrinsics.r("graphHeaderSubtitle");
                throw null;
            }
            gestaltText.i(e.f97937k);
        } else if (entry != null) {
            CustomEntry customEntry = (CustomEntry) entry;
            if (Intrinsics.d(customEntry.getF50117e(), "READY") || Intrinsics.d(customEntry.getF50117e(), "ESTIMATE")) {
                f0.h x13 = m0.x(g8().getMetricFormatType());
                GestaltText gestaltText2 = this.f97956y0;
                if (gestaltText2 == null) {
                    Intrinsics.r("graphHeaderSubtitle");
                    throw null;
                }
                String G = x13.G(customEntry.a());
                Intrinsics.checkNotNullExpressionValue(G, "getFormattedValue(...)");
                a0.p(gestaltText2, G);
            } else {
                GestaltText gestaltText3 = this.f97956y0;
                if (gestaltText3 == null) {
                    Intrinsics.r("graphHeaderSubtitle");
                    throw null;
                }
                a0.p(gestaltText3, getText(com.pinterest.partnerAnalytics.g.analytics_empty_value).toString());
            }
            GestaltText gestaltText4 = this.f97956y0;
            if (gestaltText4 == null) {
                Intrinsics.r("graphHeaderSubtitle");
                throw null;
            }
            gestaltText4.sendAccessibilityEvent(16);
        } else {
            mw1.e eVar = (mw1.e) CollectionsKt.firstOrNull(legendEntries);
            f0.h x14 = m0.x(g8().getMetricFormatType());
            Float valueOf = (eVar == null || (e13 = eVar.e()) == null) ? null : Float.valueOf((float) e13.doubleValue());
            GestaltText gestaltText5 = this.f97956y0;
            if (gestaltText5 == null) {
                Intrinsics.r("graphHeaderSubtitle");
                throw null;
            }
            gestaltText5.i(new fn1.k(valueOf, x14, this, i13));
            GestaltText gestaltText6 = this.f97956y0;
            if (gestaltText6 == null) {
                Intrinsics.r("graphHeaderSubtitle");
                throw null;
            }
            gestaltText6.sendAccessibilityEvent(16);
        }
        mw1.e eVar2 = (mw1.e) CollectionsKt.firstOrNull(legendEntries);
        Double c13 = eVar2 != null ? eVar2.c() : null;
        Integer d2 = eVar2 != null ? eVar2.d() : null;
        if (legendEntries.size() > 1) {
            LinearLayout linearLayout = this.A0;
            if (linearLayout == null) {
                Intrinsics.r("deltaDisclaimer");
                throw null;
            }
            bs1.c.X0(linearLayout);
        } else if (c13 == null || d2 == null) {
            LinearLayout linearLayout2 = this.A0;
            if (linearLayout2 == null) {
                Intrinsics.r("deltaDisclaimer");
                throw null;
            }
            bs1.c.X0(linearLayout2);
        } else if (entry != null) {
            LinearLayout linearLayout3 = this.A0;
            if (linearLayout3 == null) {
                Intrinsics.r("deltaDisclaimer");
                throw null;
            }
            bs1.c.b1(linearLayout3);
        } else {
            GestaltText gestaltText7 = this.B0;
            if (gestaltText7 == null) {
                Intrinsics.r("tvPercentage");
                throw null;
            }
            kw1.d.a(gestaltText7, c13);
            GestaltText gestaltText8 = this.C0;
            if (gestaltText8 == null) {
                Intrinsics.r("tvPercentageDisclaimer");
                throw null;
            }
            String quantityString = getResources().getQuantityString(com.pinterest.partnerAnalytics.f.analytics_closeup_graph_delta_disclaimer, d2.intValue(), d2);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            a0.p(gestaltText8, quantityString);
            LinearLayout linearLayout4 = this.A0;
            if (linearLayout4 == null) {
                Intrinsics.r("deltaDisclaimer");
                throw null;
            }
            bs1.c.U1(linearLayout4);
        }
        if (legendEntries.size() > 1) {
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            RecyclerView recyclerView = this.f97954w0;
            if (recyclerView == null) {
                Intrinsics.r("chartLegend");
                throw null;
            }
            recyclerView.R2(linearLayoutManager);
            ww1.c g83 = g8();
            ((uw1.e) this.f97948q0.getValue()).C(legendEntries, m0.x(g83.getMetricFormatType()), g83.getShowLegendValue());
            RecyclerView recyclerView2 = this.f97954w0;
            if (recyclerView2 == null) {
                Intrinsics.r("chartLegend");
                throw null;
            }
            recyclerView2.setVisibility(0);
        } else {
            RecyclerView recyclerView3 = this.f97954w0;
            if (recyclerView3 == null) {
                Intrinsics.r("chartLegend");
                throw null;
            }
            recyclerView3.setVisibility(8);
        }
        if (entry == null) {
            if (((j) f8()).w3()) {
                GestaltText gestaltText9 = this.H0;
                if (gestaltText9 == null) {
                    Intrinsics.r("dataProcessingCallout");
                    throw null;
                }
                a0.p(gestaltText9, "");
                FrameLayout frameLayout = this.I0;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    return;
                } else {
                    Intrinsics.r("dataProcessingCalloutBackground");
                    throw null;
                }
            }
            GestaltText gestaltText10 = this.H0;
            if (gestaltText10 == null) {
                Intrinsics.r("dataProcessingCallout");
                throw null;
            }
            String string = getString(com.pinterest.partnerAnalytics.g.analytics_closeup_data_not_available_for_date_range);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a0.p(gestaltText10, string);
            FrameLayout frameLayout2 = this.I0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
                return;
            } else {
                Intrinsics.r("dataProcessingCalloutBackground");
                throw null;
            }
        }
        String f50117e = ((CustomEntry) entry).getF50117e();
        int hashCode = f50117e.hashCode();
        if (hashCode != -1557009090) {
            if (hashCode != 907287315) {
                if (hashCode == 1482363665 && f50117e.equals("BEFORE_PIN_VIDEO_STATS")) {
                    GestaltText gestaltText11 = this.H0;
                    if (gestaltText11 == null) {
                        Intrinsics.r("dataProcessingCallout");
                        throw null;
                    }
                    String string2 = getString(com.pinterest.partnerAnalytics.g.analytics_before_video_stats_msg);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    a0.p(gestaltText11, string2);
                    FrameLayout frameLayout3 = this.I0;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(0);
                        return;
                    } else {
                        Intrinsics.r("dataProcessingCalloutBackground");
                        throw null;
                    }
                }
            } else if (f50117e.equals("PROCESSING")) {
                boolean d13 = Intrinsics.d(h8(), new mw1.i());
                zx.d r33 = ((j) f8()).r3();
                FrameLayout frameLayout4 = this.I0;
                if (frameLayout4 == null) {
                    Intrinsics.r("dataProcessingCalloutBackground");
                    throw null;
                }
                frameLayout4.setVisibility(0);
                GestaltText gestaltText12 = this.H0;
                if (gestaltText12 == null) {
                    Intrinsics.r("dataProcessingCallout");
                    throw null;
                }
                String string3 = (d13 || r33 != zx.d.ALL) ? getString(com.pinterest.partnerAnalytics.g.analytics_closeup_realtime_data_unavailable) : getString(com.pinterest.partnerAnalytics.g.analytics_closeup_graph_info);
                Intrinsics.f(string3);
                a0.p(gestaltText12, string3);
                return;
            }
        } else if (f50117e.equals("BEFORE_PIN_CREATED")) {
            GestaltText gestaltText13 = this.H0;
            if (gestaltText13 == null) {
                Intrinsics.r("dataProcessingCallout");
                throw null;
            }
            String string4 = getString(com.pinterest.partnerAnalytics.g.metric_disclaimer_pin_data_was_not_available);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            a0.p(gestaltText13, string4);
            FrameLayout frameLayout5 = this.I0;
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(0);
                return;
            } else {
                Intrinsics.r("dataProcessingCalloutBackground");
                throw null;
            }
        }
        GestaltText gestaltText14 = this.H0;
        if (gestaltText14 == null) {
            Intrinsics.r("dataProcessingCallout");
            throw null;
        }
        a0.p(gestaltText14, "");
        FrameLayout frameLayout6 = this.I0;
        if (frameLayout6 != null) {
            frameLayout6.setVisibility(8);
        } else {
            Intrinsics.r("dataProcessingCalloutBackground");
            throw null;
        }
    }

    public final void m8(g3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.d(state, mw1.f.f88433a)) {
            GestaltText gestaltText = this.D0;
            if (gestaltText != null) {
                gestaltText.i(e.f97936j);
                return;
            } else {
                Intrinsics.r("tvLifeTime");
                throw null;
            }
        }
        if (state instanceof mw1.g) {
            GestaltText gestaltText2 = this.D0;
            if (gestaltText2 != null) {
                gestaltText2.i(new gw1.i(1, this, state));
            } else {
                Intrinsics.r("tvLifeTime");
                throw null;
            }
        }
    }

    public final void n8(Entry entry) {
        String a13;
        if (entry == null) {
            GestaltText gestaltText = this.f97957z0;
            if (gestaltText == null) {
                Intrinsics.r("graphHeaderTitle");
                throw null;
            }
            String string = getString(com.pinterest.partnerAnalytics.g.analytics_closeup_graph_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a0.p(gestaltText, string);
            return;
        }
        CustomEntry customEntry = (CustomEntry) entry;
        GestaltText gestaltText2 = this.f97957z0;
        if (gestaltText2 == null) {
            Intrinsics.r("graphHeaderTitle");
            throw null;
        }
        if (customEntry.getF50118f()) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTimeInMillis(customEntry.getF50116d());
            calendar.add(10, 1);
            long min = Math.min(System.currentTimeMillis(), calendar.getTimeInMillis());
            a13 = getString(com.pinterest.partnerAnalytics.g.analytics_closeup_graph_date_hour_hover, kw1.e.a(min, kw1.b.DATE), kw1.e.a(min, kw1.b.HOUR));
        } else {
            a13 = kw1.e.a(customEntry.getF50116d(), kw1.b.DATE);
        }
        Intrinsics.f(a13);
        a0.p(gestaltText2, a13);
        GestaltText gestaltText3 = this.f97957z0;
        if (gestaltText3 != null) {
            gestaltText3.sendAccessibilityEvent(16);
        } else {
            Intrinsics.r("graphHeaderTitle");
            throw null;
        }
    }

    public final void o8(ww1.c metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        MetricsSelectorView metricsSelectorView = this.F0;
        if (metricsSelectorView == null) {
            Intrinsics.r("metricsSelector");
            throw null;
        }
        metricsSelectorView.setVisibility(0);
        MetricsSelectorView metricsSelectorView2 = this.G0;
        if (metricsSelectorView2 == null) {
            Intrinsics.r("splitsSelector");
            throw null;
        }
        metricsSelectorView2.setVisibility(0);
        MetricsSelectorView metricsSelectorView3 = this.F0;
        if (metricsSelectorView3 == null) {
            Intrinsics.r("metricsSelector");
            throw null;
        }
        metricsSelectorView3.a(metricType.getDescription());
        MetricsSelectorView metricsSelectorView4 = this.F0;
        if (metricsSelectorView4 == null) {
            Intrinsics.r("metricsSelector");
            throw null;
        }
        metricsSelectorView4.setOnClickListener(new fd1.e(18, this, metricType));
        MetricsSelectorView metricsSelectorView5 = this.G0;
        if (metricsSelectorView5 == null) {
            Intrinsics.r("splitsSelector");
            throw null;
        }
        List i83 = i8();
        Integer num = this.f97946o0;
        metricsSelectorView5.a(((mw1.m) i83.get(num != null ? num.intValue() : 0)).a());
        MetricsSelectorView metricsSelectorView6 = this.G0;
        if (metricsSelectorView6 != null) {
            metricsSelectorView6.setOnClickListener(new a(this, 1));
        } else {
            Intrinsics.r("splitsSelector");
            throw null;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.f97945n0 = bundle != null ? Integer.valueOf(bundle.getInt("METRIC_TYPE_POSITION")) : null;
        this.f97946o0 = bundle != null ? Integer.valueOf(bundle.getInt("SPLIT_TYPE_POSITION")) : null;
        super.onCreate(bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.chart_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f97953v0 = (FrameLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvGraphHeaderTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f97957z0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvGraphHeaderSubtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f97956y0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.deltaDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.A0 = (LinearLayout) findViewById4;
        View findViewById5 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvDelta);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.B0 = (GestaltText) findViewById5;
        View findViewById6 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvDeltaDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.C0 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvDataProcessingCallout);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.H0 = (GestaltText) findViewById7;
        View findViewById8 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvDataProcessingCalloutBackground);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.I0 = (FrameLayout) findViewById8;
        View findViewById9 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvMetricInfo);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.J0 = (GestaltText) findViewById9;
        View findViewById10 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvDataStatusInfo);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.K0 = (GestaltText) findViewById10;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.f97955x0 = new vw1.a(requireContext);
        View findViewById11 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.chart_legend);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f97954w0 = (RecyclerView) findViewById11;
        View findViewById12 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.spinners_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.E0 = (LinearLayout) findViewById12;
        View findViewById13 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.productTagsCard);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.M0 = (ProductTagCard) findViewById13;
        View findViewById14 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.metrics_selector_long);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.F0 = (MetricsSelectorView) findViewById14;
        View findViewById15 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.splits_selector_long);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.G0 = (MetricsSelectorView) findViewById15;
        LinearLayout linearLayout = this.E0;
        if (linearLayout == null) {
            Intrinsics.r("spinnersContainer");
            throw null;
        }
        linearLayout.setOrientation(1);
        View findViewById16 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.aboutDataView);
        InfoAboutDataView infoAboutDataView = (InfoAboutDataView) findViewById16;
        infoAboutDataView.setPinalytics(s7());
        Intrinsics.checkNotNullExpressionValue(findViewById16, "apply(...)");
        Intrinsics.checkNotNullParameter(infoAboutDataView, "<set-?>");
        this.N0 = infoAboutDataView;
        View findViewById17 = onCreateView.findViewById(com.pinterest.partnerAnalytics.d.tvLifeTime);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.D0 = (GestaltText) findViewById17;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((j) f8()).B3();
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Integer num = this.f97945n0;
        if (num != null) {
            outState.putInt("METRIC_TYPE_POSITION", num.intValue());
        }
        Integer num2 = this.f97946o0;
        if (num2 != null) {
            outState.putInt("SPLIT_TYPE_POSITION", num2.intValue());
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) v13.findViewById(com.pinterest.partnerAnalytics.d.brio_toolbar);
        this.f97947p0 = gestaltToolbarImpl;
        if (gestaltToolbarImpl != null) {
            gestaltToolbarImpl.X(vn1.c.DEFAULT);
        }
        GestaltToolbarImpl gestaltToolbarImpl2 = this.f97947p0;
        if (gestaltToolbarImpl2 != null) {
            gestaltToolbarImpl2.P(drawableRes, eo1.b.color_themed_text_default);
        }
        GestaltToolbarImpl gestaltToolbarImpl3 = this.f97947p0;
        if (gestaltToolbarImpl3 != null) {
            gestaltToolbarImpl3.m();
        }
        GestaltToolbarImpl gestaltToolbarImpl4 = this.f97947p0;
        if (gestaltToolbarImpl4 != null) {
            gestaltToolbarImpl4.U(new a(this, 0));
        }
        GestaltToolbarImpl gestaltToolbarImpl5 = this.f97947p0;
        if (gestaltToolbarImpl5 != null) {
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            b0.K(gestaltToolbarImpl5, requireContext3, new c(this, 2));
        }
        View findViewById = v13.findViewById(com.pinterest.partnerAnalytics.d.analyticsDetailSwipeRefresh);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = (InitialLoadSwipeRefreshLayout) findViewById;
        this.L0 = initialLoadSwipeRefreshLayout;
        if (initialLoadSwipeRefreshLayout == null) {
            Intrinsics.r("swipeRefresh");
            throw null;
        }
        initialLoadSwipeRefreshLayout.f44880n = new a41.c(this, 1);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        int n03 = b0.n0(requireActivity);
        FrameLayout frameLayout = this.f97953v0;
        if (frameLayout == null) {
            Intrinsics.r("chartContainer");
            throw null;
        }
        vw1.a aVar = this.f97955x0;
        if (aVar == null) {
            Intrinsics.r("chartView");
            throw null;
        }
        frameLayout.addView(aVar, -1, n03 / 3);
        c8();
        Context context = getContext();
        if (context != null) {
            vw1.a aVar2 = this.f97955x0;
            if (aVar2 == null) {
                Intrinsics.r("chartView");
                throw null;
            }
            aVar2.setContentDescription(getString(com.pinterest.partnerAnalytics.g.analytics_closeup_graph));
            aVar2.n().d();
            aVar2.y();
            int i13 = eo1.b.color_themed_transparent;
            Object obj = d5.a.f53679a;
            aVar2.setBackgroundColor(context.getColor(i13));
            aVar2.p().a();
            vw1.a aVar3 = this.f97955x0;
            if (aVar3 == null) {
                Intrinsics.r("chartView");
                throw null;
            }
            sf.m r13 = aVar3.r();
            r13.c();
            r13.p(l.BOTTOM);
            r13.k();
            r13.b(context.getColor(eo1.b.color_gray_500));
            r13.g(context.getColor(eo1.b.color_themed_light_gray));
            fy1.a aVar4 = fy1.a.ABSOLUTE;
            pb0.d dVar = this.f97941j0;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            r13.o(new fy1.b(aVar4, dVar));
            vw1.a aVar5 = this.f97955x0;
            if (aVar5 == null) {
                Intrinsics.r("chartView");
                throw null;
            }
            p E = aVar5.E();
            E.c();
            E.n();
            E.m();
            E.i();
            E.j();
            E.o(O0);
            E.g(context.getColor(eo1.b.color_themed_light_gray));
            E.b(context.getColor(eo1.b.color_gray_500));
            E.l(((int) ww1.a.NUMBER.getDefaultMaxYAxis()) + 1);
            aVar2.x();
            aVar2.F().a();
            aVar2.I();
            vw1.a aVar6 = this.f97955x0;
            if (aVar6 == null) {
                Intrinsics.r("chartView");
                throw null;
            }
            y l13 = aVar2.l();
            Intrinsics.checkNotNullExpressionValue(l13, "getAnimator(...)");
            ag.j q13 = aVar2.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getViewPortHandler(...)");
            aVar2.A(new vw1.c(context, aVar6, l13, q13));
            aVar2.z((b) this.f97952u0.getValue());
        }
        RecyclerView recyclerView = this.f97954w0;
        if (recyclerView == null) {
            Intrinsics.r("chartLegend");
            throw null;
        }
        recyclerView.f19254t = true;
        g41.a aVar7 = new g41.a(this, 16);
        recyclerView.getContext();
        PinterestLinearLayoutManager pinterestLinearLayoutManager = new PinterestLinearLayoutManager(aVar7);
        recyclerView.R2(pinterestLinearLayoutManager);
        v vVar = this.f97948q0;
        recyclerView.H2((uw1.e) vVar.getValue());
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
        recyclerView.m(new ey1.d(requireContext4, pinterestLinearLayoutManager, (uw1.e) vVar.getValue()));
        n8(null);
        ww1.c g83 = g8();
        GestaltText gestaltText = this.J0;
        if (gestaltText == null) {
            Intrinsics.r("metricInfo");
            throw null;
        }
        gestaltText.setText(getText(g83.getMetricInfo()));
        o8(g8());
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
