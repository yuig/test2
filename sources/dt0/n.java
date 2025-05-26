package dt0;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.r1;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldt0/n;", "Lo82/v2;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n extends d0 {
    public static final /* synthetic */ int S0 = 0;
    public r1 L0;
    public xs0.l M0;
    public final m1 N0;
    public final xk2.v O0;
    public Boolean P0;
    public final d4 Q0;
    public final a4 R0;

    public n() {
        int i13 = 9;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ca0.b0(18, new kl0.w(this, i13)));
        this.N0 = a1.s(this, k0.f80436a.b(c0.class), new ml0.v(a13, 8), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.O0 = xk2.m.b(new i(this, 0));
        this.P0 = Boolean.FALSE;
        this.Q0 = d4.HOMEFEED_CONTROL;
        this.R0 = a4.HOMEFEED_CONTROL_ACTIVITY;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null && Intrinsics.d(f13.K2(), Boolean.TRUE) && ((Boolean) this.O0.getValue()).booleanValue()) {
            ((l82.c) k9().c()).a(f.f56238a);
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 24);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(k9().c(), 29);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int i13 = 5;
        adapter.I(9991, new i(this, 1), new p90.m(i13), new p90.n(this, i13));
        if (((Boolean) this.O0.getValue()).booleanValue()) {
            adapter.H(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, new i(this, 3));
        }
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 3;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getK0() {
        return this.R0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF34839g() {
        return this.Q0;
    }

    public final c0 k9() {
        return (c0) this.N0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(xp1.b.fragment_activity, xp1.a.p_recycler_view);
        eVar.f979c = xp1.a.empty_state_container;
        eVar.c(xp1.a.loading_container);
        return eVar;
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        View view;
        View findViewById;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (((Boolean) this.O0.getValue()).booleanValue() && (view = getView()) != null && (findViewById = view.findViewById(xp1.a.filter_view)) != null) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new lj0.a(this, 27));
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new m(this, null), 3);
    }
}
