package bx0;

import android.app.Application;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import ao2.j0;
import com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.v2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import o82.b3;
import o82.c3;
import om0.m1;
import pk.a0;
import so.m5;
import yn2.c0;

/* loaded from: classes5.dex */
public final class i extends ConstraintLayout implements yk1.n, nx.v, af2.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f24043t = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f24044a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24045b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f24046c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f24047d;

    /* renamed from: e, reason: collision with root package name */
    public final m5 f24048e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f24049f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f24050g;

    /* renamed from: h, reason: collision with root package name */
    public final bb2.j f24051h;

    /* renamed from: i, reason: collision with root package name */
    public final RecyclerView f24052i;

    /* renamed from: j, reason: collision with root package name */
    public final ShopTheLookCarouselContainer f24053j;

    /* renamed from: k, reason: collision with root package name */
    public final ll.j f24054k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltButton f24055l;

    /* renamed from: m, reason: collision with root package name */
    public u50.r f24056m;

    /* renamed from: n, reason: collision with root package name */
    public final String f24057n;

    /* renamed from: o, reason: collision with root package name */
    public final c3 f24058o;

    /* renamed from: p, reason: collision with root package name */
    public final b3 f24059p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24060q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24061r;

    /* renamed from: s, reason: collision with root package name */
    public yw0.a f24062s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, androidx.lifecycle.u scope, d0 pinalytics, int i13, z moduleVariant, m5 seeItStyledModuleViewModelFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(seeItStyledModuleViewModelFactory, "seeItStyledModuleViewModelFactory");
        final int i14 = 1;
        if (!this.f24045b) {
            this.f24045b = true;
            ((k) generatedComponent()).getClass();
        }
        this.f24046c = scope;
        this.f24047d = pinalytics;
        this.f24048e = seeItStyledModuleViewModelFactory;
        final int i15 = 0;
        this.f24054k = new ll.j(16, 0);
        this.f24057n = "STLFocusCarouselRecyclerView";
        c3 c3Var = new c3();
        this.f24058o = c3Var;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        b3 b3Var = new b3(scope, c3Var, null, (Application) applicationContext, 20);
        b3Var.I(2701215, new m1(26, context, this), h.f24042a, new p90.n(this, 7));
        this.f24059p = b3Var;
        this.f24060q = true;
        View.inflate(context, i13, this);
        View findViewById = findViewById(f62.c.see_it_styled_carousel_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f24049f = (GestaltText) findViewById;
        View findViewById2 = findViewById(f62.c.see_it_styled_carousel_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f24050g = (GestaltText) findViewById2;
        KeyEvent.Callback findViewById3 = findViewById(f62.c.current_product_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        bb2.j jVar = (bb2.j) findViewById3;
        this.f24051h = jVar;
        jVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        jVar.a2(true);
        View findViewById4 = findViewById(f62.c.see_it_styled_carousel_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        this.f24052i = recyclerView;
        recyclerView.H2(b3Var);
        View findViewById5 = findViewById(f62.c.see_it_styled_product_carousel_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        ShopTheLookCarouselContainer shopTheLookCarouselContainer = (ShopTheLookCarouselContainer) findViewById5;
        this.f24053j = shopTheLookCarouselContainer;
        int i16 = c.f24026a[moduleVariant.ordinal()];
        if (i16 == 1) {
            r0 r0Var = new r0(this) { // from class: bx0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f24023b;

                {
                    this.f24023b = this;
                }

                @Override // androidx.recyclerview.widget.r0
                public final String value() {
                    int i17 = i15;
                    i this$0 = this.f24023b;
                    switch (i17) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            break;
                    }
                    return this$0.f24057n;
                }
            };
            recyclerView.getContext();
            recyclerView.R2(new PinterestLinearLayoutManager(r0Var, 0, false));
            recyclerView.m(new eb2.n(bs1.c.H1(recyclerView, eo1.a.item_horizontal_spacing)));
        } else if (i16 == 2) {
            r0 r0Var2 = new r0(this) { // from class: bx0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f24023b;

                {
                    this.f24023b = this;
                }

                @Override // androidx.recyclerview.widget.r0
                public final String value() {
                    int i17 = i14;
                    i this$0 = this.f24023b;
                    switch (i17) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            break;
                    }
                    return this$0.f24057n;
                }
            };
            Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            recyclerView.R2(new SnappableCarouselLayoutManager(r0Var2, context2, new androidx.appcompat.widget.q(this, 1), 0, 24));
            recyclerView.m(new eb2.d(new d(bs1.c.H1(recyclerView, eo1.a.sema_space_200), recyclerView), e.f24030j, new d(recyclerView, (int) ((r13 - (0.58d * r13)) / 2)), e.f24031k));
            shopTheLookCarouselContainer.setVisibility(0);
            recyclerView.f19254t = true;
        }
        GestaltButton gestaltButton = (GestaltButton) findViewById(f62.c.see_it_styled_carousel_see_all_button);
        this.f24055l = gestaltButton;
        if (gestaltButton != null) {
            a0.m(gestaltButton, new b(this, 0));
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f24044a == null) {
            this.f24044a = new ye2.o(this);
        }
        return this.f24044a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f24044a == null) {
            this.f24044a = new ye2.o(this);
        }
        return this.f24044a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return CollectionsKt.n0(e0.b(this.f24053j), c0.j(d7.b.O(this.f24052i), g.f24036j));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        u50.r rVar;
        i0 i0Var;
        v2 x13 = ll.j.x(this.f24054k, null, 0, 0, "", null, null, 52);
        if (x13 == null || (rVar = this.f24056m) == null) {
            return null;
        }
        d0 d0Var = this.f24047d;
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
            i0Var = new i0(d4Var2, a4Var, source.f67083c, g0.SHOP_YOUR_SAVES_MODULE, source.f67085e, source.f67086f);
        } else {
            i0Var = new i0(d4.PIN, a4.PIN_PRODUCT, null, g0.SHOP_YOUR_SAVES_MODULE, null, null);
        }
        rVar.a(new o(i0Var, x13));
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        this.f24054k.y(null);
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        yw0.a aVar = this.f24062s;
        if (aVar != null) {
            this.f24052i.w2(aVar);
        }
        super.onDetachedFromWindow();
    }
}
