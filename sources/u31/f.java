package u31;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import dl1.s;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import qa2.n;
import so.oa;
import so.u1;
import w01.e0;
import wa2.i;
import x02.i2;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lu31/f;", "Lwk1/k;", "Ldl1/s;", "Lo31/b;", "Lnr0/j;", "<init>", "()V", "bp1/h", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends a<s> implements o31.b {
    public u1 R0;
    public i2 S0;
    public f0 T0;
    public uk1.e U0;
    public o31.a V0;
    public final d4 W0 = d4.USER;

    @Override // com.pinterest.feature.profile.b
    public final void D6() {
        o31.a aVar = this.V0;
        if (aVar != null) {
            ((r31.b) aVar).r3();
        } else {
            Intrinsics.r("viewListener");
            throw null;
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, new e0(this, 15));
    }

    @Override // sq0.e
    public final n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        n a13 = new q31.a(s7(), y32.f.CLOSEUP_LONGPRESS, pinActionHandler).a(new yk1.a(getResources(), requireContext().getTheme()));
        i iVar = a13.f103320a;
        iVar.f128803w = false;
        iVar.I = true;
        return a13;
    }

    @Override // yk1.k
    public final m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.U0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).d(j9()));
        i2 i2Var = this.S0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        u1 u1Var = this.R0;
        if (u1Var != null) {
            return u1Var.a(j9(), a13);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // sq0.e
    public final int Z8() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return bs1.c.U(eo1.c.lego_brick_quarter, resources);
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final g0 getF73409e1() {
        return g0.CREATED_TAB;
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 3;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getS0() {
        return getActiveUserManager().b(j9()) ? a4.USER_SELF : a4.USER_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.W0;
    }

    public final String j9() {
        Bundle f49207c;
        ScreenDescription screenDescription = this.f76937a;
        String string = (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) ? null : f49207c.getString("com.pinterest.EXTRA_USER_ID");
        return string == null ? "" : string;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o31.a aVar = this.V0;
        if (aVar != null) {
            ((r31.b) aVar).v3();
        } else {
            Intrinsics.r("viewListener");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (dl2.b.S1(r0, j9()) == true) goto L8;
     */
    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            super.onViewCreated(r5, r6)
            com.pinterest.feature.profile.createdtab.view.ProfileCreatedTabEmptyStateView r5 = new com.pinterest.feature.profile.createdtab.view.ProfileCreatedTabEmptyStateView
            android.content.Context r6 = r4.requireContext()
            java.lang.String r0 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r5.<init>(r6)
            u31.b r6 = new u31.b
            b60.b r0 = r4.getActiveUserManager()
            b60.d r0 = (b60.d) r0
            com.pinterest.api.model.wy0 r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto L32
            java.lang.String r2 = r4.j9()
            boolean r0 = dl2.b.S1(r0, r2)
            r2 = 1
            if (r0 != r2) goto L32
            goto L33
        L32:
            r2 = r1
        L33:
            u31.e r0 = new u31.e
            o31.a r3 = r4.V0
            if (r3 == 0) goto L63
            r0.<init>(r3)
            r6.<init>(r2, r0)
            r5.L(r6)
            r6 = 49
            r4.O8(r5, r6)
            androidx.recyclerview.widget.RecyclerView r5 = r4.g8()
            if (r5 == 0) goto L62
            int r6 = r5.getPaddingStart()
            int r0 = r5.getPaddingEnd()
            android.content.res.Resources r2 = r5.getResources()
            int r3 = d02.a.recycler_bottom_padding_footer
            int r2 = r2.getDimensionPixelOffset(r3)
            r5.setPaddingRelative(r6, r1, r0, r2)
        L62:
            return
        L63:
            java.lang.String r5 = "viewListener"
            kotlin.jvm.internal.Intrinsics.r(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u31.f.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
