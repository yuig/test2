package cj0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import h32.a4;
import h32.d4;
import h32.x3;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcj0/p;", "Lo82/v2;", "<init>", "()V", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p extends m0 {
    public static final /* synthetic */ int X0 = 0;
    public zf0.f L0;
    public lh0.r M0;
    public f N0;
    public qa2.j0 O0;
    public t2 P0;
    public ni1.d0 Q0;
    public il1.a R0;
    public final d4 S0 = d4.BOARD;
    public final a4 T0 = a4.BOARD_FOR_ME;
    public final m1 U0;
    public final xk2.v V0;
    public zy.a0 W0;

    public p() {
        int i13 = 28;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ca0.b0(6, new q1(this, i13)));
        this.U0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(e0.class), new mq.e0(a13, 27), new mq.f0(null, a13, i13), new mq.g0(this, a13, i13));
        this.V0 = xk2.m.b(new m(this, 0));
        this.W0 = new zy.a0();
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_VIEW_TYPE_RESULT_CODE")) {
            kh2.j.x2(l9(), new j0(result.getInt("com.pinterest.EXTRA_BOARD_VIEW_TYPE")));
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(l9().a(), 17);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(l9().c(), 9);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int i13 = 1;
        adapter.J(1000, new m(this, i13), new p90.m(i13), new p90.n(this, i13), new n(this, 0));
        adapter.E(1001, new m(this, 2), new f0((wa2.m) this.V0.getValue(), new n(this, i13)), o.f27848j);
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.W0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.W0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getM0() {
        return this.T0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getL0() {
        return this.S0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k9() {
        /*
            r3 = this;
            java.lang.String r0 = "com.pinterest.EXTRA_BOARD_ID"
            java.lang.String r1 = ""
            java.lang.String r0 = com.bumptech.glide.d.Z(r3, r0, r1)
            boolean r2 = kotlin.text.z.j(r0)
            if (r2 == 0) goto L2e
            com.pinterest.navigation.Navigation r0 = r3.I
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.getF49940b()
            if (r0 != 0) goto L19
            goto L1b
        L19:
            r1 = r0
            goto L2d
        L1b:
            com.pinterest.navigation.Navigation r0 = r3.I
            if (r0 == 0) goto L2a
            com.pinterest.api.model.v7 r0 = r0.P1()
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getUid()
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 != 0) goto L19
        L2d:
            r0 = r1
        L2e:
            boolean r1 = kotlin.text.z.j(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L37
            return r0
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Board ID is required"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj0.p.k9():java.lang.String");
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new ca0.y(l9().c(), 10);
    }

    public final e0 l9() {
        return (e0) this.U0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(y60.d.fragment_board_automagical, y60.c.automagical_board_content);
        eVar.c(y60.c.automagical_board_loading_state_container);
        eVar.f979c = y60.c.automagical_board_empty_state_container;
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e0 l93 = l9();
        String k93 = k9();
        h32.i0 i03 = com.bumptech.glide.d.i0(null, this.T0, this.S0, k9());
        il1.a aVar = this.R0;
        if (aVar != null) {
            l93.h(k93, (wa2.m) this.V0.getValue(), i03, aVar, this.W0.f(), com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", ""));
        } else {
            Intrinsics.r("fragmentFactory");
            throw null;
        }
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        f fVar = this.N0;
        if (fVar != null) {
            fVar.c(onCreateView, (l82.c) l9().c());
            return onCreateView;
        }
        Intrinsics.r("boardContentView");
        throw null;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f fVar = this.N0;
        if (fVar != null) {
            fVar.d();
        } else {
            Intrinsics.r("boardContentView");
            throw null;
        }
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g3.g2(this, new l(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.W0.e().f67083c;
        return (x3Var == null || (str = x3Var.f67402f) == null) ? k9() : str;
    }
}
