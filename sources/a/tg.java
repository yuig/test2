package a;

import ads_mobile_sdk.lw2;
import ads_mobile_sdk.mw2;

/* loaded from: classes2.dex */
public final class tg implements wf {
    public static void a(long j13, Object obj) {
        ads_mobile_sdk.j jVar = (ads_mobile_sdk.j) ((h4) mw2.f8408c.g(obj, j13));
        if (jVar.f6594a) {
            jVar.f6594a = false;
        }
    }

    public static h4 b(long j13, Object obj) {
        lw2 lw2Var = mw2.f8408c;
        h4 h4Var = (h4) lw2Var.g(obj, j13);
        if (((ads_mobile_sdk.j) h4Var).f6594a) {
            return h4Var;
        }
        int size = h4Var.size();
        h4 a13 = h4Var.a(size == 0 ? 10 : size * 2);
        lw2Var.a(j13, obj, a13);
        return a13;
    }
}
