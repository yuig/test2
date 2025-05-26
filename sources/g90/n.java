package g90;

import a.m2;
import a.sc;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.collage.cutoutcloseup.layoutmanager.CollagesCarouselLayoutManager;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.x3;
import java.util.HashMap;
import java.util.WeakHashMap;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lb.l0;
import mq.f0;
import q5.m0;
import q5.v0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg90/n;", "Lmm1/l;", "<init>", "()V", "cutoutCloseup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n extends d0 {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f64537w0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public wk2.a f64538g0;

    /* renamed from: h0, reason: collision with root package name */
    public pb0.a f64539h0;

    /* renamed from: i0, reason: collision with root package name */
    public nx.k f64540i0;

    /* renamed from: j0, reason: collision with root package name */
    public hs.d f64541j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f64542k0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltIconButton f64544m0;

    /* renamed from: n0, reason: collision with root package name */
    public CutoutCarouselView f64545n0;

    /* renamed from: o0, reason: collision with root package name */
    public ViewPager f64546o0;

    /* renamed from: q0, reason: collision with root package name */
    public final m1 f64548q0;

    /* renamed from: r0, reason: collision with root package name */
    public zy.a0 f64549r0;

    /* renamed from: s0, reason: collision with root package name */
    public a f64550s0;

    /* renamed from: t0, reason: collision with root package name */
    public final d4 f64551t0;

    /* renamed from: u0, reason: collision with root package name */
    public final a4 f64552u0;

    /* renamed from: v0, reason: collision with root package name */
    public final g0 f64553v0;

    /* renamed from: l0, reason: collision with root package name */
    public final xk2.v f64543l0 = xk2.m.b(new k(this, 2));

    /* renamed from: p0, reason: collision with root package name */
    public final xk2.v f64547p0 = xk2.m.b(new k(this, 3));

    public n() {
        xk2.k q13 = jq.b.q(17, new q1(this, 16), xk2.n.NONE);
        int i13 = 15;
        this.f64548q0 = a1.s(this, k0.f80436a.b(c0.class), new mq.e0(q13, i13), new f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.f64549r0 = new zy.a0();
        this.f64550s0 = new a();
        this.f64551t0 = d4.PIN;
        this.f64552u0 = a4.PIN_SHUFFLE_CUTOUT;
        this.f64553v0 = g0.PIN_CLOSEUP;
    }

    @Override // mm1.l
    public final mm1.d b8() {
        int i13 = a90.d.fragment_cutout_closeup;
        f8();
        return new mm1.d(i13, true, 60, f8() ? 60 : 95, true, true, new k(this, 1), 704);
    }

    public final void d8(View view) {
        if (Intrinsics.d(view, getView()) || view.getParent() == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        if (view.getParent() instanceof View) {
            Object parent = view.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            d8((View) parent);
        }
    }

    public final String e8() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        return f49940b == null ? "" : f49940b;
    }

    public final boolean f8() {
        return com.bumptech.glide.d.G(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_IS_COLLAGE_AD", false);
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        return this.f64549r0.e();
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        return z0.f(new Pair("pin_id", e8()), new Pair("shuffle_asset_id", com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ID", "")));
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getV0() {
        return this.f64553v0;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f64549r0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF103167r0() {
        return this.f64552u0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF73869c0() {
        return this.f64551t0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(((c0) this.f64548q0.getValue()).c(), 18);
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hs.d dVar = this.f64541j0;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        if (dVar.a() && (!hf0.b.q() || !hf0.b.m())) {
            FragmentActivity requireActivity = requireActivity();
            l0.j1(requireActivity.getWindow(), false);
            if (requireActivity.getWindow().getStatusBarColor() != 0) {
                requireActivity.getWindow().setStatusBarColor(0);
            }
            Window window = requireActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            pk.a0.f1(window);
            View findViewById = requireActivity.getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            sc scVar = new sc(24);
            WeakHashMap weakHashMap = v0.f102521a;
            m0.n(findViewById, scVar);
        }
        if (this.f64539h0 == null) {
            Intrinsics.r("clock");
            throw null;
        }
        this.f64542k0 = System.currentTimeMillis();
        c0 c0Var = (c0) this.f64548q0.getValue();
        String e83 = e8();
        String Z = com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ID", "");
        c0Var.h(com.bumptech.glide.d.i0(this.f64553v0, this.f64552u0, this.f64551t0, ""), e83, Z, this.f64549r0.f(), e8(), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_ROOT_PIN_ID", ""), f8());
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(a90.c.cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f64544m0 = (GestaltIconButton) findViewById;
        View findViewById2 = v13.findViewById(a90.c.cutout_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f64545n0 = (CutoutCarouselView) findViewById2;
        View findViewById3 = v13.findViewById(a90.c.cutouts_view_pager);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f64546o0 = (ViewPager) findViewById3;
        bs1.c.X0(v13.findViewById(tk1.a.gestalt_sheet_header));
        Z7(i.f64528i);
        int i13 = 0;
        j listener = new j(this, i13);
        Intrinsics.checkNotNullParameter(listener, "listener");
        mm1.k kVar = this.f87627c0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.a(listener);
        k listener2 = new k(this, i13);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        mm1.k kVar2 = this.f87627c0;
        if (kVar2 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar2.d(listener2);
        GestaltIconButton gestaltIconButton = this.f64544m0;
        if (gestaltIconButton == null) {
            Intrinsics.r("cancelButton");
            throw null;
        }
        gestaltIconButton.u(new xo.k(this, 26));
        CutoutCarouselView cutoutCarouselView = this.f64545n0;
        if (cutoutCarouselView == null) {
            Intrinsics.r("cutoutCarousel");
            throw null;
        }
        int q13 = kg.t.q(com.bumptech.glide.d.O(this, "EXTRA_COLLAGES_SHUFFLE_WIDTH", hf0.b.f69002b), bs1.c.W(cutoutCarouselView, a90.a.collages_bottom_sheet_carousel_item_width));
        cr.d dVar = new cr.d(7);
        Context context = cutoutCarouselView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cutoutCarouselView.R2(new CollagesCarouselLayoutManager(dVar, context, new g4.u(0), q13, d90.a.LINEAR));
        cutoutCarouselView.setTranslationY(-bs1.c.W(cutoutCarouselView, a90.a.collages_bottom_sheet_top_margin_collapsed_mode));
        cutoutCarouselView.H2(new b90.b(q13, true));
        cutoutCarouselView.setOnTouchListener(new m2(this, 4));
        d8(cutoutCarouselView);
        ViewPager viewPager = this.f64546o0;
        if (viewPager == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        viewPager.D(1);
        Object value = this.f64547p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        viewPager.z((r) value);
        int W = bs1.c.W(viewPager, a90.a.collages_bottom_sheet_viewpager_margin);
        int i14 = viewPager.f19900m;
        viewPager.f19900m = W;
        int width = viewPager.getWidth();
        viewPager.v(width, width, W, i14);
        viewPager.requestLayout();
        kh2.b0.D1(this, new m(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f64549r0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
