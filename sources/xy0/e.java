package xy0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.s;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import eb2.h;
import h32.a4;
import h32.d4;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j2;
import m60.r0;
import pb0.g;
import tq0.i;
import xk2.m;
import xk2.v;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxy0/e;", "Lyq0/b0;", "Lyq0/a0;", "Lry0/b;", "<init>", "()V", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends a<a0> implements ry0.b {
    public static final /* synthetic */ int L0 = 0;
    public j2 A0;
    public LoadingView C0;
    public GestaltSpinner D0;
    public GestaltButton E0;
    public GestaltText F0;
    public GestaltText G0;
    public iy0.a H0;
    public ry0.a I0;

    /* renamed from: z0, reason: collision with root package name */
    public wy0.d f136203z0;
    public final v B0 = m.b(new b(this, 0));
    public final v J0 = m.b(c.f136199i);
    public final a4 K0 = a4.ORIENTATION_INTEREST_PICKER;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new b(this, 1));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        wy0.d dVar = this.f136203z0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("multiSectionNUXPickerPresenter");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF111142k1() {
        return this.K0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF92961w0() {
        d4 viewType;
        iy0.a aVar = this.H0;
        return (aVar == null || (viewType = aVar.getViewType()) == null) ? d4.UNKNOWN_VIEW : viewType;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(jv1.f.fragment_modern_nux_interests_picker, jv1.d.nux_interests_recycler_view);
    }

    @Override // xy0.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 k03 = bs1.c.k0(context);
        if (k03 instanceof iy0.a) {
            this.H0 = (iy0.a) k03;
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(jv1.d.nux_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.G0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(jv1.d.nux_header_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.F0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(jv1.d.nux_interest_next_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        gestaltButton.d(d.f136200j);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.E0 = gestaltButton;
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.getContext();
            g83.R2(new GridLayoutManager(g83.getResources().getInteger(jv1.e.interest_grid_cols)));
            g83.m(new h(g83.getResources().getInteger(jv1.e.interest_grid_cols), g83.getResources().getDimensionPixelSize(r0.margin), g83.getResources().getDimensionPixelSize(r0.margin_half)));
            g2 g2Var = g83.M;
            if (g2Var instanceof s) {
                Intrinsics.g(g2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                ((s) g2Var).f19618g = false;
            }
        }
        View findViewById4 = onCreateView.findViewById(jv1.d.nux_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.C0 = (LoadingView) findViewById4;
        if (((Boolean) this.B0.getValue()).booleanValue()) {
            View findViewById5 = onCreateView.findViewById(jv1.d.nux_spinner);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById5;
            s0.w(gestaltSpinner, d.f136201k);
            this.D0 = gestaltSpinner;
            LoadingView loadingView = this.C0;
            if (loadingView == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            loadingView.setVisibility(8);
        } else {
            LoadingView loadingView2 = this.C0;
            if (loadingView2 == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            loadingView2.g2(se0.f.LOADING);
        }
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.H0 = null;
        super.onDetach();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltButton gestaltButton = this.E0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        gestaltButton.e(new np0.h(this, 23));
        tq0.h hVar = (tq0.h) this.J0.getValue();
        hVar.n(new i(s7()), new tq0.m(g.f99432a, s7()));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
    }
}
