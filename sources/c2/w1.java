package c2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class w1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25349i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i2 f25350j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(i2 i2Var, int i13) {
        super(1);
        this.f25349i = i13;
        this.f25350j = i2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f25349i;
        i2 i2Var = this.f25350j;
        switch (i13) {
            case 0:
                return new n4.h(d7.b.a(ml2.c.c(i2Var.f24842a.f()), 0));
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(i2.a(i2Var).l0(g2.f24760b));
        }
    }
}
