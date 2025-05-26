package ed1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58572i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f58573j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i13) {
        super(0);
        this.f58572i = i13;
        this.f58573j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f58572i;
        f0 f0Var = this.f58573j;
        switch (i13) {
            case 0:
                if (f0Var.F.j()) {
                    return new o(f0Var, 1);
                }
                return null;
            default:
                f0Var.q3(false);
                return Unit.f80348a;
        }
    }
}
