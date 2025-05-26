package vu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.b2;
import ba.q;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.ads.feature.owc.view.shopping.AdsProductContentModule;
import com.pinterest.ads.feature.owc.view.shopping.AdsShoppingTabletLandscapeDetailView;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kh2.m2;
import kh2.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nt.c2;
import nx.d0;
import ps.p;
import ps.s;
import xk2.v;

/* loaded from: classes3.dex */
public final class k extends AdsCoreScrollingModule implements b {
    public static final /* synthetic */ int P0 = 0;
    public final b60.b F0;
    public final es.h G0;
    public AdsProductContentModule H0;
    public final AdsShoppingTabletLandscapeDetailView I0;
    public h J0;
    public float K0;
    public final LinearLayout L0;
    public final v M0;
    public List N0;
    public boolean O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, b60.b activeUserManager, es.h adsCommonDisplay) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.F0 = activeUserManager;
        this.G0 = adsCommonDisplay;
        this.M0 = xk2.m.b(new q(context, 12));
        this.O0 = true;
        View findViewById = findViewById(p.submodules_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.L0 = (LinearLayout) findViewById;
        this.H0 = (AdsProductContentModule) findViewById(p.product_content_view);
        this.I0 = (AdsShoppingTabletLandscapeDetailView) findViewById(p.shopping_detail_view_landscape_tablet);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void H0() {
        postDelayed(new c2(this, 2), 100L);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void I0() {
        if (this.O0) {
            super.I0();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void K1() {
        this.f35323j0.d(new l(a.HERO_CLICKTHROUGH));
        if (!b40.U0(Y0())) {
            super.K1();
            return;
        }
        fu.c cVar = this.f35327n0;
        if (cVar != null) {
            cVar.d5();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void M1(int i13) {
        super.M1(i13);
        g2(bs1.c.R0(this.U).top - hf0.b.f69007g);
        this.K0 = K0().getY() + 40;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, cu.a
    public final void a() {
        super.a();
        g2(this.K0);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void a2() {
        String c23;
        AdsShoppingTabletLandscapeDetailView adsShoppingTabletLandscapeDetailView = this.I0;
        if (adsShoppingTabletLandscapeDetailView != null) {
            f30 pin = Y0();
            Intrinsics.checkNotNullParameter(pin, "pin");
            es.h adsCommonDisplay = this.G0;
            Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
            AdsProductContentModule adsProductContentModule = adsShoppingTabletLandscapeDetailView.f35398a;
            int i13 = 6;
            AttributeSet attributeSet = null;
            if (adsProductContentModule.f35396h && adsProductContentModule.getParent() != null) {
                int indexOfChild = adsShoppingTabletLandscapeDetailView.indexOfChild(adsShoppingTabletLandscapeDetailView.f35398a);
                adsShoppingTabletLandscapeDetailView.removeViewAt(indexOfChild);
                Context context = adsShoppingTabletLandscapeDetailView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                AdsProductContentModule adsProductContentModule2 = new AdsProductContentModule(i13, context, attributeSet);
                adsShoppingTabletLandscapeDetailView.f35398a = adsProductContentModule2;
                adsShoppingTabletLandscapeDetailView.addView(adsProductContentModule2, indexOfChild);
                AdsProductContentModule adsProductContentModule3 = adsShoppingTabletLandscapeDetailView.f35398a;
                adsProductContentModule3.setPaddingRelative(adsProductContentModule3.getPaddingStart(), bs1.c.W(adsShoppingTabletLandscapeDetailView, eo1.c.space_800), adsProductContentModule3.getPaddingEnd(), adsProductContentModule3.getPaddingBottom());
            }
            AdsProductContentModule adsProductContentModule4 = adsShoppingTabletLandscapeDetailView.f35398a;
            adsProductContentModule4.L(pin, m2.W0(pin, adsCommonDisplay, false));
            Intrinsics.checkNotNullParameter(pin, "pin");
            Iterator it = d7.b.O(adsProductContentModule4).iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.f17692u = -1;
                layoutParams2.f17693v = -1;
                view.setLayoutParams(layoutParams2);
            }
            GestaltText gestaltText = adsProductContentModule4.f35392d;
            ViewGroup.LayoutParams layoutParams3 = gestaltText.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(adsProductContentModule4.getResources().getDimensionPixelSize(eo1.c.space_500));
            gestaltText.setLayoutParams(layoutParams4);
            adsProductContentModule4.f35391c.setGravity(0);
            gestaltText.i(c.f126640j);
            bs1.c.X0(adsProductContentModule4.f35394f);
            boolean f13 = bs1.c.f1(pin);
            if (f13) {
                Resources resources = adsProductContentModule4.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                c23 = bs1.c.c2(az1.c.product_in_stock, resources);
            } else {
                if (f13) {
                    throw new NoWhenBranchMatchedException();
                }
                Resources resources2 = adsProductContentModule4.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                c23 = bs1.c.c2(az1.c.product_out_of_stock, resources2);
            }
            Resources resources3 = adsProductContentModule4.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            String d13 = dl2.b.d1(pin, resources3, null, null, 14);
            if (d13 != null) {
                Resources resources4 = adsProductContentModule4.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                c23 = j1.Y("%s %s %s", new Object[]{d13, bs1.c.c2(s.dot, resources4), c23}, null, 6);
            }
            adsProductContentModule4.f35389a.setText(c23);
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void b2() {
        AdsProductContentModule adsProductContentModule = this.H0;
        AttributeSet attributeSet = null;
        LinearLayout linearLayout = this.L0;
        if (adsProductContentModule != null && adsProductContentModule.f35396h) {
            k3.J1(adsProductContentModule);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AdsProductContentModule adsProductContentModule2 = new AdsProductContentModule(6, context, attributeSet);
            k3.M1(adsProductContentModule2, linearLayout);
            int W = bs1.c.W(adsProductContentModule2, eo1.c.space_400);
            adsProductContentModule2.setPadding(W, W, W, W);
            this.H0 = adsProductContentModule2;
        }
        AdsProductContentModule adsProductContentModule3 = this.H0;
        if (adsProductContentModule3 != null) {
            f30 Y0 = Y0();
            List list = this.N0;
            if (list == null) {
                Intrinsics.r("images");
                throw null;
            }
            adsProductContentModule3.L(Y0, list);
            adsProductContentModule3.f35397i = this;
        }
        if (b40.U0(Y0())) {
            return;
        }
        rq.j1 j1Var = (rq.j1) this.M0.getValue();
        d0 d0Var = this.E0;
        if (d0Var == null) {
            Intrinsics.r("analytics");
            throw null;
        }
        j1Var.updatePinalytics(d0Var);
        j1Var.updatePin(Y0());
        k3.M1(j1Var, linearLayout);
    }

    public final void f2() {
        this.f35323j0.d(new o());
        if (!b40.U0(Y0())) {
            super.K1();
            return;
        }
        fu.c cVar = this.f35327n0;
        if (cVar != null) {
            cVar.d5();
        }
    }

    public final void g2(float f13) {
        if (K0().getY() + 40 > this.U.getY()) {
            K0().setY(f13);
        }
    }

    public final void i2(boolean z13) {
        this.O0 = z13;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, cu.a
    public final void j() {
        super.j();
        g2(0.0f);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final int p1() {
        return hf0.b.n() ? ps.q.ads_shopping_scrolling_module_landscape_tablet : ps.q.ads_shopping_scrolling_module;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void t1(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        boolean z13 = this.N0 != null && images.size() > 1;
        this.N0 = images;
        lh0.g S0 = S0();
        f30 pin = Y0();
        Intrinsics.checkNotNullParameter(S0, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        iv.e eVar = new iv.e(m2.b1(S0, pin), m2.b1(S0, pin), hf0.b.q() && m2.b1(S0, pin), !((es.c) as.c.a()).S(pin));
        CloseupCarouselView n13 = n1();
        if (this.O0 && m2.b1(S0(), Y0())) {
            n13.g(r0.margin_half);
            n13.f35433t = eVar;
            if (z13) {
                try {
                    ((b2) n13.getRecyclerAdapter()).i(0);
                } catch (UninitializedPropertyAccessException e13) {
                    e13.toString();
                }
            }
        }
        int i13 = n13.f35424k;
        n13.getPinterestRecyclerView().f52535e.M0(i13);
        n13.f35424k = i13;
        f30 Y0 = Y0();
        wy0 f13 = ((b60.d) this.F0).f();
        Intrinsics.checkNotNullParameter(Y0, "<this>");
        Boolean n53 = Y0.n5();
        Intrinsics.checkNotNullExpressionValue(n53, "getIsVirtualTryOn(...)");
        if (n53.booleanValue()) {
            f42.j jVar = f42.l.Companion;
            Integer P6 = Y0.P6();
            Intrinsics.checkNotNullExpressionValue(P6, "getVirtualTryOnType(...)");
            int intValue = P6.intValue();
            jVar.getClass();
            if (f42.j.a(intValue) == f42.l.PRODUCT && d7.b.i0(f13)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                s71.l y13 = r.y(context, true, 8388693, false);
                FrameLayout frameLayout = this.f35324k0;
                if (frameLayout != null) {
                    frameLayout.addView(y13);
                }
                y13.bringToFront();
                y13.setOnClickListener(new tq.j(this, 13));
                d0 d0Var = this.E0;
                if (d0Var == null) {
                    Intrinsics.r("analytics");
                    throw null;
                }
                d0Var.N(f1.RENDER, u0.VIRTUAL_TRY_ON_ICON, g0.PIN_CLOSEUP, Y0().getUid(), false);
            }
        }
        List list = this.N0;
        if (list != null) {
            super.t1(list);
        } else {
            Intrinsics.r("images");
            throw null;
        }
    }
}
