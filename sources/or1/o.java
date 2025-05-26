package or1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class o extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97276i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97277j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(i iVar, int i13) {
        super(1);
        this.f97276i = i13;
        this.f97277j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f97276i;
        i iVar = this.f97277j;
        switch (i13) {
            case 0:
                i.l(iVar, e.ATTEMPT, null, 6);
                break;
            case 1:
                i.l(iVar, e.SUCCESS, null, 6);
                break;
            default:
                i.l(iVar, e.FAILURE, (Throwable) obj, 4);
                break;
        }
        return Unit.f80348a;
    }
}
