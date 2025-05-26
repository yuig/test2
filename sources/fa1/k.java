package fa1;

import ea1.k1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61571i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f61572j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k1 f61573k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, k1 k1Var, int i13) {
        super(1);
        this.f61571i = i13;
        this.f61572j = nVar;
        this.f61573k = k1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61571i;
        k1 k1Var = this.f61573k;
        n nVar = this.f61572j;
        switch (i13) {
            case 0:
                nVar.f61582c.a(k1Var.f58074a);
                break;
            default:
                nVar.f61582c.a(k1Var.f58074a);
                break;
        }
        return Unit.f80348a;
    }
}
