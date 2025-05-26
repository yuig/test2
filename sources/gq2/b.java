package gq2;

import java.security.spec.ECParameterSpec;

/* loaded from: classes4.dex */
public final class b extends ECParameterSpec {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(hq2.f r9, hq2.l r10, java.math.BigInteger r11) {
        /*
            r8 = this;
            mq2.a r0 = r9.f69944a
            int r1 = r0.a()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            r4 = 0
            if (r1 == 0) goto L1a
            java.security.spec.ECFieldFp r1 = new java.security.spec.ECFieldFp
            java.math.BigInteger r0 = r0.b()
            r1.<init>(r0)
            goto L5a
        L1a:
            mq2.d r0 = (mq2.d) r0
            mq2.c r0 = r0.f88072b
            int[] r1 = r0.f88070a
            if (r1 != 0) goto L24
            r5 = r4
            goto L2b
        L24:
            int r5 = r1.length
            int[] r5 = new int[r5]
            int r6 = r1.length
            java.lang.System.arraycopy(r1, r2, r5, r2, r6)
        L2b:
            int r1 = r5.length
            int r6 = r1 + (-1)
            int r1 = r1 + (-2)
            if (r1 < 0) goto La0
            int[] r6 = new int[r1]
            int r7 = r5.length
            int r7 = r7 - r3
            if (r7 >= r1) goto L3e
            int r7 = r5.length
            int r7 = r7 - r3
            java.lang.System.arraycopy(r5, r3, r6, r2, r7)
            goto L41
        L3e:
            java.lang.System.arraycopy(r5, r3, r6, r2, r1)
        L41:
            int[] r5 = new int[r1]
        L43:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4f
            int r7 = r2 + 1
            r2 = r6[r2]
            r5[r1] = r2
            r2 = r7
            goto L43
        L4f:
            java.security.spec.ECFieldF2m r1 = new java.security.spec.ECFieldF2m
            int[] r0 = r0.f88070a
            int r2 = r0.length
            int r2 = r2 - r3
            r0 = r0[r2]
            r1.<init>(r0, r5)
        L5a:
            o6.d r0 = r9.f69945b
            java.math.BigInteger r0 = r0.w()
            o6.d r9 = r9.f69946c
            java.math.BigInteger r9 = r9.w()
            java.security.spec.EllipticCurve r2 = new java.security.spec.EllipticCurve
            r2.<init>(r1, r0, r9, r4)
            hq2.l r9 = r10.j()
            java.security.spec.ECPoint r10 = new java.security.spec.ECPoint
            boolean r0 = r9.g()
            java.lang.String r1 = "point not in normal form"
            if (r0 == 0) goto L9a
            o6.d r0 = r9.f69963b
            java.math.BigInteger r0 = r0.w()
            boolean r4 = r9.g()
            if (r4 == 0) goto L94
            o6.d r9 = r9.d()
            java.math.BigInteger r9 = r9.w()
            r10.<init>(r0, r9)
            r8.<init>(r2, r10, r11, r3)
            return
        L94:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r1)
            throw r9
        L9a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r1)
            throw r9
        La0:
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>(r3)
            java.lang.String r10 = " > "
            r9.append(r10)
            r9.append(r6)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.b.<init>(hq2.f, hq2.l, java.math.BigInteger):void");
    }
}
