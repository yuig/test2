package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ft1 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final zq1 f5278a;

    public ft1(zq1 omid) {
        Intrinsics.checkNotNullParameter(omid, "omid");
        this.f5278a = omid;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.OMID;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        return new pk0(new et1((String) this.f5278a.f14866g.b(qq1.f10224a, "GetOmidVersion")));
    }
}
