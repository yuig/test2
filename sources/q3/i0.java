package q3;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i0 extends s3.h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f102219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f102220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Function2 function2, String str) {
        super(str);
        this.f102219b = l0Var;
        this.f102220c = function2;
    }

    @Override // q3.p0
    public final q0 a(r0 r0Var, List list, long j13) {
        d0 d0Var;
        int i13;
        l0 l0Var = this.f102219b;
        l0Var.f102237h.f102204a = r0Var.getLayoutDirection();
        float b13 = r0Var.b();
        f0 f0Var = l0Var.f102237h;
        f0Var.f102205b = b13;
        f0Var.f102206c = r0Var.j0();
        boolean K = r0Var.K();
        Function2 function2 = this.f102220c;
        if (K || l0Var.f102230a.f110815c == null) {
            l0Var.f102233d = 0;
            q0 q0Var = (q0) function2.invoke(f0Var, new n4.a(j13));
            return new h0(q0Var, l0Var, l0Var.f102233d, q0Var);
        }
        l0Var.f102234e = 0;
        d0Var = l0Var.f102238i;
        q0 q0Var2 = (q0) function2.invoke(d0Var, new n4.a(j13));
        i13 = l0Var.f102234e;
        return new g0(q0Var2, l0Var, i13, q0Var2);
    }
}
