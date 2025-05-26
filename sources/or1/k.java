package or1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97262i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97263j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f97264k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f97265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(i iVar, d dVar, p pVar, int i13) {
        super(1);
        this.f97262i = i13;
        this.f97263j = iVar;
        this.f97264k = dVar;
        this.f97265l = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f97262i;
        p pVar = this.f97265l;
        d dVar = this.f97264k;
        i iVar = this.f97263j;
        switch (i13) {
            case 0:
                iVar.e(e.ATTEMPT, dVar, pVar, null);
                break;
            case 1:
                iVar.e(e.SUCCESS, dVar, pVar, null);
                break;
            default:
                iVar.e(e.FAILURE, dVar, pVar, (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
