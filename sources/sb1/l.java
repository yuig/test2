package sb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import h32.g0;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import n91.z;
import rq.c2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsb1/l;", "Lnl1/d;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l extends a {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f112255j0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f112256c0 = d4.SETTINGS;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f112257d0 = a4.PARENTAL_PASSCODE_SETTINGS;

    /* renamed from: e0, reason: collision with root package name */
    public final m1 f112258e0;

    /* renamed from: f0, reason: collision with root package name */
    public SettingsToggleItemView f112259f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f112260g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltText f112261h0;

    /* renamed from: i0, reason: collision with root package name */
    public final s91.l f112262i0;

    public l() {
        int i13 = 8;
        xk2.k r13 = d7.g.r(12, new t0(this, i13), xk2.n.NONE);
        int i14 = 9;
        this.f112258e0 = a1.s(this, k0.f80436a.b(t.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        xk2.m.b(new h81.b(this, 14));
        this.f112262i0 = new s91.l(f52.c.settings_parental_passcode_header_title, z.b(f52.c.settings_account_management_passcode_description), false, true);
    }

    @Override // nl1.d, nx.i1
    public final g0 b2() {
        return g0.PARENTAL_PASSCODE_SETTINGS_VIEW;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF35234i() {
        return this.f112257d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35233h() {
        return this.f112256c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = f52.b.fragment_passcode_summary;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(f52.a.header_view_passcode);
        settingsRoundHeaderView.k0(c52.e.settings_account_management_parental_passcode_title);
        settingsRoundHeaderView.g0(new x91.k(this, 18));
        View findViewById = onCreateView.findViewById(f52.a.bottom_sheet_view_passcode);
        if (findViewById != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            findViewById.requestLayout();
        }
        Intrinsics.checkNotNullExpressionValue(onCreateView.findViewById(f52.a.settings_menu_container_passcode), "findViewById(...)");
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(f52.a.stiv_summary_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f112259f0 = (SettingsToggleItemView) findViewById;
        View findViewById2 = v13.findViewById(f52.a.parental_passcode_forgot_instructions);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f112260g0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(f52.a.gt_passcode_summary_email);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f112261h0 = (GestaltText) findViewById3;
        SettingsToggleItemView settingsToggleItemView = this.f112259f0;
        if (settingsToggleItemView == null) {
            Intrinsics.r("toggleItemView");
            throw null;
        }
        settingsToggleItemView.f48365a = new i1.h(this, 22);
        settingsToggleItemView.a(this.f112262i0);
        GestaltText gestaltText = this.f112260g0;
        if (gestaltText == null) {
            Intrinsics.r("instructionsView");
            throw null;
        }
        gestaltText.i(new c2(gestaltText, 13));
        gestaltText.j(new ca1.h(this, 5));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new j(this, null), 3);
    }
}
