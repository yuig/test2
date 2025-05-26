package u91;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kh2.c3;
import kh2.k3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import lb0.q;
import lh0.m3;
import m60.w;
import pk.a0;
import x02.x2;
import xk2.k;
import xk2.m;
import xk2.n;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu91/h;", "Lyq0/b0;", "", "Lr91/c;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h extends c<Object> implements r91.c {
    public static final /* synthetic */ int N0 = 0;
    public SettingsRoundHeaderView A0;
    public View B0;
    public m3 C0;
    public uk1.e D0;
    public x10.d E0;
    public UserDeserializer F0;
    public lb2.d G0;
    public lu1.b H0;
    public q I0;
    public fr1.c J0;
    public final k K0 = m.a(n.NONE, new e(this, 0));
    public final d4 L0 = d4.SETTINGS;
    public final a4 M0 = a4.ACCOUNT_SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public t91.e f121221z0;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        View view = this.B0;
        if (view != null) {
            bs1.c.M1(view);
        } else {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new e(this, 1));
        adapter.G(1, new e(this, 2));
        adapter.G(2, new e(this, 3));
        adapter.G(3, new e(this, 4));
        adapter.G(19, new e(this, 5));
    }

    @Override // nl1.d
    public final void S6(yf0.h insetMode, View fragmentRootView) {
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

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.D0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        x2 A7 = A7();
        w f73 = f7();
        x10.d dVar = this.E0;
        if (dVar == null) {
            Intrinsics.r("settingsApi");
            throw null;
        }
        UserDeserializer userDeserializer = this.F0;
        if (userDeserializer == null) {
            Intrinsics.r("userDeserializer");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        lb2.d dVar2 = this.G0;
        if (dVar2 == null) {
            Intrinsics.r("accountManager");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        m3 m3Var = this.C0;
        if (m3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        q qVar = this.I0;
        if (qVar != null) {
            return new t91.e(g13, p73, A7, f73, dVar, userDeserializer, aVar, dVar2, activeUserManager, m3Var, qVar);
        }
        Intrinsics.r("prefsManagerPersisted");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF72616t0() {
        return this.M0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF72615s0() {
        return this.L0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // u91.c, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.D(E4);
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.z(bf.b.S(this), null, null, new f(this, null), 3);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(b52.c.settings_account_management_title);
        settingsRoundHeaderView.g0(new d(this, 2));
        this.A0 = settingsRoundHeaderView;
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            zh0.e.a(relativeLayout, resources);
        }
        b8(new c0(this, 22));
        View findViewById = onCreateView.findViewById(c52.c.settings_menu_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.B0 = findViewById;
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
