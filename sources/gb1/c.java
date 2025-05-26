package gb1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.kz;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import w1.l0;
import yq0.b0;
import yq0.z;

/* loaded from: classes2.dex */
public abstract class c extends b0 implements com.pinterest.feature.settings.notifications.e {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f64682z0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public final kz f64683u0;

    /* renamed from: v0, reason: collision with root package name */
    public uk1.e f64684v0;

    /* renamed from: w0, reason: collision with root package name */
    public r20.a f64685w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.pinterest.feature.settings.notifications.d f64686x0;

    /* renamed from: y0, reason: collision with root package name */
    public final d4 f64687y0;

    public c(kz setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.f64683u0 = setting;
        this.f64687y0 = d4.SETTINGS;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        boolean z13 = this.f64683u0 == kz.NOTIFICATION_SETTING_TYPE_PUSH;
        adapter.G(3, new b(requireContext, this, 0));
        adapter.G(11, new b(requireContext, this, 1));
        adapter.G(6, new l0(requireContext, this, z13, 4));
        adapter.G(14, new com.pinterest.feature.search.results.view.b0(requireContext, 25));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        r20.a aVar = this.f64685w0;
        if (aVar == null) {
            Intrinsics.r("service");
            throw null;
        }
        uj2.q p73 = p7();
        uk1.e eVar = this.f64684v0;
        if (eVar != null) {
            return new fb1.c(aVar, this.f64683u0, p73, eVar);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF50136o() {
        return this.f64687y0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(e52.b.lego_fragment_settings_brio, e52.a.p_recycler_view);
        eVar.f979c = e52.a.empty_state_container;
        eVar.b(e52.a.loading_container);
        return eVar;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(e52.a.header_view);
        if (settingsRoundHeaderView != null) {
            int i13 = a.f64678a[this.f64683u0.ordinal()];
            int i14 = i13 != 1 ? i13 != 2 ? e52.c.on_pinterest_notifications : e52.c.email_notifications : e52.c.push_notifications;
            settingsRoundHeaderView.d0(rm1.q.ARROW_BACK);
            settingsRoundHeaderView.g0(new x91.k(this, 9));
            settingsRoundHeaderView.k0(i14);
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(e52.a.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        fo1.a i73 = i7();
        if (i73 != null) {
            int i13 = a.f64678a[this.f64683u0.ordinal()];
            ((GestaltToolbarImpl) i73).Y(i13 != 1 ? i13 != 2 ? e52.c.on_pinterest_notifications : e52.c.email_notifications : e52.c.push_notifications);
        }
    }
}
