package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f85586i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o2 f85587j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l2 f85588k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlin.jvm.internal.g0 g0Var, o2 o2Var, l2 l2Var) {
        super(2);
        this.f85586i = g0Var;
        this.f85587j = o2Var;
        this.f85588k = l2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        kotlin.jvm.internal.g0 g0Var = this.f85586i;
        float f13 = floatValue - g0Var.f80425a;
        o2 o2Var = this.f85587j;
        long g13 = o2Var.g(o2Var.c(f13));
        o2 o2Var2 = this.f85588k.f85439a;
        g0Var.f80425a += o2Var.c(o2Var.f(o2.a(o2Var2, o2Var2.f85500h, g13, 1)));
        return Unit.f80348a;
    }
}
