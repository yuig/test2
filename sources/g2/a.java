package g2;

import c2.m0;
import kl2.l;
import kotlin.collections.z0;
import kotlin.jvm.internal.s;
import q3.c1;
import q3.o0;
import q3.q0;
import q3.r0;

/* loaded from: classes2.dex */
public final class a extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public static final a f63382i = new a(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q0 s03;
        r0 r0Var = (r0) obj;
        long j13 = ((n4.a) obj3).f89168a;
        int R = r0Var.R(c.f63384a);
        int i13 = R * 2;
        c1 Q = ((o0) obj2).Q(bs1.c.w1(i13, 0, j13));
        s03 = r0Var.s0(Q.f102178a - i13, Q.f102179b, z0.d(), new m0(Q, R, 1));
        return s03;
    }
}
