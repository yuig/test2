package qv0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.d4;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqv0/g;", "Lyq0/b0;", "Lyq0/a0;", "Lnv0/n;", "<init>", "()V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends a<yq0.a0> implements nv0.n {
    public static final /* synthetic */ int N0 = 0;
    public wk2.a A0;
    public ag1.h B0;
    public zp.j C0;
    public ag1.b D0;
    public final xk2.v E0;
    public GestaltSpinner F0;
    public GestaltSpinner G0;
    public GestaltSearchField H0;
    public GestaltText I0;
    public nv0.b J0;
    public gm1.a K0;
    public final d4 L0;
    public final a4 M0;

    /* renamed from: z0, reason: collision with root package name */
    public so.k f105184z0;

    public g() {
        this.S = false;
        this.E0 = xk2.m.b(new e(this, 0));
        this.L0 = d4.STORY_PIN_STICKER_PICKER;
        this.M0 = a4.STORY_PIN_CREATE;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.d1(requireActivity);
        super.L7();
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new e(this, 1));
        adapter.G(1, new e(this, 2));
        adapter.G(2, new e(this, 3));
        adapter.G(3, new e(this, 4));
        adapter.G(4, new e(this, 5));
        adapter.G(5, new e(this, 6));
        adapter.G(6, new e(this, 7));
        adapter.G(7, new e(this, 8));
    }

    public final NavigationImpl U8(ScreenLocation screenLocation) {
        NavigationImpl w13 = Navigation.w1(screenLocation);
        Navigation navigation = this.I;
        w13.Y1("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", navigation != null ? navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
        Navigation navigation2 = this.I;
        w13.m0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        return w13;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        so.k kVar = this.f105184z0;
        if (kVar != null) {
            return kVar.a((du0.b) this.E0.getValue());
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    public final void V8(int i13, int i14) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        yb0.n nVar = new yb0.n(requireContext);
        String b23 = bs1.c.b2(i13);
        Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
        nVar.w(b23);
        nVar.u(bs1.c.b2(i14));
        String b24 = bs1.c.b2(aq1.h.idea_pin_board_sticker_alert_view_confirm);
        Intrinsics.checkNotNullExpressionValue(b24, "string(...)");
        nVar.q(b24);
        nVar.o(false);
        nVar.r(new e(this, 9));
        cb.x(nVar, f7());
    }

    public final void W8(jk.r state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof nv0.j) {
            GestaltSearchField gestaltSearchField = this.H0;
            if (gestaltSearchField == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            c0.d.j(gestaltSearchField, d.f105165l);
            gestaltSearchField.g0(new c(this, 1));
            gm1.a aVar = this.K0;
            if (aVar != null) {
                GestaltSearchField gestaltSearchField2 = this.H0;
                if (gestaltSearchField2 != null) {
                    gestaltSearchField2.g0(aVar);
                    return;
                } else {
                    Intrinsics.r("searchBar");
                    throw null;
                }
            }
            return;
        }
        if (!(state instanceof nv0.i)) {
            if (state instanceof nv0.k) {
                if (((nv0.k) state).D()) {
                    int i13 = aq1.h.idea_pin_sticker_search_no_results_title;
                    GestaltText gestaltText = this.I0;
                    if (gestaltText == null) {
                        Intrinsics.r("titleView");
                        throw null;
                    }
                    String b23 = bs1.c.b2(i13);
                    Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
                    pk.a0.p(gestaltText, b23);
                    return;
                }
                int i14 = aq1.h.idea_pin_sticker_browse_title;
                GestaltText gestaltText2 = this.I0;
                if (gestaltText2 == null) {
                    Intrinsics.r("titleView");
                    throw null;
                }
                String b24 = bs1.c.b2(i14);
                Intrinsics.checkNotNullExpressionValue(b24, "string(...)");
                pk.a0.p(gestaltText2, b24);
                return;
            }
            return;
        }
        GestaltSearchField gestaltSearchField3 = this.H0;
        if (gestaltSearchField3 == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        hf0.b.k(gestaltSearchField3);
        GestaltSearchField gestaltSearchField4 = this.H0;
        if (gestaltSearchField4 == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        c0.d.j(gestaltSearchField4, d.f105166m);
        GestaltSearchField gestaltSearchField5 = this.H0;
        if (gestaltSearchField5 == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        if (gestaltSearchField5.hasFocus()) {
            GestaltSearchField gestaltSearchField6 = this.H0;
            if (gestaltSearchField6 != null) {
                gestaltSearchField6.clearFocus();
            } else {
                Intrinsics.r("searchBar");
                throw null;
            }
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF103167r0() {
        return this.M0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF73869c0() {
        return this.L0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(aq1.f.fragment_idea_pin_sticker_browse, aq1.d.p_recycler_view);
    }

    @Override // yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 22);
        getContext();
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(bVar, 3);
        pinterestGridLayoutManager.K = new ht0.p(this, pinterestGridLayoutManager, 1);
        return new v0(pinterestGridLayoutManager);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.cancel_button);
        ((GestaltIconButton) findViewById).u(new c(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = onCreateView.findViewById(aq1.d.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.I0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.F0 = (GestaltSpinner) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.G0 = (GestaltSpinner) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.sticker_search_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltSearchField gestaltSearchField = (GestaltSearchField) findViewById5;
        c0.d.j(gestaltSearchField, d.f105163j);
        this.H0 = gestaltSearchField;
        a8(new c0());
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
        super.onResume();
    }

    @Override // yq0.t, yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GestaltSpinner gestaltSpinner = this.F0;
        if (gestaltSpinner != null) {
            s0.w(gestaltSpinner, new f(state, 0));
        } else {
            Intrinsics.r("gestaltSpinner");
            throw null;
        }
    }
}
