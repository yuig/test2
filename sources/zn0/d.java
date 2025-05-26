package zn0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.y;
import com.pinterest.ui.components.modals.BoardSectionEditOption;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.x0;
import rm1.q;
import so.t5;
import u50.k0;
import yk1.i;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lzn0/d;", "Lyk1/k;", "Lxn0/a;", "<init>", "()V", "gi2/b", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends f implements xn0.a {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f142270u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public FullBleedGestaltSpinner f142271j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltTextField f142272k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f142273l0;

    /* renamed from: m0, reason: collision with root package name */
    public BoardSectionEditOption f142274m0;

    /* renamed from: n0, reason: collision with root package name */
    public BoardSectionEditOption f142275n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton.SmallPrimaryButton f142276o0;

    /* renamed from: p0, reason: collision with root package name */
    public yn0.d f142277p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f142278q0;

    /* renamed from: r0, reason: collision with root package name */
    public t5 f142279r0;

    /* renamed from: s0, reason: collision with root package name */
    public final d4 f142280s0 = d4.BOARD_SECTION;

    /* renamed from: t0, reason: collision with root package name */
    public final a4 f142281t0 = a4.BOARD_SECTION_EDIT;

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        FragmentActivity E4 = E4();
        Window window = E4 != null ? E4.getWindow() : null;
        if (window == null || window.getAttributes() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            this.f142278q0 = attributes.softInputMode;
        }
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        Window window;
        V6();
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(this.f142278q0);
        }
        GestaltTextField gestaltTextField = this.f142272k0;
        if (gestaltTextField == null) {
            Intrinsics.r("boardSectionNameEditField");
            throw null;
        }
        hf0.b.k(gestaltTextField);
        super.L7();
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_SECTION_MERGE_RESULT_CODE")) {
            String string = result.getString("com.pinterest.EXTRA_BOARD_SECTION_MERGE_SOURCE_ID");
            Navigation navigation = this.I;
            String f49940b = navigation != null ? navigation.getF49940b() : null;
            if (f49940b == null) {
                f49940b = "";
            }
            if (z.i(f49940b, string, true)) {
                b8();
            }
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.I();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null);
        this.f142276o0 = smallPrimaryButton;
        smallPrimaryButton.d(c.f142268m);
        GestaltButton.SmallPrimaryButton smallPrimaryButton2 = this.f142276o0;
        if (smallPrimaryButton2 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        smallPrimaryButton2.e(new a(this, 0));
        c8(false);
        GestaltButton.SmallPrimaryButton smallPrimaryButton3 = this.f142276o0;
        if (smallPrimaryButton3 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        gestaltToolbarImpl.c(smallPrimaryButton3);
        gestaltToolbarImpl.b0(getResources().getString(k70.e.edit_board_section));
        gestaltToolbarImpl.m();
        q qVar = q.CANCEL;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        gestaltToolbarImpl.Q(qVar.drawableRes(requireContext2, dl2.b.f1(requireContext3)), eo1.b.color_themed_text_default, x0.cancel);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        gestaltToolbarImpl.w().setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // yk1.k
    public final m V7() {
        t5 t5Var = this.f142279r0;
        if (t5Var == null) {
            Intrinsics.r("boardSectionEditPresenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        return t5Var.a(f49940b, com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", ""));
    }

    public final void b8() {
        za.c remove = Navigation.remove();
        ScreenLocation b13 = y.b();
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        remove.a(Navigation.z0(b13, f49940b));
        remove.a(this.I);
        f7().d(remove);
    }

    public final void c8(boolean z13) {
        k0 k0Var;
        if (z13) {
            int i13 = k70.e.content_description_done_button;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            k0Var = new k0(i13, new ArrayList(0));
        } else {
            int i14 = k70.e.content_description_done_button_disabled;
            String[] formatArgs2 = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
            k0Var = new k0(i14, new ArrayList(0));
        }
        GestaltButton.SmallPrimaryButton smallPrimaryButton = this.f142276o0;
        if (smallPrimaryButton != null) {
            smallPrimaryButton.d(new r1.f(z13, k0Var, 15));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d8() {
        /*
            r4 = this;
            com.pinterest.ui.components.modals.BoardSectionEditOption r0 = r4.f142274m0
            r1 = 0
            if (r0 == 0) goto L33
            boolean r0 = kh2.k3.v1(r0)
            r2 = 1
            if (r0 != 0) goto L1f
            com.pinterest.ui.components.modals.BoardSectionEditOption r0 = r4.f142275n0
            if (r0 == 0) goto L19
            boolean r0 = kh2.k3.v1(r0)
            if (r0 == 0) goto L17
            goto L1f
        L17:
            r0 = 0
            goto L20
        L19:
            java.lang.String r0 = "deleteSectionOption"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        L1f:
            r0 = r2
        L20:
            com.pinterest.gestalt.text.GestaltText r3 = r4.f142273l0
            if (r3 == 0) goto L2d
            rn0.d r1 = new rn0.d
            r1.<init>(r0, r2)
            r3.i(r1)
            return
        L2d:
            java.lang.String r0 = "manageOptionsHeader"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        L33:
            java.lang.String r0 = "mergeSectionOption"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.d.d8():void");
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getD0() {
        return this.f142281t0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getC0() {
        return this.f142280s0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = k70.c.board_section_edit_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(k70.b.loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f142271j0 = (FullBleedGestaltSpinner) findViewById;
        View findViewById2 = onCreateView.findViewById(k70.b.board_section_name_edit_field);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f142272k0 = (GestaltTextField) findViewById2;
        View findViewById3 = onCreateView.findViewById(k70.b.board_section_manage);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f142273l0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(k70.b.merge_board_section);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f142274m0 = (BoardSectionEditOption) findViewById4;
        View findViewById5 = onCreateView.findViewById(k70.b.delete_board_section);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f142275n0 = (BoardSectionEditOption) findViewById5;
        FullBleedGestaltSpinner fullBleedGestaltSpinner = this.f142271j0;
        if (fullBleedGestaltSpinner != null) {
            fullBleedGestaltSpinner.a(ln1.e.LOADED);
            return onCreateView;
        }
        Intrinsics.r("loadingView");
        throw null;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        BoardSectionEditOption boardSectionEditOption = this.f142274m0;
        if (boardSectionEditOption == null) {
            Intrinsics.r("mergeSectionOption");
            throw null;
        }
        String string = getString(k70.e.merge_board_section);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        boardSectionEditOption.p(string);
        BoardSectionEditOption boardSectionEditOption2 = this.f142274m0;
        if (boardSectionEditOption2 == null) {
            Intrinsics.r("mergeSectionOption");
            throw null;
        }
        String string2 = getString(k70.e.merge_board_section_details);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        boardSectionEditOption2.c(string2);
        BoardSectionEditOption boardSectionEditOption3 = this.f142275n0;
        if (boardSectionEditOption3 == null) {
            Intrinsics.r("deleteSectionOption");
            throw null;
        }
        String string3 = getString(k70.e.delete_board_section);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        boardSectionEditOption3.p(string3);
        BoardSectionEditOption boardSectionEditOption4 = this.f142275n0;
        if (boardSectionEditOption4 == null) {
            Intrinsics.r("deleteSectionOption");
            throw null;
        }
        String string4 = getString(k70.e.delete_board_section_details);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        boardSectionEditOption4.c(string4);
        GestaltTextField gestaltTextField = this.f142272k0;
        if (gestaltTextField != null) {
            gestaltTextField.Z(new a(this, 1));
        } else {
            Intrinsics.r("boardSectionNameEditField");
            throw null;
        }
    }

    @Override // yk1.n
    public final void setLoadState(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FullBleedGestaltSpinner fullBleedGestaltSpinner = this.f142271j0;
        if (fullBleedGestaltSpinner != null) {
            fullBleedGestaltSpinner.showLoadingSpinner(state == i.LOADING);
        } else {
            Intrinsics.r("loadingView");
            throw null;
        }
    }
}
