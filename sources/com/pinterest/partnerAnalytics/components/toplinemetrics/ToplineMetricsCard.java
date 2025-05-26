package com.pinterest.partnerAnalytics.components.toplinemetrics;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.components.MetricRowView;
import com.pinterest.partnerAnalytics.components.experiencebanner.AnalyticsExperienceBanner;
import dl1.i0;
import dv0.q;
import gh1.e;
import java.util.List;
import jw1.a;
import jw1.b;
import jw1.d;
import kh2.m0;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mp.m;
import org.jetbrains.annotations.NotNull;
import pe.i;
import pk.a0;
import vn1.g;
import vn1.h;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/toplinemetrics/ToplineMetricsCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ToplineMetricsCard extends LinearLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f50106j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsExperienceBanner f50107a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltSpinner f50108b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f50109c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50110d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50111e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f50112f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIconButton f50113g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f50114h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f50115i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToplineMetricsCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(b viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        if (viewAdapter.c()) {
            d dVar = d.f77668k;
            GestaltIconButton gestaltIconButton = this.f50113g;
            gestaltIconButton.t(dVar);
            gestaltIconButton.u(new e(viewAdapter, 24));
        }
        AttributeSet attributeSet = null;
        if (viewAdapter.a()) {
            q qVar = this.f50107a.f50071c;
            if (qVar == null) {
                Intrinsics.r("experienceBannerHelper");
                throw null;
            }
            qVar.c();
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a0.p(this.f50109c, viewAdapter.h(resources));
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        a0.p(this.f50110d, viewAdapter.e(resources2));
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        this.f50111e.i(new i0(viewAdapter.d(resources3), 29));
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        a0.p(this.f50114h, viewAdapter.f(resources4));
        LinearLayout linearLayout = this.f50112f;
        linearLayout.removeAllViews();
        List b13 = viewAdapter.b();
        boolean z13 = false;
        int i13 = 0;
        for (Object obj : b13) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            a aVar = (a) obj;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            MetricRowView metricRowView = new MetricRowView(6, context, attributeSet);
            String name = metricRowView.getResources().getString(aVar.f77663a.getDescription());
            Intrinsics.checkNotNullExpressionValue(name, "getString(...)");
            Intrinsics.checkNotNullParameter(name, "name");
            a0.p(metricRowView.f50050b, name);
            g gestaltTextVariant = h.f126278d;
            Intrinsics.checkNotNullParameter(gestaltTextVariant, "gestaltTextVariant");
            metricRowView.f50050b.i(new m(gestaltTextVariant, 10));
            kw1.d.a(metricRowView.f50051c, aVar.f77665c);
            Integer num = aVar.f77664b;
            String G = (num != null ? Float.valueOf((float) num.intValue()) : null) != null ? m0.x(aVar.f77663a.getMetricFormatType()).G(num.intValue()) : null;
            GestaltText gestaltText = metricRowView.f50052d;
            if (G == null) {
                a0.p(gestaltText, "_");
            } else {
                a0.p(gestaltText, G);
            }
            if (aVar.f77666d) {
                metricRowView.setOnClickListener(new fd1.e(17, this, aVar));
            }
            if (f0.i(b13) == i13) {
                i.g(metricRowView.f50049a, new mm1.i(z13, 27));
            }
            linearLayout.addView(metricRowView);
            i13 = i14;
        }
        linearLayout.setVisibility(0);
        dl2.b.X2(this.f50108b, ln1.e.LOADED);
    }

    public final void b(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f50115i = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToplineMetricsCard(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50115i = d.f77667j;
        View.inflate(context, com.pinterest.partnerAnalytics.e.pin_stats_metrics, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.loadingView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById;
        this.f50108b = gestaltSpinner;
        dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50109c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.tvCardTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50111e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.expBanner);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50107a = (AnalyticsExperienceBanner) findViewById4;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.tvTopDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50110d = (GestaltText) findViewById5;
        View findViewById6 = findViewById(com.pinterest.partnerAnalytics.d.metricsContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f50112f = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(com.pinterest.partnerAnalytics.d.ivTopButton);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f50113g = (GestaltIconButton) findViewById7;
        View findViewById8 = findViewById(com.pinterest.partnerAnalytics.d.tvBottomDescription);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f50114h = (GestaltText) findViewById8;
    }
}
