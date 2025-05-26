package kt0;

import df.j1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80835i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f80836j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, int i13) {
        super(1);
        this.f80835i = i13;
        this.f80836j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f80835i;
        q qVar = this.f80836j;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.f80346a).intValue();
                int intValue2 = ((Number) pair.f80347b).intValue();
                fv1.b bVar = qVar.f80848s0;
                if (bVar == null) {
                    Intrinsics.r("notificationCount");
                    throw null;
                }
                bVar.f63028b = intValue;
                bVar.f63029c = intValue2;
                bVar.f63027a.d(new fv1.a());
                return Unit.f80348a;
            default:
                qVar.b6().h(j1.T(qVar + " error getting unseen notifications", ((Throwable) obj).getMessage()));
                return Unit.f80348a;
        }
    }
}
