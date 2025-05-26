package t3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class z3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116290i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f116291j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(int i13, kotlin.jvm.internal.j0 j0Var) {
        super(0);
        this.f116290i = i13;
        this.f116291j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f116290i;
        kotlin.jvm.internal.j0 j0Var = this.f116291j;
        switch (i13) {
            case 0:
                ((Function0) j0Var.f80434a).invoke();
                return Unit.f80348a;
            default:
                return (Boolean) ((j1.g1) j0Var.f80434a).f74073b.getValue();
        }
    }
}
