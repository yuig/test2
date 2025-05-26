package iz0;

import a.z0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import com.pinterest.api.model.cb0;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import ni1.t2;
import o82.b3;
import qa2.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz0/n;", "Lo82/v2;", "<init>", "()V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n extends a {
    public static final /* synthetic */ int Y0 = 0;
    public e01.a L0;
    public final m1 M0;
    public final rw0.f N0;
    public final HashMap O0;
    public is1.x P0;
    public cb0 Q0;
    public String R0;
    public j0 S0;
    public t2 T0;
    public ni1.d0 U0;
    public final m V0;
    public final d4 W0;
    public final a4 X0;

    public n() {
        int i13 = 14;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(i13, new kl0.w(this, i13)));
        int i14 = 15;
        this.M0 = a1.s(this, k0.f80436a.b(g0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.N0 = rw0.f.f();
        this.O0 = new HashMap();
        this.R0 = "";
        this.V0 = new m(this);
        this.W0 = d4.PEAR_QUIZ;
        this.X0 = a4.PEAR_QUIZ_RESULTS;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        Context context = getContext();
        if (com.bumptech.glide.d.o0(context != null ? Boolean.valueOf(pk.a0.G0(context, "android.permission.READ_EXTERNAL_STORAGE")) : null)) {
            f7().h(this.V0);
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            fk2.g gVar = new fk2.g(new dp.a(28, j0Var, this), 3);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            uj2.a0 a0Var = tk2.e.f118017c;
            R6(gVar.m(5L, timeUnit, a0Var).l(a0Var).h(wj2.c.a()).i(new fp.a(16, j0Var, this), new hx0.a(26, l.f73925k)));
        }
    }

    @Override // o82.v2, yq0.t, yk1.k, nl1.d
    public final void L7() {
        is1.x xVar = this.P0;
        if (xVar != null) {
            xVar.b();
        }
        f7().j(this.V0);
        super.L7();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 27);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(k9().c(), 6);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        q qVar = new q(null);
        z0 z0Var = new z0(this, 5);
        final int i13 = 0;
        b3.G(adapter, 20086, new k(this, 2), qVar, new o82.c(this) { // from class: iz0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f73906b;

            {
                this.f73906b = this;
            }

            @Override // o82.c
            public final void e(View view, u50.o oVar) {
                int i14 = i13;
                n this$0 = this.f73906b;
                switch (i14) {
                    case 0:
                        kz0.f view2 = (kz0.f) view;
                        p displayState = (p) oVar;
                        int i15 = n.Y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        cb0 cb0Var = displayState.f73929a;
                        String str = this$0.R0;
                        e01.a aVar = this$0.L0;
                        if (aVar != null) {
                            view2.i(cb0Var, str, aVar, this$0.s7(), new k(this$0, 1));
                            return;
                        } else {
                            Intrinsics.r("shareUtil");
                            throw null;
                        }
                    default:
                        kz0.m view3 = (kz0.m) view;
                        u displayState2 = (u) oVar;
                        int i16 = n.Y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view3, "view");
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        view3.a(displayState2.f73935a, this$0.s7());
                        return;
                }
            }
        }, z0Var, null, 96);
        s sVar = new s(null);
        int i14 = 16;
        mj.m mVar = new mj.m(i14);
        final int i15 = 1;
        b3.G(adapter, 30086, new k(this, 3), sVar, new o82.c(this) { // from class: iz0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f73906b;

            {
                this.f73906b = this;
            }

            @Override // o82.c
            public final void e(View view, u50.o oVar) {
                int i142 = i15;
                n this$0 = this.f73906b;
                switch (i142) {
                    case 0:
                        kz0.f view2 = (kz0.f) view;
                        p displayState = (p) oVar;
                        int i152 = n.Y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        cb0 cb0Var = displayState.f73929a;
                        String str = this$0.R0;
                        e01.a aVar = this$0.L0;
                        if (aVar != null) {
                            view2.i(cb0Var, str, aVar, this$0.s7(), new k(this$0, 1));
                            return;
                        } else {
                            Intrinsics.r("shareUtil");
                            throw null;
                        }
                    default:
                        kz0.m view3 = (kz0.m) view;
                        u displayState2 = (u) oVar;
                        int i16 = n.Y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view3, "view");
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        view3.a(displayState2.f73935a, this$0.s7());
                        return;
                }
            }
        }, mVar, null, 96);
        adapter.H(50086, new k(this, 4));
        int i16 = 6;
        adapter.H(70086, new k(this, i16));
        adapter.H(60086, new k(this, 7));
        adapter.J(40086, new k(this, i13), new p90.m(i16), new p90.n(this, 8), new dx0.d(this, i14));
    }

    @Override // o82.v2
    public final int Z8() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return pk.a0.K(16, resources);
    }

    @Override // uk1.c
    /* renamed from: getAuxData, reason: from getter */
    public final HashMap getF68106k0() {
        return this.O0;
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return 2;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getZ0() {
        return this.X0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.W0;
    }

    public final g0 k9() {
        return (g0) this.M0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(iy1.e.fragment_pear_quiz_result, iy1.d.p_recycler_view);
        eVar.c(iy1.d.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.R0 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_QUIZ_ID", "");
        k9().h(this.R0, com.bumptech.glide.d.Z(this, "EXTRA_ANSWER_STRING", ""), com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_QUIZ_RESULT", ""));
        HashMap hashMap = this.O0;
        hashMap.put("quiz_id", this.R0);
        Navigation navigation = this.I;
        String g23 = navigation != null ? navigation.g2("com.pinterest.EXTRA_REFERRER", "") : null;
        hashMap.put("referrer", g23 != null ? g23 : "");
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new j(this, v13, null), 3);
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        return this.O0;
    }
}
