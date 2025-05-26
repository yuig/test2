package nr;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import uj2.r;

/* loaded from: classes3.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91860i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f91861j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(fk2.f fVar, int i13) {
        super(1);
        this.f91860i = i13;
        this.f91861j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91860i;
        r rVar = this.f91861j;
        switch (i13) {
            case 0:
                ((fk2.f) rVar).c((vd0.c) obj);
                break;
            default:
                ((fk2.f) rVar).a((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
