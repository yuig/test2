package tj0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import i32.y0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.s3;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltj0/h;", "Lmm1/n;", "Ldl1/s;", "", "Lnr0/j;", "<init>", "()V", "default_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends mm1.n<dl1.s> implements mj0.c {

    /* renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ int f117873a1 = 0;
    public b0 R0;
    public m60.f0 S0;
    public i2 T0;
    public uk1.e U0;
    public s3 V0;
    public final int W0 = t60.c.fragment_board_more_ideas_bottom_sheet;
    public mj0.a X0;
    public final d4 Y0;
    public final a4 Z0;

    public h() {
        this.Y0 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_FULL_SCREEN", false) ? d4.FULL_MODAL : d4.HALF_MODAL;
        this.Z0 = a4.BOARD_IDEAS;
    }

    @Override // mj0.e
    public final void C5(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        View view = getView();
        if (view != null) {
            bs1.c.s2(view, message);
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, dl2.b.m2(s7(), W8(), new b10.z(24, requireContext, this)));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL, dl2.b.m2(s7(), W8(), new g(this, requireContext, adapter)));
        adapter.G(160, new g(requireContext, adapter, this));
    }

    @Override // mj0.c
    public final void U5() {
        ur0.g.d(y0.ANDROID_OWN_BOARD_MORE_IDEAS_TAKEOVER, this, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0096, code lost:
    
        if (r0 == null) goto L14;
     */
    @Override // yk1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yk1.m V7() {
        /*
            r13 = this;
            android.content.Context r0 = r13.requireContext()
            java.lang.String r1 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.content.Context r1 = kb0.a.f79058b
            java.lang.Class<wk1.a> r1 = wk1.a.class
            java.lang.Object r1 = a.cb.e(r1)
            wk1.a r1 = (wk1.a) r1
            wk1.b r11 = new wk1.b
            yk1.a r3 = new yk1.a
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r3.<init>(r2, r0)
            so.oa r1 = (so.oa) r1
            uj2.q r4 = r1.u2()
            uk1.e r0 = r1.x2()
            uk1.a r0 = (uk1.a) r0
            uk1.d r5 = r0.g()
            nx.d1 r6 = r1.F2()
            es.a r7 = r1.m2()
            es.h r8 = r1.o2()
            vr.a r9 = r1.n2()
            is1.t r10 = r1.S2()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            qa2.n r0 = r13.W8()
            r11.d(r0)
            uk1.e r0 = r13.U0
            r1 = 0
            if (r0 == 0) goto Lb4
            uk1.a r0 = (uk1.a) r0
            n70.o r2 = new n70.o
            r3 = 1
            nx.f0 r0 = r0.f122378a
            r2.<init>(r13, r0, r3)
            r11.g(r2)
            x02.i2 r0 = r13.T0
            if (r0 == 0) goto Lae
            r11.f(r0)
            wk1.c r6 = r11.a()
            so.s3 r2 = r13.V0
            if (r2 == 0) goto La8
            nj0.a r3 = new nj0.a
            java.lang.String r8 = r13.m9()
            r10 = 0
            r11 = 0
            r9 = 0
            r12 = 30
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            hk0.m r4 = hk0.m.BOARD
            com.pinterest.navigation.Navigation r0 = r13.I
            if (r0 == 0) goto L9b
            java.lang.String r1 = "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE"
            int r0 = r0.J1(r1)
            x22.a r1 = x22.c.Companion
            r1.getClass()
            x22.c r0 = x22.a.a(r0)
            if (r0 != 0) goto L99
            goto L9b
        L99:
            r5 = r0
            goto L9e
        L9b:
            x22.c r0 = x22.c.POST_AUTO_ORGANIZE_BOTTOM_SHEET
            goto L99
        L9e:
            r8 = 0
            r9 = 0
            r7 = 0
            r10 = 240(0xf0, float:3.36E-43)
            pj0.s r0 = so.s3.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        La8:
            java.lang.String r0 = "moreIdeasPresenterFactory"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        Lae:
            java.lang.String r0 = "pinRepository"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        Lb4:
            java.lang.String r0 = "presenterPinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tj0.h.V7():yk1.m");
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF112299o0() {
        return this.Z0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140044n0() {
        return this.Y0;
    }

    @Override // mm1.n
    public final Function0 h9() {
        return new f(this, 0);
    }

    @Override // mm1.n
    /* renamed from: i9 */
    public final int getF108113b1() {
        return 95;
    }

    @Override // mj0.c
    public final void j6(mj0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.X0 = listener;
    }

    @Override // mm1.n
    /* renamed from: j9 */
    public final int getF108114c1() {
        return com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_FULL_SCREEN", false) ? 95 : 50;
    }

    @Override // mm1.n
    /* renamed from: k9, reason: from getter */
    public final int getM0() {
        return this.W0;
    }

    public final String m9() {
        String f49940b;
        Navigation navigation = this.I;
        if (navigation == null || (f49940b = navigation.v0("com.pinterest.EXTRA_BOARD_ID")) == null) {
            Navigation navigation2 = this.I;
            f49940b = navigation2 != null ? navigation2.getF49940b() : null;
        }
        m60.f0 f0Var = this.S0;
        if (f0Var != null) {
            f0Var.N(f49940b, "Board id not sent to fragment through navigation!", new Object[0]);
            return f49940b == null ? "" : f49940b;
        }
        Intrinsics.r("devUtils");
        throw null;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g9(a.f117854n);
        hh0.a listener = new hh0.a(this, 17);
        Intrinsics.checkNotNullParameter(listener, "listener");
        mm1.k kVar = this.Q0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.a(listener);
        f listener2 = new f(this, 1);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        mm1.k kVar2 = this.Q0;
        if (kVar2 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar2.d(listener2);
        f listener3 = new f(this, 2);
        Intrinsics.checkNotNullParameter(listener3, "listener");
        mm1.k kVar3 = this.Q0;
        if (kVar3 != null) {
            kVar3.c(listener3);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }

    @Override // mj0.d
    public final boolean t3() {
        return false;
    }
}
