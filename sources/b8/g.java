package b8;

import d7.n0;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22154a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f22155b;

    /* renamed from: c, reason: collision with root package name */
    public int f22156c;

    /* renamed from: d, reason: collision with root package name */
    public long f22157d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public int f22158e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f22159f;

    /* renamed from: g, reason: collision with root package name */
    public int f22160g;

    public g(a8.k kVar) {
        this.f22154a = kVar;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22157d = j13;
        this.f22159f = j14;
        this.f22160g = 0;
    }

    @Override // b8.i
    public final void c(long j13) {
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 2);
        this.f22155b = D;
        int i14 = n0.f53866a;
        D.b(this.f22154a.f1381c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if ((r27.h() >> 6) == 0) goto L24;
     */
    @Override // b8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r24, long r25, d7.d0 r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            q8.k0 r5 = r0.f22155b
            bf.b.w(r5)
            int r5 = r0.f22158e
            r6 = -1
            if (r5 == r6) goto L2b
            int r5 = a8.i.a(r5)
            if (r1 == r5) goto L2b
            int r7 = d7.n0.f53866a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r8 = "; received: "
            java.lang.String r9 = ". Dropping packet."
            java.lang.String r5 = a.cb.j(r7, r5, r8, r1, r9)
            java.lang.String r7 = "RtpMpeg4Reader"
            d7.u.g(r7, r5)
        L2b:
            int r5 = r27.a()
            q8.k0 r7 = r0.f22155b
            r8 = 0
            r7.d(r5, r8, r2)
            int r7 = r0.f22160g
            if (r7 != 0) goto L6d
            byte[] r7 = r2.f53806a
            byte[] r9 = new byte[r3]
            r9 = {x00ac: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            java.lang.String r10 = "array"
            bf.b.p(r7, r10)
            r10 = r8
        L46:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L5a
            r11 = r8
        L4c:
            if (r11 >= r3) goto L5b
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L58
            int r10 = r10 + r4
            goto L46
        L58:
            int r11 = r11 + r4
            goto L4c
        L5a:
            r10 = r6
        L5b:
            if (r10 == r6) goto L6a
            int r10 = r10 + r3
            r2.K(r10)
            int r2 = r27.h()
            int r2 = r2 >> 6
            if (r2 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r8
        L6b:
            r0.f22156c = r4
        L6d:
            int r2 = r0.f22160g
            int r2 = r2 + r5
            r0.f22160g = r2
            if (r28 == 0) goto La8
            long r2 = r0.f22157d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L84
            r2 = r25
            r0.f22157d = r2
            goto L86
        L84:
            r2 = r25
        L86:
            long r9 = r0.f22159f
            long r13 = r0.f22157d
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = kh2.j.I2(r9, r11, r13, r15)
            q8.k0 r2 = r0.f22155b
            int r3 = r0.f22156c
            int r4 = r0.f22160g
            r21 = 0
            r22 = 0
            r16 = r2
            r19 = r3
            r20 = r4
            r16.a(r17, r19, r20, r21, r22)
            r0.f22160g = r8
        La8:
            r0.f22158e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.g.e(int, long, d7.d0, boolean):void");
    }
}
