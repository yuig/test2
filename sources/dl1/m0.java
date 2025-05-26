package dl1;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55253i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f55254j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(q0 q0Var, int i13) {
        super(2);
        this.f55253i = i13;
        this.f55254j = q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        s sVar;
        switch (this.f55253i) {
            case 0:
                xk2.w accumulator = (xk2.w) obj;
                Pair updatedModelWithParams = (Pair) obj2;
                Intrinsics.checkNotNullParameter(accumulator, "accumulator");
                Intrinsics.checkNotNullParameter(updatedModelWithParams, "updatedModelWithParams");
                s sVar2 = (s) ((Map) accumulator.f135234a).get(((s) updatedModelWithParams.f80347b).getId());
                if (sVar2 == null) {
                    r rVar = this.f55254j.f55274g;
                    m mVar = (m) updatedModelWithParams.f80346a;
                    synchronized (rVar.f55284a) {
                        try {
                            q qVar = (q) rVar.f55284a.get(mVar);
                            if (qVar == null || !q.a(qVar)) {
                                sVar = qVar != null ? qVar.f55265a : null;
                            } else {
                                rVar.f55284a.remove(mVar);
                            }
                        } finally {
                        }
                    }
                    sVar2 = sVar;
                }
                Map map = (Map) accumulator.f135234a;
                String id3 = ((s) updatedModelWithParams.f80347b).getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                map.put(id3, updatedModelWithParams.f80347b);
                return new xk2.w(accumulator.f135234a, sVar2, updatedModelWithParams.f80347b);
            default:
                Map map2 = (Map) obj;
                s sVar3 = (s) obj2;
                Intrinsics.f(map2);
                String id4 = sVar3.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                String id5 = sVar3.getId();
                Intrinsics.checkNotNullExpressionValue(id5, "getUid(...)");
                map2.put(id4, this.f55254j.l(id5));
                return Unit.f80348a;
        }
    }
}
