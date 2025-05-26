package z91;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz91/m;", "Lnl1/d;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class m extends y {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f141383j0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public SettingsRoundHeaderView f141384c0;

    /* renamed from: d0, reason: collision with root package name */
    public FrameLayout f141385d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltSpinner f141386e0;

    /* renamed from: f0, reason: collision with root package name */
    public w f141387f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f141388g0 = d4.SETTINGS;

    /* renamed from: h0, reason: collision with root package name */
    public final m1 f141389h0;

    /* renamed from: i0, reason: collision with root package name */
    public i92.k f141390i0;

    public m() {
        int i13 = 26;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new l(0, new kl0.w(this, i13)));
        int i14 = 27;
        this.f141389h0 = a1.s(this, k0.f80436a.b(v.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
    }

    public final v Y7() {
        return (v) this.f141389h0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f141388g0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_claimed_account;
        Y7().h();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f141384c0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(b52.a.container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f141385d0 = (FrameLayout) findViewById2;
        View findViewById3 = v13.findViewById(b52.a.progress_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f141386e0 = (GestaltSpinner) findViewById3;
        FrameLayout frameLayout = (FrameLayout) v13.findViewById(b52.a.general_fragment_container);
        Context requireContext = requireContext();
        int i13 = eo1.b.color_themed_background_elevation_floating;
        Object obj = d5.a.f53679a;
        frameLayout.setBackground(requireContext.getDrawable(i13));
        SettingsRoundHeaderView settingsRoundHeaderView = this.f141384c0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        int i14 = b52.c.claimed_accounts;
        int i15 = 0;
        settingsRoundHeaderView.g0(new i(this, i15));
        settingsRoundHeaderView.k0(i14);
        settingsRoundHeaderView.setElevation(0.0f);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        w wVar = new w(requireContext2, (l82.c) Y7().c(), i15);
        this.f141387f0 = wVar;
        FrameLayout frameLayout2 = this.f141385d0;
        if (frameLayout2 == null) {
            Intrinsics.r("container");
            throw null;
        }
        frameLayout2.addView(wVar);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, null), 3);
    }
}
