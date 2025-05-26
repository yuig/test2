package com.pinterest.partnerAnalytics.feature.analytics.toppins.overview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import ex1.a;
import ex1.g;
import ex1.h;
import ex1.i;
import ex1.j;
import ex1.l;
import ex1.m;
import ex1.n;
import h32.d4;
import java.util.List;
import kh2.d;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ln1.e;
import m60.w;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import so.b1;
import ww1.c;
import xk2.v;
import xo.s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/analytics/toppins/overview/TopPinsView;", "Landroid/widget/LinearLayout;", "Lex1/j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TopPinsView extends s implements j {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f50124p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final v f50125d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f50126e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f50127f;

    /* renamed from: g, reason: collision with root package name */
    public final PinsListEmptyView f50128g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f50129h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltSpinner f50130i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f50131j;

    /* renamed from: k, reason: collision with root package name */
    public yk1.j f50132k;

    /* renamed from: l, reason: collision with root package name */
    public b1 f50133l;

    /* renamed from: m, reason: collision with root package name */
    public w f50134m;

    /* renamed from: n, reason: collision with root package name */
    public l f50135n;

    /* renamed from: o, reason: collision with root package name */
    public final d4 f50136o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopPinsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ex1.j
    public final void F1(d viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        boolean z13 = viewState instanceof i;
        GestaltSpinner gestaltSpinner = this.f50130i;
        if (!z13) {
            if (Intrinsics.d(viewState, h.f60399a)) {
                i(true);
                b.X2(gestaltSpinner, e.NONE);
                return;
            }
            return;
        }
        i(false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        i iVar = (i) viewState;
        this.f50129h.H2(new g(context, iVar.f60401a, iVar.f60402b, new n(this, 0)));
        b.X2(gestaltSpinner, e.LOADED);
    }

    @Override // ex1.j
    public final void L2(l presenterListener) {
        Intrinsics.checkNotNullParameter(presenterListener, "presenterListener");
        this.f50135n = presenterListener;
    }

    @Override // ex1.j
    public final void c0(String disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getP0() {
        return this.f50136o;
    }

    @Override // ex1.j
    public final void h1(List metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
    }

    public final void i(boolean z13) {
        this.f50127f.i(new mm1.i(z13, 28));
        boolean z14 = !z13;
        this.f50129h.setVisibility(z14 ? 0 : 8);
        this.f50126e.d(new mm1.i(z14, 29));
        this.f50128g.setVisibility(z13 ? 0 : 8);
    }

    public final void j() {
        l lVar = this.f50135n;
        if (lVar != null) {
            lVar.r3();
        }
    }

    @Override // ex1.j
    public final void j0() {
        this.f50135n = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yk1.j jVar = this.f50132k;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        b1 b1Var = this.f50133l;
        if (b1Var == null) {
            Intrinsics.r("topPinsPresenterFactory");
            throw null;
        }
        d0 d0Var = this.f50131j;
        if (d0Var != null) {
            jVar.d(this, b1Var.a(d0Var, 3, false, c.IMPRESSION));
        } else {
            Intrinsics.r("pinalytics");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yk1.j jVar = this.f50132k;
        if (jVar != null) {
            jVar.e(this);
        } else {
            Intrinsics.r("mvpBinder");
            throw null;
        }
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f50131j = pinalytics;
        this.f50128g.f50123c = pinalytics;
        this.f50126e.d(m.f60419k).e(new gh1.e(this, 25));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopPinsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 20);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50125d = xk2.m.b(a.f60384k);
        this.f50136o = d4.ANALYTICS_OVERVIEW;
        View.inflate(context, com.pinterest.partnerAnalytics.e.fragment_top_pins, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.pinListEmpty);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50128g = (PinsListEmptyView) findViewById;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.loadingView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById2;
        this.f50130i = gestaltSpinner;
        s0.w(gestaltSpinner, m.f60418j);
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.top_pins_recyclerview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f50129h = recyclerView;
        recyclerView.R2(new PinterestLinearLayoutManager(new g41.a(this, 18)));
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.metric_description_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50127f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.see_all_pins_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50126e = (GestaltButton) findViewById5;
    }
}
