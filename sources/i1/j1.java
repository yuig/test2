package i1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70800i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m1 f70801j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f70802k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(m1 m1Var, long j13, int i13) {
        super(1);
        this.f70800i = i13;
        this.f70801j = m1Var;
        this.f70802k = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        int i13;
        int i14 = this.f70800i;
        m1 m1Var = this.f70801j;
        switch (i14) {
            case 0:
                m1Var.getClass();
                int i15 = h1.f70786a[((w0) obj).ordinal()];
                long j13 = this.f70802k;
                if (i15 != 1) {
                    if (i15 == 2) {
                        p0 p0Var = m1Var.f70836r.f70855a.f70948c;
                        if (p0Var != null && (function1 = p0Var.f70867b) != null) {
                            j13 = ((n4.j) function1.invoke(new n4.j(j13))).f89186a;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        p0 p0Var2 = m1Var.f70837s.f70860a.f70948c;
                        if (p0Var2 != null && (function12 = p0Var2.f70867b) != null) {
                            j13 = ((n4.j) function12.invoke(new n4.j(j13))).f89186a;
                        }
                    }
                }
                return new n4.j(j13);
            default:
                w0 w0Var = (w0) obj;
                long j14 = 0;
                if (m1Var.f70841w != null && m1Var.M0() != null && !Intrinsics.d(m1Var.f70841w, m1Var.M0()) && (i13 = h1.f70786a[w0Var.ordinal()]) != 1 && i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p0 p0Var3 = m1Var.f70837s.f70860a.f70948c;
                    if (p0Var3 != null) {
                        long j15 = this.f70802k;
                        long j16 = ((n4.j) p0Var3.f70867b.invoke(new n4.j(j15))).f89186a;
                        u2.e M0 = m1Var.M0();
                        Intrinsics.f(M0);
                        n4.k kVar = n4.k.Ltr;
                        long a13 = M0.a(j15, j16, kVar);
                        u2.e eVar = m1Var.f70841w;
                        Intrinsics.f(eVar);
                        j14 = n4.h.b(a13, eVar.a(j15, j16, kVar));
                    }
                }
                return new n4.h(j14);
        }
    }
}
