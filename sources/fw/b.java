package fw;

import ew.n;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import nx.d0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f63032a;

    public b(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f63032a = pinalytics;
    }

    public final void a(String adUnitId, int i13, n surface) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(surface, "surface");
        i0 p13 = this.f63032a.p();
        if (p13 == null) {
            p13 = new i0(null, null, null, null, null, null);
        }
        i0 z03 = com.bumptech.glide.d.z0(p13, new a(surface, 0));
        f1 f1Var = f1.GMA_QUERY_INFO_SENT;
        HashMap x13 = a.a.x("ad_unit_ids", adUnitId, "is_third_party_ad", "true");
        u uVar = new u();
        uVar.s(Integer.valueOf(i13), "query_info_length");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        x13.put("3p_additional_data", sVar);
        Unit unit = Unit.f80348a;
        this.f63032a.U(z03, f1Var, null, null, x13, false);
    }

    public final void b(String failReason, int i13, String str, n nVar) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        i0 p13 = this.f63032a.p();
        if (p13 == null) {
            p13 = new i0(null, null, null, null, null, null);
        }
        i0 z03 = com.bumptech.glide.d.z0(p13, new a(nVar, 1));
        f1 f1Var = f1.GMA_REQUEST_HEADER_MISSING;
        HashMap o13 = ep.b.o("fail_reason", failReason);
        if (str != null) {
        }
        u uVar = new u();
        uVar.s(Integer.valueOf(i13), "count");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        o13.put("3p_additional_data", sVar);
        Unit unit = Unit.f80348a;
        this.f63032a.U(z03, f1Var, null, null, o13, false);
    }
}
