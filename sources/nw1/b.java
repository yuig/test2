package nw1;

import android.content.Context;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ow1.j;
import so.t0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnw1/b;", "Low1/g;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends f {
    public uk1.e S0;
    public t0 T0;
    public final v U0 = m.b(a.f92368i);

    @Override // yk1.k
    public final yk1.m V7() {
        mw1.m h83 = h8();
        t0 t0Var = this.T0;
        if (t0Var == null) {
            Intrinsics.r("graphCloseupPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        uk1.e eVar = this.S0;
        if (eVar != null) {
            return t0Var.a(requireContext, uk1.e.c(eVar, this), g8(), h83);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // ow1.g
    public final String d8() {
        return (String) this.U0.getValue();
    }

    @Override // ow1.g
    public final d4 j8() {
        return d4.ANALYTICS_OVERVIEW;
    }

    @Override // uw1.b
    public final void o3(gh0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // ow1.g, nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((j) f8()).B3();
    }
}
