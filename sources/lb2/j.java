package lb2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82775i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f82776j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ or1.b f82777k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, or1.b bVar, int i13) {
        super(1);
        this.f82775i = i13;
        this.f82776j = nVar;
        this.f82777k = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f82775i;
        n nVar = this.f82776j;
        or1.b bVar = this.f82777k;
        switch (i13) {
            case 0:
                nVar.h(or1.c.DELETE_ACCOUNT, or1.e.ATTEMPT, bVar, null);
                break;
            default:
                nVar.h(or1.c.DELETE_ACCOUNT, or1.e.FAILURE, bVar, (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
