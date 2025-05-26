package hq2;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes4.dex */
public abstract class b extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(int r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            if (r3 == 0) goto L38
            r0 = 0
            if (r4 != 0) goto L18
            if (r5 != 0) goto L10
            int[] r2 = new int[]{r0, r3, r2}
            mq2.d r2 = mq2.b.a(r2)
            goto L24
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "k3 must be 0 if k2 == 0"
            r2.<init>(r3)
            throw r2
        L18:
            if (r4 <= r3) goto L30
            if (r5 <= r4) goto L28
            int[] r2 = new int[]{r0, r3, r4, r5, r2}
            mq2.d r2 = mq2.b.a(r2)
        L24:
            r1.<init>(r2)
            return
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "k3 must be > k2"
            r2.<init>(r3)
            throw r2
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "k2 must be > k1"
            r2.<init>(r3)
            throw r2
        L38:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "k1 must be > 0"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.b.<init>(int, int, int, int):void");
    }

    @Override // hq2.f
    public final l c(BigInteger bigInteger, BigInteger bigInteger2, boolean z13) {
        o6.d h10 = h(bigInteger);
        o6.d h13 = h(bigInteger2);
        int i13 = this.f69949f;
        if (i13 == 5 || i13 == 6) {
            if (!h10.m()) {
                h13 = h13.d(h10).a(h10);
            } else if (!h13.s().equals(this.f69946c)) {
                throw new IllegalArgumentException();
            }
        }
        return d(h10, h13, z13);
    }

    @Override // hq2.f
    public final l f(int i13, BigInteger bigInteger) {
        o6.d dVar;
        o6.d h10 = h(bigInteger);
        if (h10.m()) {
            dVar = this.f69946c.r();
        } else {
            o6.d a13 = h10.s().k().n(this.f69946c).a(this.f69945b).a(h10);
            if (!a13.m()) {
                o6.d h13 = h(a.f69933a);
                int i14 = i();
                Random random = new Random();
                while (true) {
                    o6.d h14 = h(new BigInteger(i14, random));
                    o6.d dVar2 = a13;
                    o6.d dVar3 = h13;
                    for (int i15 = 1; i15 < i14; i15++) {
                        o6.d s13 = dVar2.s();
                        dVar3 = dVar3.s().a(s13.n(h14));
                        dVar2 = s13.a(a13);
                    }
                    if (!dVar2.m()) {
                        a13 = null;
                        break;
                    }
                    if (!dVar3.s().a(dVar3).m()) {
                        a13 = dVar3;
                        break;
                    }
                }
            }
            if (a13 != null) {
                if (a13.v() != (i13 == 1)) {
                    a13 = a13.b();
                }
                int i16 = this.f69949f;
                dVar = (i16 == 5 || i16 == 6) ? a13.a(h10) : a13.n(h10);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return d(h10, dVar, true);
        }
        throw new IllegalArgumentException("Invalid point compression");
    }
}
