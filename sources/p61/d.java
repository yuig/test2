package p61;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.cz;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kh2.c3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a0;
import om1.l;
import so.e3;
import yf0.h;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp61/d;", "Lyk1/k;", "Lp61/a;", "<init>", "()V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends g implements a {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f98909r0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public e3 f98910j0;

    /* renamed from: k0, reason: collision with root package name */
    public f f98911k0;

    /* renamed from: l0, reason: collision with root package name */
    public final a0 f98912l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f98913m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltButton f98914n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltIconButton f98915o0;

    /* renamed from: p0, reason: collision with root package name */
    public final ca2.e f98916p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f98917q0;

    public d() {
        a0 a0Var = new a0();
        this.f98912l0 = a0Var;
        this.f98916p0 = new ca2.e(true, null, 0, 0, null, 0, a0Var, null, false, false, 958);
        this.E = l42.d.fragment_gold_standard_bottom_sheet;
        setPinalytics(a0Var);
        this.f98917q0 = d4.UNKNOWN_VIEW;
    }

    @Override // nl1.d
    public final void S6(h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        GestaltIconButton gestaltIconButton = this.f98915o0;
        if (gestaltIconButton == null) {
            Intrinsics.r("topCloseButton");
            throw null;
        }
        c3.n(gestaltIconButton, true);
        View c13 = this.f98916p0.c();
        if (c13 != null) {
            c3.j(c13);
        }
    }

    @Override // yk1.k
    public final m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("extra_safety_root_outro") : null;
        cz czVar = i03 instanceof cz ? (cz) i03 : null;
        if (czVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        e3 e3Var = this.f98910j0;
        if (e3Var != null) {
            return e3Var.a(czVar, this.f98912l0);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        z(c.f98908i);
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.f98917q0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.f98916p0.m(onCreateView.findViewById(l42.b.gold_standard_bottom_sheet_container));
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f98916p0.l();
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        v13.setOnTouchListener(new x4.a0(2));
        ca2.e eVar = this.f98916p0;
        BottomSheetBehavior d2 = eVar.d();
        final int i13 = 0;
        if (d2 != null) {
            d2.R(false);
        }
        View findViewById = v13.findViewById(l42.b.gold_standard_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f98913m0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(l42.b.gold_standard_bottom_sheet_top_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f98915o0 = (GestaltIconButton) findViewById2;
        View findViewById3 = v13.findViewById(l42.b.gold_standard_bottom_sheet_close);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f98914n0 = (GestaltButton) findViewById3;
        eVar.s("", false);
        GestaltIconButton gestaltIconButton = this.f98915o0;
        if (gestaltIconButton == null) {
            Intrinsics.r("topCloseButton");
            throw null;
        }
        gestaltIconButton.u(new gm1.a(this) { // from class: p61.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f98907b;

            {
                this.f98907b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar = c.f98908i;
                int i14 = i13;
                d this$0 = this.f98907b;
                switch (i14) {
                    case 0:
                        int i15 = d.f98909r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.z(cVar);
                            break;
                        }
                        break;
                    default:
                        int i16 = d.f98909r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.z(cVar);
                        break;
                }
            }
        });
        GestaltButton gestaltButton = this.f98914n0;
        if (gestaltButton == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.e(new gm1.a(this) { // from class: p61.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f98907b;

            {
                this.f98907b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar = c.f98908i;
                int i142 = i14;
                d this$0 = this.f98907b;
                switch (i142) {
                    case 0:
                        int i15 = d.f98909r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.z(cVar);
                            break;
                        }
                        break;
                    default:
                        int i16 = d.f98909r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.z(cVar);
                        break;
                }
            }
        });
        f fVar = this.f98911k0;
        if (fVar != null) {
            fVar.p3();
        }
    }
}
