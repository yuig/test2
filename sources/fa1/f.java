package fa1;

import ea1.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61557i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f61558j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f61559k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(n nVar, g1 g1Var, int i13) {
        super(1);
        this.f61557i = i13;
        this.f61558j = nVar;
        this.f61559k = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61557i;
        g1 g1Var = this.f61559k;
        n nVar = this.f61558j;
        switch (i13) {
            case 0:
                nVar.f61582c.a(g1Var.f58055a);
                break;
            default:
                nVar.f61582c.a(g1Var.f58055a);
                break;
        }
        return Unit.f80348a;
    }
}
