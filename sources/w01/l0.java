package w01;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 extends kotlin.jvm.internal.p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p03 = (String) obj;
        kl2.l p13 = (kl2.l) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        m0 m0Var = (m0) this.receiver;
        m0Var.getClass();
        m0Var.addDisposable(m0Var.f127084x.a(p03, p13, new e0(m0Var, 2)));
        return Unit.f80348a;
    }
}
