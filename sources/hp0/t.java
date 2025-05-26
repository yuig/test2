package hp0;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.feature.closeup.qcm.drawer.carousel.QcmDrawerCarouselLayoutManager;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.x3;
import java.util.WeakHashMap;
import kh2.a1;
import kh2.n3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lb.l0;
import q5.m0;
import q5.v0;
import so.o1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhp0/t;", "Lmm1/l;", "<init>", "()V", "lp2/b", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t extends a {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public uk1.e f69865g0;

    /* renamed from: h0, reason: collision with root package name */
    public o1 f69866h0;

    /* renamed from: i0, reason: collision with root package name */
    public yk1.j f69867i0;

    /* renamed from: j0, reason: collision with root package name */
    public hs.d f69868j0;

    /* renamed from: k0, reason: collision with root package name */
    public zy.a0 f69869k0 = new zy.a0();

    /* renamed from: l0, reason: collision with root package name */
    public final m1 f69870l0;

    /* renamed from: m0, reason: collision with root package name */
    public b f69871m0;

    /* renamed from: n0, reason: collision with root package name */
    public ViewPager2 f69872n0;

    /* renamed from: o0, reason: collision with root package name */
    public ek2.j f69873o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f69874p0;

    /* renamed from: q0, reason: collision with root package name */
    public final xk2.v f69875q0;

    /* renamed from: r0, reason: collision with root package name */
    public final xk2.v f69876r0;

    /* renamed from: s0, reason: collision with root package name */
    public final xk2.v f69877s0;

    /* renamed from: t0, reason: collision with root package name */
    public final xk2.v f69878t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltIconButton f69879u0;

    /* renamed from: v0, reason: collision with root package name */
    public jp0.b f69880v0;

    /* renamed from: w0, reason: collision with root package name */
    public FrameLayout f69881w0;

    /* renamed from: x0, reason: collision with root package name */
    public final xk2.v f69882x0;

    /* renamed from: y0, reason: collision with root package name */
    public final d4 f69883y0;

    /* renamed from: z0, reason: collision with root package name */
    public final g0 f69884z0;

    public t() {
        int i13 = 5;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ca0.b0(13, new kl0.w(this, i13)));
        int i14 = 4;
        this.f69870l0 = a1.s(this, k0.f80436a.b(f0.class), new ml0.v(a13, i14), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.f69871m0 = new b();
        this.f69875q0 = xk2.m.b(new m(this, i14));
        this.f69876r0 = xk2.m.b(new m(this, 1));
        this.f69877s0 = xk2.m.b(l.f69853i);
        this.f69878t0 = xk2.m.b(new m(this, 2));
        this.f69882x0 = xk2.m.b(new m(this, 3));
        this.f69883y0 = d4.PIN;
        this.f69884z0 = g0.ADS_QCM_DRAWER;
    }

    @Override // nl1.d
    public final void K7() {
        hs.d dVar = this.f69868j0;
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
            mj.m mVar = new mj.m(7);
            WeakHashMap weakHashMap = v0.f102521a;
            m0.n(findViewById, mVar);
        }
        jp0.b bVar = this.f69880v0;
        if (bVar == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        bVar.onActivated();
        super.K7();
    }

    @Override // nl1.d
    public final void L7() {
        hs.d dVar = this.f69868j0;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        if (dVar.a() && (!hf0.b.q() || !hf0.b.m())) {
            FragmentActivity requireActivity = requireActivity();
            l0.j1(requireActivity.getWindow(), true);
            pk.a0.d1(requireActivity);
            View findViewById = requireActivity.getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            WeakHashMap weakHashMap = v0.f102521a;
            m0.n(findViewById, null);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = 0;
            findViewById.setLayoutParams(layoutParams2);
        }
        super.L7();
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(ps.q.fragment_qcm_drawer, false, 50, 0, true, false, new m(this, 0), 584);
    }

    public final void d8(int i13, int i14) {
        jp0.b bVar = this.f69880v0;
        if (bVar == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        int height = (bVar.getHeight() - i14) / 2;
        FrameLayout frameLayout = this.f69881w0;
        if (frameLayout == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        View view = new View(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.topMargin = height;
        layoutParams.gravity = 8388611;
        view.setLayoutParams(layoutParams);
        final int i15 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: hp0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f69841b;

            {
                this.f69841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                t this$0 = this.f69841b;
                switch (i16) {
                    case 0:
                        int i17 = t.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ViewPager2 viewPager2 = this$0.f69872n0;
                        if (viewPager2 == null) {
                            Intrinsics.r("viewPager");
                            throw null;
                        }
                        int i18 = viewPager2.f19924d;
                        if (i18 > 0) {
                            if (viewPager2 != null) {
                                viewPager2.i(i18 - 1, true);
                                return;
                            } else {
                                Intrinsics.r("viewPager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i19 = t.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ViewPager2 viewPager22 = this$0.f69872n0;
                        if (viewPager22 == null) {
                            Intrinsics.r("viewPager");
                            throw null;
                        }
                        int i23 = viewPager22.f19924d;
                        if (i23 < ((lp0.b) this$0.f69875q0.getValue()).f84242g.size()) {
                            ViewPager2 viewPager23 = this$0.f69872n0;
                            if (viewPager23 != null) {
                                viewPager23.i(i23 + 1, true);
                                return;
                            } else {
                                Intrinsics.r("viewPager");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        frameLayout.addView(view);
        FrameLayout frameLayout2 = this.f69881w0;
        if (frameLayout2 == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        View view2 = new View(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i13, i14);
        layoutParams2.topMargin = height;
        layoutParams2.gravity = 8388613;
        view2.setLayoutParams(layoutParams2);
        final int i16 = 1;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: hp0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f69841b;

            {
                this.f69841b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                int i162 = i16;
                t this$0 = this.f69841b;
                switch (i162) {
                    case 0:
                        int i17 = t.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ViewPager2 viewPager2 = this$0.f69872n0;
                        if (viewPager2 == null) {
                            Intrinsics.r("viewPager");
                            throw null;
                        }
                        int i18 = viewPager2.f19924d;
                        if (i18 > 0) {
                            if (viewPager2 != null) {
                                viewPager2.i(i18 - 1, true);
                                return;
                            } else {
                                Intrinsics.r("viewPager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i19 = t.A0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ViewPager2 viewPager22 = this$0.f69872n0;
                        if (viewPager22 == null) {
                            Intrinsics.r("viewPager");
                            throw null;
                        }
                        int i23 = viewPager22.f19924d;
                        if (i23 < ((lp0.b) this$0.f69875q0.getValue()).f84242g.size()) {
                            ViewPager2 viewPager23 = this$0.f69872n0;
                            if (viewPager23 != null) {
                                viewPager23.i(i23 + 1, true);
                                return;
                            } else {
                                Intrinsics.r("viewPager");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        frameLayout2.addView(view2);
    }

    public final void e8(View view) {
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
            e8((View) parent);
        }
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        return i0.a(super.generateLoggingContext(), null, null, this.f69884z0, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF73409e1() {
        return this.f69884z0;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f69869k0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f69883y0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j1.U0(com.bumptech.glide.d.Z(this, "EXTRA_BOTTOM_SHEET_SELECTED_ITEM_ID", ""));
        f0 f0Var = (f0) this.f69870l0.getValue();
        String Z = com.bumptech.glide.d.Z(this, "EXTRA_BOTTOM_SHEET_SELECTED_ITEM_ID", "");
        i0 generateLoggingContext = generateLoggingContext();
        String f13 = this.f69869k0.f();
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        f0Var.h(f49940b != null ? f49940b : "", Z, generateLoggingContext, f13);
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ek2.j jVar = this.f69873o0;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(ps.p.qcm_drawer_root_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f69881w0 = (FrameLayout) findViewById;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        nx.d0 s73 = s7();
        xk2.v vVar = this.f69877s0;
        jp0.b bVar = new jp0.b(requireContext, s73, n3.p(((Number) vVar.getValue()).intValue(), bs1.c.X(this, ps.n.ads_qcm_drawer_carousel_item_width)));
        bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f69880v0 = bVar;
        FrameLayout frameLayout = this.f69881w0;
        AttributeSet attributeSet = null;
        if (frameLayout == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        frameLayout.addView(bVar);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, requireContext2, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i13 = 0;
        layoutParams.setMargins(bs1.c.W(gestaltIconButton, eo1.c.space_200), bs1.c.W(gestaltIconButton, eo1.c.space_200), 0, 0);
        gestaltIconButton.setLayoutParams(layoutParams);
        gestaltIconButton.t(k.f69846k);
        FrameLayout frameLayout2 = this.f69881w0;
        if (frameLayout2 == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        frameLayout2.addView(gestaltIconButton);
        this.f69879u0 = gestaltIconButton;
        View findViewById2 = v13.findViewById(ps.p.qcm_view_pager);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f69872n0 = (ViewPager2) findViewById2;
        bs1.c.X0(v13.findViewById(tk1.a.gestalt_sheet_header));
        Z7(k.f69845j);
        xb0.a listener = new xb0.a(this, 26);
        Intrinsics.checkNotNullParameter(listener, "listener");
        mm1.k kVar = this.f87627c0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.e(listener);
        GestaltIconButton gestaltIconButton2 = this.f69879u0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("cancelButton");
            throw null;
        }
        gestaltIconButton2.u(new yb0.b(this, 29));
        yk1.j jVar = this.f69867i0;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        jp0.b bVar2 = this.f69880v0;
        if (bVar2 == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        jVar.d(bVar2, (ip0.a) this.f69876r0.getValue());
        jp0.b bVar3 = this.f69880v0;
        if (bVar3 == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        int p13 = n3.p(((Number) vVar.getValue()).intValue(), bs1.c.W(bVar3, ps.n.ads_qcm_drawer_carousel_item_width));
        RecyclerView recyclerView = bVar3.getPinterestRecyclerView().f52531a;
        int i14 = 9;
        cr.d dVar = new cr.d(9);
        Context context = bVar3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.R2(new QcmDrawerCarouselLayoutManager(dVar, context, new g4.u(1), p13));
        e8(bVar3);
        RecyclerView recyclerView2 = bVar3.getPinterestRecyclerView().f52531a;
        recyclerView2.f19248q.add(new j(bVar3, this));
        ViewPager2 viewPager2 = this.f69872n0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        viewPager2.k(1);
        viewPager2.h((lp0.b) this.f69875q0.getValue());
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(this, null), 3);
        uk2.d dVar2 = gb2.f.f64748b;
        qt.a aVar = new qt.a(9, k.f69847l);
        dVar2.getClass();
        xj2.c F = new jk2.j1(pk2.f.j(new jk2.j1(dVar2, aVar, i13), new qt.b(9, k.f69848m), 2, "filter(...)"), new qk0.b(i14, k.f69849n), i13).F(new go0.j(23, new r(this, i13)), new go0.j(24, k.f69850o), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f69873o0 = (ek2.j) F;
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f69869k0.e().f67083c;
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
