package tb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import g4.u;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lh0.o3;
import m60.w;
import mf0.l;
import xk2.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltb1/j;", "Lyk1/k;", "Lcom/pinterest/feature/settings/passcode/f;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends b implements com.pinterest.feature.settings.passcode.f {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f117156u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public u f117157j0;

    /* renamed from: k0, reason: collision with root package name */
    public i92.k f117158k0;

    /* renamed from: l0, reason: collision with root package name */
    public uk1.e f117159l0;

    /* renamed from: m0, reason: collision with root package name */
    public o3 f117160m0;

    /* renamed from: n0, reason: collision with root package name */
    public View f117161n0;

    /* renamed from: o0, reason: collision with root package name */
    public SettingsToggleItemView f117162o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f117163p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f117164q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f117165r0;

    /* renamed from: s0, reason: collision with root package name */
    public final a4 f117166s0;

    /* renamed from: t0, reason: collision with root package name */
    public final g0 f117167t0;

    public j() {
        m.b(new h81.b(this, 15));
        this.f117165r0 = d4.SETTINGS;
        this.f117166s0 = a4.PARENTAL_PASSCODE_SETTINGS;
        this.f117167t0 = g0.PARENTAL_PASSCODE_SETTINGS_VIEW;
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        View view = this.f117161n0;
        if (view != null) {
            bs1.c.M1(view);
        } else {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        if (this.f117157j0 == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f117159l0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        return u.X(((uk1.a) eVar).g(), A7(), p7());
    }

    public final void b8(boolean z13) {
        of0.a aVar;
        w f73 = f7();
        if (z13) {
            aVar = new of0.a(new l());
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new of0.a(null);
        }
        f73.d(aVar);
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF73409e1() {
        return this.f117167t0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.f117166s0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getR0() {
        return this.f117165r0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
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
        settingsRoundHeaderView.g0(new x91.k(this, 20));
        View findViewById = onCreateView.findViewById(f52.a.bottom_sheet_view_passcode);
        if (findViewById != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            findViewById.requestLayout();
        }
        View findViewById2 = onCreateView.findViewById(f52.a.settings_menu_container_passcode);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f117161n0 = findViewById2;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(f52.a.stiv_summary_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f117162o0 = (SettingsToggleItemView) findViewById;
        View findViewById2 = v13.findViewById(f52.a.parental_passcode_forgot_instructions);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f117163p0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(f52.a.gt_passcode_summary_email);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f117164q0 = (GestaltText) findViewById3;
    }
}
