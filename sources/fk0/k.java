package fk0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateAddCollaboratorsView;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNamingView;
import com.pinterest.feature.board.create.view.BoardCreateBoardRepTile;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import pk.a0;
import so.g3;
import so.k2;
import so.v2;
import u50.k0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lfk0/k;", "Lyk1/k;", "Lcom/pinterest/feature/board/create/c;", "Lbk0/b;", "Lf11/h;", "<init>", "()V", "gi2/b", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends y implements com.pinterest.feature.board.create.c, bk0.b, f11.h {
    public static final /* synthetic */ int L0 = 0;
    public v2 A0;
    public i92.k B0;
    public g3 C0;
    public yk1.j D0;
    public oc.c E0;

    /* renamed from: j0, reason: collision with root package name */
    public BoardCreateBoardRepTile f62294j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltSwitchWithLabel f62295k0;

    /* renamed from: l0, reason: collision with root package name */
    public BoardCreateBoardNamingView f62296l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f62297m0;

    /* renamed from: n0, reason: collision with root package name */
    public BoardCreateAddCollaboratorsView f62298n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f62299o0;

    /* renamed from: p0, reason: collision with root package name */
    public ViewGroup f62300p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton.SmallPrimaryButton f62301q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltTextField f62302r0;

    /* renamed from: t0, reason: collision with root package name */
    public String f62304t0;

    /* renamed from: u0, reason: collision with root package name */
    public ek0.h f62305u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f62306v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f62307w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f62308x0;

    /* renamed from: z0, reason: collision with root package name */
    public k2 f62310z0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f62303s0 = true;

    /* renamed from: y0, reason: collision with root package name */
    public String f62309y0 = "";
    public final d4 F0 = d4.BOARD;
    public final a4 G0 = a4.BOARD_CREATE;
    public final lj0.a H0 = new lj0.a(this, 5);
    public final h I0 = new h(this, 0);
    public final h J0 = new h(this, 1);
    public final xk2.v K0 = xk2.m.b(new jh0.d(this, 11));

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        V6();
        GestaltTextField gestaltTextField = this.f62302r0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardNameEt");
            throw null;
        }
        gestaltTextField.clearFocus();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.L7();
    }

    @Override // nl1.d
    public final void P7() {
        s7().F(g0.MODAL_CREATE_BOARD, u0.CANCEL_BUTTON);
        super.P7();
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation;
        this.f62306v0 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", false);
        if ((E4() instanceof MainActivity) && (navigation = this.I) != null) {
            navigation.Y1("com.pinterest.EXTRA_IS_MAIN_ACTIVITY", true);
        }
        k2 k2Var = this.f62310z0;
        if (k2Var == null) {
            Intrinsics.r("boardCreatePresenterFactory");
            throw null;
        }
        Navigation navigation2 = this.I;
        v2 v2Var = this.A0;
        if (v2Var == null) {
            Intrinsics.r("boardCreatePinalyticsFactory");
            throw null;
        }
        String f49940b = navigation2 != null ? navigation2.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        xj0.a a13 = v2Var.a(f49940b);
        oc.c cVar = this.E0;
        if (cVar == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        ek0.h a14 = k2Var.a(navigation2, a13, cVar, (String) this.K0.getValue(), com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_SESSION_ID", ""));
        Intrinsics.checkNotNullExpressionValue(a14, "create(...)");
        return a14;
    }

    public final void b8(String str) {
        if (!U6()) {
            P7();
            return;
        }
        Bundle bundle = new Bundle();
        if (j1.U0(str)) {
            bundle.putString("com.pinterest.EXTRA_NEWLY_CREATED_BOARD_ID", str);
        }
        P6("com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE", bundle);
        D5();
    }

    public final BoardCreateBoardNamingView c8() {
        BoardCreateBoardNamingView boardCreateBoardNamingView = this.f62296l0;
        if (boardCreateBoardNamingView != null) {
            return boardCreateBoardNamingView;
        }
        Intrinsics.r("boardNamingView");
        throw null;
    }

    @Override // nl1.d, f11.h
    public final void d2() {
        ViewGroup viewGroup = this.f62300p0;
        if (viewGroup == null) {
            Intrinsics.r("containerView");
            throw null;
        }
        hf0.b.k(viewGroup);
        P7();
    }

    public final void d8(boolean z13) {
        int i13 = z13 ? x60.c.board_name_et : x60.c.board_name_edittext;
        int i14 = 2;
        requireView().findViewById(x60.c.board_name_edittext).setOnFocusChangeListener(new com.google.android.material.datepicker.h(this, i14));
        View findViewById = requireView().findViewById(i13);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        ph.a.p(gestaltTextField, i.f62284l);
        this.f62302r0 = gestaltTextField;
        gestaltTextField.Z(new h(this, i14));
        GestaltTextField gestaltTextField2 = this.f62302r0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("boardNameEt");
            throw null;
        }
        ph.a.p(gestaltTextField2, i.f62285m);
        GestaltTextField gestaltTextField3 = this.f62302r0;
        if (gestaltTextField3 != null) {
            gestaltTextField3.Z(new h(this, 3));
        } else {
            Intrinsics.r("boardNameEt");
            throw null;
        }
    }

    public final void e8(boolean z13) {
        GestaltText gestaltText = this.f62297m0;
        if (gestaltText == null) {
            Intrinsics.r("addCollaboratorTitle");
            throw null;
        }
        pp2.a.k(gestaltText, new jc0.m(z13, 12));
        BoardCreateAddCollaboratorsView boardCreateAddCollaboratorsView = this.f62298n0;
        if (boardCreateAddCollaboratorsView != null) {
            bs1.c.R1(boardCreateAddCollaboratorsView, z13);
        } else {
            Intrinsics.r("addCollaboratorsView");
            throw null;
        }
    }

    public final void f8(k0 k0Var) {
        GestaltTextField gestaltTextField = this.f62302r0;
        if (gestaltTextField != null) {
            ph.a.p(gestaltTextField, new fx.e(2, k0Var));
        } else {
            Intrinsics.r("boardNameEt");
            throw null;
        }
    }

    public final void g8(boolean z13) {
        GestaltText gestaltText = this.f62299o0;
        if (gestaltText == null) {
            Intrinsics.r("boardSecretToggleHeader");
            throw null;
        }
        int i13 = 13;
        pp2.a.k(gestaltText, new r1.f(z13, this, i13));
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f62295k0;
        if (gestaltSwitchWithLabel != null) {
            c0.d.k(gestaltSwitchWithLabel, new jc0.m(z13, i13));
        } else {
            Intrinsics.r("secretBoardToggle");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF72616t0() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF72615s0() {
        return this.F0;
    }

    public final void h8(String message, boolean z13) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (z13) {
            i92.k kVar = this.B0;
            if (kVar != null) {
                kVar.i(message);
                return;
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
        i92.k kVar2 = this.B0;
        if (kVar2 != null) {
            kVar2.m(message);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.f62307w0 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_JUMPSTART_ENABLED", false);
        super.onCreate(bundle);
        this.E = x60.d.fragment_board_create;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(x60.c.board_rep);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f62294j0 = (BoardCreateBoardRepTile) findViewById;
        View findViewById2 = onCreateView.findViewById(x60.c.is_secret_board_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f62295k0 = (GestaltSwitchWithLabel) findViewById2;
        View findViewById3 = onCreateView.findViewById(x60.c.board_naming_view);
        BoardCreateBoardNamingView boardCreateBoardNamingView = (BoardCreateBoardNamingView) findViewById3;
        boardCreateBoardNamingView.a(this);
        boardCreateBoardNamingView.setContentDescription(boardCreateBoardNamingView.getResources().getString(f02.g.create_board_title));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        Intrinsics.checkNotNullParameter(boardCreateBoardNamingView, "<set-?>");
        this.f62296l0 = boardCreateBoardNamingView;
        View findViewById4 = onCreateView.findViewById(x60.c.add_collaborator_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f62297m0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(x60.c.board_add_collaborator_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f62298n0 = (BoardCreateAddCollaboratorsView) findViewById5;
        View findViewById6 = onCreateView.findViewById(x60.c.is_secret_board_header);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f62299o0 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(x60.c.board_create_container);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f62300p0 = (ViewGroup) findViewById7;
        View findViewById8 = onCreateView.findViewById(x60.c.header_view);
        HeaderCell headerCell = (HeaderCell) findViewById8;
        headerCell.Z(this);
        headerCell.a0(d70.g.create_new_board);
        headerCell.setElevation(0.0f);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null);
        bs1.c.s(smallPrimaryButton, i.f62286n);
        smallPrimaryButton.e(this.I0);
        this.f62301q0 = smallPrimaryButton;
        if (this.f62307w0) {
            bs1.c.s(smallPrimaryButton, i.f62283k);
        }
        GestaltButton.SmallPrimaryButton smallPrimaryButton2 = this.f62301q0;
        if (smallPrimaryButton2 == null) {
            Intrinsics.r("createBtn");
            throw null;
        }
        headerCell.L(smallPrimaryButton2);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_SOURCE", "");
        Intrinsics.checkNotNullParameter(Z, "<set-?>");
        this.f62309y0 = Z;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ig1.b.W0();
        super.onDestroy();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        GestaltTextField gestaltTextField = this.f62302r0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardNameEt");
            throw null;
        }
        hf0.b.k(gestaltTextField);
        super.onDestroyView();
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        GestaltTextField gestaltTextField = this.f62302r0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardNameEt");
            throw null;
        }
        if (j1.U0(gestaltTextField.z0())) {
            GestaltTextField gestaltTextField2 = this.f62302r0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("boardNameEt");
                throw null;
            }
            outState.putString("board_name", String.valueOf(gestaltTextField2.z0()));
        }
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f62295k0;
        if (gestaltSwitchWithLabel == null) {
            Intrinsics.r("secretBoardToggle");
            throw null;
        }
        outState.putBoolean("is_board_secret", gestaltSwitchWithLabel.Z().f().f());
        Navigation navigation = this.I;
        outState.putParcelable("com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT", (BoardCreateOrPickerNavigation) (navigation != null ? navigation.i0("com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT") : null));
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ig1.b.W0();
        super.onStop();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        this.f62304t0 = com.bumptech.glide.d.Z(this, "board_name", "");
        boolean G = com.bumptech.glide.d.G(this, "is_board_secret", false);
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f62295k0;
        if (gestaltSwitchWithLabel == null) {
            Intrinsics.r("secretBoardToggle");
            throw null;
        }
        c0.d.k(gestaltSwitchWithLabel, new jc0.m(G, 8));
        gestaltSwitchWithLabel.X(this.J0);
        new Handler().post(new c2(this, 15));
        yk1.j jVar = this.D0;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        BoardCreateAddCollaboratorsView boardCreateAddCollaboratorsView = this.f62298n0;
        if (boardCreateAddCollaboratorsView == null) {
            Intrinsics.r("addCollaboratorsView");
            throw null;
        }
        g3 g3Var = this.C0;
        if (g3Var == null) {
            Intrinsics.r("collaboratorsViewPresenterFactory");
            throw null;
        }
        jVar.d(boardCreateAddCollaboratorsView, g3Var.a(s7()));
        ViewGroup viewGroup = this.f62300p0;
        if (viewGroup == null) {
            Intrinsics.r("containerView");
            throw null;
        }
        viewGroup.setMinimumHeight(hf0.b.f69003c);
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_NAME", "");
        if (Z.length() > 0) {
            GestaltTextField gestaltTextField = this.f62302r0;
            if (gestaltTextField != null) {
                ph.a.p(gestaltTextField, new jc0.l(Z, 26));
            } else {
                Intrinsics.r("boardNameEt");
                throw null;
            }
        }
    }
}
