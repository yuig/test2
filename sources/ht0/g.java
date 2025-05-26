package ht0;

import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;
import yq0.z;

@xk2.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lht0/g;", "Lyq0/b0;", "", "Lrs0/a;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends a<Object> implements rs0.a {
    public r1 A0;
    public b60.b B0;
    public xs0.l C0;
    public ws0.a D0;
    public final xk2.v E0 = xk2.m.b(new e(this, 0));
    public final d4 F0 = d4.HOMEFEED_CONTROL;
    public final a4 G0 = a4.HOMEFEED_CONTROL_BOARDS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f70113z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (((Boolean) this.E0.getValue()).booleanValue()) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, new e(this, 1));
        }
        adapter.G(9992, new e(this, 2));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f70113z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        r1 r1Var = this.A0;
        if (r1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        b60.b bVar = this.B0;
        if (bVar == null) {
            Intrinsics.r("userManager");
            throw null;
        }
        xs0.l lVar = this.C0;
        if (lVar == null) {
            Intrinsics.r("boardToggleSettingViewBinder");
            throw null;
        }
        ws0.a aVar = new ws0.a(g13, p73, r1Var, bVar, lVar);
        this.D0 = aVar;
        return aVar;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF20758n1() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF20757m1() {
        return this.F0;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        O8(u.a(this, xp1.d.homefeed_tuner_boards_empty_experiment_uup), 49);
    }
}
