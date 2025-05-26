package ml0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import com.pinterest.feature.board.headerimage.WashedWebImageView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml0/w;", "Lo82/v2;", "<init>", "()V", "edit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w extends s0 {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f87509e1 = 0;
    public qa2.j0 L0;
    public t2 M0;
    public ni1.d0 N0;
    public final m1 O0;
    public GestaltButton P0;
    public BoardHeaderImageView Q0;
    public ScrollView R0;
    public BoardHeaderImageView S0;
    public HorizontalScrollView T0;
    public FrameLayout U0;
    public BoardHeaderImageView V0;
    public GestaltText W0;
    public FrameLayout X0;
    public WashedWebImageView Y0;
    public kk2.l Z0;

    /* renamed from: a1, reason: collision with root package name */
    public String f87510a1;

    /* renamed from: b1, reason: collision with root package name */
    public final l f87511b1;

    /* renamed from: c1, reason: collision with root package name */
    public final d4 f87512c1;

    /* renamed from: d1, reason: collision with root package name */
    public final a4 f87513d1;

    public w() {
        int i13 = 1;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ca0.b0(9, new kl0.w(this, i13)));
        this.O0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(r0.class), new v(a13, 0), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.f87511b1 = new l(this, i13);
        this.f87512c1 = d4.BOARD;
        this.f87513d1 = a4.BOARD_CHOOSE_HEADER;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(((r0) this.O0.getValue()).a(), 18);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(((r0) this.O0.getValue()).c(), 13);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.H(1001, new u(this, 0));
        int i13 = 1;
        adapter.H(1002, new u(this, i13));
        adapter.H(1000, new u(this, 2));
        adapter.H(1004, new u(this, 3));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        qa2.n f13 = kg.t.f(requireContext, s7());
        adapter.E(1003, dl2.b.m2(s7(), f13, new b10.z(26, this, f13)), new ol0.p(f13.f103320a, new m(this, i13), 0), n.f87480k);
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return (hf0.b.q() && hf0.b.m()) ? 5 : 3;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.f87513d1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.f87512c1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(d70.e.fragment_board_header_image_selector, d70.d.p_recycler_view);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87510a1 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", "");
        r0 r0Var = (r0) this.O0.getValue();
        String str = this.f87510a1;
        if (str != null) {
            r0Var.h(com.bumptech.glide.d.i0(null, this.f87513d1, this.f87512c1, ""), str);
        } else {
            Intrinsics.r("boardIdFromNavigation");
            throw null;
        }
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(d70.d.done_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        final int i13 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: ml0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f87466b;

            {
                this.f87466b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                w this$0 = this.f87466b;
                switch (i14) {
                    case 0:
                        int i15 = w.f87509e1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        FrameLayout frameLayout = this$0.U0;
                        if (frameLayout == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float scrollX = frameLayout.getScrollX();
                        BoardHeaderImageView boardHeaderImageView = this$0.V0;
                        if (boardHeaderImageView == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        float T = boardHeaderImageView.T() * scrollX;
                        FrameLayout frameLayout2 = this$0.U0;
                        if (frameLayout2 == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float scrollY = frameLayout2.getScrollY();
                        BoardHeaderImageView boardHeaderImageView2 = this$0.V0;
                        if (boardHeaderImageView2 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        float X = boardHeaderImageView2.X() * scrollY;
                        FrameLayout frameLayout3 = this$0.U0;
                        if (frameLayout3 == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float measuredWidth = frameLayout3.getMeasuredWidth();
                        BoardHeaderImageView boardHeaderImageView3 = this$0.V0;
                        if (boardHeaderImageView3 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        float T2 = boardHeaderImageView3.T() * measuredWidth;
                        FrameLayout frameLayout4 = this$0.U0;
                        if (frameLayout4 == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float measuredHeight = frameLayout4.getMeasuredHeight();
                        BoardHeaderImageView boardHeaderImageView4 = this$0.V0;
                        if (boardHeaderImageView4 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        kh2.j.x2((r0) this$0.O0.getValue(), new f(T, X, boardHeaderImageView4.X() * measuredHeight, T2));
                        return;
                    default:
                        int i16 = w.f87509e1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2((r0) this$0.O0.getValue(), d.f87445a);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.P0 = gestaltButton;
        View findViewById2 = v13.findViewById(d70.d.close_button);
        final int i14 = 1;
        ((GestaltIconButton) findViewById2).u(new gm1.a(this) { // from class: ml0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f87466b;

            {
                this.f87466b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                w this$0 = this.f87466b;
                switch (i142) {
                    case 0:
                        int i15 = w.f87509e1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        FrameLayout frameLayout = this$0.U0;
                        if (frameLayout == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float scrollX = frameLayout.getScrollX();
                        BoardHeaderImageView boardHeaderImageView = this$0.V0;
                        if (boardHeaderImageView == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        float T = boardHeaderImageView.T() * scrollX;
                        FrameLayout frameLayout2 = this$0.U0;
                        if (frameLayout2 == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float scrollY = frameLayout2.getScrollY();
                        BoardHeaderImageView boardHeaderImageView2 = this$0.V0;
                        if (boardHeaderImageView2 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        float X = boardHeaderImageView2.X() * scrollY;
                        FrameLayout frameLayout3 = this$0.U0;
                        if (frameLayout3 == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float measuredWidth = frameLayout3.getMeasuredWidth();
                        BoardHeaderImageView boardHeaderImageView3 = this$0.V0;
                        if (boardHeaderImageView3 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        float T2 = boardHeaderImageView3.T() * measuredWidth;
                        FrameLayout frameLayout4 = this$0.U0;
                        if (frameLayout4 == null) {
                            Intrinsics.r("scrollViewShowing");
                            throw null;
                        }
                        float measuredHeight = frameLayout4.getMeasuredHeight();
                        BoardHeaderImageView boardHeaderImageView4 = this$0.V0;
                        if (boardHeaderImageView4 == null) {
                            Intrinsics.r("imageShown");
                            throw null;
                        }
                        kh2.j.x2((r0) this$0.O0.getValue(), new f(T, X, boardHeaderImageView4.X() * measuredHeight, T2));
                        return;
                    default:
                        int i16 = w.f87509e1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2((r0) this$0.O0.getValue(), d.f87445a);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = v13.findViewById(d70.d.reposition_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.W0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(d70.d.board_header_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.X0 = (FrameLayout) findViewById4;
        View findViewById5 = v13.findViewById(d70.d.portrait_board_header_image);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.Q0 = (BoardHeaderImageView) findViewById5;
        View findViewById6 = v13.findViewById(d70.d.horizontal_board_header_image);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.S0 = (BoardHeaderImageView) findViewById6;
        View findViewById7 = v13.findViewById(d70.d.board_header_image_scroll_view);
        ScrollView scrollView = (ScrollView) findViewById7;
        l lVar = this.f87511b1;
        scrollView.setOnScrollChangeListener(lVar);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.R0 = scrollView;
        View findViewById8 = v13.findViewById(d70.d.horizontal_board_header_image_scroll_view);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById8;
        horizontalScrollView.setOnScrollChangeListener(lVar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.T0 = horizontalScrollView;
        ScrollView scrollView2 = this.R0;
        if (scrollView2 == null) {
            Intrinsics.r("scrollView");
            throw null;
        }
        this.U0 = scrollView2;
        BoardHeaderImageView boardHeaderImageView = this.Q0;
        if (boardHeaderImageView == null) {
            Intrinsics.r("selectedImage");
            throw null;
        }
        this.V0 = boardHeaderImageView;
        s sVar = new s(this, null);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(this, sVar, null), 3);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setOnScrollChangeListener(new l(this, i13));
        }
        View findViewById9 = v13.findViewById(d70.d.board_header_image_blur);
        WashedWebImageView washedWebImageView = (WashedWebImageView) findViewById9;
        int i15 = BoardHeaderImageView.f45270e;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        washedWebImageView.j(pe.i.y1(requireContext));
        washedWebImageView.g(new t(washedWebImageView, i13));
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.Y0 = washedWebImageView;
        if (pe.i.Z0()) {
            FrameLayout frameLayout = this.X0;
            if (frameLayout == null) {
                Intrinsics.r("scrollContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = 0;
            layoutParams.height = -2;
            frameLayout.setLayoutParams(layoutParams);
        }
    }
}
