package i1;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70911i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70912j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70913k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, Object obj, Object obj2) {
        super(1);
        this.f70911i = i13;
        this.f70912j = obj;
        this.f70913k = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70911i;
        Object obj2 = this.f70913k;
        Object obj3 = this.f70912j;
        switch (i13) {
            case 0:
                j1.z1 z1Var = (j1.z1) obj;
                x xVar = (x) obj3;
                v3 v3Var = (v3) xVar.f70929d.g(z1Var.c());
                long j13 = v3Var != null ? ((n4.j) v3Var.getValue()).f89186a : 0L;
                v3 v3Var2 = (v3) xVar.f70929d.g(z1Var.a());
                long j14 = v3Var2 != null ? ((n4.j) v3Var2.getValue()).f89186a : 0L;
                v1 v1Var = (v1) ((w) obj2).f70922c.getValue();
                if (v1Var != null) {
                    j1.h0 h0Var = (j1.h0) v1Var.f70920b.invoke(new n4.j(j13), new n4.j(j14));
                    if (h0Var != null) {
                        return h0Var;
                    }
                }
                return j1.e.q(0.0f, 0.0f, null, 7);
            default:
                q3.b1 b1Var = (q3.b1) obj;
                q3.c1 c1Var = (q3.c1) obj3;
                float h10 = ((r0) obj2).f70886c.h();
                b1Var.getClass();
                long a13 = d7.b.a(0, 0);
                q3.b1.c(b1Var, c1Var);
                c1Var.u0(n4.h.c(a13, c1Var.f102182e), h10, null);
                return Unit.f80348a;
        }
    }
}
