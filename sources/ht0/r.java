package ht0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import sq0.c0;
import yq0.z;

@xk2.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lht0/r;", "Lyq0/b0;", "", "<init>", "()V", "gi2/b", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r extends d<Object> implements c0 {
    public static final /* synthetic */ int G0 = 0;
    public g0 A0;
    public b20.c B0;
    public final xk2.v C0 = xk2.m.b(new o(this, 0));
    public final xk2.v D0 = xk2.m.b(new o(this, 1));
    public final d4 E0 = d4.HOMEFEED_CONTROL;
    public final a4 F0 = a4.HOMEFEED_CONTROL_INTERESTS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f70136z0;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        setRefreshing(true);
        V1();
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(2, new o(this, 2));
        adapter.G(1, new o(this, 3));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f70136z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        w f73 = f7();
        g0 g0Var = this.A0;
        if (g0Var != null) {
            return new us0.b(g13, p73, f73, g0Var, com.bumptech.glide.d.G(this, "HOMEFEED_TUNER_EXTRAS_KEY_ADD_TOPICS", false));
        }
        Intrinsics.r("pageSizeProvider");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF86878d0() {
        return this.F0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF75509a1() {
        return this.E0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        if (!com.bumptech.glide.d.G(this, "HOMEFEED_TUNER_EXTRAS_KEY_ADD_TOPICS", false)) {
            return super.m8();
        }
        a7.e eVar = new a7.e(xp1.b.fragment_follow_topics, xp1.a.follow_topics);
        eVar.c(xp1.a.follow_topics_loading_container);
        eVar.f979c = xp1.a.follow_topics_empty_state_container;
        return eVar;
    }

    @Override // yq0.t
    public final v0 n8() {
        int i13;
        cp.b bVar = new cp.b(this, 17);
        requireContext();
        if (hf0.b.q()) {
            i13 = hf0.b.f69004d;
        } else {
            hf0.b.m();
            i13 = 3;
        }
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(bVar, i13);
        pinterestGridLayoutManager.K = new p(this, pinterestGridLayoutManager, 0);
        return new v0(pinterestGridLayoutManager);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        int i13;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (com.bumptech.glide.d.G(this, "HOMEFEED_TUNER_EXTRAS_KEY_ADD_TOPICS", false)) {
            ((GestaltIconButton) v13.findViewById(xp1.a.follow_topics_navigation_icon)).u(new np0.h(this, 5));
        }
        O8(u.a(this, xp1.d.homefeed_tuner_topics_empty_experiment_uup), 49);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int F0 = dl2.b.F0(requireContext, eo1.a.hft_interest_vertical_spacing);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int F02 = dl2.b.F0(requireContext2, eo1.a.hft_interest_horizontal_spacing);
        v13.setPaddingRelative(F02, 0, F02, 0);
        if (hf0.b.q()) {
            i13 = hf0.b.f69004d;
        } else {
            hf0.b.m();
            i13 = 3;
        }
        a8(new q(F0, F02, i13, new mj.m(11)));
    }
}
