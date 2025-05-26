package or1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97269i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97270j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f97271k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(i iVar, f fVar, int i13) {
        super(1);
        this.f97269i = i13;
        this.f97270j = iVar;
        this.f97271k = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f97269i;
        i iVar = this.f97270j;
        f fVar = this.f97271k;
        switch (i13) {
            case 0:
                iVar.g(e.ATTEMPT, fVar, null);
                break;
            default:
                iVar.g(e.FAILURE, fVar, (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
