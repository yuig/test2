package a;

import ads_mobile_sdk.sj0;
import ads_mobile_sdk.yv2;

/* loaded from: classes2.dex */
public final class ih extends tf {
    @Override // a.tf
    public final yv2 a(Object obj) {
        sj0 sj0Var = (sj0) obj;
        yv2 yv2Var = sj0Var.f11118b;
        if (yv2Var != yv2.f14423f) {
            return yv2Var;
        }
        yv2 b13 = yv2.b();
        sj0Var.f11118b = b13;
        return b13;
    }

    @Override // a.tf
    public final void b(Object obj, Object obj2) {
        ((sj0) obj).f11118b = (yv2) obj2;
    }

    @Override // a.tf
    public final void d(Object obj) {
        yv2 yv2Var = ((sj0) obj).f11118b;
        if (yv2Var.f14428e) {
            yv2Var.f14428e = false;
        }
    }
}
