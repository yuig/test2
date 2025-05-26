package sm0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.i0;
import qm0.b2;
import qm0.d2;
import qm0.e2;
import qm0.g2;
import qm0.l2;
import qm0.n2;
import z32.m0;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final m f113268i = new m(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 d2Var;
        String g13;
        i0 i0Var;
        i0 i0Var2;
        ?? r63;
        o12.b response = (o12.b) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        Object U = CollectionsKt.U(0, response.f92783a);
        vh vhVar = U instanceof vh ? (vh) U : null;
        if (vhVar == null) {
            return e0.b(b2.f104248a);
        }
        List list = vhVar.f42865w;
        Intrinsics.f(list);
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            i0Var = b2.f104248a;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dl1.s sVar = (dl1.s) it.next();
                if (sVar instanceof vh) {
                    Intrinsics.f(sVar);
                    vh vhVar2 = (vh) sVar;
                    List list2 = vhVar2.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof f30) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String p03 = bs1.c.p0((f30) it2.next());
                        if (p03 != null) {
                            arrayList3.add(p03);
                        }
                    }
                    kj kjVar = vhVar2.f42855m;
                    String a13 = kjVar != null ? kjVar.a() : null;
                    i0Var2 = new l2(arrayList3.size(), a13 != null ? a13 : "", arrayList3);
                } else if (sVar instanceof ba) {
                    Intrinsics.f(sVar);
                    ba baVar = (ba) sVar;
                    List<f30> y13 = baVar.y();
                    if (y13 != null) {
                        r63 = new ArrayList();
                        for (f30 f30Var : y13) {
                            Intrinsics.f(f30Var);
                            String p04 = bs1.c.p0(f30Var);
                            if (p04 != null) {
                                r63.add(p04);
                            }
                        }
                    } else {
                        r63 = 0;
                    }
                    if (r63 == 0) {
                        r63 = q0.f80391a;
                    }
                    String uid = baVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    String A = baVar.A();
                    Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
                    Integer x13 = baVar.x();
                    Intrinsics.checkNotNullExpressionValue(x13, "getPinCount(...)");
                    i0Var2 = new n2(x13.intValue(), uid, A, r63);
                } else if (sVar instanceof f30) {
                    Intrinsics.f(sVar);
                    i0Var2 = new g2((f30) sVar);
                } else {
                    i0Var2 = null;
                }
                if (i0Var2 != null) {
                    arrayList.add(i0Var2);
                }
            }
            if (arrayList.isEmpty()) {
                i0Var = b2.f104248a;
            } else {
                if (vhVar.f42868z == m0.STRUCTURED_FEED_GRID_SECTION) {
                    String uid2 = vhVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    kj kjVar2 = vhVar.f42855m;
                    String a14 = kjVar2 != null ? kjVar2.a() : null;
                    if (a14 == null) {
                        a14 = "";
                    }
                    ih ihVar = vhVar.f42857o;
                    g13 = ihVar != null ? ihVar.g() : null;
                    d2Var = new e2(uid2, a14, g13 != null ? g13 : "", arrayList);
                } else {
                    String uid3 = vhVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    kj kjVar3 = vhVar.f42855m;
                    String a15 = kjVar3 != null ? kjVar3.a() : null;
                    if (a15 == null) {
                        a15 = "";
                    }
                    ih ihVar2 = vhVar.f42857o;
                    g13 = ihVar2 != null ? ihVar2.g() : null;
                    d2Var = new d2(uid3, a15, g13 != null ? g13 : "", arrayList);
                }
                i0Var = d2Var;
            }
        }
        return e0.b(i0Var);
    }
}
