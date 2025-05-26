package b01;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.v1;
import ca0.b0;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import h32.a4;
import h32.d4;
import h32.u0;
import is1.x;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import nx.f0;
import so.p1;
import uj2.a0;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb01/l;", "Lwk1/k;", "Ldl1/s;", "Lb01/q;", "Lnr0/j;", "Lh01/b;", "Lb01/b;", "<init>", "()V", "vo/i", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends a<s> implements q, h01.b, b {

    /* renamed from: r1, reason: collision with root package name */
    public static final /* synthetic */ int f20744r1 = 0;
    public f0 R0;
    public p1 S0;
    public i92.k T0;
    public e01.a U0;
    public hf0.c V0;
    public v1 W0;
    public List Y0;
    public View Z0;

    /* renamed from: a1, reason: collision with root package name */
    public LinearLayout f20745a1;

    /* renamed from: b1, reason: collision with root package name */
    public GestaltIconButton f20746b1;

    /* renamed from: c1, reason: collision with root package name */
    public GestaltText f20747c1;

    /* renamed from: d1, reason: collision with root package name */
    public GestaltIconButton f20748d1;

    /* renamed from: e1, reason: collision with root package name */
    public c0 f20749e1;

    /* renamed from: f1, reason: collision with root package name */
    public a01.b f20750f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f20751g1;

    /* renamed from: h1, reason: collision with root package name */
    public Integer f20752h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f20753i1;

    /* renamed from: o1, reason: collision with root package name */
    public x f20759o1;
    public String X0 = "";

    /* renamed from: j1, reason: collision with root package name */
    public final v f20754j1 = xk2.m.b(new f(this, 0));

    /* renamed from: k1, reason: collision with root package name */
    public final v f20755k1 = xk2.m.b(new f(this, 2));

    /* renamed from: l1, reason: collision with root package name */
    public String f20756l1 = "";

    /* renamed from: m1, reason: collision with root package name */
    public final d4 f20757m1 = d4.PEAR_INSIGHT;

    /* renamed from: n1, reason: collision with root package name */
    public final a4 f20758n1 = a4.PEAR_STYLE_SUMMARY;

    /* renamed from: p1, reason: collision with root package name */
    public final rw0.f f20760p1 = rw0.f.f();

    /* renamed from: q1, reason: collision with root package name */
    public final k f20761q1 = new k(this);

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        if (qy1.d.a(requireContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            f7().h(this.f20761q1);
            j0 j0Var = new j0();
            fk2.g gVar = new fk2.g(new dp.a(29, j0Var, this), 3);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            a0 a0Var = tk2.e.f118017c;
            R6(gVar.m(5L, timeUnit, a0Var).l(a0Var).h(wj2.c.a()).i(new fp.a(17, j0Var, this), new hx0.a(28, h.f20739k)));
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        x xVar = this.f20759o1;
        if (xVar != null) {
            xVar.b();
        }
        f7().j(this.f20761q1);
        super.L7();
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(0, new g(this));
        adapter.G(1, new f(this, 3));
        adapter.G(2, new f(this, 4));
        adapter.G(3, new f(this, 5));
        adapter.G(9, new f(this, 6));
        adapter.G(8, new f(this, 7));
        adapter.G(10, new i(this));
        j creatorLambda = new j(this);
        Intrinsics.checkNotNullParameter(creatorLambda, "creatorLambda");
        adapter.f139765k.j(11, new yq0.f(new b0(14, creatorLambda)));
    }

    @Override // h01.b
    public final void T5() {
        this.f20751g1 = true;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        p1 p1Var = this.S0;
        if (p1Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_INSIGHT_ID", "");
        f0 f0Var = this.R0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_INSIGHT_ID", "");
        String Z3 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_REFERRER", "");
        if (Z3.length() == 0) {
            Z3 = "unknown";
        }
        f fVar = new f(this, 1);
        return p1Var.a(new yz0.a(f0Var, this.f20757m1, this.f20758n1, Z2, Z3, fVar), Z);
    }

    @Override // h01.b
    public final void a2() {
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return 2;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF45060f() {
        return this.f20758n1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF45059e() {
        return this.f20757m1;
    }

    public final e01.a j9() {
        e01.a aVar = this.U0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("shareUtil");
        throw null;
    }

    public final void k9(boolean z13) {
        om1.f fVar = z13 ? om1.f.TRANSPARENT_DARK_GRAY : om1.f.TRANSPARENT_ALWAYS_LIGHT;
        GestaltIconButton gestaltIconButton = this.f20746b1;
        if (gestaltIconButton == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        gestaltIconButton.t(new kl0.s(fVar, 3));
        GestaltIconButton gestaltIconButton2 = this.f20748d1;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("shareButton");
            throw null;
        }
        gestaltIconButton2.t(new kl0.s(fVar, 4));
        GestaltText gestaltText = this.f20747c1;
        if (gestaltText == null) {
            Intrinsics.r("toolbarTitle");
            throw null;
        }
        gestaltText.i(new dv0.n(z13, 14));
        LinearLayout linearLayout = this.f20745a1;
        if (linearLayout == null) {
            Intrinsics.r("topToolbar");
            throw null;
        }
        linearLayout.setBackgroundColor(z13 ? bs1.c.C(this, eo1.b.color_themed_background_default) : bs1.c.C(this, eo1.b.color_themed_transparent));
        LinearLayout linearLayout2 = this.f20745a1;
        if (linearLayout2 == null) {
            Intrinsics.r("topToolbar");
            throw null;
        }
        linearLayout2.setElevation(z13 ? bs1.c.X(this, eo1.c.space_200) : 0.0f);
        if (z13) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            pk.a0.d1(requireActivity);
        } else {
            Window window = requireActivity().getWindow();
            window.setStatusBarColor(0);
            pk.a0.f1(window);
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(iy1.e.fragment_pear_style_summary_v2, iy1.d.p_recycler_view);
        eVar.b(iy1.d.loading_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.f20756l1.length() > 0) {
            new File(this.f20756l1).delete();
        }
        c0 c0Var = this.f20749e1;
        if (c0Var == null) {
            Intrinsics.r("onScrollListener");
            throw null;
        }
        A8(c0Var);
        x xVar = this.f20759o1;
        if (xVar != null) {
            xVar.b();
        }
        f7().j(this.f20761q1);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        FragmentActivity requireActivity = requireActivity();
        Integer num = this.f20752h1;
        if (num != null) {
            requireActivity.getWindow().getDecorView().setSystemUiVisibility(num.intValue());
        }
        Intrinsics.f(requireActivity);
        pk.a0.d1(requireActivity);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Window window = requireActivity().getWindow();
        this.f20752h1 = Integer.valueOf(window.getDecorView().getSystemUiVisibility());
        window.getDecorView().setSystemUiVisibility(1280);
        if (this.f20753i1) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            pk.a0.d1(requireActivity);
        } else {
            Window window2 = requireActivity().getWindow();
            window2.setStatusBarColor(0);
            pk.a0.f1(window2);
        }
        if (this.f20751g1) {
            this.f20751g1 = false;
            i92.k kVar = this.T0;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar.k(kk1.d.product_feedback_thank_you);
            a01.b bVar = this.f20750f1;
            if (bVar != null) {
                bVar.t3();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(iy1.d.cover_pin_carousel_one);
        ((AnimatedPinVerticalCarouselView) findViewById).b(8000.0f);
        Unit unit = Unit.f80348a;
        final int i13 = 0;
        View findViewById2 = v13.findViewById(iy1.d.cover_pin_carousel_two);
        ((AnimatedPinVerticalCarouselView) findViewById2).b(9143.0f);
        final int i14 = 1;
        View findViewById3 = v13.findViewById(iy1.d.cover_pin_carousel_three);
        ((AnimatedPinVerticalCarouselView) findViewById3).b(10667.0f);
        View findViewById4 = v13.findViewById(iy1.d.cover_pin_carousel_four);
        ((AnimatedPinVerticalCarouselView) findViewById4).b(12800.0f);
        this.Y0 = kotlin.collections.f0.j(findViewById, findViewById2, findViewById3, findViewById4);
        View findViewById5 = v13.findViewById(iy1.d.cover_pin_overlay_top);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.Z0 = findViewById5;
        View findViewById6 = v13.findViewById(iy1.d.top_toolbar_container);
        LinearLayout linearLayout = (LinearLayout) findViewById6;
        Intrinsics.f(linearLayout);
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), hf0.b.f(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f20745a1 = linearLayout;
        View findViewById7 = v13.findViewById(iy1.d.back_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById7;
        gestaltIconButton.u(new gm1.a(this) { // from class: b01.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f20734b;

            {
                this.f20734b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                l this$0 = this.f20734b;
                switch (i15) {
                    case 0:
                        int i16 = l.f20744r1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            c0.d.u2(this$0.s7(), null, null, u0.BACK_BUTTON, null, 11);
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i17 = l.f20744r1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            c0.d.u2(this$0.s7(), null, null, u0.PEAR_SHARE_BUTTON, null, 11);
                            a01.b bVar = this$0.f20750f1;
                            if (bVar != null) {
                                bVar.v3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f20746b1 = gestaltIconButton;
        View findViewById8 = v13.findViewById(iy1.d.top_toolbar_title);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f20747c1 = (GestaltText) findViewById8;
        View findViewById9 = v13.findViewById(iy1.d.share_button);
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById9;
        gestaltIconButton2.u(new gm1.a(this) { // from class: b01.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f20734b;

            {
                this.f20734b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                l this$0 = this.f20734b;
                switch (i15) {
                    case 0:
                        int i16 = l.f20744r1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            c0.d.u2(this$0.s7(), null, null, u0.BACK_BUTTON, null, 11);
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i17 = l.f20744r1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            c0.d.u2(this$0.s7(), null, null, u0.PEAR_SHARE_BUTTON, null, 11);
                            a01.b bVar = this$0.f20750f1;
                            if (bVar != null) {
                                bVar.v3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.f20748d1 = gestaltIconButton2;
        c0 c0Var = new c0(this, 16);
        b8(c0Var);
        this.f20749e1 = c0Var;
    }
}
