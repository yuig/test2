package a51;

import a.cb;
import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import dl1.s;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.g0;
import m60.t0;
import m60.v0;
import m60.w;
import m60.x0;
import nc0.f;
import nr0.m;
import so.oa;
import uk1.e;
import w01.e0;
import wk1.k;
import x02.i2;
import yq0.z;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La51/d;", "Lwk1/k;", "Ldl1/s;", "Lx41/c;", "Lnr0/j;", "Lx41/b;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends k<s> implements x41.c, x41.b {
    public i2 M0;
    public e N0;
    public g0 O0;
    public f0 P0;
    public m Q0;
    public x41.d R0;
    public final d4 S0 = d4.USER;

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        int i13;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        int i14 = c.f784a[g9().ordinal()];
        if (i14 == 1) {
            i13 = x0.recently_viewed;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = x0.recently_saved;
        }
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(i13);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        e eVar = this.N0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.M0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        x41.a g93 = g9();
        w f73 = f7();
        g0 g0Var = this.O0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        m mVar = this.Q0;
        if (mVar != null) {
            return new z41.b(g93, f73, g0Var, a13, mVar);
        }
        Intrinsics.r("dynamicGridViewBinderDelegateFactory");
        throw null;
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9 */
    public final void y8(z adapter, sq0.f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        adapter.G(743292, new e0(this, 21));
    }

    public final x41.a g9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_RECENT_PIN_ACTION_TYPE") : null;
        if (v03 == null) {
            v03 = "";
        }
        f0 f0Var = this.P0;
        if (f0Var != null) {
            f0Var.S(v03.length() > 0, "Please provide a valid recent pin action typethrough the navigation", new Object[0]);
            return x41.a.valueOf(v03);
        }
        Intrinsics.r("devUtils");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getU0() {
        int i13 = c.f784a[g9().ordinal()];
        if (i13 == 1) {
            return a4.USER_RECENTLY_VIEWED_PINS;
        }
        if (i13 == 2) {
            return a4.USER_RECENTLY_SAVED_PINS;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getT0() {
        return this.S0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(v0.pinterest_recycler_initial_load_and_refresh_container_with_toolbar, t0.p_recycler_view);
        eVar.c(t0.swipe_container);
        eVar.f979c = t0.empty_state_container;
        return eVar;
    }

    @Override // nl1.d
    public final f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (f) mainView.findViewById(t0.toolbar);
    }
}
