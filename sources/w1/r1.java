package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class r1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1 f127470j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(y1 y1Var, int i13) {
        super(1);
        this.f127469i = i13;
        this.f127470j = y1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127469i;
        y1 y1Var = this.f127470j;
        switch (i13) {
            case 0:
                y1Var.c(((a3.c) obj).f482a);
                break;
            default:
                n3.q qVar = (n3.q) obj;
                y1Var.e(c0.d.w2(qVar, false));
                qVar.a();
                break;
        }
        return Unit.f80348a;
    }
}
