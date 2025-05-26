package ba1;

import a.z0;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lba1/y;", "Lo82/i3;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class y extends i {
    public static final /* synthetic */ int M0 = 0;
    public final m1 F0;
    public SettingsRoundHeaderView G0;
    public ConstraintLayout H0;
    public GestaltIcon I0;
    public GestaltText J0;
    public final s K0;
    public final d4 L0;

    public y() {
        int i13 = 28;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new z91.l(2, new kl0.w(this, i13)));
        int i14 = 29;
        this.F0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(p0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.K0 = new s(this);
        this.L0 = d4.SETTINGS;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(b9().a(), 3);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(b9().c(), 21);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 0, new h81.b(this, 8), c.f22350a, new com.pinterest.boardAutoCollages.l(this, 5), new z0(this, 15), null, 96);
    }

    public final p0 b9() {
        return (p0) this.F0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF68107l0() {
        return this.L0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(b52.b.fragment_list_claimed_accounts, b52.a.list_claimed_recycler_view);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b9().h();
        f7().h(this.K0);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f7().j(this.K0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kh2.j.x2(b9(), new l(o82.d0.f93560a));
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.G0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(b52.a.api_migration_error_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.H0 = (ConstraintLayout) findViewById2;
        View findViewById3 = v13.findViewById(b52.a.api_migration_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.I0 = (GestaltIcon) findViewById3;
        View findViewById4 = v13.findViewById(b52.a.api_migration_error_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.J0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(b52.a.api_migration_action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById5;
        if (gestaltButton == null) {
            Intrinsics.r("instagramApiBannerActionButton");
            throw null;
        }
        gestaltButton.e(new l11.p(this, 29));
        SettingsRoundHeaderView settingsRoundHeaderView = this.G0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        int i13 = b52.c.claimed_accounts;
        settingsRoundHeaderView.g0(new x91.k(this, 1));
        settingsRoundHeaderView.k0(i13);
        settingsRoundHeaderView.setElevation(0.0f);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new w(this, null), 3);
    }
}
