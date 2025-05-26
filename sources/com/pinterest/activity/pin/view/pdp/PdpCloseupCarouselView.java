package com.pinterest.activity.pin.view.pdp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.o2;
import bb2.c;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import hf0.b;
import hs.d;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import nx.b0;
import nx.d0;
import nx.f0;
import nx.o0;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import q5.x;
import tq.a;
import tq.l;
import tq.r;
import tq0.f;
import xk2.v;
import yk1.j;
import yq0.z;
import zy.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/activity/pin/view/pdp/PdpCloseupCarouselView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lsq0/x;", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PdpCloseupCarouselView extends a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final j f35047d;

    /* renamed from: e, reason: collision with root package name */
    public final v f35048e;

    /* renamed from: f, reason: collision with root package name */
    public float f35049f;

    /* renamed from: g, reason: collision with root package name */
    public int f35050g;

    /* renamed from: h, reason: collision with root package name */
    public int f35051h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f35052i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f35053j;

    /* renamed from: k, reason: collision with root package name */
    public o2 f35054k;

    /* renamed from: l, reason: collision with root package name */
    public l f35055l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35056m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35057n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35058o;

    /* renamed from: p, reason: collision with root package name */
    public c f35059p;

    /* renamed from: q, reason: collision with root package name */
    public r f35060q;

    /* renamed from: r, reason: collision with root package name */
    public a0 f35061r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f35062s;

    /* renamed from: t, reason: collision with root package name */
    public d f35063t;

    /* renamed from: u, reason: collision with root package name */
    public b0 f35064u;

    /* renamed from: v, reason: collision with root package name */
    public ur.a f35065v;

    /* renamed from: w, reason: collision with root package name */
    public f30 f35066w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f35067x;

    /* renamed from: y, reason: collision with root package name */
    public final n1 f35068y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f35069z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdpCloseupCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(PdpCloseupCarouselView pdpCloseupCarouselView, float f13, float f14, Float f15, Float f16, int i13, int i14) {
        float G;
        float f17;
        FrameLayout frameLayout;
        if ((i14 & 4) != 0) {
            f15 = null;
        }
        if ((i14 & 8) != 0) {
            f16 = null;
        }
        if (f15 != null) {
            G = f15.floatValue();
        } else {
            c cVar = pdpCloseupCarouselView.f35059p;
            G = (b.q() ? com.bumptech.glide.c.G() : b.j(pdpCloseupCarouselView.getContext())) * (cVar != null ? cVar.f22598f : 1.0f);
        }
        float f18 = G / f14;
        Float S0 = bs1.c.S0(G, f16);
        if (S0 != null) {
            f17 = S0.floatValue();
        } else {
            float f19 = b.f69001a;
            f17 = f19 * (f13 / f19) * f18;
        }
        pdpCloseupCarouselView.f35049f = f17;
        Resources resources = pdpCloseupCarouselView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int U = bs1.c.U(n80.a.pdp_carousel_single_image_max_height, resources);
        if (pdpCloseupCarouselView.f35058o) {
            float f23 = U;
            if (pdpCloseupCarouselView.f35049f > f23) {
                float f24 = (f14 / f13) * f23;
                pdpCloseupCarouselView.f35049f = f23;
                ViewGroup.LayoutParams layoutParams = pdpCloseupCarouselView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = U;
                layoutParams.width = (int) f24;
                pdpCloseupCarouselView.setLayoutParams(layoutParams);
                l lVar = pdpCloseupCarouselView.f35055l;
                if (lVar == null || (frameLayout = lVar.f118890a.f118913w) == null) {
                    return;
                }
                frameLayout.setBackground(new ColorDrawable(i13));
                return;
            }
        }
        if (pdpCloseupCarouselView.getLayoutParams().height <= 0 || pdpCloseupCarouselView.getLayoutParams().height >= ((int) pdpCloseupCarouselView.f35049f)) {
            pdpCloseupCarouselView.getLayoutParams().height = (int) pdpCloseupCarouselView.f35049f;
            pdpCloseupCarouselView.requestLayout();
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        if (d0Var == null) {
            return super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
        }
        m[] mVarArr = new m[1];
        HashMap hashMap = new HashMap();
        f30 f30Var = this.f35066w;
        if (f30Var != null) {
            b0 b0Var = this.f35064u;
            if (b0Var == null) {
                Intrinsics.r("pinAuxHelper");
                throw null;
            }
            b0Var.c(f30Var, hashMap);
        }
        Unit unit = Unit.f80348a;
        Integer valueOf = Integer.valueOf(this.f35050g);
        f30 f30Var2 = this.f35066w;
        ur.a aVar2 = this.f35065v;
        if (aVar2 != null) {
            mVarArr[0] = new f(clock, d0Var, hashMap, null, valueOf, bs1.c.q0(f30Var2, aVar2));
            return mVarArr;
        }
        Intrinsics.r("adsCoreDependencies");
        throw null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        cp.b bVar = new cp.b(this, 1);
        getContext();
        PdpCloseupCarouselView$createLayoutManagerContract$1 layoutManager = new PdpCloseupCarouselView$createLayoutManagerContract$1(bVar, 0, false);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    public final void e(int i13) {
        this.f35051h = i13;
        getPinterestRecyclerView().h(i13, false);
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
        x.a(recyclerView, new d.d(recyclerView, this, i13, 10));
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f35048e.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return zv1.b.view_normal_carousel_recycler_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return zv1.a.horizontal_recycler;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, new db.m(this, 22));
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPinterestRecyclerView().f52531a.setOnTouchListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdpCloseupCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PdpCloseupCarouselView(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            r6 = this;
            r10 = r10 & 4
            r0 = 0
            if (r10 == 0) goto L6
            r9 = r0
        L6:
            yk1.j r10 = yk1.j.a()
            java.lang.String r1 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "mvpBinder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            r6.<init>(r7, r8, r9, r0)
            r6.f35047d = r10
            tq.t r7 = tq.t.f118932j
            xk2.v r7 = xk2.m.b(r7)
            r6.f35048e = r7
            hs.d r7 = r6.f35063t
            if (r7 == 0) goto L8c
            boolean r7 = r7.a()
            r6.f35067x = r7
            androidx.recyclerview.widget.n1 r8 = new androidx.recyclerview.widget.n1
            r8.<init>()
            r6.f35068y = r8
            r9 = 1
            r6.f35069z = r9
            com.pinterest.ui.grid.PinterestRecyclerView r9 = r6.getPinterestRecyclerView()
            androidx.recyclerview.widget.RecyclerView r9 = r9.f52531a
            r8.b(r9)
            com.pinterest.ui.grid.PinterestRecyclerView r8 = r6.getPinterestRecyclerView()
            androidx.recyclerview.widget.c0 r9 = new androidx.recyclerview.widget.c0
            r10 = 3
            r9.<init>(r6, r10)
            r8.b(r9)
            com.pinterest.ui.grid.PinterestRecyclerView r8 = r6.getPinterestRecyclerView()
            r9 = 393216(0x60000, float:5.51013E-40)
            r8.setDescendantFocusability(r9)
            boolean r8 = hf0.b.n()
            if (r8 != 0) goto L8b
            if (r7 == 0) goto L79
            com.pinterest.ui.grid.PinterestRecyclerView r7 = r6.getPinterestRecyclerView()
            eb2.k r8 = new eb2.k
            int r9 = eo1.c.space_100
            int r4 = bs1.c.W(r6, r9)
            r1 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
            goto L8b
        L79:
            com.pinterest.ui.grid.PinterestRecyclerView r7 = r6.getPinterestRecyclerView()
            eb2.n r8 = new eb2.n
            int r9 = eo1.c.space_100
            int r9 = bs1.c.W(r6, r9)
            r8.<init>(r9)
            r7.a(r8)
        L8b:
            return
        L8c:
            java.lang.String r7 = "moduleViewabilityHelper"
            kotlin.jvm.internal.Intrinsics.r(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
