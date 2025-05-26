package or1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97266i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97267j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f97268k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(i iVar, f fVar, int i13) {
        super(1);
        this.f97266i = i13;
        this.f97267j = iVar;
        this.f97268k = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f97266i;
        i iVar = this.f97267j;
        f fVar = this.f97268k;
        switch (i13) {
            case 0:
                iVar.g(e.ATTEMPT, fVar, null);
                break;
            case 1:
                iVar.g(e.SUCCESS, fVar, null);
                break;
            default:
                iVar.g(e.FAILURE, fVar, (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
