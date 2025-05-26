package ca1;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lca1/o;", "Lnl1/d;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class o extends w {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f27214k0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f27215c0;

    /* renamed from: d0, reason: collision with root package name */
    public SettingsRoundHeaderView f27216d0;

    /* renamed from: e0, reason: collision with root package name */
    public FrameLayout f27217e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltSpinner f27218f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f27219g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f27220h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltListAction f27221i0;

    /* renamed from: j0, reason: collision with root package name */
    public final d4 f27222j0;

    public o() {
        int i13 = 29;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new z91.l(3, new kl0.w(this, i13)));
        int i14 = 0;
        this.f27215c0 = a1.s(this, k0.f80436a.b(v.class), new ml0.v(a13, i13), new m(a13, i14), new n(this, a13, i14));
        this.f27222j0 = d4.INSTAGRAM_BACKFILL_MIGRATION;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.f27222j0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(((v) this.f27215c0.getValue()).c(), 22);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_claim_migration;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f27216d0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(b52.a.loading_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f27217e0 = (FrameLayout) findViewById2;
        View findViewById3 = v13.findViewById(b52.a.progress_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f27218f0 = (GestaltSpinner) findViewById3;
        View findViewById4 = v13.findViewById(b52.a.connected_to);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f27219g0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(b52.a.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f27220h0 = (GestaltButton) findViewById5;
        View findViewById6 = v13.findViewById(b52.a.board_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f27221i0 = (GestaltListAction) findViewById6;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f27216d0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        settingsRoundHeaderView.f51780e = new x91.k(this, 2);
        settingsRoundHeaderView.setElevation(0.0f);
        settingsRoundHeaderView.Z().t(l.f27208i);
        GestaltButton gestaltButton = this.f27220h0;
        if (gestaltButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        gestaltButton.e(new h(this, 0));
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, null), 3);
    }
}
