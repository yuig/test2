package ib1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import sq0.c0;
import x91.k;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lib1/e;", "Lyq0/b0;", "", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a<Object> implements c0 {
    public static final /* synthetic */ int B0 = 0;
    public final d4 A0 = d4.SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f72024z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(2, new h81.b(this, 12));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(c52.e.notifications));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final m V7() {
        uk1.e eVar = this.f72024z0;
        if (eVar != null) {
            return new ql0.a(((uk1.a) eVar).g(), p7(), getActiveUserManager());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getA0() {
        return this.A0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.d0(q.ARROW_BACK);
            settingsRoundHeaderView.g0(new k(this, 11));
            settingsRoundHeaderView.k0(c52.e.notifications);
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        Intrinsics.checkNotNullExpressionValue(onCreateView.findViewById(c52.c.settings_menu_container), "findViewById(...)");
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        L8();
    }
}
