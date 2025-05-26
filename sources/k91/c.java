package k91;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l11.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk91/c;", "Lyk1/k;", "Ll91/a;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c extends l implements l91.a {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f78808v0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f78809j0;

    /* renamed from: k0, reason: collision with root package name */
    public mr1.a f78810k0;

    /* renamed from: l0, reason: collision with root package name */
    public lu1.b f78811l0;

    /* renamed from: m0, reason: collision with root package name */
    public p91.d f78812m0;

    /* renamed from: n0, reason: collision with root package name */
    public ViewStub f78813n0;

    /* renamed from: o0, reason: collision with root package name */
    public ViewStub f78814o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltButton f78815p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f78816q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f78817r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f78818s0;

    /* renamed from: t0, reason: collision with root package name */
    public final d4 f78819t0 = d4.ADD_ACCOUNT;

    /* renamed from: u0, reason: collision with root package name */
    public final a4 f78820u0 = a4.ADD_SECONDARY_ACCOUNT;

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f78809j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        return new p91.d(((uk1.a) eVar).f(s7(), ""), A7(), p7());
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getM0() {
        return this.f78820u0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getL0() {
        return this.f78819t0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_add_additional_account_bottom_sheet;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(b52.a.header_view);
        int i13 = 3;
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.k0(b52.c.additional_account_add_account);
            settingsRoundHeaderView.g0(new a(this, i13));
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(b52.a.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        View findViewById = onCreateView.findViewById(b52.a.account_upsell_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f78813n0 = (ViewStub) findViewById;
        View findViewById2 = onCreateView.findViewById(b52.a.account_secondary_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f78814o0 = (ViewStub) findViewById2;
        View findViewById3 = onCreateView.findViewById(b52.a.upsell_create_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f78815p0 = (GestaltButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(b52.a.secondary_create_row);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f78816q0 = findViewById4;
        View findViewById5 = onCreateView.findViewById(b52.a.connect_existing_account_row);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f78817r0 = findViewById5;
        View findViewById6 = onCreateView.findViewById(b52.a.manage_accounts_row);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f78818s0 = findViewById6;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltButton gestaltButton = this.f78815p0;
        if (gestaltButton == null) {
            Intrinsics.r("upsellCreateGestaltButton");
            throw null;
        }
        gestaltButton.d(b.f78805j).e(new p(this, 21));
        View view = this.f78816q0;
        if (view == null) {
            Intrinsics.r("secondaryCreateRow");
            throw null;
        }
        view.setOnClickListener(new a(this, 0));
        View view2 = this.f78817r0;
        if (view2 == null) {
            Intrinsics.r("connectAccountRow");
            throw null;
        }
        view2.setOnClickListener(new a(this, 1));
        View view3 = this.f78818s0;
        if (view3 != null) {
            view3.setOnClickListener(new a(this, 2));
        } else {
            Intrinsics.r("manageAccountsRow");
            throw null;
        }
    }
}
