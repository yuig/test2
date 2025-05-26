package l9;

import a.y3;
import d7.n0;
import java.util.List;
import pk.c1;
import pk.s2;
import pk.z;

/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final z f82298c;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f82299a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f82300b;

    static {
        s2 s2Var = s2.f100480a;
        y3 y3Var = new y3(21);
        s2Var.getClass();
        f82298c = new z(y3Var, s2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(pk.v2 r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 0
            r19.<init>()
            int r3 = r20.size()
            r6 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r6) goto L4c
            java.lang.Object r3 = com.bumptech.glide.c.U(r20)
            l9.a r3 = (l9.a) r3
            long r9 = r3.f82295b
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L22
            r4 = 0
            goto L23
        L22:
            r4 = r9
        L23:
            long r9 = r3.f82296c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            pk.c1 r3 = r3.f82294a
            if (r7 != 0) goto L38
            pk.v2 r1 = pk.c1.v(r3)
            r0.f82299a = r1
            long[] r1 = new long[r6]
            r1[r2] = r4
            r0.f82300b = r1
            goto L4b
        L38:
            pk.v2 r7 = pk.c1.u()
            pk.v2 r3 = pk.c1.w(r3, r7)
            r0.f82299a = r3
            long r9 = r9 + r4
            long[] r1 = new long[r1]
            r1[r2] = r4
            r1[r6] = r9
            r0.f82300b = r1
        L4b:
            return
        L4c:
            int r3 = r20.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.f82300b = r1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            pk.z r3 = l9.b.f82298c
            r9 = r20
            pk.v2 r3 = pk.c1.A(r9, r3)
            r9 = r2
        L6b:
            int r10 = r3.size()
            if (r2 >= r10) goto Ld8
            java.lang.Object r10 = r3.get(r2)
            l9.a r10 = (l9.a) r10
            long r11 = r10.f82295b
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L7f
            r11 = 0
        L7f:
            long r13 = r10.f82296c
            long r15 = r11 + r13
            pk.c1 r10 = r10.f82294a
            if (r9 == 0) goto Lb8
            long[] r4 = r0.f82300b
            int r5 = r9 + (-1)
            r17 = r4[r5]
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L92
            goto Lb8
        L92:
            if (r4 != 0) goto La4
            java.lang.Object r4 = r1.get(r5)
            pk.c1 r4 = (pk.c1) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto La4
            r1.set(r5, r10)
            goto Lb2
        La4:
            java.lang.String r4 = "CuesWithTimingSubtitle"
            java.lang.String r7 = "Truncating unsupported overlapping cues."
            d7.u.g(r4, r7)
            long[] r4 = r0.f82300b
            r4[r5] = r11
            r1.set(r5, r10)
        Lb2:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto Lc3
        Lb8:
            long[] r4 = r0.f82300b
            int r5 = r9 + 1
            r4[r9] = r11
            r1.add(r10)
            r9 = r5
            goto Lb2
        Lc3:
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r7 == 0) goto Ld5
            long[] r7 = r0.f82300b
            int r8 = r9 + 1
            r7[r9] = r15
            pk.v2 r7 = pk.c1.u()
            r1.add(r7)
            r9 = r8
        Ld5:
            int r2 = r2 + r6
            r7 = r4
            goto L6b
        Ld8:
            pk.c1 r1 = pk.c1.r(r1)
            r0.f82299a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.b.<init>(pk.v2):void");
    }

    @Override // l9.d
    public final int a(long j13) {
        int a13 = n0.a(this.f82300b, j13, false);
        if (a13 < this.f82299a.size()) {
            return a13;
        }
        return -1;
    }

    @Override // l9.d
    public final List b(long j13) {
        int e13 = n0.e(this.f82300b, j13, false);
        return e13 == -1 ? c1.u() : (c1) this.f82299a.get(e13);
    }

    @Override // l9.d
    public final long c(int i13) {
        bf.b.i(i13 < this.f82299a.size());
        return this.f82300b[i13];
    }

    @Override // l9.d
    public final int d() {
        return this.f82299a.size();
    }
}
