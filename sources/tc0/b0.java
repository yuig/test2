package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uc0.i1;
import uc0.l1;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117219i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1 f117220j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(l1 l1Var, int i13) {
        super(1);
        this.f117219i = i13;
        this.f117220j = l1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f117219i;
        l1 l1Var = this.f117220j;
        switch (i13) {
            case 0:
                uc0.k it = (uc0.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                l1Var.i(it);
                break;
            default:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                l1Var.i(new i1(it2));
                break;
        }
        return Unit.f80348a;
    }
}
