package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117285i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ uc0.d0 f117286j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(uc0.d0 d0Var, int i13) {
        super(1);
        this.f117285i = i13;
        this.f117286j = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f117285i;
        uc0.d0 d0Var = this.f117286j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                d0Var.i(new uc0.b0(it));
                break;
            default:
                uc0.c0 itemEvent = (uc0.c0) obj;
                Intrinsics.checkNotNullParameter(itemEvent, "itemEvent");
                d0Var.i(itemEvent);
                break;
        }
        return Unit.f80348a;
    }
}
