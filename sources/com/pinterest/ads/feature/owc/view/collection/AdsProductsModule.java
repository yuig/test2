package com.pinterest.ads.feature.owc.view.collection;

import a.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.pinterest.gestalt.text.GestaltText;
import ct.c;
import eb2.o;
import es.h;
import eu.p;
import eu.q;
import eu.t;
import hf0.b;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.x;
import m60.r0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rl2.u;
import so.hb;
import st.d;
import yk1.j;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/collection/AdsProductsModule;", "Lcom/google/android/material/card/MaterialCardView;", "Lct/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsProductsModule extends t implements c {
    public static final /* synthetic */ u[] C;
    public final p A;
    public final q B;

    /* renamed from: r, reason: collision with root package name */
    public hb f35356r;

    /* renamed from: s, reason: collision with root package name */
    public j f35357s;

    /* renamed from: t, reason: collision with root package name */
    public w f35358t;

    /* renamed from: u, reason: collision with root package name */
    public h f35359u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f35360v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f35361w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f35362x;

    /* renamed from: y, reason: collision with root package name */
    public d f35363y;

    /* renamed from: z, reason: collision with root package name */
    public final p f35364z;

    static {
        x xVar = new x(AdsProductsModule.class, "parentPin", "getParentPin$ads_release()Lcom/pinterest/api/model/Pin;", 0);
        l0 l0Var = k0.f80436a;
        C = new u[]{l0Var.e(xVar), a.y(AdsProductsModule.class, "products", "getProducts$ads_release()Ljava/util/List;", 0, l0Var)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsProductsModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f35358t;
        if (wVar != null) {
            wVar.h(this.B);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w wVar = this.f35358t;
        if (wVar != null) {
            wVar.j(this.B);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsProductsModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35364z = new p(null, this, 0);
        View.inflate(getContext(), ps.q.ads_collection_products_module, this);
        View findViewById = findViewById(ps.p.dynamic_collection_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35360v = (GestaltText) findViewById;
        View findViewById2 = findViewById(ps.p.promotion_ads_promo_info);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35361w = (GestaltText) findViewById2;
        View findViewById3 = findViewById(ps.p.opaque_one_tap_products_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f35362x = recyclerView;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.pin_grid_cell_outer_margin);
        recyclerView.R2(b.n() ? new StaggeredGridLayoutManager(4) : new StaggeredGridLayoutManager(2));
        recyclerView.m(new o(dimensionPixelOffset, dimensionPixelOffset));
        this.A = new p(q0.f80391a, this, 1);
        this.B = new q(this);
    }
}
