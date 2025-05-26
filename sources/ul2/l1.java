package ul2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class l1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m1 f122552j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(m1 m1Var, int i13) {
        super(0);
        this.f122551i = i13;
        this.f122552j = m1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f122551i;
        m1 m1Var = this.f122552j;
        switch (i13) {
            case 0:
                return lb.l0.f(m1Var, false);
            default:
                am2.t0 setter = m1Var.v().n().getSetter();
                return setter == null ? dl2.b.R(m1Var.v().n(), bm2.h.f23540a) : setter;
        }
    }
}
