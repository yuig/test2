package dm2;

import kotlin.jvm.functions.Function1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class d0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f55408b;

    public /* synthetic */ d0(e0 e0Var, int i13) {
        this.f55407a = i13;
        this.f55408b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55407a) {
            case 0:
                return Boolean.valueOf(!((am2.c1) obj).F());
            default:
                pn2.h0 h0Var = (pn2.h0) obj;
                e0 e0Var = this.f55408b;
                if (h0Var != null) {
                    return e0Var.f55412b.f100834a.f() ? h0Var : (pn2.h0) e0Var.r0().l(h0Var, w1.INVARIANT);
                }
                e0Var.getClass();
                return h0Var;
        }
    }
}
