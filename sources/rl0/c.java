package rl0;

import a7.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import eb2.k;
import h32.a4;
import h32.d4;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import r70.h;
import so.q7;
import sq0.c0;
import xk2.m;
import xk2.v;
import yk1.i;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrl0/c;", "Lyq0/b0;", "Lyq0/a0;", "", "<init>", "()V", "favorites_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends a<a0> implements c0 {
    public static final /* synthetic */ int I0 = 0;
    public q7 A0;
    public ViewGroup B0;
    public GestaltSpinner C0;
    public ViewGroup D0;
    public GestaltIconButton E0;
    public final v F0 = m.b(new b(this, 0));
    public final d4 G0 = d4.MODAL;
    public final a4 H0 = a4.PIN_FAVORITE_USER_LIST;

    /* renamed from: z0, reason: collision with root package name */
    public f0 f108518z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new b(this, 1));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        q7 q7Var = this.A0;
        if (q7Var != null) {
            return q7Var.a((String) this.F0.getValue());
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF35234i() {
        return this.H0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF2091g0() {
        return this.G0;
    }

    @Override // yq0.t
    public final e m8() {
        return new e(ci0.c.pin_favorite_user_list_fragment, ci0.b.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ci0.b.pin_favorite_user_list_bottom_sheet);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.B0 = (ViewGroup) findViewById;
        View findViewById2 = onCreateView.findViewById(ci0.b.pin_favorite_user_list_coordinator_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = onCreateView.findViewById(ci0.b.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.C0 = (GestaltSpinner) findViewById3;
        View findViewById4 = onCreateView.findViewById(ci0.b.botttom_sheet_background);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.D0 = (ViewGroup) findViewById4;
        View findViewById5 = onCreateView.findViewById(ci0.b.close_screen_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.E0 = (GestaltIconButton) findViewById5;
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ViewGroup viewGroup = this.B0;
        if (viewGroup == null) {
            Intrinsics.r("bottomSheetView");
            throw null;
        }
        BottomSheetBehavior J2 = BottomSheetBehavior.J(viewGroup);
        J2.V(hf0.b.f69003c / 3);
        J2.X(4);
        Intrinsics.checkNotNullExpressionValue(J2, "apply(...)");
        ViewGroup viewGroup2 = this.D0;
        if (viewGroup2 == null) {
            Intrinsics.r("bottomSheetOuterBackground");
            throw null;
        }
        viewGroup2.setOnClickListener(new lj0.a(this, 7));
        ViewGroup viewGroup3 = this.B0;
        if (viewGroup3 == null) {
            Intrinsics.r("bottomSheetView");
            throw null;
        }
        viewGroup3.requestLayout();
        f7().d(new h(false, false));
        a8(new k(getResources().getDimensionPixelOffset(ci0.a.pin_favorite_user_list_horizontal_margin), getResources().getDimensionPixelOffset(ci0.a.pin_favorite_user_list_vertical_margin), getResources().getDimensionPixelOffset(ci0.a.pin_favorite_user_list_horizontal_margin), getResources().getDimensionPixelOffset(ci0.a.pin_favorite_user_list_vertical_margin)));
        GestaltIconButton gestaltIconButton = this.E0;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new yb0.b(this, 20));
        } else {
            Intrinsics.r("closeScreenButton");
            throw null;
        }
    }

    @Override // yq0.t, yk1.n
    public final void setLoadState(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.setLoadState(state);
        GestaltSpinner gestaltSpinner = this.C0;
        if (gestaltSpinner != null) {
            if (state == i.LOADING) {
                Intrinsics.checkNotNullParameter(gestaltSpinner, "<this>");
                s0.w(gestaltSpinner, ln1.i.f84011l);
                GestaltSpinner gestaltSpinner2 = this.C0;
                if (gestaltSpinner2 != null) {
                    dl2.b.X2(gestaltSpinner2, ln1.e.LOADING);
                    return;
                } else {
                    Intrinsics.r("loadingSpinner");
                    throw null;
                }
            }
            dl2.b.X2(gestaltSpinner, ln1.e.LOADED);
            GestaltSpinner gestaltSpinner3 = this.C0;
            if (gestaltSpinner3 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            Intrinsics.checkNotNullParameter(gestaltSpinner3, "<this>");
            s0.w(gestaltSpinner3, ln1.i.f84010k);
        }
    }
}
