package dn2;

import am2.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.b0;
import pn2.h0;
import pn2.i1;
import pn2.u0;
import pn2.v1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class t extends g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(dn2.f r3) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            dn2.r r1 = new dn2.r
            r1.<init>(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.t.<init>(dn2.f):void");
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        b0 b0Var;
        Intrinsics.checkNotNullParameter(module, "module");
        u0.f100848b.getClass();
        u0 u0Var = u0.f100849c;
        xl2.l f13 = module.f();
        f13.getClass();
        am2.g i13 = f13.i(xl2.q.P.g());
        Intrinsics.checkNotNullExpressionValue(i13, "getKClass(...)");
        Intrinsics.checkNotNullParameter(module, "module");
        Object obj = this.f55623a;
        s sVar = (s) obj;
        if (sVar instanceof q) {
            b0Var = ((q) obj).f55635a;
        } else {
            if (!(sVar instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = ((r) obj).f55636a;
            ym2.b bVar = fVar.f55621a;
            am2.g c03 = l0.c0(module, bVar);
            int i14 = fVar.f55622b;
            if (c03 == null) {
                rn2.l lVar = rn2.l.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String bVar2 = bVar.toString();
                Intrinsics.checkNotNullExpressionValue(bVar2, "toString(...)");
                b0Var = rn2.m.d(lVar, bVar2, String.valueOf(i14));
            } else {
                h0 j13 = c03.j();
                Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
                v1 F = kotlin.jvm.internal.j.F(j13);
                for (int i15 = 0; i15 < i14; i15++) {
                    F = module.f().g(F, w1.INVARIANT);
                    Intrinsics.checkNotNullExpressionValue(F, "getArrayType(...)");
                }
                b0Var = F;
            }
        }
        return pn2.g.p(u0Var, i13, e0.b(new i1(b0Var)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(ym2.b classId, int i13) {
        this(new f(classId, i13));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
