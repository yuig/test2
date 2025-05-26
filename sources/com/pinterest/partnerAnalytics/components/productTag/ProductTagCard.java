package com.pinterest.partnerAnalytics.components.productTag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents.MetricsSelectorView;
import dl2.b;
import gw1.a;
import gw1.d;
import gw1.g;
import gw1.k;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.s0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ln1.e;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import px.h;
import sw0.u;
import ww1.c;
import yq1.u1;
import zp.y0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/productTag/ProductTagCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProductTagCard extends LinearLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f50084v = 0;

    /* renamed from: a, reason: collision with root package name */
    public d0 f50085a;

    /* renamed from: b, reason: collision with root package name */
    public a f50086b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltSpinner f50087c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f50088d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50089e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIcon f50090f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f50091g;

    /* renamed from: h, reason: collision with root package name */
    public final MetricsSelectorView f50092h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f50093i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f50094j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f50095k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f50096l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f50097m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f50098n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltButton f50099o;

    /* renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f50100p;

    /* renamed from: q, reason: collision with root package name */
    public final k f50101q;

    /* renamed from: r, reason: collision with root package name */
    public List f50102r;

    /* renamed from: s, reason: collision with root package name */
    public c f50103s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f50104t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f50105u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductTagCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f50104t = true;
    }

    public final void b(a viewAdapter, c currentMetricTypes) {
        int i13;
        Object obj;
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        Intrinsics.checkNotNullParameter(currentMetricTypes, "currentMetricTypes");
        this.f50086b = viewAdapter;
        this.f50103s = currentMetricTypes;
        b.X2(this.f50087c, e.LOADED);
        g gVar = (g) viewAdapter;
        List list = gVar.f66229b.f101571b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i13 = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!Intrinsics.d(((h) next).f101562a, "all")) {
                arrayList.add(next);
            }
        }
        List value = CollectionsKt.x0(arrayList, new u(8));
        int i14 = 3;
        if (!this.f50104t) {
            value = CollectionsKt.y0(value, 3);
        }
        if (this.f50105u) {
            value = CollectionsKt.q0(value);
        }
        k kVar = this.f50101q;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        kVar.f66240e = value;
        kVar.h();
        b.z(this.f50090f, new d(this, i13));
        RecyclerView recyclerView = this.f50088d;
        recyclerView.H2(kVar);
        bs1.c.U1(recyclerView);
        this.f50089e.i(new gw1.e(viewAdapter, this, 0));
        this.f50091g.i(new gw1.e(viewAdapter, this, i13)).setOnClickListener(new wq1.a(this, 12));
        this.f50094j.i(new gw1.e(viewAdapter, this, 2));
        this.f50095k.i(new u1(viewAdapter, 23));
        Iterator it2 = gVar.f66229b.f101571b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (Intrinsics.d(((h) obj).f101562a, "all")) {
                    break;
                }
            }
        }
        h hVar = (h) obj;
        kw1.d.a(this.f50096l, hVar != null ? hVar.f101564c : null);
        this.f50097m.i(new gw1.e(viewAdapter, this, i14));
        this.f50099o.d(new gw1.e(viewAdapter, this, 4));
    }

    public final void c(List metrics, Function1 infoModalClick) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(infoModalClick, "infoModalClick");
        this.f50093i.setOnClickListener(new y0(this, infoModalClick, metrics, 27));
    }

    public final void d(Function1 detailsClick) {
        Intrinsics.checkNotNullParameter(detailsClick, "detailsClick");
        this.f50099o.setOnClickListener(new fd1.e(15, this, detailsClick));
    }

    public final void e() {
        this.f50104t = true;
        this.f50098n.i(new d(this, 4));
        bs1.c.X0(this.f50096l);
        bs1.c.X0(this.f50089e);
        bs1.c.X0(this.f50092h);
        bs1.c.X0(this.f50100p);
        bs1.c.X0(this.f50093i);
        bs1.c.X0(this.f50099o);
    }

    public final void f(List metrics, Function2 onMetricsClick) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(onMetricsClick, "onMetricsClick");
        this.f50102r = metrics;
        int description = this.f50103s.getDescription();
        MetricsSelectorView metricsSelectorView = this.f50092h;
        metricsSelectorView.a(description);
        metricsSelectorView.setOnClickListener(new y0(onMetricsClick, metrics, this, 26));
    }

    public final void g(c metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        if (this.f50103s != metric) {
            d0 d0Var = this.f50085a;
            if (d0Var != null) {
                f1 f1Var = f1.DROPDOWN_CHANGE;
                g0 g0Var = g0.PIN_STATS_TAGGED_PRODUCTS_TABLE;
                u0 u0Var = u0.PIN_STATS_TAGGED_PRODUCTS_METRIC_SELECTLIST;
                HashMap hashMap = new HashMap();
                hashMap.put("analytics_previous_value", this.f50103s.name());
                hashMap.put("analytics_next_value", metric.name());
                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            this.f50103s = metric;
            s0.w(this.f50087c, gw1.b.f66216k);
            bs1.c.X0(this.f50088d);
            this.f50092h.a(this.f50103s.getDescription());
            this.f50094j.i(gw1.b.f66217l);
            this.f50095k.i(gw1.b.f66218m);
            this.f50091g.i(new d(this, 5));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductTagCard(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50101q = new k(context, new gw1.c(this, 0));
        this.f50103s = c.PRODUCT_TAG_IMPRESSION;
        View.inflate(context, com.pinterest.partnerAnalytics.e.product_tags_card, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.pt_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById;
        this.f50087c = gestaltSpinner;
        s0.w(gestaltSpinner, gw1.b.f66215j);
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.pt_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50088d = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.pt_date);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50089e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.pt_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50098n = (GestaltText) findViewById4;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.pt_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        View findViewById6 = findViewById(com.pinterest.partnerAnalytics.d.pt_direction);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f50090f = (GestaltIcon) findViewById6;
        View findViewById7 = findViewById(com.pinterest.partnerAnalytics.d.pt_selected_metric);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f50091g = (GestaltText) findViewById7;
        View findViewById8 = findViewById(com.pinterest.partnerAnalytics.d.pt_metric_selector);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f50092h = (MetricsSelectorView) findViewById8;
        View findViewById9 = findViewById(com.pinterest.partnerAnalytics.d.pt_info_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f50093i = (ImageView) findViewById9;
        View findViewById10 = findViewById(com.pinterest.partnerAnalytics.d.pt_num_of_products);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f50094j = (GestaltText) findViewById10;
        View findViewById11 = findViewById(com.pinterest.partnerAnalytics.d.pt_metric_total);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f50095k = (GestaltText) findViewById11;
        View findViewById12 = findViewById(com.pinterest.partnerAnalytics.d.pt_metric_percentage);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f50096l = (GestaltText) findViewById12;
        View findViewById13 = findViewById(com.pinterest.partnerAnalytics.d.pt_description);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f50097m = (GestaltText) findViewById13;
        View findViewById14 = findViewById(com.pinterest.partnerAnalytics.d.pt_see_all);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f50099o = (GestaltButton) findViewById14;
        View findViewById15 = findViewById(com.pinterest.partnerAnalytics.d.pt_totals_container);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f50100p = (ConstraintLayout) findViewById15;
    }
}
