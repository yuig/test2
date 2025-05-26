package com.pinterest.ads.onetap.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.ui.h0;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.o2;
import androidx.recyclerview.widget.w2;
import bb2.c;
import c02.b;
import c02.u;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincarouselads.view.a0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import eb2.k;
import h32.a4;
import h32.c1;
import h32.d4;
import hs.d;
import hv.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.l2;
import lh0.p2;
import lh0.z3;
import m60.w;
import m60.x0;
import nx.d0;
import nx.f0;
import nx.o0;
import oc2.i;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import tq.a;
import tq0.f;
import uj2.q;
import x02.i2;
import xk2.v;
import yk1.j;
import yq0.z;
import zy.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/ads/onetap/view/CloseupCarouselView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lsq0/x;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oneTapLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class CloseupCarouselView extends a {
    public static final /* synthetic */ int O = 0;
    public w A;
    public q B;
    public d C;
    public p2 D;
    public final j E;
    public e F;
    public final GestaltIconButton G;
    public boolean H;
    public String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f35416J;
    public c1 K;
    public boolean L;
    public final HashSet M;
    public uk2.d N;

    /* renamed from: d, reason: collision with root package name */
    public final v f35417d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35418e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35419f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35420g;

    /* renamed from: h, reason: collision with root package name */
    public int f35421h;

    /* renamed from: i, reason: collision with root package name */
    public float f35422i;

    /* renamed from: j, reason: collision with root package name */
    public int f35423j;

    /* renamed from: k, reason: collision with root package name */
    public int f35424k;

    /* renamed from: l, reason: collision with root package name */
    public o2 f35425l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f35426m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnLongClickListener f35427n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnClickListener f35428o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35429p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35430q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35431r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35432s;

    /* renamed from: t, reason: collision with root package name */
    public iv.e f35433t;

    /* renamed from: u, reason: collision with root package name */
    public c f35434u;

    /* renamed from: v, reason: collision with root package name */
    public k f35435v;

    /* renamed from: w, reason: collision with root package name */
    public k f35436w;

    /* renamed from: x, reason: collision with root package name */
    public f0 f35437x;

    /* renamed from: y, reason: collision with root package name */
    public l2 f35438y;

    /* renamed from: z, reason: collision with root package name */
    public i2 f35439z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseupCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void k(CloseupCarouselView closeupCarouselView, List images, d4 d4Var, a4 a4Var, Float f13, boolean z13, int i13) {
        d4 d4Var2 = (i13 & 2) != 0 ? null : d4Var;
        a4 a4Var2 = (i13 & 4) != 0 ? null : a4Var;
        Float f14 = (i13 & 8) != 0 ? null : f13;
        boolean z14 = (i13 & 16) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(images, "images");
        closeupCarouselView.H = z14;
        iv.e eVar = closeupCarouselView.f35433t;
        if (eVar != null) {
            int size = images.size();
            closeupCarouselView.f35429p = eVar.f73726a;
            closeupCarouselView.f35431r = eVar.f73727b;
            boolean z15 = eVar.f73728c;
            closeupCarouselView.f35430q = z15;
            closeupCarouselView.f35432s = eVar.f73729d;
            if (size == 1 || z15) {
                closeupCarouselView.f35431r = false;
            }
            if (closeupCarouselView.f35431r) {
                closeupCarouselView.getPinterestRecyclerView().k(new u(new c02.d(1000L, 0), new c02.a(0), new b(1000L), new c02.c(1000L, 0), c02.e.f24436a));
            }
        }
        e eVar2 = closeupCarouselView.F;
        if (eVar2 != null) {
            eVar2.f70438e = closeupCarouselView.f35431r;
            eVar2.f70437d = closeupCarouselView.f35429p;
            eVar2.F3(images);
        }
        e eVar3 = closeupCarouselView.F;
        if (eVar3 == null) {
            q qVar = closeupCarouselView.B;
            if (qVar == null) {
                Intrinsics.r("networkStateStream");
                throw null;
            }
            f0 f0Var = closeupCarouselView.f35437x;
            if (f0Var == null) {
                Intrinsics.r("pinalyticsFactory");
                throw null;
            }
            boolean z16 = closeupCarouselView.f35429p;
            boolean z17 = closeupCarouselView.f35431r;
            String str = closeupCarouselView.I;
            i2 i2Var = closeupCarouselView.f35439z;
            if (i2Var == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            w wVar = closeupCarouselView.A;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            l2 l2Var = closeupCarouselView.f35438y;
            if (l2Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            p2 p2Var = closeupCarouselView.D;
            if (p2Var == null) {
                Intrinsics.r("carouselAdsExperiments");
                throw null;
            }
            e eVar4 = new e(images, qVar, d4Var2, a4Var2, f0Var, z16, z17, str, i2Var, wVar, l2Var, p2Var, closeupCarouselView.f35432s);
            closeupCarouselView.F = eVar4;
            eVar3 = eVar4;
        }
        closeupCarouselView.E.d(closeupCarouselView, eVar3);
        closeupCarouselView.f35423j = images.size();
        m21.a aVar = (m21.a) images.get(0);
        iv.e eVar5 = closeupCarouselView.f35433t;
        if ((eVar5 == null || !eVar5.f73727b) && !closeupCarouselView.f35430q) {
            l(closeupCarouselView, aVar.i(), aVar.j(), null, f14, 4);
            return;
        }
        boolean z18 = closeupCarouselView.f35430q;
        float f15 = z18 ? 1.0f : 0.8f;
        c cVar = new c(aVar.j(), aVar.i(), z18 ? com.bumptech.glide.c.G() : hf0.b.j(closeupCarouselView.getContext()), hf0.b.g(closeupCarouselView.getContext()), f15, f15, z18 ? 1.0f : 0.6f);
        bb2.b W0 = dl2.b.W0(cVar);
        boolean z19 = closeupCarouselView.f35430q;
        float f16 = W0.f22591a;
        l(closeupCarouselView, closeupCarouselView.f35430q ? aVar.i() : W0.f22592b, z19 ? aVar.j() : f16, Float.valueOf(f16), null, 8);
        closeupCarouselView.f35434u = cVar;
    }

    public static void l(CloseupCarouselView closeupCarouselView, float f13, float f14, Float f15, Float f16, int i13) {
        float G;
        float f17;
        if ((i13 & 4) != 0) {
            f15 = null;
        }
        if ((i13 & 8) != 0) {
            f16 = null;
        }
        if (f15 != null) {
            G = f15.floatValue();
        } else if (closeupCarouselView.f35430q) {
            G = com.bumptech.glide.c.G();
        } else {
            c cVar = closeupCarouselView.f35434u;
            G = (hf0.b.q() ? com.bumptech.glide.c.G() : hf0.b.j(closeupCarouselView.getContext())) * (cVar != null ? cVar.f22598f : 1.0f);
        }
        float f18 = G / f14;
        Float S0 = bs1.c.S0(G, f16);
        if (S0 != null) {
            f17 = S0.floatValue();
        } else {
            float f19 = hf0.b.f69001a;
            f17 = (f13 / f19) * f18 * f19;
        }
        closeupCarouselView.f35422i = f17;
        if (closeupCarouselView.getLayoutParams().height <= 0 || closeupCarouselView.getLayoutParams().height >= ((int) closeupCarouselView.f35422i) || !closeupCarouselView.H) {
            closeupCarouselView.getLayoutParams().height = (int) closeupCarouselView.f35422i;
            closeupCarouselView.requestLayout();
        }
    }

    public final a0 b() {
        View childAt = getPinterestRecyclerView().f52531a.getChildAt(this.f35424k);
        if (childAt instanceof a0) {
            return (a0) childAt;
        }
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return d0Var != null ? new m[]{new f(clock, d0Var, null, null, Integer.valueOf(this.f35423j), this.K)} : super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        final cp.b bVar = new cp.b(this, 2);
        getContext();
        PinterestLinearLayoutManager layoutManager = new PinterestLinearLayoutManager(bVar) { // from class: com.pinterest.ads.onetap.view.CloseupCarouselView$createLayoutManagerContract$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final void W0(RecyclerView recyclerView, w2 w2Var, int i14) {
                m1 m1Var = new m1(5, recyclerView != null ? recyclerView.getContext() : null, CloseupCarouselView.this);
                m1Var.f19651a = i14;
                X0(m1Var);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final int t1(w2 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return 1;
            }
        };
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    public final void e() {
        a0 b13 = b();
        if (b13 != null) {
            PinterestVideoView pinterestVideoView = b13.f47367l;
            if (pinterestVideoView != null) {
                i.a(pinterestVideoView);
            }
            Unit unit = Unit.f80348a;
        }
    }

    public final void g(int i13) {
        if (this.f35435v == null) {
            k kVar = new k(false, 0, 0, getResources().getDimensionPixelSize(i13), 0);
            getPinterestRecyclerView().a(kVar);
            this.f35435v = kVar;
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f35417d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return this.f35421h > 0 ? zv1.b.view_rounded_carousel_recycler_view : zv1.b.view_normal_carousel_recycler_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return zv1.a.horizontal_recycler;
    }

    public final void m(GradientDrawable gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Iterator it = this.M.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            WeakReference weakReference = (WeakReference) next;
            if (weakReference.get() == null) {
                it.remove();
            } else if (((a0) weakReference.get()) != null) {
                Intrinsics.checkNotNullParameter(gradient, "gradient");
            }
        }
    }

    public final void n(int i13) {
        SimplePlayerControlView simplePlayerControlView;
        Iterator it = this.M.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            WeakReference weakReference = (WeakReference) next;
            if (weakReference.get() == null) {
                it.remove();
            } else {
                a0 a0Var = (a0) weakReference.get();
                if (a0Var != null) {
                    PinterestVideoView pinterestVideoView = a0Var.f47367l;
                    ViewGroup.LayoutParams layoutParams = (pinterestVideoView == null || (simplePlayerControlView = pinterestVideoView.F) == null) ? null : simplePlayerControlView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = i13;
                    }
                }
            }
        }
    }

    public final void o(int i13) {
        PinterestVideoView pinterestVideoView;
        SimplePlayerControlView simplePlayerControlView;
        LinearLayout linearLayout;
        Iterator it = this.M.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            WeakReference weakReference = (WeakReference) next;
            if (weakReference.get() == null) {
                it.remove();
            } else {
                a0 a0Var = (a0) weakReference.get();
                if (a0Var != null && (pinterestVideoView = a0Var.f47367l) != null && (simplePlayerControlView = pinterestVideoView.F) != null && (linearLayout = (LinearLayout) simplePlayerControlView.findViewById(h0.exo_controller_placeholder)) != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = null;
                    FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams3 != null) {
                        layoutParams3.bottomMargin = i13;
                        layoutParams2 = layoutParams3;
                    }
                    linearLayout.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (i13 == 24 || i13 == 25) {
            RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
            Iterator it = d7.b.O(recyclerView).iterator();
            while (it.hasNext()) {
                ((View) it.next()).onKeyDown(i13, keyEvent);
            }
        }
        return super.onKeyDown(i13, keyEvent);
    }

    public final void q() {
        a0 b13 = b();
        if (b13 != null) {
            PinterestVideoView pinterestVideoView = b13.f47367l;
            if (pinterestVideoView != null) {
                pinterestVideoView.play();
            }
            Unit unit = Unit.f80348a;
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, new iv.b(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, new iv.b(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO, new iv.b(this, 2));
    }

    public final void s(int i13) {
        Iterator it = this.M.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            WeakReference weakReference = (WeakReference) next;
            if (weakReference.get() == null) {
                it.remove();
            } else {
                a0 a0Var = (a0) weakReference.get();
                if (a0Var != null) {
                    PinterestVideoView pinterestVideoView = a0Var.f47367l;
                    SimplePlayerControlView simplePlayerControlView = pinterestVideoView != null ? pinterestVideoView.F : null;
                    if (simplePlayerControlView != null) {
                        simplePlayerControlView.setY(i13);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPinterestRecyclerView().f52531a.setOnTouchListener(listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseupCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z13 = true;
        this.f35417d = xk2.m.b(iv.a.f73722i);
        this.f35418e = 150.0f;
        this.f35419f = true;
        r70.b bottomNavBarState = r70.b.f106349i.k0();
        Intrinsics.checkNotNullParameter(bottomNavBarState, "bottomNavBarState");
        new ArrayList();
        new Rect();
        this.f35432s = true;
        j a13 = j.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.E = a13;
        l2 l2Var = this.f35438y;
        if (l2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = lh0.a4.f83297a;
        g1 g1Var = (g1) l2Var.f83417a;
        if (!g1Var.o("closeup_redesign_letterboxing_and_visit_cta_android", "enabled", z3Var) && !g1Var.l("closeup_redesign_letterboxing_and_visit_cta_android") && hf0.b.q()) {
            l2 l2Var2 = this.f35438y;
            if (l2Var2 == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            g1 g1Var2 = (g1) l2Var2.f83417a;
            if (!g1Var2.o("closeup_redesign_tablet_android", "enabled", z3Var) && !g1Var2.l("closeup_redesign_tablet_android")) {
                z13 = false;
            }
        }
        this.H = z13;
        this.M = new HashSet();
        new n1().b(getPinterestRecyclerView().f52531a);
        setContentDescription(bs1.c.d2(context, x0.closeup_click_view_description));
        getPinterestRecyclerView().b(new c0(this, 4));
        View findViewById = findViewById(zv1.a.carousel_flashlight_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        gestaltIconButton.u(new xo.k(this, 23));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.G = gestaltIconButton;
    }
}
