package v9;

import d7.n0;
import q8.k0;

/* loaded from: classes3.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m.h f124722a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124723b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124724c;

    /* renamed from: g, reason: collision with root package name */
    public long f124728g;

    /* renamed from: i, reason: collision with root package name */
    public String f124730i;

    /* renamed from: j, reason: collision with root package name */
    public k0 f124731j;

    /* renamed from: k, reason: collision with root package name */
    public p f124732k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f124733l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f124735n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f124729h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final w f124725d = new w(7);

    /* renamed from: e, reason: collision with root package name */
    public final w f124726e = new w(8);

    /* renamed from: f, reason: collision with root package name */
    public final w f124727f = new w(6);

    /* renamed from: m, reason: collision with root package name */
    public long f124734m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final d7.d0 f124736o = new d7.d0();

    public q(m.h hVar, boolean z13, boolean z14) {
        this.f124722a = hVar;
        this.f124723b = z13;
        this.f124724c = z14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c2, code lost:
    
        if (r3.f124700n != r4.f124700n) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d2, code lost:
    
        if (r3.f124702p != r4.f124702p) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e0, code lost:
    
        if (r3.f124698l != r4.f124698l) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r16, int r17, long r18, long r20) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.q.a(int, int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.q.b(byte[], int, int):void");
    }

    public final void c(int i13, long j13, long j14) {
        if (!this.f124733l || this.f124732k.f124705c) {
            this.f124725d.d(i13);
            this.f124726e.d(i13);
        }
        this.f124727f.d(i13);
        p pVar = this.f124732k;
        boolean z13 = this.f124735n;
        pVar.f124711i = i13;
        pVar.f124714l = j14;
        pVar.f124712j = j13;
        pVar.f124721s = z13;
        if (!pVar.f124704b || i13 != 1) {
            if (!pVar.f124705c) {
                return;
            }
            if (i13 != 5 && i13 != 1 && i13 != 2) {
                return;
            }
        }
        o oVar = pVar.f124715m;
        pVar.f124715m = pVar.f124716n;
        pVar.f124716n = oVar;
        oVar.f124688b = false;
        oVar.f124687a = false;
        pVar.f124710h = 0;
        pVar.f124713k = true;
    }

    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        int i13;
        bf.b.w(this.f124731j);
        int i14 = n0.f53866a;
        int i15 = d0Var.f53807b;
        int i16 = d0Var.f53808c;
        byte[] bArr = d0Var.f53806a;
        this.f124728g += d0Var.a();
        this.f124731j.d(d0Var.a(), 0, d0Var);
        while (true) {
            int b13 = e7.q.b(bArr, i15, i16, this.f124729h);
            if (b13 == i16) {
                b(bArr, i15, i16);
                return;
            }
            int i17 = bArr[b13 + 3] & 31;
            if (b13 <= 0 || bArr[b13 - 1] != 0) {
                i13 = 3;
            } else {
                b13--;
                i13 = 4;
            }
            int i18 = b13;
            int i19 = i13;
            int i23 = i18 - i15;
            if (i23 > 0) {
                b(bArr, i15, i18);
            }
            int i24 = i16 - i18;
            long j13 = this.f124728g - i24;
            a(i24, i23 < 0 ? -i23 : 0, j13, this.f124734m);
            c(i17, j13, this.f124734m);
            i15 = i18 + i19;
        }
    }

    @Override // v9.i
    public final void f() {
        this.f124728g = 0L;
        this.f124735n = false;
        this.f124734m = -9223372036854775807L;
        e7.q.a(this.f124729h);
        this.f124725d.c();
        this.f124726e.c();
        this.f124727f.c();
        ((e7.w) this.f124722a.f85200e).b(0);
        p pVar = this.f124732k;
        if (pVar != null) {
            pVar.f124713k = false;
            pVar.f124717o = false;
            o oVar = pVar.f124716n;
            oVar.f124688b = false;
            oVar.f124687a = false;
        }
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124730i = h0Var.f124635e;
        h0Var.b();
        k0 D = uVar.D(h0Var.f124634d, 2);
        this.f124731j = D;
        this.f124732k = new p(D, this.f124723b, this.f124724c);
        this.f124722a.y(uVar, h0Var);
    }

    @Override // v9.i
    public final void h(boolean z13) {
        bf.b.w(this.f124731j);
        int i13 = n0.f53866a;
        if (z13) {
            ((e7.w) this.f124722a.f85200e).b(0);
            a(0, 0, this.f124728g, this.f124734m);
            c(9, this.f124728g, this.f124734m);
            a(0, 0, this.f124728g, this.f124734m);
        }
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124734m = j13;
        this.f124735n = ((i13 & 2) != 0) | this.f124735n;
    }
}
