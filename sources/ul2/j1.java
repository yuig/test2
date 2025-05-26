package ul2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122535i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k1 f122536j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k1 k1Var, int i13) {
        super(0);
        this.f122535i = i13;
        this.f122536j = k1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f122535i;
        k1 k1Var = this.f122536j;
        switch (i13) {
            case 0:
                return lb.l0.f(k1Var, true);
            default:
                dm2.r0 getter = k1Var.v().n().getGetter();
                return getter == null ? dl2.b.Q(k1Var.v().n(), bm2.h.f23540a) : getter;
        }
    }
}
