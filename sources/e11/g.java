package e11;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ar0.s;
import b11.m0;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import h32.h4;
import i01.f0;
import i01.m;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import oq.g0;
import oq.x0;
import rq.r1;
import rq.w4;
import rq.y4;
import tq.y;

/* loaded from: classes5.dex */
public final class g extends s {

    /* renamed from: a, reason: collision with root package name */
    public final f f56800a;

    /* renamed from: b, reason: collision with root package name */
    public final e f56801b;

    /* renamed from: c, reason: collision with root package name */
    public final b f56802c;

    /* renamed from: d, reason: collision with root package name */
    public final c f56803d;

    /* renamed from: e, reason: collision with root package name */
    public final d f56804e;

    /* renamed from: f, reason: collision with root package name */
    public final m f56805f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f56806g;

    /* renamed from: h, reason: collision with root package name */
    public y f56807h;

    /* renamed from: i, reason: collision with root package name */
    public int f56808i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f56809j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f56810k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f56811l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f56812m;

    public g(f viewabilityListener, e boundsProvider, b legacyViewBoundListener, c pdpCloseupViewBoundListener, d relatedPinsHeaderListener, m fragmentActiveStateProvider) {
        Intrinsics.checkNotNullParameter(viewabilityListener, "viewabilityListener");
        Intrinsics.checkNotNullParameter(boundsProvider, "boundsProvider");
        Intrinsics.checkNotNullParameter(legacyViewBoundListener, "legacyViewBoundListener");
        Intrinsics.checkNotNullParameter(pdpCloseupViewBoundListener, "pdpCloseupViewBoundListener");
        Intrinsics.checkNotNullParameter(relatedPinsHeaderListener, "relatedPinsHeaderListener");
        Intrinsics.checkNotNullParameter(fragmentActiveStateProvider, "fragmentActiveStateProvider");
        this.f56800a = viewabilityListener;
        this.f56801b = boundsProvider;
        this.f56802c = legacyViewBoundListener;
        this.f56803d = pdpCloseupViewBoundListener;
        this.f56804e = relatedPinsHeaderListener;
        this.f56805f = fragmentActiveStateProvider;
    }

