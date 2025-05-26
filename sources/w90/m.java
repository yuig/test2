package w90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128569i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f128570j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i13) {
        super(2);
        this.f128569i = i13;
        this.f128570j = pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f128569i;
        p pVar = this.f128570j;
        switch (i13) {
            case 0:
                i2.o oVar = (i2.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                el.a.b(null, new j(pVar, 1), oVar, 0, 1);
            default:
                String collageId = (String) obj;
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                e eVar = new e(collageId);
                int i14 = p.V0;
                kh2.j.x2(pVar.e9(), eVar);
                break;
        }
        return Unit.f80348a;
    }
}
