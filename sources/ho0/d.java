package ho0;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.v0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.pin.create.view.CreateBoardCell;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import dl1.s;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yq0.z;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lho0/d;", "Lwk1/k;", "Ldl1/s;", "", "Lnr0/j;", "Lf11/h;", "<init>", "()V", "gi2/b", "repin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class d extends wk1.k<s> implements f11.h {

    /* renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ int f69689a1 = 0;
    public FrameLayout M0;
    public c0 N0;
    public View O0;
    public int P0;
    public String Q0;
    public boolean S0;
    public boolean T0;
    public CreateBoardCell U0;
    public FrameLayout V0;
    public HeaderCell W0;
    public FrameLayout X0;
    public boolean R0 = true;
    public final d4 Y0 = d4.BOARD_SECTION;
    public final a4 Z0 = a4.BOARD_SECTION_PICKER;

    @Override // sq0.e, yq0.b0
    public void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(465540, new c(this, 0));
        adapter.G(465541, new c(this, 1));
        adapter.G(465543, new c(this, 2));
        adapter.G(465544, new c(this, 3));
        adapter.G(465545, new c(this, 4));
        adapter.G(67, new c(this, 5));
        adapter.G(465546, new c(this, 6));
    }

    @Override // nl1.d
    public final void dismiss() {
        FragmentActivity E4 = E4();
        hf0.b.k(E4 != null ? E4.getCurrentFocus() : null);
        if (U6()) {
            Y6(b.f69682j);
        } else {
            P7();
        }
    }

    public final void g9() {
        View view = new View(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 3.0f, view.getResources().getDisplayMetrics()));
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = this.P0;
        view.setLayoutParams(layoutParams);
        Resources resources = view.getResources();
        int i13 = f02.b.board_picker_bottom_drop_shadow;
        ThreadLocal threadLocal = e5.n.f57243a;
        view.setBackground(resources.getDrawable(i13, null));
        this.O0 = view;
        FrameLayout frameLayout = this.V0;
        if (frameLayout == null && (frameLayout = this.X0) == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        frameLayout.addView(view);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getZ0() {
        return this.Z0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.Y0;
    }

    public final HeaderCell h9() {
        HeaderCell headerCell = this.W0;
        if (headerCell != null) {
            return headerCell;
        }
        Intrinsics.r("headerView");
        throw null;
    }

    public void i9() {
        Navigation navigation = this.I;
        if (navigation == null) {
            throw new IllegalStateException("Navigation cannot be null here");
        }
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        this.Q0 = f49940b.length() == 0 ? null : navigation.getF49940b();
        this.T0 = navigation.S("com.pinterest.EXTRA_SHOW_PARENT_BOARD", false);
        this.R0 = navigation.S("com.pinterest.EXTRA_LOAD_ALL_BOARDS", true);
        this.S0 = navigation.S("com.pinterest.EXTRA_BOARD_IS_ADONLY", false);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(e02.c.fragment_section_picker_bottom_sheet, e02.b.p_recycler_view);
        eVar.b(e02.b.loading_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 11);
        requireContext();
        return new v0(new PinterestLinearLayoutManager(bVar));
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.V0 = (FrameLayout) onCreateView.findViewById(e02.b.tablet_center_container);
        View findViewById = onCreateView.findViewById(e02.b.section_picker_wrapper);
        FrameLayout frameLayout = (FrameLayout) findViewById;
        frameLayout.setOnClickListener(new lj0.a(this, 10));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.X0 = frameLayout;
        View findViewById2 = onCreateView.findViewById(e02.b.bottom_sheet_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.M0 = (FrameLayout) findViewById2;
        View findViewById3 = onCreateView.findViewById(e02.b.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        HeaderCell headerCell = (HeaderCell) findViewById3;
        Intrinsics.checkNotNullParameter(headerCell, "<set-?>");
        this.W0 = headerCell;
        View findViewById4 = onCreateView.findViewById(e02.b.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        Intrinsics.checkNotNullParameter((PinterestRecyclerView) findViewById4, "<set-?>");
        this.P0 = onCreateView.getResources().getDimensionPixelOffset(f02.a.lego_create_board_cell_height);
        h9().Z(this);
        FrameLayout frameLayout2 = this.M0;
        if (frameLayout2 == null) {
            Intrinsics.r("bottomSheetView");
            throw null;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(frameLayout2);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.FrameLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            int J1 = navigation.J1("com.pinterest.EXTRA_SECTION_PICKER_BOTTOM_SHEET_PEEK_HEIGHT");
            if (J1 == 0) {
                lockableBottomSheetBehavior.f44543h0 = false;
            } else {
                lockableBottomSheetBehavior.W(J1);
            }
            int J12 = navigation.J1("com.pinterest.EXTRA_SECTION_PICKER_BOTTOM_SHEET_STATE");
            if (J12 == 0) {
                J12 = 3;
            }
            lockableBottomSheetBehavior.X(J12);
            frameLayout2.requestLayout();
        }
        c0 c0Var = new c0(this, 11);
        this.N0 = c0Var;
        b8(c0Var);
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ig1.b.W0();
        super.onDestroy();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        c0 c0Var = this.N0;
        if (c0Var == null) {
            Intrinsics.r("shadowListener");
            throw null;
        }
        A8(c0Var);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q7(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ig1.b.W0();
        super.onStop();
    }

    @Override // yq0.t, yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        N8(state == yk1.i.LOADING);
    }
}
