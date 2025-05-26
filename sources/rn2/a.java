package rn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.l1;
import pn2.q1;

/* loaded from: classes2.dex */
public final class a extends dm2.m {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(ym2.g r19) {
        /*
            r18 = this;
            java.lang.String r0 = "name"
            r3 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            rn2.m r0 = rn2.m.f108927a
            rn2.f r2 = rn2.m.f108928b
            am2.c0 r4 = am2.c0.OPEN
            am2.h r5 = am2.h.CLASS
            kotlin.collections.q0 r10 = kotlin.collections.q0.f80391a
            am2.v0 r17 = am2.w0.f15602a
            on2.c r7 = on2.q.f96785e
            r1 = r18
            r3 = r19
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            bm2.g r14 = bm2.h.f23540a
            dm2.k r0 = new dm2.k
            am2.c r16 = am2.c.DECLARATION
            r15 = 1
            r13 = 0
            r11 = r0
            r12 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            am2.r r1 = am2.s.f15576d
            r0.H0(r10, r1)
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            rn2.i r1 = rn2.i.SCOPE_FOR_ERROR_CLASS
            ym2.g r2 = r0.getName()
            java.lang.String r2 = r2.f139478a
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = ""
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            rn2.h r1 = rn2.m.b(r1, r2)
            rn2.j r2 = new rn2.j
            rn2.l r9 = rn2.l.ERROR_CLASS
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            rn2.k r7 = rn2.m.e(r9, r4)
            java.lang.String[] r12 = new java.lang.String[r3]
            r11 = 0
            r6 = r2
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.D0(r2)
            java.util.Set r2 = kotlin.collections.g1.b(r0)
            r3 = r18
            r3.u0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.a.<init>(ym2.g):void");
    }

    @Override // dm2.b, dm2.f0
    public final in2.n X(l1 typeSubstitution, qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        i iVar = i.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f139478a;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return m.b(iVar, str, typeSubstitution.toString());
    }

    @Override // dm2.b, am2.y0
    public final am2.n d(q1 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // dm2.b
    /* renamed from: r0 */
    public final am2.g d(q1 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // dm2.m
    public final String toString() {
        String b13 = getName().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        return b13;
    }
}
