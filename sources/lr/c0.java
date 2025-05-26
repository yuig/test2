package lr;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x40.nb;
import x40.ob;
import x40.q9;
import x40.qb;
import x40.r9;
import x40.rb;
import x40.sb;
import x40.tb;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f84483i = new c0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb qbVar;
        List<ob> list;
        nb nbVar;
        q9 q9Var;
        r9 r9Var;
        pc.h response = (pc.h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        tb tbVar = (tb) response.f99563c;
        if (tbVar != null && (q9Var = tbVar.f133359a) != null) {
            Intrinsics.checkNotNullParameter(q9Var, "<this>");
            sb sbVar = q9Var instanceof sb ? (sb) q9Var : null;
            if (sbVar != null && (r9Var = sbVar.f133264e) != null) {
                Intrinsics.checkNotNullParameter(r9Var, "<this>");
                rb rbVar = r9Var instanceof rb ? (rb) r9Var : null;
                if (rbVar != null) {
                    qbVar = rbVar.f133180e;
                    if (qbVar != null || (list = qbVar.f133115a) == null) {
                        return q0.f80391a;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ob obVar : list) {
                        if (obVar == null || (nbVar = obVar.a()) == null) {
                            nbVar = null;
                        } else {
                            Intrinsics.checkNotNullParameter(nbVar, "<this>");
                        }
                        if (nbVar != null) {
                            arrayList.add(nbVar);
                        }
                    }
                    return arrayList;
                }
            }
        }
        qbVar = null;
        if (qbVar != null) {
        }
        return q0.f80391a;
    }
}
