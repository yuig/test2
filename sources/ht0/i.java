package ht0;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import so.r8;
import so.v7;
import sq0.c0;
import yq0.z;

@xk2.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lht0/i;", "Lyq0/b0;", "", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends b<Object> implements c0 {
    public static final /* synthetic */ int D0 = 0;
    public v7 A0;
    public final d4 B0 = d4.HOMEFEED_CONTROL;
    public final a4 C0 = a4.HOMEFEED_CONTROL_PROFILES;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f70114z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(44, new yq0.k(this, 25));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        v7 v7Var = this.A0;
        if (v7Var == null) {
            Intrinsics.r("homeFeedTunerFollowingPresenterFactory");
            throw null;
        }
        String uid = com.bumptech.glide.d.Q(getActiveUserManager()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        uk1.e eVar = this.f70114z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        r8 r8Var = v7Var.f114672a;
        return new ql0.a(uid, g13, (uj2.q) r8Var.f114090a.f113947u9.get(), (g0) r8Var.f114090a.f113590a4.get(), (oa2.p) r8Var.f114091b.f114553x1.get());
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.C0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.B0;
    }

    @Override // yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 16);
        requireContext();
        return new v0(new PinterestGridLayoutManager(bVar, 1));
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        O8(u.a(this, xp1.d.homefeed_tuner_profiles_empty_experiment_uup), 49);
    }
}
