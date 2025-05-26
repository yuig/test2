package p51;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h32.a4;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.r0;
import m60.t0;
import m60.v0;
import sq0.c0;
import uj2.q;
import w01.e0;
import yk1.m;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp51/d;", "Lyq0/b0;", "Lyq0/a0;", "", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends f<a0> implements c0 {
    public uk1.e A0;
    public String B0 = "";
    public boolean C0 = true;

    /* renamed from: z0, reason: collision with root package name */
    public g0 f98897z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new e0(this, 25));
    }

    @Override // yk1.k
    public final m V7() {
        boolean z13 = this.C0;
        String str = this.B0;
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        b60.b activeUserManager = getActiveUserManager();
        q p73 = p7();
        g0 g0Var = this.f98897z0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(getF0(), getG0(), null, getF73409e1(), null);
        Unit unit = Unit.f80348a;
        return new o51.a(z13, str, aVar, activeUserManager, p73, g0Var, g13);
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF73409e1() {
        String string;
        h32.g0 valueOf;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("com.pinterest.EXTRA_COMMENT_COMPONENT")) == null || (valueOf = h32.g0.valueOf(string)) == null) ? h32.g0.PIN_CLOSEUP_COMMENTS : valueOf;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getG0() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER")) == null) {
            return null;
        }
        return a4.valueOf(string);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF0() {
        String string;
        d4 valueOf;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("com.pinterest.EXTRA_COMMENT_VIEW_TYPE")) == null || (valueOf = d4.valueOf(string)) == null) ? d4.PIN_COMMENTS : valueOf;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(v0.comment_user_reactions_list_view, t0.p_recycler_view);
        eVar.c(t0.swipe_container);
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        a8(new eb2.d(new ex.d(dimensionPixelSize, 14), null, new ex.d(dimensionPixelSize, 15), null, 10));
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) c7().b(), g83);
        }
    }
}
