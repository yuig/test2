package ni1;

import so.ca;
import so.da;
import so.na;
import so.oa;

/* loaded from: classes2.dex */
public interface t2 {
    static o2 a(t2 t2Var, ao2.j0 j0Var, zw.a aVar, int i13) {
        boolean z13 = (i13 & 2) != 0;
        zw.a aVar2 = (i13 & 8) != 0 ? new zw.a() : aVar;
        na naVar = ((ca) t2Var).f113373a;
        da daVar = (da) naVar.f113568a.f113914sc.get();
        oa oaVar = naVar.f113568a;
        return new o2(j0Var, z13, null, aVar2, daVar, (es.h) oaVar.f113735i7.get(), oa.h0(oaVar), (es.a) oaVar.P6.get(), oa.x1(oaVar), (jv.a) oaVar.f113932tc.get(), (nx.b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (nx.d0) oaVar.f113817n2.get());
    }
}
