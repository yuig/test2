package vz0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import dl1.s;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import np0.h;
import nx.d0;
import so.n1;
import so.oa;
import uk1.e;
import wk1.b;
import wk1.c;
import wk1.k;
import x02.i2;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvz0/a;", "Lwk1/k;", "Ldl1/s;", "", "Lnr0/j;", "<init>", "()V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends k<s> {
    public static final /* synthetic */ int R0 = 0;
    public i2 M0;
    public n1 N0;
    public e O0;
    public final d4 P0 = d4.PEAR_INSIGHT;
    public final a4 Q0 = a4.PEAR_STYLE_EXPLORER;

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER, new au0.a(this, 22));
    }

    @Override // yk1.k
    public final m V7() {
        e3.a pinalyticsViewType = new e3.a(5);
        pinalyticsViewType.p((d4) pinalyticsViewType.f56996b, (a4) pinalyticsViewType.f56997c, null, getF63135d0());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        b bVar = new b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        i2 i2Var = this.M0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        if (this.O0 == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        d0 pinalytics = s7();
        String objectId = d.Z(this, "com.pinterest.EXTRA_STYLE_ID", "");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(pinalyticsViewType, "pinalyticsViewType");
        bVar.g(new uk1.d(pinalyticsViewType, pinalytics, objectId));
        c a13 = bVar.a();
        n1 n1Var = this.N0;
        if (n1Var != null) {
            return n1Var.a(d.Z(this, "com.pinterest.EXTRA_STYLE_ID", ""), d.Z(this, "com.pinterest.EXTRA_SOURCE_PIN_ID", ""), a13);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getQ0() {
        return this.Q0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getP0() {
        return this.P0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(iy1.e.fragment_pear_style_explorer, iy1.d.p_recycler_view);
        eVar.f979c = iy1.d.empty_state_container;
        eVar.c(iy1.d.swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ((GestaltIconButton) v13.findViewById(iy1.d.back_button)).u(new h(this, 25));
    }

    @Override // nl1.d
    public final String q7() {
        return d.Z(this, "com.pinterest.EXTRA_STYLE_ID", "");
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        hashMap.put("style_id", d.Z(this, "com.pinterest.EXTRA_STYLE_ID", ""));
        hashMap.put("source_style_id", d.Z(this, "com.pinterest.EXTRA_SOURCE_STYLE_ID", ""));
        hashMap.put("source_pin_id", d.Z(this, "com.pinterest.EXTRA_SOURCE_PIN_ID", ""));
        hashMap.put("depth", String.valueOf(d.O(this, "com.pinterest.EXTRA_DEPTH", 0)));
        return hashMap;
    }
}
