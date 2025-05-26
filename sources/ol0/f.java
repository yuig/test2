package ol0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.detail.collaboratorview.view.BoardCollaboratorView;
import com.pinterest.feature.board.edit.view.BoardHeaderImagePreview;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.text.DescriptionEditView;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m1.e0;
import m60.f0;
import m60.w;
import pk.a0;
import q5.v0;
import so.o5;
import x02.u2;
import x02.x0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lol0/f;", "Lyk1/k;", "Lcom/pinterest/feature/board/edit/a;", "<init>", "()V", "edit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends r implements com.pinterest.feature.board.edit.a {
    public static final /* synthetic */ int V0 = 0;
    public BoardCollaboratorView A0;
    public GestaltIconButton B0;
    public LinearLayout C0;
    public DescriptionEditView D0;
    public LinearLayout E0;
    public GestaltSwitch F0;
    public ConstraintLayout G0;
    public GestaltSwitch H0;
    public View I0;
    public View J0;
    public GestaltText K0;
    public GestaltText L0;
    public ConstraintLayout M0;
    public GestaltText N0;
    public BoardHeaderImagePreview O0;
    public GestaltText P0;
    public ll0.f Q0;
    public boolean R0;
    public final d4 S0 = d4.BOARD;
    public final a4 T0 = a4.BOARD_EDIT;
    public final xk2.v U0 = xk2.m.b(new d(this, 0));

    /* renamed from: j0, reason: collision with root package name */
    public o5 f96370j0;

    /* renamed from: k0, reason: collision with root package name */
    public i92.k f96371k0;

    /* renamed from: l0, reason: collision with root package name */
    public f0 f96372l0;

    /* renamed from: m0, reason: collision with root package name */
    public uk1.e f96373m0;

    /* renamed from: n0, reason: collision with root package name */
    public yk1.j f96374n0;

    /* renamed from: o0, reason: collision with root package name */
    public x0 f96375o0;

    /* renamed from: p0, reason: collision with root package name */
    public ap.o f96376p0;

    /* renamed from: q0, reason: collision with root package name */
    public pb0.d f96377q0;

    /* renamed from: r0, reason: collision with root package name */
    public u2 f96378r0;

    /* renamed from: s0, reason: collision with root package name */
    public gi.m f96379s0;

    /* renamed from: t0, reason: collision with root package name */
    public nx.f0 f96380t0;

    /* renamed from: u0, reason: collision with root package name */
    public oc.c f96381u0;

    /* renamed from: v0, reason: collision with root package name */
    public x92.b f96382v0;

    /* renamed from: w0, reason: collision with root package name */
    public c2 f96383w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltButton f96384x0;

    /* renamed from: y0, reason: collision with root package name */
    public LinearLayout f96385y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltTextField f96386z0;

    @Override // yk1.k, nl1.d
    public final void L7() {
        V6();
        super.L7();
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        ll0.f fVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_HEADER_IMAGE_RESULT_CODE") && result.getBoolean("com.pinterest.EXTRA_BOARD_HEADER_IMAGE_RESULT_UPLOAD_STARTED") && (fVar = this.Q0) != null) {
            fVar.p3();
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(a70.c.board_edit);
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_icon_default, m60.x0.cancel);
        int i13 = 2;
        gestaltToolbarImpl.U(new a(this, i13));
        gestaltToolbarImpl.b(d70.e.view_done_actionbar);
        View findViewById = requireView().findViewById(d70.d.done_btn);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.e(new b(this, 1));
        v0.o(gestaltButton, new androidx.core.widget.g(i13));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f96384x0 = gestaltButton;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        o5 o5Var = this.f96370j0;
        if (o5Var == null) {
            Intrinsics.r("boardEditPresenterFactory");
            throw null;
        }
        String d83 = d8();
        uk1.e eVar = this.f96373m0;
        if (eVar != null) {
            return o5Var.a(((uk1.a) eVar).f(s7(), ""), d83);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final void b8(m boardHeader) {
        Intrinsics.checkNotNullParameter(boardHeader, "boardHeader");
        BoardHeaderImagePreview boardHeaderImagePreview = this.O0;
        if (boardHeaderImagePreview == null) {
            Intrinsics.r("boardHeaderImagePreview");
            throw null;
        }
        boardHeaderImagePreview.T(boardHeader);
        bs1.c.U1(boardHeaderImagePreview);
        GestaltText gestaltText = this.P0;
        if (gestaltText != null) {
            a0.w1(gestaltText);
        } else {
            Intrinsics.r("boardHeaderImageTitle");
            throw null;
        }
    }

    public final void c8(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_BOARD_EDIT_ACTION", result);
        Unit unit = Unit.f80348a;
        X6("com.pinterest.EXTRA_BOARD_EDIT_RESULT_CODE", bundle);
    }

    public final String d8() {
        Navigation navigation = this.I;
        Intrinsics.f(navigation);
        f0 f0Var = this.f96372l0;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.N(navigation, "navigation object can't be null", new Object[0]);
        v7 P1 = navigation.P1();
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        String uid = P1 != null ? P1.getUid() : null;
        return uid == null ? f49940b : uid;
    }

    public final void e8() {
        String string;
        ConstraintLayout constraintLayout = this.G0;
        if (constraintLayout == null) {
            Intrinsics.r("homefeedRecommendationsContainer");
            throw null;
        }
        String string2 = getString(a70.c.board_personalization);
        GestaltSwitch gestaltSwitch = this.H0;
        if (gestaltSwitch == null) {
            Intrinsics.r("allowHomefeedRecommendationsSwitch");
            throw null;
        }
        if (gestaltSwitch.l().f()) {
            string = getString(d70.g.board_edit_switch_accessibility_enabled_state);
            Intrinsics.f(string);
        } else {
            string = getString(d70.g.board_edit_switch_accessibility_disabled_state);
            Intrinsics.f(string);
        }
        constraintLayout.setContentDescription(string2 + " - " + string);
    }

    public final void f8() {
        String string;
        ConstraintLayout constraintLayout = this.M0;
        if (constraintLayout == null) {
            Intrinsics.r("secretContainer");
            throw null;
        }
        String string2 = getString(d70.g.board_secret_toggle);
        GestaltSwitch gestaltSwitch = this.F0;
        if (gestaltSwitch == null) {
            Intrinsics.r("secretToggleSwitch");
            throw null;
        }
        if (gestaltSwitch.l().f()) {
            string = getString(d70.g.board_edit_switch_accessibility_enabled_state);
            Intrinsics.f(string);
        } else {
            string = getString(d70.g.board_edit_switch_accessibility_disabled_state);
            Intrinsics.f(string);
        }
        constraintLayout.setContentDescription(string2 + " - " + string);
    }

    public final void g8() {
        d dVar = new d(this, 4);
        GestaltSwitch gestaltSwitch = this.F0;
        if (gestaltSwitch == null) {
            Intrinsics.r("secretToggleSwitch");
            throw null;
        }
        pe.i.i(gestaltSwitch, new e0(23, dVar));
        ConstraintLayout constraintLayout = this.M0;
        if (constraintLayout != null) {
            v0.m(constraintLayout, r5.d.f106213g, getString(d70.g.board_edit_switch_accessibility_action), new c(this, dVar, 1));
        } else {
            Intrinsics.r("secretContainer");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        return (HashMap) this.U0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getH0() {
        return this.T0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.S0;
    }

    public final yb0.n h8(String str, String str2, String str3) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        yb0.n nVar = new yb0.n(requireContext);
        nVar.w(str);
        nVar.u(str2);
        nVar.q(str3);
        String string = getString(m60.x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.m(string);
        nVar.setFocusable(true);
        nVar.setFocusableInTouchMode(true);
        nVar.requestFocus();
        return nVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = a70.b.fragment_board_edit;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(a70.a.edit_board_board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f96386z0 = (GestaltTextField) findViewById;
        View findViewById2 = v13.findViewById(a70.a.edit_board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f96385y0 = (LinearLayout) findViewById2;
        View findViewById3 = v13.findViewById(a70.a.board_edit_collaborator_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = v13.findViewById(a70.a.board_edit_collaborator_facepile);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.A0 = (BoardCollaboratorView) findViewById4;
        View findViewById5 = v13.findViewById(a70.a.board_edit_add_collaborator_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.B0 = (GestaltIconButton) findViewById5;
        View findViewById6 = v13.findViewById(a70.a.board_edit_collaborator_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        View findViewById7 = v13.findViewById(a70.a.edit_board_description);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.C0 = (LinearLayout) findViewById7;
        View findViewById8 = v13.findViewById(a70.a.edit_board_description_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.D0 = (DescriptionEditView) findViewById8;
        View findViewById9 = v13.findViewById(a70.a.edit_board_secret);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.E0 = (LinearLayout) findViewById9;
        ((GestaltText) v13.findViewById(a70.a.board_edit_secret_label)).i(e.f96359l);
        View findViewById10 = v13.findViewById(a70.a.board_edit_secret_container);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.M0 = (ConstraintLayout) findViewById10;
        View findViewById11 = v13.findViewById(a70.a.board_edit_secret_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.F0 = (GestaltSwitch) findViewById11;
        View findViewById12 = v13.findViewById(a70.a.board_edit_personalization_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.G0 = (ConstraintLayout) findViewById12;
        ((GestaltText) v13.findViewById(a70.a.board_edit_personalisation_label)).i(e.f96360m);
        View findViewById13 = v13.findViewById(a70.a.board_edit_personalisation_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.H0 = (GestaltSwitch) findViewById13;
        View findViewById14 = v13.findViewById(a70.a.edit_board_delete_container);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.I0 = findViewById14;
        View findViewById15 = v13.findViewById(a70.a.edit_board_actions_text);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.N0 = (GestaltText) findViewById15;
        View findViewById16 = v13.findViewById(a70.a.edit_board_leave_container);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.J0 = findViewById16;
        View findViewById17 = v13.findViewById(a70.a.edit_board_delete_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        View findViewById18 = v13.findViewById(a70.a.edit_board_delete);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        View findViewById19 = v13.findViewById(a70.a.edit_board_leave);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        View findViewById20 = v13.findViewById(a70.a.leave_board_details);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.K0 = (GestaltText) findViewById20;
        View findViewById21 = v13.findViewById(a70.a.secret_board_education);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.L0 = (GestaltText) findViewById21;
        View findViewById22 = v13.findViewById(a70.a.edit_board_secret_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        View findViewById23 = v13.findViewById(a70.a.delete_board_details);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById23;
        if (gestaltText == null) {
            Intrinsics.r("boardDeletionText");
            throw null;
        }
        gestaltText.setText(getResources().getString(a70.c.soft_delete_board_details, 7));
        View findViewById24 = v13.findViewById(a70.a.board_header_image_title);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        this.P0 = (GestaltText) findViewById24;
        View findViewById25 = v13.findViewById(a70.a.board_header_image_preview);
        BoardHeaderImagePreview boardHeaderImagePreview = (BoardHeaderImagePreview) findViewById25;
        int i13 = 1;
        boardHeaderImagePreview.X(new d(this, i13));
        int i14 = 2;
        boardHeaderImagePreview.L(new d(this, i14));
        Intrinsics.checkNotNullExpressionValue(findViewById25, "apply(...)");
        this.O0 = boardHeaderImagePreview;
        GestaltTextField gestaltTextField = this.f96386z0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardNameEditText");
            throw null;
        }
        gestaltTextField.Z(new b(this, i14));
        View view = this.J0;
        if (view == null) {
            Intrinsics.r("leaveContainer");
            throw null;
        }
        view.setOnClickListener(new a(this, 0));
        View view2 = this.I0;
        if (view2 == null) {
            Intrinsics.r("deleteContainer");
            throw null;
        }
        view2.setOnClickListener(new a(this, i13));
        String d83 = d8();
        if (this.f96374n0 == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        BoardCollaboratorView boardCollaboratorView = this.A0;
        if (boardCollaboratorView == null) {
            Intrinsics.r("collaboratorFacepile");
            throw null;
        }
        yk1.m c13 = yk1.j.c(boardCollaboratorView);
        if (c13 instanceof kk0.a) {
            ((mk0.e) ((kk0.a) c13)).s3(d83);
        } else {
            x0 x0Var = this.f96375o0;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            u2 u2Var = this.f96378r0;
            if (u2Var == null) {
                Intrinsics.r("userFeedRepository");
                throw null;
            }
            b60.b activeUserManager = getActiveUserManager();
            ap.o oVar = this.f96376p0;
            if (oVar == null) {
                Intrinsics.r("uploadContactsUtil");
                throw null;
            }
            w f73 = f7();
            uk1.e eVar = this.f96373m0;
            if (eVar == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            uk1.d f13 = ((uk1.a) eVar).f(s7(), d83);
            r41.k kVar = r41.k.f106176a;
            gi.m mVar = this.f96379s0;
            if (mVar == null) {
                Intrinsics.r("boardInviteUtils");
                throw null;
            }
            nx.f0 f0Var = this.f96380t0;
            if (f0Var == null) {
                Intrinsics.r("pinalyticsFactory");
                throw null;
            }
            oc.c cVar = this.f96381u0;
            if (cVar == null) {
                Intrinsics.r("apolloClient");
                throw null;
            }
            x92.b bVar = this.f96382v0;
            if (bVar == null) {
                Intrinsics.r("graphQLBoardCollaboratorRemoteDataSource");
                throw null;
            }
            c2 c2Var = this.f96383w0;
            if (c2Var == null) {
                Intrinsics.r("sharesheetUtils");
                throw null;
            }
            mk0.e eVar2 = new mk0.e(d83, true, x0Var, u2Var, activeUserManager, oVar, f73, f13, mVar, null, f0Var, cVar, bVar, c2Var);
            yk1.j jVar = this.f96374n0;
            if (jVar == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            BoardCollaboratorView boardCollaboratorView2 = this.A0;
            if (boardCollaboratorView2 == null) {
                Intrinsics.r("collaboratorFacepile");
                throw null;
            }
            jVar.d(boardCollaboratorView2, eVar2);
        }
        GestaltIconButton gestaltIconButton = this.B0;
        if (gestaltIconButton == null) {
            Intrinsics.r("addCollaboratorButton");
            throw null;
        }
        gestaltIconButton.u(new b(this, 0));
        g8();
        f8();
        DescriptionEditView descriptionEditView = this.D0;
        if (descriptionEditView == null) {
            Intrinsics.r("descriptionEt");
            throw null;
        }
        descriptionEditView.k(new a(this, 3));
        e8();
        Resources resources = getResources();
        int i15 = le0.c.ic_forward_arrow_nonpds;
        ThreadLocal threadLocal = e5.n.f57243a;
        kh2.n.b0(resources.getDrawable(i15, null));
    }
}
