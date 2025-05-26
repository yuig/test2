package s1;

import kh2.k3;
import m1.f1;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f110532i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n4.k f110533j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f110534k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o0 o0Var, n4.k kVar, float f13) {
        super(3);
        this.f110532i = o0Var;
        this.f110533j = kVar;
        this.f110534k = f13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean r13;
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        o0 o0Var = this.f110532i;
        if (((f0) o0Var.m()).f110422e == f1.Vertical) {
            r13 = k3.r1(o0Var);
        } else {
            r13 = this.f110533j == n4.k.Ltr ? k3.r1(o0Var) : !k3.r1(o0Var);
        }
        int i13 = ((f0) o0Var.m()).f110419b;
        float Q = i13 == 0 ? 0.0f : k3.Q(o0Var) / i13;
        float f13 = Q - ((int) Q);
        char c13 = Math.abs(floatValue) >= o0Var.f110506p.l0(n1.l.f88914a) ? floatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c13 == 0) {
            floatValue2 = Math.abs(f13) > this.f110534k ? floatValue3 : floatValue3;
        } else {
            if (c13 != 1) {
                if (c13 != 2) {
                    floatValue2 = 0.0f;
                }
            }
        }
        return Float.valueOf(floatValue2);
    }
}
