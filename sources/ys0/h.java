package ys0;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import ca0.b0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import ht0.u;
import kh2.a1;
import kl0.w;
import kl0.x;
import kl0.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.r1;
import o82.b3;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys0/h;", "Lo82/i3;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends a {
    public static final /* synthetic */ int L0 = 0;
    public r1 F0;
    public xs0.l G0;
    public final m1 H0;
    public final v I0;
    public final d4 J0;
    public final a4 K0;

    public h() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new b0(15, new w(this, 6)));
        this.H0 = a1.s(this, k0.f80436a.b(s.class), new ml0.v(a13, 5), new x(null, a13, 6), new y(this, a13, 6));
        this.I0 = xk2.m.b(new f(this, 0));
        this.J0 = d4.HOMEFEED_CONTROL;
        this.K0 = a4.HOMEFEED_CONTROL_BOARDS;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(((s) this.H0.getValue()).a(), 21);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(((s) this.H0.getValue()).c(), 26);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int i13 = 4;
        adapter.I(9992, new f(this, 1), new p90.m(i13), new p90.n(this, i13));
        if (((Boolean) this.I0.getValue()).booleanValue()) {
            adapter.H(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, new f(this, 3));
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.K0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getR0() {
        return this.J0;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        O8(u.a(this, xp1.d.homefeed_tuner_boards_empty_experiment_uup), 49);
    }
}
