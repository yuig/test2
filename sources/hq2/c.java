package hq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class c extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.math.BigInteger r4) {
        /*
            r3 = this;
            mq2.e r0 = mq2.b.f88068a
            int r0 = r4.bitLength()
            int r1 = r4.signum()
            if (r1 <= 0) goto L2b
            r1 = 2
            if (r0 < r1) goto L2b
            r2 = 3
            if (r0 >= r2) goto L21
            int r0 = r4.intValue()
            if (r0 == r1) goto L1e
            if (r0 == r2) goto L1b
            goto L21
        L1b:
            mq2.e r4 = mq2.b.f88069b
            goto L27
        L1e:
            mq2.e r4 = mq2.b.f88068a
            goto L27
        L21:
            mq2.e r0 = new mq2.e
            r0.<init>(r4)
            r4 = r0
        L27:
            r3.<init>(r4)
            return
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'characteristic' must be >= 2"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.c.<init>(java.math.BigInteger):void");
    }

    @Override // hq2.f
    public final l f(int i13, BigInteger bigInteger) {
        o6.d h10 = h(bigInteger);
        o6.d r13 = h10.s().a(this.f69945b).n(h10).a(this.f69946c).r();
        if (r13 == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        if (r13.v() != (i13 == 1)) {
            r13 = r13.q();
        }
        return d(h10, r13, true);
    }
}
