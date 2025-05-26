package rn0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.compose.foundation.lazy.layout.z0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.feature.boardsection.create.view.BoardSectionNameSuggestionsContainer;
import com.pinterest.feature.boardsection.pincarousel.view.BoardSectionPinCarousel;
import com.pinterest.feature.pin.j;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.repository.pin.PinService;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import m60.x0;
import mn0.h;
import nt.c2;
import pk.a0;
import rm1.q;
import rq.n3;
import so.oa;
import so.q5;
import x02.i2;
import yk1.i;
import yk1.k;
import yk1.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrn0/e;", "Lyk1/k;", "Lln0/b;", "Lln0/c;", "<init>", "()V", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends k implements ln0.b, ln0.c {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f108830v0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public FullBleedGestaltSpinner f108831e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltTextField f108832f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltButton.SmallPrimaryButton f108833g0;

    /* renamed from: h0, reason: collision with root package name */
    public BoardSectionNameSuggestionsContainer f108834h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f108835i0;

    /* renamed from: j0, reason: collision with root package name */
    public ArrayList f108836j0;

    /* renamed from: k0, reason: collision with root package name */
    public String f108837k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f108838l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f108839m0;

    /* renamed from: n0, reason: collision with root package name */
    public ln0.a f108840n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.pinterest.feature.boardsection.a f108841o0;

    /* renamed from: p0, reason: collision with root package name */
    public i2 f108842p0;

    /* renamed from: q0, reason: collision with root package name */
    public j f108843q0;

    /* renamed from: r0, reason: collision with root package name */
    public q5 f108844r0;

    /* renamed from: s0, reason: collision with root package name */
    public uk1.e f108845s0;

    /* renamed from: t0, reason: collision with root package name */
    public j12.k f108846t0;

    /* renamed from: u0, reason: collision with root package name */
    public PinService f108847u0;

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        if (E4() == null || requireActivity().getWindow() == null || requireActivity().getWindow().getAttributes() == null) {
            return;
        }
        Window window = requireActivity().getWindow();
        this.f108838l0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        V6();
        GestaltTextField gestaltTextField = this.f108832f0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardSectionTitleEditText");
            throw null;
        }
        hf0.b.k(gestaltTextField);
        if (E4() != null && requireActivity().getWindow() != null) {
            requireActivity().getWindow().setSoftInputMode(this.f108838l0);
        }
        super.L7();
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            com.pinterest.feature.boardsection.a enumFromValue = com.pinterest.feature.boardsection.a.getEnumFromValue(navigation.v0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE"));
            Intrinsics.checkNotNullExpressionValue(enumFromValue, "getEnumFromValue(...)");
            this.f108841o0 = enumFromValue;
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.I();
        j0 j0Var = new j0();
        j0Var.f80434a = "";
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.f108833g0 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null);
        com.pinterest.feature.boardsection.a aVar = this.f108841o0;
        if (aVar == null) {
            Intrinsics.r("boardSectionActionMode");
            throw null;
        }
        int i13 = b.f108823a[aVar.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            String string = getResources().getString(x0.done);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            j0Var.f80434a = string;
        } else if (i13 == 4) {
            String string2 = getResources().getString(x0.next);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            j0Var.f80434a = string2;
        }
        GestaltButton.SmallPrimaryButton smallPrimaryButton = this.f108833g0;
        if (smallPrimaryButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        smallPrimaryButton.d(new z0(7, j0Var));
        GestaltButton.SmallPrimaryButton smallPrimaryButton2 = this.f108833g0;
        if (smallPrimaryButton2 == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        smallPrimaryButton2.e(new a(this, 0));
        fo1.a i73 = i7();
        if (i73 != null) {
            GestaltButton.SmallPrimaryButton smallPrimaryButton3 = this.f108833g0;
            if (smallPrimaryButton3 == null) {
                Intrinsics.r("actionButton");
                throw null;
            }
            ((GestaltToolbarImpl) i73).c(smallPrimaryButton3);
        }
        gestaltToolbarImpl.Y(k70.e.add_board_section);
        com.pinterest.feature.boardsection.a aVar2 = this.f108841o0;
        if (aVar2 == null) {
            Intrinsics.r("boardSectionActionMode");
            throw null;
        }
        if (aVar2 == com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION) {
            q qVar = q.CANCEL;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            gestaltToolbarImpl.Q(qVar.drawableRes(requireContext2, dl2.b.f1(requireContext3)), eo1.b.color_themed_text_default, x0.cancel);
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
            gestaltToolbarImpl.w().setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
    }

    @Override // yk1.k
    public final m V7() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        this.f108835i0 = v03;
        Navigation navigation2 = this.I;
        this.f108836j0 = navigation2 != null ? navigation2.M("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST") : null;
        Navigation navigation3 = this.I;
        this.f108837k0 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_SHUFFLE_ASSET_ID") : null;
        Navigation navigation4 = this.I;
        ArrayList M = navigation4 != null ? navigation4.M("com.pinterest.EXTRA_SELECT_ALL_EXCLUDE_PINS") : null;
        Navigation navigation5 = this.I;
        Boolean valueOf = navigation5 != null ? Boolean.valueOf(navigation5.S("com.pinterest.EXTRA_IS_SELECT_ALL_MODE_ACTIVE", false)) : null;
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BULK_MOVE_ORIGIN_BOARD_ID", "");
        Navigation navigation6 = this.I;
        String v04 = navigation6 != null ? navigation6.v0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_SECTION_ID") : null;
        Navigation navigation7 = this.I;
        this.f108839m0 = navigation7 != null ? navigation7.S("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", false) : false;
        q5 q5Var = this.f108844r0;
        if (q5Var == null) {
            Intrinsics.r("boardSectionCreatePresenterFactory");
            throw null;
        }
        com.pinterest.feature.boardsection.a aVar = this.f108841o0;
        if (aVar == null) {
            Intrinsics.r("boardSectionActionMode");
            throw null;
        }
        String str = this.f108835i0;
        if (str == null) {
            Intrinsics.r("boardId");
            throw null;
        }
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        ArrayList arrayList = this.f108836j0;
        String str2 = this.f108837k0;
        j jVar = this.f108843q0;
        if (jVar != null) {
            return q5Var.a(aVar, str, booleanValue, Z, v04, arrayList, M, str2, jVar);
        }
        Intrinsics.r("pinAction");
        throw null;
    }

    public final void Y7() {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(getResources().getString(l70.d.section_added));
        z(c.f108824j);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getD0() {
        return a4.BOARD_SECTION_CREATE;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getC0() {
        return d4.BOARD_SECTION;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = k70.c.board_section_create_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(k70.b.loading_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FullBleedGestaltSpinner fullBleedGestaltSpinner = (FullBleedGestaltSpinner) findViewById;
        this.f108831e0 = fullBleedGestaltSpinner;
        if (fullBleedGestaltSpinner == null) {
            Intrinsics.r("loadingView");
            throw null;
        }
        fullBleedGestaltSpinner.a(ln1.e.LOADED);
        View findViewById2 = onCreateView.findViewById(k70.b.board_section_title_edit_field);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f108832f0 = (GestaltTextField) findViewById2;
        View findViewById3 = onCreateView.findViewById(k70.b.board_section_name_suggestions_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f108834h0 = (BoardSectionNameSuggestionsContainer) findViewById3;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ig1.b.W0();
        super.onDestroy();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        GestaltTextField gestaltTextField = this.f108832f0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardSectionTitleEditText");
            throw null;
        }
        gestaltTextField.Z(new n3(6));
        super.onDestroyView();
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
        GestaltTextField gestaltTextField = this.f108832f0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardSectionTitleEditText");
            throw null;
        }
        gestaltTextField.X(c.f108826l);
        GestaltTextField gestaltTextField2 = this.f108832f0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("boardSectionTitleEditText");
            throw null;
        }
        gestaltTextField2.Z(new a(this, 1));
        new Handler().post(new c2(this, 20));
        if (qb0.b.p(this.f108836j0)) {
            BoardSectionPinCarousel boardSectionPinCarousel = new BoardSectionPinCarousel(getContext());
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            boardSectionPinCarousel.e(a0.K(16, resources));
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            boardSectionPinCarousel.b(a0.K(16, resources2));
            uk2.f fVar = new uk2.f();
            Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
            ArrayList arrayList = this.f108836j0;
            uk1.e eVar = this.f108845s0;
            if (eVar == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            uk1.d g13 = ((uk1.a) eVar).g();
            uj2.q p73 = p7();
            i2 i2Var = this.f108842p0;
            if (i2Var == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            jo0.a aVar = new jo0.a(arrayList, fVar, g13, p73, i2Var);
            aVar.r3(new yk1.a(getResources(), requireContext().getTheme()));
            yk1.j.a().d(boardSectionPinCarousel, aVar);
            View view = getView();
            Intrinsics.g(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            p pVar = new p();
            View view2 = new View(getContext());
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            view2.setLayoutParams(new RelativeLayout.LayoutParams(-1, a0.L(resources3, 1.0f)));
            Context requireContext = requireContext();
            int i13 = eo1.b.color_themed_light_gray;
            Object obj = d5.a.f53679a;
            view2.setBackgroundColor(requireContext.getColor(i13));
            view2.setId(k70.b.board_section_create_header_divider);
            constraintLayout.addView(view2, 0);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.E = 0.0f;
            boardSectionPinCarousel.setId(k70.b.board_section_create_header);
            constraintLayout.addView(boardSectionPinCarousel, 0, layoutParams);
            pVar.j(constraintLayout);
            pVar.l(boardSectionPinCarousel.getId(), 3, k70.b.divider, 4);
            pVar.l(boardSectionPinCarousel.getId(), 6, 0, 6);
            pVar.l(boardSectionPinCarousel.getId(), 7, 0, 7);
            pVar.l(view2.getId(), 3, boardSectionPinCarousel.getId(), 4);
            pVar.l(view2.getId(), 6, 0, 6);
            pVar.l(view2.getId(), 7, 0, 7);
            GestaltTextField gestaltTextField3 = this.f108832f0;
            if (gestaltTextField3 == null) {
                Intrinsics.r("boardSectionTitleEditText");
                throw null;
            }
            pVar.l(gestaltTextField3.getId(), 3, view2.getId(), 4);
            pVar.b(constraintLayout);
        }
        String str = this.f108835i0;
        if (str == null) {
            Intrinsics.r("boardId");
            throw null;
        }
        ArrayList arrayList2 = this.f108836j0;
        PinService pinService = this.f108847u0;
        if (pinService == null) {
            Intrinsics.r("pinService");
            throw null;
        }
        j12.k kVar = this.f108846t0;
        if (kVar == null) {
            Intrinsics.r("boardSectionService");
            throw null;
        }
        uk1.e eVar2 = this.f108845s0;
        if (eVar2 == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        h hVar = new h(str, arrayList2, pinService, kVar, ((uk1.a) eVar2).g(), p7());
        BoardSectionNameSuggestionsContainer boardSectionNameSuggestionsContainer = this.f108834h0;
        if (boardSectionNameSuggestionsContainer == null) {
            Intrinsics.r("boardSectionNameSuggestionsContainer");
            throw null;
        }
        boardSectionNameSuggestionsContainer.b(this);
        yk1.j a13 = yk1.j.a();
        BoardSectionNameSuggestionsContainer boardSectionNameSuggestionsContainer2 = this.f108834h0;
        if (boardSectionNameSuggestionsContainer2 != null) {
            a13.d(boardSectionNameSuggestionsContainer2, hVar);
        } else {
            Intrinsics.r("boardSectionNameSuggestionsContainer");
            throw null;
        }
    }

    @Override // yk1.n
    public final void setLoadState(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FullBleedGestaltSpinner fullBleedGestaltSpinner = this.f108831e0;
        if (fullBleedGestaltSpinner != null) {
            fullBleedGestaltSpinner.a(dl2.b.T2(state));
        } else {
            Intrinsics.r("loadingView");
            throw null;
        }
    }
}
