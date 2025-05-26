package yw0;

import android.app.Application;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao2.j0;
import com.pinterest.feature.modules.seeItStyled.completeTheLookCarousel.CompleteTheLookCarouselContainer;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.v2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.y3;
import nx.d0;
import nx.v;
import o82.b3;
import o82.c3;
import om0.m1;
import so.jb;
import so.m6;
import u50.r;
import ye2.o;
import yn2.c0;

/* loaded from: classes5.dex */
public final class e extends ConstraintLayout implements yk1.n, v, af2.c {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f140272s = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f140273a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f140274b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f140275c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f140276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f140277e;

    /* renamed from: f, reason: collision with root package name */
    public final m6 f140278f;

    /* renamed from: g, reason: collision with root package name */
    public y3 f140279g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f140280h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f140281i;

    /* renamed from: j, reason: collision with root package name */
    public final bb2.j f140282j;

    /* renamed from: k, reason: collision with root package name */
    public final RecyclerView f140283k;

    /* renamed from: l, reason: collision with root package name */
    public final CompleteTheLookCarouselContainer f140284l;

    /* renamed from: m, reason: collision with root package name */
    public final ll.j f140285m;

    /* renamed from: n, reason: collision with root package name */
    public r f140286n;

    /* renamed from: o, reason: collision with root package name */
    public final String f140287o;

    /* renamed from: p, reason: collision with root package name */
    public final c3 f140288p;

    /* renamed from: q, reason: collision with root package name */
    public final b3 f140289q;

    /* renamed from: r, reason: collision with root package name */
    public a f140290r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, u scope, d0 pinalytics, int i13, m6 seeItStyledModuleViewModelFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(seeItStyledModuleViewModelFactory, "seeItStyledModuleViewModelFactory");
        if (!this.f140274b) {
            this.f140274b = true;
            this.f140279g = ((jb) ((f) generatedComponent())).f113485c.F6();
        }
        this.f140275c = scope;
        this.f140276d = pinalytics;
        this.f140277e = i13;
        this.f140278f = seeItStyledModuleViewModelFactory;
        this.f140285m = new ll.j(16, 0);
        this.f140287o = "SeeItStyledCarouselRecyclerView";
        c3 c3Var = new c3();
        this.f140288p = c3Var;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        b3 b3Var = new b3(scope, c3Var, null, (Application) applicationContext, 20);
        b3Var.I(2701215, new m1(24, context, this), d.f140271a, new p90.n(this, 6));
        this.f140289q = b3Var;
        View.inflate(context, i13, this);
        View findViewById = findViewById(f62.c.see_it_styled_carousel_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f140280h = (GestaltText) findViewById;
        View findViewById2 = findViewById(f62.c.see_it_styled_carousel_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140281i = (GestaltText) findViewById2;
        KeyEvent.Callback findViewById3 = findViewById(f62.c.current_product_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        bb2.j jVar = (bb2.j) findViewById3;
        this.f140282j = jVar;
        jVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        jVar.a2(true);
        View findViewById4 = findViewById(f62.c.see_it_styled_carousel_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        this.f140283k = recyclerView;
        recyclerView.H2(b3Var);
        View findViewById5 = findViewById(f62.c.see_it_styled_product_carousel_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f140284l = (CompleteTheLookCarouselContainer) findViewById5;
        cp.b bVar = new cp.b(this, 25);
        recyclerView.getContext();
        recyclerView.R2(new PinterestLinearLayoutManager(bVar, 0, false));
        recyclerView.m(new eb2.n(bs1.c.H1(recyclerView, eo1.a.item_horizontal_spacing)));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f140273a == null) {
            this.f140273a = new o(this);
        }
        return this.f140273a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f140273a == null) {
            this.f140273a = new o(this);
        }
        return this.f140273a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return CollectionsKt.n0(e0.b(this.f140284l), c0.j(d7.b.O(this.f140283k), c.f140270i));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        r rVar;
        i0 i0Var;
        v2 x13 = ll.j.x(this.f140285m, null, 0, 0, "", null, null, 52);
        if (x13 == null || (rVar = this.f140286n) == null) {
            return null;
        }
        d0 d0Var = this.f140276d;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        i0 source = d0Var.p();
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            d4 d4Var = source.f67081a;
            if (d4Var == null) {
                d4Var = d4.PIN;
            }
            d4 d4Var2 = d4Var;
            a4 a4Var = source.f67082b;
            if (a4Var == null) {
                a4Var = a4.PIN_PRODUCT;
            }
            i0Var = new i0(d4Var2, a4Var, source.f67083c, g0.SEE_IT_STYLED, source.f67085e, source.f67086f);
        } else {
            i0Var = new i0(d4.PIN, a4.PIN_PRODUCT, null, g0.SEE_IT_STYLED, null, null);
        }
        rVar.a(new h(i0Var, x13));
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        this.f140285m.y(null);
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a aVar = this.f140290r;
        if (aVar != null) {
            this.f140283k.w2(aVar);
        }
        super.onDetachedFromWindow();
    }
}
