package g8;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f extends n1 {

    /* renamed from: l, reason: collision with root package name */
    public final long f64241l;

    /* renamed from: m, reason: collision with root package name */
    public final long f64242m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f64243n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f64244o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f64245p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f64246q;

    /* renamed from: r, reason: collision with root package name */
    public final a7.a1 f64247r;

    /* renamed from: s, reason: collision with root package name */
    public e f64248s;

    /* renamed from: t, reason: collision with root package name */
    public ClippingMediaSource$IllegalClippingException f64249t;

    /* renamed from: u, reason: collision with root package name */
    public long f64250u;

    /* renamed from: v, reason: collision with root package name */
    public long f64251v;

    public f(d dVar) {
        super(dVar.f64222a);
        this.f64241l = dVar.f64223b;
        this.f64242m = dVar.f64224c;
        this.f64243n = dVar.f64225d;
        this.f64244o = dVar.f64226e;
        this.f64245p = dVar.f64227f;
        this.f64246q = new ArrayList();
        this.f64247r = new a7.a1();
    }

    @Override // g8.n1
    public final void D(a7.b1 b1Var) {
        if (this.f64249t != null) {
            return;
        }
        G(b1Var);
    }

    public final void G(a7.b1 b1Var) {
        long j13;
        long j14;
        long j15;
        a7.a1 a1Var = this.f64247r;
        b1Var.o(0, a1Var);
        long j16 = a1Var.f944p;
        e eVar = this.f64248s;
        ArrayList arrayList = this.f64246q;
        long j17 = this.f64242m;
        if (eVar == null || arrayList.isEmpty() || this.f64244o) {
            boolean z13 = this.f64245p;
            long j18 = this.f64241l;
            if (z13) {
                long j19 = a1Var.f940l;
                j18 += j19;
                j13 = j19 + j17;
            } else {
                j13 = j17;
            }
            this.f64250u = j16 + j18;
            this.f64251v = j17 != Long.MIN_VALUE ? j16 + j13 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) arrayList.get(i13);
                long j23 = this.f64250u;
                long j24 = this.f64251v;
                cVar.f64219e = j23;
                cVar.f64220f = j24;
            }
            j14 = j18;
            j15 = j13;
        } else {
            long j25 = this.f64250u - j16;
            j15 = j17 != Long.MIN_VALUE ? this.f64251v - j16 : Long.MIN_VALUE;
            j14 = j25;
        }
        try {
            e eVar2 = new e(b1Var, j14, j15);
            this.f64248s = eVar2;
            o(eVar2);
        } catch (ClippingMediaSource$IllegalClippingException e13) {
            this.f64249t = e13;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f64221g = this.f64249t;
            }
        }
    }

    @Override // g8.a
    public final c0 b(e0 e0Var, l8.m mVar, long j13) {
        c cVar = new c(this.f64356k.b(e0Var, mVar, j13), this.f64243n, this.f64250u, this.f64251v);
        this.f64246q.add(cVar);
        return cVar;
    }

    @Override // g8.j, g8.a
    public final void l() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f64249t;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.l();
    }

    @Override // g8.a
    public final void q(c0 c0Var) {
        ArrayList arrayList = this.f64246q;
        bf.b.t(arrayList.remove(c0Var));
        this.f64356k.q(((c) c0Var).f64215a);
        if (!arrayList.isEmpty() || this.f64244o) {
            return;
        }
        e eVar = this.f64248s;
        eVar.getClass();
        G(eVar.f64402b);
    }

    @Override // g8.j, g8.a
    public final void t() {
        super.t();
        this.f64249t = null;
        this.f64248s = null;
    }
}
