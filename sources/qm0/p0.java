package qm0;

import a.cb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import h32.a4;
import h32.d4;
import h32.x3;
import i2.y3;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm0/p0;", "Lo82/v2;", "<init>", "()V", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p0 extends f2 {

    /* renamed from: d1, reason: collision with root package name */
    public static final /* synthetic */ int f104322d1 = 0;
    public qa2.j0 L0;
    public t2 M0;
    public ni1.d0 N0;
    public zf0.f O0;
    public qb0.f P0;
    public ComposeView Q0;
    public View R0;
    public FloatingToolbarView S0;
    public wm0.f T0;
    public final xk2.v U0 = xk2.m.b(new i0(this, 5));
    public final xk2.k V0;
    public final xk2.v W0;
    public final xk2.k X0;
    public final androidx.lifecycle.m1 Y0;
    public final ParcelableSnapshotMutableState Z0;

    /* renamed from: a1, reason: collision with root package name */
    public zy.a0 f104323a1;

    /* renamed from: b1, reason: collision with root package name */
    public final d4 f104324b1;

    /* renamed from: c1, reason: collision with root package name */
    public final a4 f104325c1;

    public p0() {
        xk2.n nVar = xk2.n.NONE;
        this.V0 = xk2.m.a(nVar, new i0(this, 6));
        this.W0 = xk2.m.b(new i0(this, 16));
        this.X0 = xk2.m.a(nVar, new i0(this, 7));
        int i13 = 3;
        xk2.k a13 = xk2.m.a(nVar, new ca0.b0(11, new kl0.w(this, i13)));
        this.Y0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(z1.class), new ml0.v(a13, 2), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.Z0 = bs1.c.u1(t0.a(), y3.f71400a);
        this.f104323a1 = new zy.a0();
        this.f104324b1 = d4.BOARD;
        this.f104325c1 = a4.BOARD_SELF;
    }

    public static final void k9(p0 p0Var, i2.o oVar, int i13) {
        p0Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1009133057);
        fc0.n.a(false, null, false, false, q2.i.c(445123359, new j0(p0Var, 0), sVar), sVar, 24576, 15);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(p0Var, i13, 6);
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_PREVIEW_TEMPLATE_RESULT_CODE") || Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_PREVIEW_VIDEO_RESULT_CODE")) {
            n9(new y(result.getString("ARG_TEMPLATE_ID"), result.getStringArrayList("ARG_TEMPLATE_PINS")));
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(m9().a(), 20);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(m9().c(), 16);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 1000, new i0(this, 9), a2.f104239a, new ns.i(6), new h0(this, 0), m9(), 32);
        b3.G(adapter, 1001, new i0(this, 10), b2.f104248a, new ns.i(7), new h0(this, 1), m9(), 32);
        i0 i0Var = new i0(this, 11);
        m2 m2Var = m2.f104307c;
        int i13 = 8;
        int i14 = 3;
        b3.G(adapter, 1002, i0Var, pe.i.x(), new ns.i(i13), new mj.m(i14), m9(), 32);
        adapter.J(1003, new i0(this, i13), new p90.m(i14), new p90.n(this, i14), new n0(this, i14));
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f104323a1.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f104323a1.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.f104325c1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF74737q1() {
        return this.f104324b1;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new ca0.y(m9().c(), 17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l9() {
        /*
            r3 = this;
            java.lang.String r0 = "BoardLandingExtras.EXTRA_BOARD_ID"
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
        throw new UnsupportedOperationException("Method not decompiled: qm0.p0.l9():java.lang.String");
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(y60.d.fragment_board_landing, y60.c.board_landing_content);
        eVar.b(y60.c.board_landing_loading_state_container);
        eVar.f979c = y60.c.board_landing_empty_state_container;
        return eVar;
    }

    public final z1 m9() {
        return (z1) this.Y0.getValue();
    }

    public final void n9(g0 g0Var) {
        kh2.j.x2(m9(), g0Var);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z1 m93 = m9();
        String l93 = l9();
        String g13 = cb.g("toString(...)");
        if (this.O0 != null) {
            m93.h(l93, g13, kg.t.O0(zf0.f.h(), true), (h32.i0) this.U0.getValue(), this.f104323a1.f());
        } else {
            Intrinsics.r("educationHelper");
            throw null;
        }
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(y60.c.board_landing_top_bar);
        ComposeView composeView = (ComposeView) findViewById;
        j0 j0Var = new j0(this, 1);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(j0Var, true, -91505110));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.Q0 = composeView;
        View findViewById2 = onCreateView.findViewById(y60.c.board_landing_top_bar_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.R0 = findViewById2;
        return onCreateView;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.w2((o2) this.X0.getValue());
        }
        super.onDestroyView();
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.o((o2) this.X0.getValue());
        }
        g9(bs1.c.X(this, d70.b.floating_toolbar_recycler_padding));
        View findViewById = v13.findViewById(y60.c.board_landing_tools_bar);
        FloatingToolbarView floatingToolbarView = (FloatingToolbarView) findViewById;
        floatingToolbarView.setTranslationY(400.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.S0 = floatingToolbarView;
        RecyclerView g84 = g8();
        if (g84 != null) {
            FloatingToolbarView floatingToolbarView2 = this.S0;
            if (floatingToolbarView2 == null) {
                Intrinsics.r("boardTools");
                throw null;
            }
            ComposeView composeView = this.Q0;
            if (composeView == null) {
                Intrinsics.r("topBar");
                throw null;
            }
            this.T0 = new wm0.f(floatingToolbarView2, composeView, g84);
        }
        k3.w1(this, new m0(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f104323a1.e().f67083c;
        return (x3Var == null || (str = x3Var.f67402f) == null) ? l9() : str;
    }
}
