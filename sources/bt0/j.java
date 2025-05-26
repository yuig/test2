package bt0;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import ca0.b0;
import h32.a4;
import h32.d4;
import kh2.a1;
import kl0.w;
import kl0.x;
import kl0.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbt0/j;", "Lo82/i3;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends a {
    public static final /* synthetic */ int K0 = 0;
    public uk1.e F0;
    public oa2.p G0;
    public final m1 H0;
    public final d4 I0;
    public final a4 J0;

    public j() {
        h hVar = new h(this, 1);
        int i13 = 7;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new b0(16, new w(this, i13)));
        this.H0 = a1.s(this, k0.f80436a.b(v.class), new ml0.v(a13, 6), new x(hVar, a13, i13), new y(this, a13, i13));
        this.I0 = d4.HOMEFEED_CONTROL;
        this.J0 = a4.HOMEFEED_CONTROL_PROFILES;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(((v) this.H0.getValue()).a(), 22);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(((v) this.H0.getValue()).c(), 27);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        uk1.d e13;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        e3.a aVar = new e3.a(5);
        aVar.p(this.I0, this.J0, null, null);
        uk1.e eVar = this.F0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        e13 = ((uk1.a) eVar).e("", aVar);
        h hVar = new h(this, 0);
        nk1.k a13 = oa2.r.a();
        oa2.p pVar = this.G0;
        if (pVar != null) {
            adapter.E(44, hVar, new rk1.g(e13, a13, pVar, new us0.a(e13, 1)), i.f23874j);
        } else {
            Intrinsics.r("legoUserRepPresenterFactory");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getX0() {
        return this.J0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.I0;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new g(this, null), 3);
    }
}
