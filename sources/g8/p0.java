package g8;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p0 implements l8.u {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f64371b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.y f64372c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.d f64373d;

    /* renamed from: e, reason: collision with root package name */
    public final q8.u f64374e;

    /* renamed from: f, reason: collision with root package name */
    public final a7.o f64375f;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f64377h;

    /* renamed from: j, reason: collision with root package name */
    public long f64379j;

    /* renamed from: l, reason: collision with root package name */
    public q8.k0 f64381l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f64382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0 f64383n;

    /* renamed from: g, reason: collision with root package name */
    public final q8.c0 f64376g = new q8.c0(0);

    /* renamed from: i, reason: collision with root package name */
    public boolean f64378i = true;

    /* renamed from: a, reason: collision with root package name */
    public final long f64370a = v.f64440d.getAndIncrement();

    /* renamed from: k, reason: collision with root package name */
    public g7.i f64380k = a(0);

    public p0(t0 t0Var, Uri uri, g7.f fVar, androidx.appcompat.app.d dVar, q8.u uVar, a7.o oVar) {
        this.f64383n = t0Var;
        this.f64371b = uri;
        this.f64372c = new g7.y(fVar);
        this.f64373d = dVar;
        this.f64374e = uVar;
        this.f64375f = oVar;
    }

    public final g7.i a(long j13) {
        Collections.emptyMap();
        String str = this.f64383n.f64412i;
        Map map = t0.R;
        Uri uri = this.f64371b;
        bf.b.x(uri, "The uri must be set.");
        return new g7.i(uri, 0L, 1, null, map, j13, -1L, str, 6, null);
    }

    @Override // l8.u
    public final void h() {
        g7.f fVar;
        int i13;
        int i14 = 0;
        while (i14 == 0 && !this.f64377h) {
            try {
                long j13 = this.f64376g.f102894a;
                g7.i a13 = a(j13);
                this.f64380k = a13;
                long d2 = this.f64372c.d(a13);
                if (this.f64377h) {
                    if (i14 != 1 && this.f64373d.p() != -1) {
                        this.f64376g.f102894a = this.f64373d.p();
                    }
                    lb.l0.H(this.f64372c);
                    return;
                }
                if (d2 != -1) {
                    d2 += j13;
                    t0 t0Var = this.f64383n;
                    t0Var.f64422s.post(new n0(t0Var, 0));
                }
                long j14 = d2;
                this.f64383n.f64424u = c9.b.d(this.f64372c.f63851a.e());
                g7.y yVar = this.f64372c;
                c9.b bVar = this.f64383n.f64424u;
                if (bVar == null || (i13 = bVar.f26969f) == -1) {
                    fVar = yVar;
                } else {
                    fVar = new u(yVar, i13, this);
                    t0 t0Var2 = this.f64383n;
                    t0Var2.getClass();
                    q8.k0 C = t0Var2.C(new r0(0, true));
                    this.f64381l = C;
                    C.b(t0.S);
                }
                long j15 = j13;
                this.f64373d.E(fVar, this.f64371b, this.f64372c.f63851a.e(), j13, j14, this.f64374e);
                if (this.f64383n.f64424u != null) {
                    Object obj = this.f64373d.f15967c;
                    if (((q8.s) obj) != null) {
                        q8.s sVar = (q8.s) obj;
                        sVar.getClass();
                        if (sVar instanceof i9.d) {
                            ((i9.d) sVar).f71756s = true;
                        }
                    }
                }
                if (this.f64378i) {
                    androidx.appcompat.app.d dVar = this.f64373d;
                    long j16 = this.f64379j;
                    q8.s sVar2 = (q8.s) dVar.f15967c;
                    sVar2.getClass();
                    sVar2.b(j15, j16);
                    this.f64378i = false;
                }
                while (true) {
                    long j17 = j15;
                    while (i14 == 0 && !this.f64377h) {
                        try {
                            this.f64375f.b();
                            androidx.appcompat.app.d dVar2 = this.f64373d;
                            q8.c0 c0Var = this.f64376g;
                            q8.s sVar3 = (q8.s) dVar2.f15967c;
                            sVar3.getClass();
                            q8.t tVar = (q8.t) dVar2.f15968d;
                            tVar.getClass();
                            i14 = sVar3.d(tVar, c0Var);
                            j15 = this.f64373d.p();
                            if (j15 > this.f64383n.f64413j + j17) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f64375f.f();
                    t0 t0Var3 = this.f64383n;
                    t0Var3.f64422s.post(t0Var3.f64421r);
                }
                if (i14 == 1) {
                    i14 = 0;
                } else if (this.f64373d.p() != -1) {
                    this.f64376g.f102894a = this.f64373d.p();
                }
                lb.l0.H(this.f64372c);
            } catch (Throwable th3) {
                if (i14 != 1 && this.f64373d.p() != -1) {
                    this.f64376g.f102894a = this.f64373d.p();
                }
                lb.l0.H(this.f64372c);
                throw th3;
            }
        }
    }

    @Override // l8.u
    public final void o() {
        this.f64377h = true;
    }
}
