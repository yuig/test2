package s52;

import h32.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111170i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f111171j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(n nVar, int i13) {
        super(1);
        this.f111170i = i13;
        this.f111171j = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f111170i;
        n nVar = this.f111171j;
        switch (i13) {
            case 0:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = nVar.f111195f1;
                break;
            default:
                r52.a itemPin = (r52.a) obj;
                Intrinsics.checkNotNullParameter(itemPin, "itemPin");
                int i14 = n.f111189g1;
                kh2.j.x2(nVar.n9(), new r52.n(itemPin));
                break;
        }
        return Unit.f80348a;
    }
}