    public static boolean q(int i13, int i14, int i15) {
        if (i14 != i15) {
            return (i14 < i13 && i15 >= i13) || (i14 >= i13 && i15 < i13);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.c(recyclerView, i13, i14);
        this.f56812m = i14 > 0;
        x0 x0Var = this.f56806g;
        if (x0Var != null) {
            n(x0Var);
        }
        Iterator it = d7.b.O(recyclerView).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof m0) && view.isAttachedToWindow()) {
                ((m0) view).a((int) ((PinCloseupFragment) this.f56801b).c7().b());
            }
        }
    }

    @Override // ar0.s
    public final void j(RecyclerView recyclerView, View view) {
        y yVar;
        x0 x0Var;
        w4 w4Var;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        super.j(recyclerView, view);
        if (!(view instanceof x0)) {
            if (!(view instanceof y)) {
                if ((view instanceof PinCloseupBaseModule) && ((PinCloseupFragment) this.f56805f).f91282J) {
                    PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) view;
                    pinCloseupBaseModule.updateActive(true);
                    pinCloseupBaseModule.checkForBeginView((int) ((PinCloseupFragment) this.f56801b).c7().b());
                    return;
                }
                return;
            }
            if (!Intrinsics.d(view, this.f56807h)) {
                r();
            }
            y pdpView = (y) view;
            this.f56807h = pdpView;
            PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.f56803d;
            pinCloseupFragment.getClass();
            Intrinsics.checkNotNullParameter(pdpView, "pdpView");
            y yVar2 = pinCloseupFragment.f47000j2;
            if (yVar2 != null) {
                yVar2.s(pinCloseupFragment.f91282J);
            }
            f0 f0Var = pinCloseupFragment.O1;
            if (f0Var != null) {
                f0Var.onCloseupViewRevealed();
            }
            f30 pin = pinCloseupFragment.getPin();
            if (pin != null) {
                Boolean n53 = pin.n5();
                Intrinsics.checkNotNullExpressionValue(n53, "getIsVirtualTryOn(...)");
                if (!n53.booleanValue() || (yVar = pinCloseupFragment.f47000j2) == null) {
                    return;
                }
                yVar.C(pinCloseupFragment.f47003k2[1] - pinCloseupFragment.c7().a());
                return;
            }
            return;
        }
        if (!Intrinsics.d(view, this.f56806g)) {
            r();
        }
        x0 legacyView = (x0) view;
        this.f56806g = legacyView;
        PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) this.f56802c;
        pinCloseupFragment2.getClass();
        Intrinsics.checkNotNullParameter(legacyView, "legacyView");
        x0 x0Var2 = pinCloseupFragment2.f46997i2;
        if (x0Var2 != null) {
            x0Var2.Y0(pinCloseupFragment2.f91282J);
        }
        if (pinCloseupFragment2.f91282J) {
            x0 x0Var3 = pinCloseupFragment2.f46997i2;
            y4 H0 = x0Var3 != null ? x0Var3.H0() : null;
            if (H0 != null) {
                H0.g(true);
            }
            x0 x0Var4 = pinCloseupFragment2.f46997i2;
            if (x0Var4 != null && (w4Var = x0Var4.K) != null) {
                w4Var.b();
            }
        }
        f0 f0Var2 = pinCloseupFragment2.O1;
        if (f0Var2 != null) {
            f0Var2.onCloseupViewRevealed();
        }
        f30 pin2 = pinCloseupFragment2.getPin();
        if (pin2 != null) {
            Boolean n54 = pin2.n5();
            Intrinsics.checkNotNullExpressionValue(n54, "getIsVirtualTryOn(...)");
            if (n54.booleanValue()) {
                x0 x0Var5 = pinCloseupFragment2.f46997i2;
                if (x0Var5 != null) {
                    x0Var5.M1(pinCloseupFragment2.f47003k2[1] - pinCloseupFragment2.c7().a());
                }
            } else if (b0.B1(pin2) && (x0Var = pinCloseupFragment2.f46997i2) != null) {
                x0Var.K1(pinCloseupFragment2.f47003k2[1] - pinCloseupFragment2.c7().a());
            }
        }
        n(legacyView);
    }

    @Override // ar0.s
    public final void k(RecyclerView recyclerView, View view) {
        w4 w4Var;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.d(view, this.f56806g)) {
            x0 x0Var = this.f56806g;
            Intrinsics.f(x0Var);
            n(x0Var);
            x0 legacyView = this.f56806g;
            Intrinsics.f(legacyView);
            PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.f56802c;
            pinCloseupFragment.getClass();
            Intrinsics.checkNotNullParameter(legacyView, "legacyView");
            if (pinCloseupFragment.f91282J) {
                x0 x0Var2 = pinCloseupFragment.f46997i2;
                y4 H0 = x0Var2 != null ? x0Var2.H0() : null;
                if (H0 != null) {
                    H0.g(false);
                }
                x0 x0Var3 = pinCloseupFragment.f46997i2;
                if (x0Var3 != null && (w4Var = x0Var3.K) != null) {
                    w4Var.g();
                }
            }
            this.f56806g = null;
            r();
        } else if (Intrinsics.d(view, this.f56807h)) {
            y yVar = this.f56807h;
            Intrinsics.f(yVar);
            int[] iArr = new int[2];
            yVar.k().getLocationInWindow(iArr);
            o(iArr, yVar.m(), yVar.isAttachedToWindow());
            p(yVar.i());
            int b13 = (int) ((PinCloseupFragment) this.f56801b).c7().b();
            Iterator it = yVar.f118980t.iterator();
            while (it.hasNext()) {
                ((PinCloseupBaseModule) it.next()).checkForBeginView(b13);
            }
            this.f56807h = null;
            r();
        } else if (view instanceof PinCloseupBaseModule) {
            ((PinCloseupBaseModule) view).updateActive(false);
        } else if ((view instanceof md1.b) && this.f56812m) {
            PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) this.f56804e;
            if (!pinCloseupFragment2.D2) {
                pinCloseupFragment2.D2 = true;
                w f73 = pinCloseupFragment2.f7();
                String f49940b = pinCloseupFragment2.u9().getF49940b();
                Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
                f73.d(new nd1.a(f49940b));
            }
        }
        super.k(recyclerView, view);
    }

    @Override // ar0.s
    public final void l(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        super.l(recyclerView, view);
        if (Intrinsics.d(this.f56806g, view) || Intrinsics.d(this.f56807h, view)) {
            r();
        }
    }

    @Override // ar0.s
    public final void m(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        x0 x0Var = this.f56806g;
        y yVar = this.f56807h;
        if (Intrinsics.d(view, x0Var)) {
            n(x0Var);
        } else {
            Intrinsics.d(view, yVar);
        }
        super.m(recyclerView, view);
    }

    public final void n(x0 x0Var) {
        r1 t03 = x0Var.t0();
        int[] iArr = x0Var.I0;
        if (t03 != null) {
            t03.getLocationInWindow(iArr);
        }
        o(iArr, x0Var.F0(), x0Var.isAttachedToWindow());
        p(x0Var.o0());
        int b13 = (int) ((PinCloseupFragment) this.f56801b).c7().b();
        if (x0Var.t1()) {
            g0 g0Var = x0Var.H;
            if (g0Var != null) {
                Iterator it = g0Var.f97037a.iterator();
                while (it.hasNext()) {
                    ((PinCloseupBaseModule) it.next()).checkForBeginView(b13);
                }
                return;
            }
            return;
        }
        ArrayList arrayList = x0Var.I;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((PinCloseupBaseModule) it2.next()).checkForBeginView(b13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int[] r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.g.o(int[], int, boolean):void");
    }

    @Override // ar0.s, ar0.r
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewAttachedToWindow(view);
        if (!(view instanceof x0)) {
            if (view instanceof y) {
                y pdpView = (y) view;
                PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.f56803d;
                pinCloseupFragment.getClass();
                Intrinsics.checkNotNullParameter(pdpView, "pdpView");
                pinCloseupFragment.f47000j2 = pdpView;
                pinCloseupFragment.A9();
                return;
            }
            return;
        }
        x0 legacyView = (x0) view;
        PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) this.f56802c;
        pinCloseupFragment2.getClass();
        Intrinsics.checkNotNullParameter(legacyView, "legacyView");
        pinCloseupFragment2.f46997i2 = legacyView;
        pinCloseupFragment2.A9();
        if (legacyView.d0() != null) {
            pinCloseupFragment2.requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
    }

    @Override // ar0.s, ar0.r
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewDetachedFromWindow(view);
        if (view instanceof x0) {
            x0 legacyView = (x0) view;
            PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.f56802c;
            pinCloseupFragment.getClass();
            Intrinsics.checkNotNullParameter(legacyView, "legacyView");
            if (legacyView.d0() != null) {
                pinCloseupFragment.requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            }
            pinCloseupFragment.f46997i2 = null;
            return;
        }
        if (view instanceof y) {
            y pdpView = (y) view;
            PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) this.f56803d;
            pinCloseupFragment2.getClass();
            Intrinsics.checkNotNullParameter(pdpView, "pdpView");
            pinCloseupFragment2.f47000j2 = null;
        }
    }

    public final void p(int i13) {
        int i14 = this.f56808i;
        this.f56808i = i13;
        boolean z13 = i14 < i13;
        h4 h4Var = h4.V_100;
        boolean q13 = q(h4Var.getValue(), i14, i13);
        f fVar = this.f56800a;
        if (q13) {
            ((PinCloseupFragment) fVar).C9(h4Var, z13);
        } else {
            h4 h4Var2 = h4.V_80;
            if (q(h4Var2.getValue(), i14, i13)) {
                ((PinCloseupFragment) fVar).C9(h4Var2, z13);
            } else {
                h4 h4Var3 = h4.V_50;
                if (q(h4Var3.getValue(), i14, i13)) {
                    ((PinCloseupFragment) fVar).C9(h4Var3, z13);
                }
            }
        }
        if (i13 == 0) {
            f0 f0Var = ((PinCloseupFragment) fVar).O1;
            if (f0Var != null) {
                f0Var.on0PercentVisible();
                return;
            }
            return;
        }
        f0 f0Var2 = ((PinCloseupFragment) fVar).O1;
        if (f0Var2 != null) {
            f0Var2.onPartiallyOrFullyVisible();
        }
    }

    public final void r() {
        boolean z13 = this.f56809j;
        f fVar = this.f56800a;
        if (z13) {
            this.f56809j = false;
            ((PinCloseupFragment) fVar).F9();
        }
        if (this.f56810k) {
            this.f56810k = false;
            ((PinCloseupFragment) fVar).B9();
        }
        f0 f0Var = ((PinCloseupFragment) fVar).O1;
        if (f0Var != null) {
            f0Var.on0PercentVisible();
        }
    }
}
