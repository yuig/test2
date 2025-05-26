package i1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m1 f70808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f70809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, long j13) {
        super(1);
        this.f70808i = m1Var;
        this.f70809j = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        w0 w0Var = (w0) obj;
        m1 m1Var = this.f70808i;
        w1 w1Var = m1Var.f70836r.f70855a.f70947b;
        long j13 = this.f70809j;
        long j14 = 0;
        long j15 = (w1Var == null || (function12 = w1Var.f70924a) == null) ? 0L : ((n4.h) function12.invoke(new n4.j(j13))).f89180a;
        w1 w1Var2 = m1Var.f70837s.f70860a.f70947b;
        long j16 = (w1Var2 == null || (function1 = w1Var2.f70924a) == null) ? 0L : ((n4.h) function1.invoke(new n4.j(j13))).f89180a;
        int i13 = h1.f70786a[w0Var.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                j14 = j15;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j14 = j16;
            }
        }
        return new n4.h(j14);
    }
}
