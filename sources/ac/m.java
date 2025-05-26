package ac;

import i1.a0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import q3.c1;
import q3.o0;
import q3.q0;
import q3.r0;
import s3.c0;

/* loaded from: classes3.dex */
public final class m extends u2.p implements c0 {

    /* renamed from: n, reason: collision with root package name */
    public int f1871n;

    /* renamed from: o, reason: collision with root package name */
    public int f1872o;

    @Override // s3.c0
    public final q0 i(r0 measure, o0 measurable, long j13) {
        long a13;
        q0 s03;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long G = bs1.c.G(j13, l0.d(this.f1871n, this.f1872o));
        if (n4.a.g(j13) == Integer.MAX_VALUE && n4.a.h(j13) != Integer.MAX_VALUE) {
            int i13 = (int) (G >> 32);
            int i14 = (this.f1872o * i13) / this.f1871n;
            a13 = bs1.c.a(i13, i13, i14, i14);
        } else if (n4.a.h(j13) != Integer.MAX_VALUE || n4.a.g(j13) == Integer.MAX_VALUE) {
            int i15 = (int) (G >> 32);
            int i16 = (int) (G & 4294967295L);
            a13 = bs1.c.a(i15, i15, i16, i16);
        } else {
            int i17 = (int) (G & 4294967295L);
            int i18 = (this.f1871n * i17) / this.f1872o;
            a13 = bs1.c.a(i18, i18, i17, i17);
        }
        c1 Q = measurable.Q(a13);
        s03 = measure.s0(Q.f102178a, Q.f102179b, z0.d(), new a0(Q, 9));
        return s03;
    }
}
