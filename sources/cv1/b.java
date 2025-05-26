package cv1;

import b40.k;
import b40.l;
import b40.n;
import b40.o;
import b40.p;
import b40.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f53311i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        k kVar;
        l lVar;
        n nVar;
        h response = (h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        q qVar = (q) response.f99563c;
        if (qVar != null && (kVar = qVar.f21739a) != null) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            p pVar = kVar instanceof p ? (p) kVar : null;
            if (pVar != null && (lVar = pVar.f21736e) != null) {
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                o oVar = lVar instanceof o ? (o) lVar : null;
                if (oVar != null && (nVar = oVar.f21731d) != null) {
                    Integer num = nVar.f21727b;
                    int intValue = num != null ? num.intValue() : 0;
                    Integer num2 = nVar.f21726a;
                    i13 = num2 != null ? num2.intValue() : 0;
                    r0 = intValue;
                    return new Pair(Integer.valueOf(r0), Integer.valueOf(i13));
                }
            }
        }
        i13 = 0;
        return new Pair(Integer.valueOf(r0), Integer.valueOf(i13));
    }
}
