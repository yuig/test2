package v9;

import a7.o0;
import d7.n0;
import java.util.Collections;
import q8.k0;

/* loaded from: classes3.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m.h f124750a;

    /* renamed from: b, reason: collision with root package name */
    public String f124751b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f124752c;

    /* renamed from: d, reason: collision with root package name */
    public r f124753d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f124754e;

    /* renamed from: l, reason: collision with root package name */
    public long f124761l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f124755f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w f124756g = new w(32);

    /* renamed from: h, reason: collision with root package name */
    public final w f124757h = new w(33);

    /* renamed from: i, reason: collision with root package name */
    public final w f124758i = new w(34);

    /* renamed from: j, reason: collision with root package name */
    public final w f124759j = new w(39);

    /* renamed from: k, reason: collision with root package name */
    public final w f124760k = new w(40);

    /* renamed from: m, reason: collision with root package name */
    public long f124762m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final d7.d0 f124763n = new d7.d0();

    public s(m.h hVar) {
        this.f124750a = hVar;
    }

    public final void a(int i13, int i14, long j13, long j14) {
        r rVar = this.f124753d;
        boolean z13 = this.f124754e;
        if (rVar.f124746j && rVar.f124743g) {
            rVar.f124749m = rVar.f124739c;
            rVar.f124746j = false;
        } else if (rVar.f124744h || rVar.f124743g) {
            if (z13 && rVar.f124745i) {
                rVar.a(i13 + ((int) (j13 - rVar.f124738b)));
            }
            rVar.f124747k = rVar.f124738b;
            rVar.f124748l = rVar.f124741e;
            rVar.f124749m = rVar.f124739c;
            rVar.f124745i = true;
        }
        boolean z14 = this.f124754e;
        m.h hVar = this.f124750a;
        if (!z14) {
            w wVar = this.f124756g;
            wVar.b(i14);
            w wVar2 = this.f124757h;
            wVar2.b(i14);
            w wVar3 = this.f124758i;
            wVar3.b(i14);
            if (wVar.f124823c && wVar2.f124823c && wVar3.f124823c) {
                String str = this.f124751b;
                int i15 = wVar.f124825e;
                byte[] bArr = new byte[wVar2.f124825e + i15 + wVar3.f124825e];
                System.arraycopy(wVar.f124824d, 0, bArr, 0, i15);
                System.arraycopy(wVar2.f124824d, 0, bArr, wVar.f124825e, wVar2.f124825e);
                System.arraycopy(wVar3.f124824d, 0, bArr, wVar.f124825e + wVar2.f124825e, wVar3.f124825e);
                e7.l j15 = e7.q.j(wVar2.f124824d, 3, wVar2.f124825e, null);
                e7.j jVar = j15.f57553b;
                String b13 = jVar != null ? d7.f.b(jVar.f57541a, jVar.f57543c, jVar.f57544d, jVar.f57546f, jVar.f57542b, jVar.f57545e) : null;
                a7.q qVar = new a7.q();
                qVar.f1168a = str;
                qVar.f1180m = o0.r("video/mp2t");
                qVar.f1181n = o0.r("video/hevc");
                qVar.f1177j = b13;
                qVar.f1188u = j15.f57556e;
                qVar.f1189v = j15.f57557f;
                k5.a aVar = new k5.a(1);
                aVar.f78307a = j15.f57560i;
                aVar.f78308b = j15.f57561j;
                aVar.f78309c = j15.f57562k;
                aVar.f78310d = j15.f57554c + 8;
                aVar.f78311e = j15.f57555d + 8;
                qVar.B = aVar.a();
                qVar.f1192y = j15.f57558g;
                qVar.f1183p = j15.f57559h;
                qVar.C = j15.f57552a + 1;
                qVar.f1184q = Collections.singletonList(bArr);
                androidx.media3.common.b bVar = new androidx.media3.common.b(qVar);
                this.f124752c.b(bVar);
                int i16 = bVar.f18767q;
                bf.b.v(i16 != -1);
                ((e7.w) hVar.f85200e).d(i16);
                this.f124754e = true;
            }
        }
        w wVar4 = this.f124759j;
        boolean b14 = wVar4.b(i14);
        d7.d0 d0Var = this.f124763n;
        if (b14) {
            d0Var.I(e7.q.n(wVar4.f124825e, wVar4.f124824d), wVar4.f124824d);
            d0Var.L(5);
            ((e7.w) hVar.f85200e).a(j14, d0Var);
        }
        w wVar5 = this.f124760k;
        if (wVar5.b(i14)) {
            d0Var.I(e7.q.n(wVar5.f124825e, wVar5.f124824d), wVar5.f124824d);
            d0Var.L(5);
            ((e7.w) hVar.f85200e).a(j14, d0Var);
        }
    }

    public final void b(byte[] bArr, int i13, int i14) {
        r rVar = this.f124753d;
        if (rVar.f124742f) {
            int i15 = rVar.f124740d;
            int i16 = (i13 + 2) - i15;
            if (i16 < i14) {
                rVar.f124743g = (bArr[i16] & 128) != 0;
                rVar.f124742f = false;
            } else {
                rVar.f124740d = (i14 - i13) + i15;
            }
        }
        if (!this.f124754e) {
            this.f124756g.a(bArr, i13, i14);
            this.f124757h.a(bArr, i13, i14);
            this.f124758i.a(bArr, i13, i14);
        }
        this.f124759j.a(bArr, i13, i14);
        this.f124760k.a(bArr, i13, i14);
    }

    public final void c(int i13, int i14, long j13, long j14) {
        r rVar = this.f124753d;
        boolean z13 = this.f124754e;
        rVar.f124743g = false;
        rVar.f124744h = false;
        rVar.f124741e = j14;
        rVar.f124740d = 0;
        rVar.f124738b = j13;
        if (i14 >= 32 && i14 != 40) {
            if (rVar.f124745i && !rVar.f124746j) {
                if (z13) {
                    rVar.a(i13);
                }
                rVar.f124745i = false;
            }
            if ((32 <= i14 && i14 <= 35) || i14 == 39) {
                rVar.f124744h = !rVar.f124746j;
                rVar.f124746j = true;
            }
        }
        boolean z14 = i14 >= 16 && i14 <= 21;
        rVar.f124739c = z14;
        rVar.f124742f = z14 || i14 <= 9;
        if (!this.f124754e) {
            this.f124756g.d(i14);
            this.f124757h.d(i14);
            this.f124758i.d(i14);
        }
        this.f124759j.d(i14);
        this.f124760k.d(i14);
    }

    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        int i13;
        bf.b.w(this.f124752c);
        int i14 = n0.f53866a;
        while (d0Var.a() > 0) {
            int i15 = d0Var.f53807b;
            int i16 = d0Var.f53808c;
            byte[] bArr = d0Var.f53806a;
            this.f124761l += d0Var.a();
            this.f124752c.d(d0Var.a(), 0, d0Var);
            while (i15 < i16) {
                int b13 = e7.q.b(bArr, i15, i16, this.f124755f);
                if (b13 == i16) {
                    b(bArr, i15, i16);
                    return;
                }
                int i17 = (bArr[b13 + 3] & 126) >> 1;
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
                long j13 = this.f124761l - i24;
                a(i24, i23 < 0 ? -i23 : 0, j13, this.f124762m);
                c(i24, i17, j13, this.f124762m);
                i15 = i18 + i19;
            }
        }
    }

    @Override // v9.i
    public final void f() {
        this.f124761l = 0L;
        this.f124762m = -9223372036854775807L;
        e7.q.a(this.f124755f);
        this.f124756g.c();
        this.f124757h.c();
        this.f124758i.c();
        this.f124759j.c();
        this.f124760k.c();
        ((e7.w) this.f124750a.f85200e).b(0);
        r rVar = this.f124753d;
        if (rVar != null) {
            rVar.f124742f = false;
            rVar.f124743g = false;
            rVar.f124744h = false;
            rVar.f124745i = false;
            rVar.f124746j = false;
        }
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124751b = h0Var.f124635e;
        h0Var.b();
        k0 D = uVar.D(h0Var.f124634d, 2);
        this.f124752c = D;
        this.f124753d = new r(D);
        this.f124750a.y(uVar, h0Var);
    }

    @Override // v9.i
    public final void h(boolean z13) {
        bf.b.w(this.f124752c);
        int i13 = n0.f53866a;
        if (z13) {
            ((e7.w) this.f124750a.f85200e).b(0);
            a(0, 0, this.f124761l, this.f124762m);
            c(0, 48, this.f124761l, this.f124762m);
        }
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124762m = j13;
    }
}
