package jp;

import com.pinterest.framework.multisection.datasource.pagedlist.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.n0;
import x40.nb;
import x40.ob;
import x40.pb;
import x40.q9;
import x40.qb;
import x40.r9;
import x40.rb;
import x40.sb;
import x40.tb;
import z40.d0;
import z40.n;

/* loaded from: classes3.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f77253j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f77254k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f77255l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f77256m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f77257n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f77258o = new g(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77259i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f77259i = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb qbVar;
        ?? r33;
        pb pbVar;
        pb pbVar2;
        List<ob> list;
        nb nbVar;
        q9 q9Var;
        r9 r9Var;
        int i13 = this.f77259i;
        switch (i13) {
            case 0:
                n item = (n) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(item, "item");
                        return item.getId();
                    default:
                        Intrinsics.checkNotNullParameter(item, "item");
                        return item.getId();
                }
            case 1:
                return Unit.f80348a;
            case 2:
                return Unit.f80348a;
            case 3:
                d0 item2 = (d0) obj;
                Intrinsics.checkNotNullParameter(item2, "item");
                return item2.getId();
            case 4:
                pc.h response = (pc.h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                n0 n0Var = response.f99563c;
                String str = null;
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
                                r33 = q0.f80391a;
                            } else {
                                r33 = new ArrayList();
                                for (ob obVar : list) {
                                    if (obVar == null || (nbVar = obVar.f132959a) == null) {
                                        nbVar = null;
                                    } else {
                                        Intrinsics.checkNotNullParameter(nbVar, "<this>");
                                    }
                                    if (nbVar != null) {
                                        r33.add(nbVar);
                                    }
                                }
                            }
                            if (qbVar != null && (pbVar2 = qbVar.f133116b) != null) {
                                str = pbVar2.f133036a;
                            }
                            return new l(str, r33, (qbVar != null || (pbVar = qbVar.f133116b) == null) ? false : pbVar.f133038c);
                        }
                    }
                }
                qbVar = null;
                if (qbVar != null) {
                }
                r33 = q0.f80391a;
                if (qbVar != null) {
                    str = pbVar2.f133036a;
                }
                return new l(str, r33, (qbVar != null || (pbVar = qbVar.f133116b) == null) ? false : pbVar.f133038c);
            default:
                n item3 = (n) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(item3, "item");
                        return item3.getId();
                    default:
                        Intrinsics.checkNotNullParameter(item3, "item");
                        return item3.getId();
                }
        }
    }
}
