package ct0;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.v0;
import ca0.b0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import o82.b3;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lct0/s;", "Lo82/v2;", "<init>", "()V", "Luk1/d;", "presenterPinalytics", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class s extends a {
    public static final /* synthetic */ int S0 = 0;
    public uk1.e L0;
    public b20.c M0;
    public final d4 N0 = d4.HOMEFEED_CONTROL;
    public final a4 O0 = a4.HOMEFEED_CONTROL_INTERESTS;
    public final m1 P0;
    public Drawable Q0;
    public Drawable R0;

    public s() {
        q qVar = new q(this, 2);
        int i13 = 8;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new b0(17, new kl0.w(this, i13)));
        this.P0 = a1.s(this, k0.f80436a.b(a0.class), new ml0.v(a13, 7), new kl0.x(qVar, a13, i13), new kl0.y(this, a13, i13));
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        setRefreshing(true);
        V1();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 23);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(k9().c(), 28);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int i13 = 0;
        adapter.E(1, new q(this, i13), new yi0.a((uk1.d) xk2.m.b(new q(this, 1)).getValue(), new p(this, i13)), c.f53138k);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF103167r0() {
        return this.O0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF103166q0() {
        return this.N0;
    }

    public final a0 k9() {
        return (a0) this.P0.getValue();
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

    @Override // o82.v2, yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 15);
        requireContext();
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(bVar, 3);
        pinterestGridLayoutManager.K = new i0(1);
        return new v0(pinterestGridLayoutManager);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9().h();
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (com.bumptech.glide.d.G(this, "HOMEFEED_TUNER_EXTRAS_KEY_ADD_TOPICS", false)) {
            ((GestaltIconButton) v13.findViewById(xp1.a.follow_topics_navigation_icon)).u(new np0.h(this, 4));
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new o(this, v13, null), 3);
    }
}
