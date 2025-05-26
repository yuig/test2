package uv1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RowsWithVariableColumnsLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import m60.w;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luv1/q;", "Lyq0/b0;", "", "Lvv1/l;", "<init>", "()V", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"FragmentsInLibraryDFM"})
/* loaded from: classes2.dex */
public final class q extends h<Object> implements vv1.l {
    public static final /* synthetic */ int I0 = 0;
    public k2 A0;
    public GestaltText D0;
    public int E0;
    public final d4 G0;
    public final a4 H0;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f123223z0;
    public final tq0.h B0 = vb0.i.f();
    public final z61.b C0 = new z61.b(new l11.f());
    public final v F0 = xk2.m.b(new o(this, 1));

    public q() {
        this.Y = true;
        this.G0 = d4.SEARCH;
        this.H0 = a4.SEARCH_PINS;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new o(this, 2));
    }

    public final ca2.e U8() {
        return (ca2.e) this.F0.getValue();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f123223z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        Navigation navigation = this.I;
        Object X0 = navigation != null ? navigation.X0() : null;
        Intrinsics.g(X0, "null cannot be cast to non-null type com.pinterest.oneBarLibrary.modules.OneBarContract.StructuredGuideBottomSheetViewModel");
        vv1.m mVar = (vv1.m) X0;
        w f73 = f7();
        k2 k2Var = this.A0;
        if (k2Var != null) {
            return new c21.a(g13, p73, mVar, this.C0, f73, k2Var);
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final void V8(String str) {
        this.B0.p(true, true);
        ca2.e.i(U8(), str, 0.0f, null, 6);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        V8("navigation");
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22531t0() {
        return this.H0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getJ0() {
        return this.G0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(nv1.e.fragment_structured_guide_bottom_sheet, nv1.d.bottom_sheet_recycler_view);
    }

    @Override // yq0.t
    public final v0 n8() {
        return new v0(new RowsWithVariableColumnsLayoutManager(new g41.a(this, 14)));
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        onCreateView.setOnClickListener(new wq1.a(this, 11));
        U8().m(onCreateView.findViewById(nv1.d.bottom_sheet_with_grid));
        this.E0 = onCreateView.getResources().getDimensionPixelOffset(nv1.b.structured_guide_bottom_sheet_height_slop);
        View findViewById = onCreateView.findViewById(nv1.d.bottom_sheet_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = onCreateView.findViewById(nv1.d.bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.D0 = (GestaltText) findViewById2;
        ((GestaltIconButton) onCreateView.findViewById(nv1.d.bottom_sheet_close_button)).u(new gh1.e(this, 18));
        int dimensionPixelOffset = onCreateView.getResources().getDimensionPixelOffset(eo1.c.space_100);
        a8(new eb2.k(0, 0, dimensionPixelOffset, dimensionPixelOffset));
        Z7(new p(this));
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        U8().l();
        super.onDestroyView();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        tq0.h hVar = this.B0;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
    }
}
