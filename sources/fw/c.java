package fw;

import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import nx.d0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f63033a;

    /* renamed from: b, reason: collision with root package name */
    public final zr.b f63034b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63035c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63036d;

    public c(d0 pinalytics, zr.b adsSystemUtils) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
        this.f63033a = pinalytics;
        this.f63034b = adsSystemUtils;
        this.f63035c = true;
        this.f63036d = true;
    }

    public static String a(int i13, long j13, boolean z13) {
        u uVar = new u();
        uVar.s(Integer.valueOf(i13), "query_info_length");
        uVar.s(Long.valueOf(j13), "query_info_duration");
        uVar.t("query_info_first_time", Boolean.valueOf(z13));
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return sVar;
    }

    public static void b(c cVar, String failureReason) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        f1 f1Var = f1.GMA_SDK_QUARANTINE_FAILED;
        HashMap o13 = ep.b.o("fail_reason", failureReason);
        Unit unit = Unit.f80348a;
        cVar.f63033a.g(f1Var, null, o13, false);
    }
}
