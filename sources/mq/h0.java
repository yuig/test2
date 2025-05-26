package mq;

import ac2.o1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.b2;
import androidx.viewpager2.widget.ViewPager2;
import b11.o0;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.w0;
import h32.x3;
import i32.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import y01.m0;
import y01.n0;
import y01.q0;
import y01.t0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmq/h0;", "Lnl1/d;", "Lh42/e;", "Lcb2/e;", "Lml1/q;", "<init>", "()V", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h0 extends b implements h42.e, cb2.e, ml1.q {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f87984k0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public il1.a f87985c0;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f87986d0;

    /* renamed from: e0, reason: collision with root package name */
    public ViewPager2 f87987e0;

    /* renamed from: f0, reason: collision with root package name */
    public lh0.a0 f87988f0;

    /* renamed from: g0, reason: collision with root package name */
    public y01.g0 f87989g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f87990h0;

    /* renamed from: i0, reason: collision with root package name */
    public y01.h0 f87991i0;

    /* renamed from: j0, reason: collision with root package name */
    public final d4 f87992j0;

    public h0() {
        int i13 = 0;
        xk2.k q13 = jq.b.q(0, new q1(this, 1), xk2.n.NONE);
        this.f87986d0 = a1.s(this, k0.f80436a.b(y01.q1.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
        this.f87989g0 = y01.b0.f136385a;
        this.f87992j0 = d4.PIN_SWIPE_CONTAINER;
    }

    @Override // nl1.d
    public final x3 C7(String str) {
        x3 C7;
        if (this.f87990h0) {
            return super.C7(str);
        }
        nl1.d b83 = b8();
        return (b83 == null || (C7 = b83.C7(str)) == null) ? super.C7(str) : C7;
    }

    @Override // nl1.d
    public final a4 D7() {
        if (this.f87990h0) {
            return getF140468f0();
        }
        nl1.d b83 = b8();
        if (b83 != null) {
            return b83.getF140468f0();
        }
        return null;
    }

    @Override // nl1.d
    public final d4 E7() {
        d4 f140467e0;
        if (this.f87990h0) {
            return getF140467e0();
        }
        nl1.d b83 = b8();
        return (b83 == null || (f140467e0 = b83.getF140467e0()) == null) ? d4.ERROR : f140467e0;
    }

    @Override // nl1.d
    public final void K7() {
        super.K7();
        Context context = getContext();
        boolean z13 = false;
        if (context != null && pk.a0.G0(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            z13 = true;
        }
        ny1.f fVar = ny1.f.f92666f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ((l82.c) c8().c()).a(new y01.j0(isResumed(), z13, fVar.a(requireContext)));
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        if (viewPager2.getChildCount() != 0) {
            ViewPager2 viewPager22 = this.f87987e0;
            if (viewPager22 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            int b13 = viewPager22.b();
            Y7(b13);
            Y7(b13 - 1);
            Y7(b13 + 1);
        }
    }

    @Override // nl1.d
    public final void L7() {
        super.L7();
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        if (viewPager2.getChildCount() != 0) {
            ViewPager2 viewPager22 = this.f87987e0;
            if (viewPager22 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            int b13 = viewPager22.b();
            a8(b13);
            a8(b13 - 1);
            a8(b13 + 1);
        }
        kh2.j.x2(c8(), m0.f136438a);
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        nl1.d b83;
        if ((i13 != 24 && i13 != 25) || (b83 = b8()) == null) {
            return false;
        }
        b83.N7(i13, keyEvent);
        return false;
    }

    @Override // nl1.d
    public final void Q7(boolean z13) {
        this.f87990h0 = true;
        super.Q7(z13);
        this.f87990h0 = false;
    }

    @Override // cb2.e
    public final String X() {
        return "";
    }

    public final void Y7(int i13) {
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        com.pinterest.framework.screens.a W = ig1.b.W(viewPager2, i13);
        if (W instanceof b11.e) {
            ((PinCloseupFragment) ((b11.e) W)).f46988f2 = true;
        }
        if (W instanceof ac2.o) {
            ((o1) B7()).j((ac2.o) W);
        }
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    public final void Z7(y01.h0 h0Var) {
        f30 H4;
        y01.g0 f13 = h0Var.f();
        if (Intrinsics.d(f13, this.f87989g0)) {
            return;
        }
        boolean z13 = f13 instanceof y01.a0;
        y01.i0 i0Var = y01.i0.f136416a;
        if (z13) {
            y01.a0 a0Var = (y01.a0) f13;
            ViewPager2 viewPager2 = this.f87987e0;
            if (viewPager2 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            viewPager2.m(a0Var.a());
        } else if (f13 instanceof y01.e0) {
            this.f87989g0 = y01.e0.f136398a;
            ((l82.c) c8().c()).a(i0Var);
            P7();
        } else if (f13 instanceof y01.c0) {
            y01.c0 c0Var = (y01.c0) f13;
            ((o1) B7()).w();
            ViewPager2 viewPager22 = this.f87987e0;
            if (viewPager22 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            com.pinterest.framework.screens.a W = ig1.b.W(viewPager22, c0Var.g());
            j0 j0Var = W instanceof j0 ? (j0) W : null;
            if (j0Var != null) {
                j0Var.H1();
            }
            ViewPager2 viewPager23 = this.f87987e0;
            if (viewPager23 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            com.pinterest.framework.screens.a W2 = ig1.b.W(viewPager23, c0Var.b());
            j0 j0Var2 = W2 instanceof j0 ? (j0) W2 : null;
            if (j0Var2 != null) {
                j0Var2.i(c0Var.c(), c0Var.d(), c0Var.e());
            }
            Integer f14 = c0Var.f();
            if (f14 != null) {
                int intValue = f14.intValue();
                ViewPager2 viewPager24 = this.f87987e0;
                if (viewPager24 == null) {
                    Intrinsics.r("viewPager");
                    throw null;
                }
                com.pinterest.framework.screens.a W3 = ig1.b.W(viewPager24, intValue);
                o0 o0Var = W3 instanceof o0 ? (o0) W3 : null;
                if (o0Var != null) {
                    ((PinCloseupFragment) o0Var).E9();
                }
            }
            Integer a13 = c0Var.a();
            if (a13 != null) {
                int intValue2 = a13.intValue();
                ViewPager2 viewPager25 = this.f87987e0;
                if (viewPager25 == null) {
                    Intrinsics.r("viewPager");
                    throw null;
                }
                com.pinterest.framework.screens.a W4 = ig1.b.W(viewPager25, intValue2);
                o0 o0Var2 = W4 instanceof o0 ? (o0) W4 : null;
                if (o0Var2 != null) {
                    ((PinCloseupFragment) o0Var2).D9();
                }
            }
        } else if (f13 instanceof y01.d0) {
            y01.d0 d0Var = (y01.d0) f13;
            Integer a14 = d0Var.a();
            a11.u b13 = d0Var.b();
            if (a14 != null) {
                ViewPager2 viewPager26 = this.f87987e0;
                if (viewPager26 == null) {
                    Intrinsics.r("viewPager");
                    throw null;
                }
                com.pinterest.framework.screens.a W5 = ig1.b.W(viewPager26, a14.intValue());
                j0 j0Var3 = W5 instanceof j0 ? (j0) W5 : null;
                if (j0Var3 != null && !j0Var3.n1() && (H4 = j0Var3.H4()) != null) {
                    ((l82.c) c8().c()).a(new y01.k0(H4));
                }
            }
            if (b13 != null) {
                int a15 = b13.a();
                int b14 = b13.b();
                Y7(a15);
                a8(b14);
                ViewPager2 viewPager27 = this.f87987e0;
                if (viewPager27 == null) {
                    Intrinsics.r("viewPager");
                    throw null;
                }
                com.pinterest.framework.screens.a W6 = ig1.b.W(viewPager27, b14);
                if (W6 instanceof ac2.o) {
                    ((o1) B7()).m((ac2.o) W6);
                }
            }
        } else if (f13 instanceof y01.f0) {
            boolean z14 = false;
            if (((y01.f0) f13).a() && ur0.g.g(y0.ANDROID_PIN_CLOSEUP_AFTER_SCREENSHOT, this, null) != null) {
                z14 = true;
            }
            kh2.j.x2(c8(), new q0(z14));
        } else {
            Intrinsics.d(f13, y01.b0.f136385a);
        }
        this.f87989g0 = f13;
        ((l82.c) c8().c()).a(i0Var);
    }

    public final void a8(int i13) {
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        com.pinterest.framework.screens.a W = ig1.b.W(viewPager2, i13);
        if (W instanceof ac2.o) {
            ((o1) B7()).l((ac2.o) W);
        }
    }

    public final nl1.d b8() {
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 != null) {
            return ig1.b.K(viewPager2);
        }
        Intrinsics.r("viewPager");
        throw null;
    }

    public final y01.q1 c8() {
        return (y01.q1) this.f87986d0.getValue();
    }

    @Override // nl1.d, nx.i1
    public final w0 e() {
        nl1.d b83;
        if (this.f87990h0 || (b83 = b8()) == null) {
            return null;
        }
        return b83.e();
    }

    @Override // ml1.q
    public final void e3() {
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        ig1.b.L(viewPager2, new x());
        ((l82.c) c8().c()).a(new n0(this.I));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        nl1.d b83 = b8();
        if (b83 == null) {
            nl1.d.J7();
            return false;
        }
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        b2 a13 = viewPager2.a();
        if (a13 != null) {
            int e13 = a13.e();
            ViewPager2 viewPager22 = this.f87987e0;
            if (viewPager22 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            int b13 = viewPager22.b();
            for (int i13 = 0; i13 < e13; i13++) {
                if (i13 != b13) {
                    ViewPager2 viewPager23 = this.f87987e0;
                    if (viewPager23 == null) {
                        Intrinsics.r("viewPager");
                        throw null;
                    }
                    com.pinterest.framework.screens.a W = ig1.b.W(viewPager23, i13);
                    b11.h hVar = W instanceof b11.h ? (b11.h) W : null;
                    if (hVar != null) {
                        ((PinCloseupFragment) hVar).H9();
                    }
                }
            }
        }
        if (b83.getF103154e0()) {
            return true;
        }
        nl1.d.J7();
        return false;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        h32.i0 generateLoggingContext;
        if (this.f87990h0) {
            return super.generateLoggingContext();
        }
        nl1.d b83 = b8();
        return (b83 == null || (generateLoggingContext = b83.generateLoggingContext()) == null) ? super.generateLoggingContext() : generateLoggingContext;
    }

    @Override // cb2.e
    public final f30 getPin() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF140468f0() {
        Navigation navigation = this.I;
        if (navigation == null || !navigation.w("com.pinterest.EXTRA_VIEW_PARAMETER_TYPE")) {
            return null;
        }
        String g23 = navigation.g2("com.pinterest.EXTRA_VIEW_PARAMETER_TYPE", "");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        if (g23.length() > 0) {
            return a4.valueOf(g23);
        }
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.f87992j0;
    }

    @Override // ml1.q
    public final void k5() {
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        nl1.d K = ig1.b.K(viewPager2);
        PinCloseupFragment pinCloseupFragment = K instanceof PinCloseupFragment ? (PinCloseupFragment) K : null;
        if (pinCloseupFragment != null) {
            pinCloseupFragment.k5();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        d4 f49944f;
        super.onCreate(bundle);
        this.E = n80.d.fragment_sba_pin_swipe;
        y01.q1 c83 = c8();
        Navigation navigation = this.I;
        PinFeed pinFeed = (PinFeed) (navigation != null ? navigation.i0("com.pinterest.EXTRA_FEED") : null);
        Navigation navigation2 = this.I;
        if (navigation2 == null || (str = navigation2.getF49940b()) == null) {
            str = "";
        }
        Navigation navigation3 = this.I;
        String v03 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_SOURCE_QUERY") : null;
        Navigation navigation4 = this.I;
        Parcelable b23 = navigation4 != null ? navigation4.b2("com.pinterest.TRACKING_PARAMETER_BUILDER") : null;
        Intrinsics.g(b23, "null cannot be cast to non-null type com.pinterest.analytics.TrackingParamKeyBuilder");
        TrackingParamKeyBuilder trackingParamKeyBuilder = (TrackingParamKeyBuilder) b23;
        Navigation navigation5 = this.I;
        int value = (navigation5 == null || (f49944f = navigation5.getF49944f()) == null) ? -1 : f49944f.value();
        Navigation navigation6 = this.I;
        String v04 = navigation6 != null ? navigation6.v0("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE") : null;
        Navigation navigation7 = this.I;
        String v05 = navigation7 != null ? navigation7.v0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE") : null;
        Navigation navigation8 = this.I;
        int i13 = 0;
        int J1 = navigation8 != null ? navigation8.J1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE_DEPTH") : 0;
        Navigation navigation9 = this.I;
        ArrayList M = navigation9 != null ? navigation9.M("com.pinterest.EXTRA_CONTEXT_PIN_IDS") : null;
        Navigation navigation10 = this.I;
        boolean S = navigation10 != null ? navigation10.S("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", true) : true;
        Navigation navigation11 = this.I;
        String v06 = navigation11 != null ? navigation11.v0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE") : null;
        boolean a13 = vb0.j.a();
        lh0.a0 a0Var = this.f87988f0;
        if (a0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        boolean O = a0Var.O();
        lh0.a0 a0Var2 = this.f87988f0;
        if (a0Var2 != null) {
            this.f87991i0 = c83.i(pinFeed, str, v03, trackingParamKeyBuilder, value, v04, v05, J1, M, S, v06, a13, O, a0Var2.J(), new w(this, i13));
        } else {
            Intrinsics.r("experiments");
            throw null;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Intent intent = requireActivity().getIntent();
        if (intent.getBooleanExtra("com.pinterest.EXTRA_SHOW_COMMENT_THREAD", false)) {
            intent.putExtra("com.pinterest.EXTRA_SHOW_COMMENT_THREAD", false);
            requireActivity().setIntent(intent);
            ((l82.c) c8().c()).a(t0.f136495a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        c8().h(outState);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        h42.a aVar;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(n80.c.pager_closeup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        this.f87987e0 = viewPager2;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        wb.c cVar = new wb.c(c8().a(), 1);
        z zVar = new z(c8().c(), 0);
        il1.a aVar2 = this.f87985c0;
        if (aVar2 == null) {
            Intrinsics.r("fragmentFactory");
            throw null;
        }
        y01.h0 h0Var = this.f87991i0;
        if (h0Var == null || (aVar = h0Var.g()) == null) {
            aVar = new h42.a(null, null, 15);
        }
        ig1.b.I0(viewPager2, cVar, zVar, this, aVar2, aVar);
        ViewPager2 viewPager22 = this.f87987e0;
        if (viewPager22 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        viewPager22.k(1);
        y01.h0 h0Var2 = this.f87991i0;
        if (h0Var2 != null) {
            Z7(h0Var2);
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new c0(this, null), 3);
    }

    @Override // nl1.d
    public final String q7() {
        Navigation navigation;
        String f49940b;
        if (this.f87990h0) {
            return super.q7();
        }
        nl1.d b83 = b8();
        return (b83 == null || (navigation = b83.I) == null || (f49940b = navigation.getF49940b()) == null) ? super.q7() : f49940b;
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        nl1.d b83;
        HashMap f63135d0;
        if (this.f87990h0 || (b83 = b8()) == null || (f63135d0 = b83.getF63135d0()) == null) {
            return null;
        }
        return f63135d0;
    }

    @Override // com.pinterest.framework.screens.y
    public final List u6() {
        ViewPager2 viewPager2 = this.f87987e0;
        if (viewPager2 != null) {
            return ig1.b.g0(viewPager2);
        }
        Intrinsics.r("viewPager");
        throw null;
    }
}
