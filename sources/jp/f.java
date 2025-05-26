package jp;

import com.pinterest.framework.multisection.datasource.pagedlist.l;
import com.pinterest.framework.multisection.datasource.pagedlist.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import pc.n0;
import pc.p0;
import pc.q0;
import pc.r0;
import x40.nb;
import x40.ob;
import x40.pb;
import x40.q9;
import x40.qb;
import x40.r9;
import x40.rb;
import x40.sb;
import x40.tb;
import x40.ub;

/* loaded from: classes3.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77251i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f77252j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(1);
        this.f77251i = i13;
        this.f77252j = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb qbVar;
        ?? r63;
        pb pbVar;
        pb pbVar2;
        List<ob> list;
        nb nbVar;
        q9 q9Var;
        r9 r9Var;
        int i13 = this.f77251i;
        h hVar = this.f77252j;
        switch (i13) {
            case 0:
                p requestState = (p) obj;
                Intrinsics.checkNotNullParameter(requestState, "requestState");
                q0 q0Var = new q0(Integer.valueOf(requestState.f49152a));
                String str = requestState.f49153b;
                r0 q0Var2 = str == null ? p0.f99597a : new q0(str);
                lh0.p0 p0Var = hVar.f77261b;
                p0Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) p0Var.f83455a;
                return new ub(q0Var, q0Var2, new q0(Boolean.valueOf(g1Var.o("android_real_time_messaging_killswitch", "enabled", z3Var) || g1Var.l("android_real_time_messaging_killswitch"))), 4);
            default:
                pc.h response = (pc.h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                n0 n0Var = response.f99563c;
                String str2 = null;
                tb tbVar = n0Var instanceof tb ? (tb) n0Var : null;
                if (tbVar != null && (q9Var = tbVar.f133359a) != null) {
                    Intrinsics.checkNotNullParameter(q9Var, "<this>");
                    sb sbVar = q9Var instanceof sb ? (sb) q9Var : null;
                    if (sbVar != null && (r9Var = sbVar.f133264e) != null) {
                        Intrinsics.checkNotNullParameter(r9Var, "<this>");
                        rb rbVar = r9Var instanceof rb ? (rb) r9Var : null;
                        if (rbVar != null) {
                            qbVar = rbVar.f133180e;
                            if (qbVar != null || (list = qbVar.f133115a) == null) {
                                r63 = kotlin.collections.q0.f80391a;
                            } else {
                                r63 = new ArrayList();
                                for (ob obVar : list) {
                                    if (obVar == null || (nbVar = obVar.f132959a) == null) {
                                        nbVar = null;
                                    } else {
                                        Intrinsics.checkNotNullParameter(nbVar, "<this>");
                                    }
                                    if (nbVar != null) {
                                        r63.add(nbVar);
                                    }
                                }
                            }
                            hVar.f77267h.C2(true);
                            if (qbVar != null && (pbVar2 = qbVar.f133116b) != null) {
                                str2 = pbVar2.f133036a;
                            }
                            if (qbVar != null && (pbVar = qbVar.f133116b) != null) {
                                r0 = pbVar.f133038c;
                            }
                            return new l(str2, r63, r0);
                        }
                    }
                }
                qbVar = null;
                if (qbVar != null) {
                }
                r63 = kotlin.collections.q0.f80391a;
                hVar.f77267h.C2(true);
                if (qbVar != null) {
                    str2 = pbVar2.f133036a;
                }
                if (qbVar != null) {
                    r0 = pbVar.f133038c;
                }
                return new l(str2, r63, r0);
        }
    }
}
