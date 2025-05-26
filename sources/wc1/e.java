package wc1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import i92.k;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import so.t3;
import xk2.m;
import xk2.v;
import yf0.h;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwc1/e;", "Lyq0/b0;", "", "Ltc1/b;", "<init>", "()V", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a<Object> implements tc1.b {
    public static final /* synthetic */ int I0 = 0;
    public cr1.a A0;
    public k B0;
    public t3 C0;
    public tc1.a D0;
    public SettingsRoundHeaderView E0;
    public final v F0 = m.b(new b(this, 0));
    public final d4 G0 = d4.SETTINGS;
    public final a4 H0 = a4.SECURITY_AND_LOGINS_SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f129110z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new b(this, 1));
        adapter.G(2, new b(this, 2));
        adapter.G(3, new b(this, 3));
        adapter.G(6, new b(this, 4));
    }

    @Override // nl1.d
    public final void S6(h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        RelativeLayout relativeLayout = (RelativeLayout) fragmentRootView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            c3.n(relativeLayout, false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            u2.z(g83);
        }
    }

    public final k U8() {
        k kVar = this.B0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        t3 t3Var = this.C0;
        if (t3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        mr1.b m13 = bs1.c.m(requireActivity);
        uk1.e eVar = this.f129110z0;
        if (eVar != null) {
            return t3Var.a(m13, ((uk1.a) eVar).g());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V8(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof com.pinterest.error.NetworkResponseError
            r1 = 0
            if (r0 == 0) goto Le
            com.pinterest.error.NetworkResponseError r3 = (com.pinterest.error.NetworkResponseError) r3
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r3 == 0) goto L2d
            v.f1 r3 = r3.f45043a
            if (r3 == 0) goto L2d
            qz.d r3 = kh2.k3.M(r3)
            if (r3 == 0) goto L2d
            java.lang.String r3 = r3.e()
            if (r3 == 0) goto L2d
            boolean r0 = kotlin.text.z.j(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2a
            r1 = r3
        L2a:
            if (r1 == 0) goto L2d
            goto L33
        L2d:
            int r3 = m60.x0.generic_error
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L33:
            i92.k r3 = r2.U8()
            r3.i(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc1.e.V8(java.lang.Throwable):void");
    }

    public final void W8(String str) {
        k U8 = U8();
        if (str == null) {
            str = getString(x0.generic_error);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        U8.i(str);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getN0() {
        return this.H0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getK0() {
        return this.G0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // wc1.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.D(E4);
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        this.E0 = settingsRoundHeaderView;
        if (settingsRoundHeaderView != null) {
            settingsRoundHeaderView.k0(l52.c.settings_security_screen_header);
        }
        SettingsRoundHeaderView settingsRoundHeaderView2 = this.E0;
        int i13 = 4;
        if (settingsRoundHeaderView2 != null) {
            settingsRoundHeaderView2.g0(new lc1.b(this, i13));
        }
        View findViewById = onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (findViewById != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(findViewById);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            findViewById.requestLayout();
        }
        b8(new cc1.c(this, 4));
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.d1(E4);
        }
        super.onDetach();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
        }
    }
}
