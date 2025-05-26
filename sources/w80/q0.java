package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128367i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f128368j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f128369k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Function2 function2, g gVar, int i13) {
        super(1);
        this.f128367i = i13;
        this.f128368j = function2;
        this.f128369k = gVar;
    }

    public final void b(q3.x it) {
        int i13 = this.f128367i;
        Function2 function2 = this.f128368j;
        g gVar = this.f128369k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                function2.invoke(Integer.valueOf(gVar.f128291d), it);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                function2.invoke(Integer.valueOf(gVar.f128291d), it);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f128367i) {
            case 0:
                b((q3.x) obj);
                break;
            default:
                b((q3.x) obj);
                break;
        }
        return Unit.f80348a;
    }
}
