package a;

import ads_mobile_sdk.aq;
import ads_mobile_sdk.cq;
import ads_mobile_sdk.ew0;
import ads_mobile_sdk.qj0;
import ads_mobile_sdk.zv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class n0 extends qj0 {
    public final void g(aq aqVar) {
        RandomAccess randomAccess;
        g1 g1Var;
        b();
        cq cqVar = (cq) this.f10110b;
        cqVar.getClass();
        randomAccess = cqVar.allowedApis_;
        if (!((ads_mobile_sdk.j) randomAccess).f6594a) {
            zv0 zv0Var = (zv0) randomAccess;
            cqVar.allowedApis_ = zv0Var.a(zv0Var.f14948c * 2);
        }
        g1Var = cqVar.allowedApis_;
        ((zv0) g1Var).b(aqVar.a());
    }

    public final void h(ArrayList arrayList) {
        RandomAccess randomAccess;
        g1 g1Var;
        b();
        cq cqVar = (cq) this.f10110b;
        randomAccess = cqVar.allowedApis_;
        if (!((ads_mobile_sdk.j) randomAccess).f6594a) {
            zv0 zv0Var = (zv0) randomAccess;
            cqVar.allowedApis_ = zv0Var.a(zv0Var.f14948c * 2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aq aqVar = (aq) it.next();
            g1Var = cqVar.allowedApis_;
            ((zv0) g1Var).b(aqVar.a());
        }
    }

    public final ew0 i() {
        g1 g1Var;
        u1 u1Var;
        cq cqVar = (cq) this.f10110b;
        cqVar.getClass();
        g1Var = cqVar.allowedApis_;
        u1Var = cq.allowedApis_converter_;
        return new ew0(g1Var, u1Var);
    }
}
