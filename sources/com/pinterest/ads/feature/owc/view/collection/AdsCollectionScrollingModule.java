package com.pinterest.ads.feature.owc.view.collection;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import com.pinterest.gestalt.text.GestaltText;
import cu.i;
import es.a;
import es.h;
import eu.g;
import eu.j;
import eu.p;
import eu.u;
import eu.x;
import eu.y;
import fs.c;
import hf0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kh2.m2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lh0.d;
import m60.r0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import ps.k;
import ps.q;
import rq.l2;
import rq.t4;
import so.jb;
import so.oa;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/collection/AdsCollectionScrollingModule;", "Lcom/pinterest/ads/feature/owc/view/core/AdsCoreScrollingModule;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsCollectionScrollingModule extends AdsCoreScrollingModule {
    public static final /* synthetic */ int U0 = 0;
    public boolean F0;
    public k G0;
    public d H0;
    public h I0;
    public c J0;
    public a K0;
    public final int[] L0;
    public float M0;
    public int N0;
    public final v O0;
    public final v P0;
    public final v Q0;
    public f30 R0;
    public final v S0;
    public final v T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCollectionScrollingModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        G0();
        this.L0 = new int[]{0, 0};
        this.O0 = m.b(new eu.h(this, 1));
        this.P0 = m.b(new eu.h(this, 2));
        this.Q0 = m.b(new eu.h(this, 5));
        this.S0 = m.b(new eu.h(this, 3));
        this.T0 = m.b(new eu.h(this, 6));
    }

    @Override // com.pinterest.ads.onetap.view.SwipeAwareScrollView
    public final void G0() {
        if (this.F0) {
            return;
        }
        this.F0 = true;
        oa oaVar = ((jb) ((j) generatedComponent())).f113483a;
        this.R = (ac2.m) oaVar.C7.get();
        this.G0 = oaVar.c2();
        this.H0 = (d) oaVar.Q6.get();
        this.I0 = (h) oaVar.f113735i7.get();
        this.J0 = oa.h0(oaVar);
        this.K0 = (a) oaVar.P6.get();
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void H0() {
        postDelayed(new g(this, 1), 100L);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule, com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void K1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!m2.u1(context)) {
            K0().setY(b.g(getContext()) - K0().j());
            K0().e();
        }
        this.R0 = Y0();
        y yVar = new y(0, Y0());
        w wVar = this.f35323j0;
        wVar.d(yVar);
        wVar.d(new u(Y0(), false, true));
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void U1() {
        this.f35322i0 = (int) k2().getY();
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void V1() {
        int height = k2().getHeight() + K0().j();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a0.k1(this.U, m2.O0(resources) + height);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, cu.a
    public final void a() {
        super.a();
        K0().setY(this.M0);
        this.f35323j0.d(new x(this.R0));
    }

    public final h f2() {
        h hVar = this.I0;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("adsCommonDisplay");
        throw null;
    }

    public final List g2() {
        return (List) this.O0.getValue();
    }

    public final k i2() {
        k kVar = this.G0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("pinChipLooper");
        throw null;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, cu.a
    public final void j() {
        super.j();
        K0().setY(0.0f);
    }

    public final AdsProductsModule k2() {
        Object value = this.Q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AdsProductsModule) value;
    }

    public final void l2() {
        st.d dVar = k2().f35363y;
        if (dVar != null) {
            dVar.s3();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, com.pinterest.ui.scrollview.ObservableScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.K0;
        if (aVar == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        if (((es.c) aVar).w(Y0(), new eu.h(this, 4))) {
            this.f35323j0.f(new ps.m(i2().a(), Y0().getUid()));
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final int p1() {
        return b.n() ? q.ads_closeup_collection_scrolling_module_landscape_tablet : q.ads_closeup_collection_scrolling_module;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final aa2.c r1() {
        return (aa2.c) this.T0.getValue();
    }

    public final void r2(k kVar) {
        f30 f30Var;
        String i43;
        h f23 = f2();
        f30 Y0 = Y0();
        d dVar = this.H0;
        if (dVar == null) {
            Intrinsics.r("adFormatsLibraryExperiments");
            throw null;
        }
        ArrayList t13 = ((es.v) f23).t(Y0, dVar);
        if (t13 == null || (f30Var = (f30) t13.get(kVar.f101240c)) == null || (i43 = f30Var.i4()) == null) {
            return;
        }
        n1().setBackgroundColor(Color.parseColor(i43));
    }

    public final void s2(ArrayList products) {
        Intrinsics.checkNotNullParameter(products, "products");
        AdsProductsModule k23 = k2();
        f30 Y0 = Y0();
        p pVar = k23.f35364z;
        rl2.u[] uVarArr = AdsProductsModule.C;
        boolean z13 = false;
        pVar.d(k23, uVarArr[0], Y0);
        AdsProductsModule k24 = k2();
        k24.getClass();
        Intrinsics.checkNotNullParameter(products, "<set-?>");
        k24.A.d(k24, uVarArr[1], products);
        md O3 = Y0().O3();
        String newText = O3 != null ? O3.k() : null;
        if (S0().g()) {
            ((es.v) f2()).R(Y0(), true);
            if (newText == null || newText.length() == 0) {
                f3 z33 = Y0().z3();
                if (z33 != null) {
                    newText = z33.E();
                }
                newText = null;
            }
        } else {
            f3 z34 = Y0().z3();
            if (z34 != null) {
                newText = z34.E();
            }
            newText = null;
        }
        AdsProductsModule k25 = k2();
        String promoInfoText = "";
        if (newText == null) {
            newText = "";
        }
        k25.getClass();
        Intrinsics.checkNotNullParameter(newText, "newText");
        GestaltText gestaltText = k25.f35360v;
        if (gestaltText == null) {
            Intrinsics.r("dynamicCollectionHeaderText");
            throw null;
        }
        gestaltText.i(new l2(newText, 17));
        if (Intrinsics.d(newText, "")) {
            a0.k0(gestaltText);
        }
        int dimensionPixelOffset = b.n() ? k25.getResources().getDimensionPixelOffset(eo1.c.space_200) : k25.getResources().getDimensionPixelOffset(r0.lego_grid_cell_inner_padding);
        boolean d2 = Intrinsics.d(newText, "");
        RecyclerView recyclerView = k25.f35362x;
        if (d2) {
            recyclerView.setPaddingRelative(dimensionPixelOffset, k25.getResources().getDimensionPixelOffset(eo1.c.space_800), dimensionPixelOffset, dimensionPixelOffset);
        } else {
            recyclerView.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        }
        c cVar = this.J0;
        if (cVar == null) {
            Intrinsics.r("adsSalesDealsDisplay");
            throw null;
        }
        if (cVar.j(Y0(), false, false, false)) {
            if (((es.v) f2()).M(Y0())) {
                z13 = true;
            }
        }
        c cVar2 = this.J0;
        if (cVar2 == null) {
            Intrinsics.r("adsSalesDealsDisplay");
            throw null;
        }
        String a13 = cVar2.a(Y0());
        c cVar3 = this.J0;
        if (cVar3 == null) {
            Intrinsics.r("adsSalesDealsDisplay");
            throw null;
        }
        String b13 = cVar3.b(Y0());
        if (a13 != null) {
            promoInfoText = a13;
        } else if (b13 != null) {
            promoInfoText = b13;
        }
        AdsProductsModule k26 = k2();
        k26.getClass();
        Intrinsics.checkNotNullParameter(promoInfoText, "promoInfoText");
        k26.f35361w.i(new t4(z13, promoInfoText, 5));
    }

    public final void t2() {
        postDelayed(new g(this, 0), 100L);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void w1(i bottomSheet, AdsCarouselIndexModule carouselIndexModule, AdsToolbarModule toolbarModule, ac2.m videoManager, HashSet obstructionViews) {
        float O0;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Intrinsics.checkNotNullParameter(carouselIndexModule, "carouselIndexModule");
        Intrinsics.checkNotNullParameter(toolbarModule, "toolbarModule");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
        AdsProductsModule k23 = k2();
        boolean y13 = y1();
        if (!y13) {
            O0 = b.f69003c * 0.75f;
        } else {
            if (!y13) {
                throw new NoWhenBranchMatchedException();
            }
            float floatValue = ((Number) this.P0.getValue()).floatValue();
            Intrinsics.checkNotNullExpressionValue(getResources(), "getResources(...)");
            O0 = floatValue + m2.O0(r2);
        }
        k23.setY(O0);
        super.w1(bottomSheet, carouselIndexModule, toolbarModule, videoManager, obstructionViews);
    }

    public final void w2(int i13) {
        boolean y13 = y1();
        int[] iArr = this.L0;
        View view = this.U;
        int i14 = 1;
        if (!y13) {
            view.getLocationInWindow(iArr);
            if (iArr[1] - b.f69007g >= b.f69003c * 0.75f) {
                n1().s(i13);
            }
        }
        d2();
        view.getLocationInWindow(iArr);
        k2().setY(Math.min(b.f69003c * 0.75f, iArr[1] - b.f69007g) + i13);
        i K0 = K0();
        view.getLocationInWindow(iArr);
        float height = k2().getHeight() + (iArr[1] - b.f69007g);
        Intrinsics.checkNotNullExpressionValue(getResources(), "getResources(...)");
        Intrinsics.checkNotNullParameter(this, "<this>");
        K0.setY((height + m2.O0(r1)) - bs1.c.W(this, eo1.c.space_400));
        this.M0 = K0().getY();
        Rect Q0 = bs1.c.Q0(n1());
        if ((K0().getF35368t().L != 3 ? Math.max(0.0f, Math.min(1.0f, 1 - (Math.abs(Q0.top - b.f69007g) / Q0.height()))) : 0.0f) <= 0.5d) {
            i2().e();
        } else {
            k i23 = i2();
            k.d(i23, g2().size(), false, null, new eu.i(this, i23, i14), 12);
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final boolean y1() {
        return ((Boolean) this.S0.getValue()).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCollectionScrollingModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
