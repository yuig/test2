package p7;

import a7.b1;
import a7.c0;
import a7.i0;
import a7.z0;
import d7.n0;

/* loaded from: classes.dex */
public final class f extends b1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f98970b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98971c;

    /* renamed from: d, reason: collision with root package name */
    public final long f98972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98973e;

    /* renamed from: f, reason: collision with root package name */
    public final long f98974f;

    /* renamed from: g, reason: collision with root package name */
    public final long f98975g;

    /* renamed from: h, reason: collision with root package name */
    public final long f98976h;

    /* renamed from: i, reason: collision with root package name */
    public final q7.c f98977i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f98978j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f98979k;

    public f(long j13, long j14, long j15, int i13, long j16, long j17, long j18, q7.c cVar, i0 i0Var, c0 c0Var) {
        bf.b.t(cVar.f102607d == (c0Var != null));
        this.f98970b = j13;
        this.f98971c = j14;
        this.f98972d = j15;
        this.f98973e = i13;
        this.f98974f = j16;
        this.f98975g = j17;
        this.f98976h = j18;
        this.f98977i = cVar;
        this.f98978j = i0Var;
        this.f98979k = c0Var;
    }

    @Override // a7.b1
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f98973e) >= 0 && intValue < i()) {
            return intValue;
        }
        return -1;
    }

    @Override // a7.b1
    public final z0 g(int i13, z0 z0Var, boolean z13) {
        bf.b.m(i13, i());
        q7.c cVar = this.f98977i;
        String str = z13 ? cVar.b(i13).f102639a : null;
        Integer valueOf = z13 ? Integer.valueOf(this.f98973e + i13) : null;
        long d2 = cVar.d(i13);
        long X = n0.X(cVar.b(i13).f102640b - cVar.b(0).f102640b) - this.f98974f;
        z0Var.getClass();
        z0Var.o(str, valueOf, 0, d2, X, a7.b.f945g, false);
        return z0Var;
    }

    @Override // a7.b1
    public final int i() {
        return this.f98977i.f102616m.size();
    }

    @Override // a7.b1
    public final Object m(int i13) {
        bf.b.m(i13, i());
        return Integer.valueOf(this.f98973e + i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    @Override // a7.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a7.a1 n(int r22, a7.a1 r23, long r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            r2 = r22
            bf.b.m(r2, r1)
            q7.c r4 = r0.f98977i
            boolean r2 = r4.f102607d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            if (r2 == 0) goto L22
            long r7 = r4.f102608e
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L22
            long r7 = r4.f102605b
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L22
            r2 = r1
            goto L23
        L22:
            r2 = r3
        L23:
            long r7 = r0.f98976h
            if (r2 != 0) goto L29
        L27:
            r14 = r7
            goto L8c
        L29:
            r9 = 0
            int r2 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r2 <= 0) goto L39
            long r7 = r7 + r24
            long r11 = r0.f98975g
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L39
            r14 = r5
            goto L8c
        L39:
            long r11 = r0.f98974f
            long r11 = r11 + r7
            long r13 = r4.d(r3)
            r2 = r3
        L41:
            java.util.List r15 = r4.f102616m
            int r15 = r15.size()
            int r15 = r15 - r1
            if (r2 >= r15) goto L56
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L56
            long r11 = r11 - r13
            int r2 = r2 + 1
            long r13 = r4.d(r2)
            goto L41
        L56:
            q7.h r2 = r4.b(r2)
            int r15 = r2.a()
            r1 = -1
            if (r15 != r1) goto L62
            goto L27
        L62:
            java.util.List r1 = r2.f102641c
            java.lang.Object r1 = r1.get(r15)
            q7.a r1 = (q7.a) r1
            java.util.List r1 = r1.f102596c
            java.lang.Object r1 = r1.get(r3)
            q7.m r1 = (q7.m) r1
            p7.k r1 = r1.l()
            if (r1 == 0) goto L27
            long r17 = r1.g(r13)
            int r2 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r2 != 0) goto L81
            goto L27
        L81:
            long r9 = r1.f(r11, r13)
            long r1 = r1.c(r9)
            long r1 = r1 + r7
            long r1 = r1 - r11
            r14 = r1
        L8c:
            java.lang.Object r1 = a7.a1.f927q
            boolean r1 = r4.f102607d
            if (r1 == 0) goto La0
            long r1 = r4.f102608e
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto La0
            long r1 = r4.f102605b
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto La0
            r12 = 1
            goto La1
        La0:
            r12 = r3
        La1:
            int r1 = r21.i()
            r2 = 1
            int r18 = r1 + (-1)
            a7.c0 r13 = r0.f98979k
            long r1 = r0.f98975g
            r16 = r1
            a7.i0 r3 = r0.f98978j
            long r5 = r0.f98970b
            long r7 = r0.f98971c
            long r9 = r0.f98972d
            r11 = 1
            long r1 = r0.f98974f
            r19 = r1
            r2 = r23
            r2.c(r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.f.n(int, a7.a1, long):a7.a1");
    }

    @Override // a7.b1
    public final int p() {
        return 1;
    }
}
