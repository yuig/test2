package h90;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.api.model.pi0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import java.util.Set;
import kh2.a1;
import kotlin.Metadata;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import so.n5;
import x02.i2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh90/r;", "Lo82/v2;", "<init>", "()V", "cutoutCloseup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r extends k0 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f68289p1 = 0;
    public uk1.e L0;
    public yk1.v M0;
    public nr0.t N0;
    public n5 O0;
    public np0.d P0;
    public i2 Q0;
    public pb0.a R0;
    public nx.k S0;
    public long T0;
    public lh0.e0 U0;
    public final xk2.v V0 = xk2.m.b(new j(this, 12));
    public final xk2.v W0 = xk2.m.b(new j(this, 3));
    public final m1 X0;
    public final xk2.v Y0;
    public final xk2.v Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final xk2.v f68290a1;

    /* renamed from: b1, reason: collision with root package name */
    public final xk2.v f68291b1;

    /* renamed from: c1, reason: collision with root package name */
    public final xk2.v f68292c1;

    /* renamed from: d1, reason: collision with root package name */
    public final xk2.v f68293d1;

    /* renamed from: e1, reason: collision with root package name */
    public final xk2.v f68294e1;

    /* renamed from: f1, reason: collision with root package name */
    public final xk2.v f68295f1;

    /* renamed from: g1, reason: collision with root package name */
    public zy.a0 f68296g1;

    /* renamed from: h1, reason: collision with root package name */
    public final xk2.v f68297h1;

    /* renamed from: i1, reason: collision with root package name */
    public final xk2.k f68298i1;

    /* renamed from: j1, reason: collision with root package name */
    public final xk2.v f68299j1;

    /* renamed from: k1, reason: collision with root package name */
    public final xk2.v f68300k1;

    /* renamed from: l1, reason: collision with root package name */
    public final xk2.v f68301l1;

    /* renamed from: m1, reason: collision with root package name */
    public final d4 f68302m1;

    /* renamed from: n1, reason: collision with root package name */
    public final a4 f68303n1;

    /* renamed from: o1, reason: collision with root package name */
    public final h32.g0 f68304o1;

    public r() {
        q1 q1Var = new q1(this, 17);
        xk2.n nVar = xk2.n.NONE;
        xk2.k q13 = jq.b.q(18, q1Var, nVar);
        int i13 = 16;
        this.X0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(j0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.Y0 = xk2.m.b(new j(this, 11));
        this.Z0 = xk2.m.b(new j(this, 0));
        this.f68290a1 = xk2.m.b(new j(this, 1));
        this.f68291b1 = xk2.m.b(new k(this));
        this.f68292c1 = xk2.m.b(new j(this, 2));
        this.f68293d1 = xk2.m.b(new j(this, 5));
        this.f68294e1 = xk2.m.b(new j(this, 7));
        this.f68295f1 = xk2.m.b(new j(this, 10));
        this.f68296g1 = new zy.a0();
        this.f68297h1 = xk2.m.b(new j(this, 8));
        this.f68298i1 = xk2.m.a(nVar, new j(this, 9));
        this.f68299j1 = xk2.m.b(new j(this, 6));
        this.f68300k1 = xk2.m.b(l.f68269i);
        this.f68301l1 = xk2.m.b(new j(this, 4));
        this.f68302m1 = d4.FEED;
        this.f68303n1 = a4.FEED_COLLAGE_ITEM_RELATED_ITEMS;
        this.f68304o1 = h32.g0.STRUCTURED_FEED_DEFAULT_COMPONENT_TYPE;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 10);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(k9().c(), 19);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set f13 = h1.f(16, 32, 33, 28);
        q qVar = q.f68283j;
        xk2.k kVar = this.f68298i1;
        c0.d.A2(adapter, f13, qVar, (o82.y) kVar.getValue());
        adapter.E(30, new j(this, 13), (se1.d) this.f68301l1.getValue(), q.f68284k);
        c0.d.A2(adapter, h1.f(1, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE)), q.f68285l, (o82.y) kVar.getValue());
        adapter.E(444555666, new j(this, 14), (vq0.h) this.f68299j1.getValue(), q.f68286m);
        adapter.E(333444555, new j(this, 15), (vq0.h) this.f68300k1.getValue(), q.f68287n);
        adapter.H(555666777, new j(this, 16));
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f68296g1.e();
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        return (HashMap) this.W0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final h32.g0 getF123811z0() {
        return this.f68304o1;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f68296g1.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getP0() {
        return this.f68303n1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getK0() {
        return this.f68302m1;
    }

    public final j0 k9() {
        return (j0) this.X0.getValue();
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(k9().c(), 20);
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(a90.d.fragment_cutout_closeup_item, a90.c.p_recycler_view);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (this.R0 == null) {
            Intrinsics.r("clock");
            throw null;
        }
        this.T0 = System.currentTimeMillis();
        super.onCreate(bundle);
        k9().h((String) this.Z0.getValue(), (String) this.f68290a1.getValue(), (String) this.f68292c1.getValue(), (pi0.a) this.f68291b1.getValue(), (String) this.f68293d1.getValue(), (h32.i0) this.Y0.getValue(), this.f68296g1.f(), getO0(), com.bumptech.glide.d.G(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_IS_COLLAGE_AD", false), ((Boolean) this.f68295f1.getValue()).booleanValue());
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kh2.j.x2(k9(), f.f68246a);
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new p(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        return (String) this.Z0.getValue();
    }
}
