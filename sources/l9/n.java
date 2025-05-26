package l9;

import a7.o0;
import a7.q;
import d7.d0;
import d7.n0;
import g4.u;
import java.io.EOFException;
import q8.j0;
import q8.k0;

/* loaded from: classes3.dex */
public final class n implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f82325a;

    /* renamed from: b, reason: collision with root package name */
    public final j f82326b;

    /* renamed from: h, reason: collision with root package name */
    public l f82332h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.media3.common.b f82333i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f82334j;

    /* renamed from: c, reason: collision with root package name */
    public final u f82327c = new u();

    /* renamed from: e, reason: collision with root package name */
    public int f82329e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f82330f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f82331g = n0.f53868c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f82328d = new d0();

    public n(k0 k0Var, j jVar) {
        this.f82325a = k0Var;
        this.f82326b = jVar;
    }

    @Override // q8.k0
    public final void a(long j13, int i13, int i14, int i15, j0 j0Var) {
        if (this.f82332h == null) {
            this.f82325a.a(j13, i13, i14, i15, j0Var);
            return;
        }
        bf.b.h("DRM on subtitles is not supported", j0Var == null);
        int i16 = (this.f82330f - i15) - i14;
        try {
            this.f82332h.w(this.f82331g, i16, i14, k.f82318c, new n7.m(this, j13, i13));
        } catch (RuntimeException e13) {
            if (!this.f82334j) {
                throw e13;
            }
            d7.u.h("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e13);
        }
        int i17 = i16 + i14;
        this.f82329e = i17;
        if (i17 == this.f82330f) {
            this.f82329e = 0;
            this.f82330f = 0;
        }
    }

    @Override // q8.k0
    public final void b(androidx.media3.common.b bVar) {
        bVar.f18765o.getClass();
        String str = bVar.f18765o;
        bf.b.i(o0.j(str) == 3);
        boolean equals = bVar.equals(this.f82333i);
        j jVar = this.f82326b;
        if (!equals) {
            this.f82333i = bVar;
            this.f82332h = jVar.r(bVar) ? jVar.p(bVar) : null;
        }
        l lVar = this.f82332h;
        k0 k0Var = this.f82325a;
        if (lVar == null) {
            k0Var.b(bVar);
            return;
        }
        q a13 = bVar.a();
        a13.f1181n = o0.r("application/x-media3-cues");
        a13.f1177j = str;
        a13.f1186s = Long.MAX_VALUE;
        a13.f1167J = jVar.h(bVar);
        k0Var.b(new androidx.media3.common.b(a13));
    }

    @Override // q8.k0
    public final void d(int i13, int i14, d0 d0Var) {
        if (this.f82332h == null) {
            this.f82325a.d(i13, i14, d0Var);
            return;
        }
        f(i13);
        d0Var.i(this.f82331g, this.f82330f, i13);
        this.f82330f += i13;
    }

    @Override // q8.k0
    public final int e(a7.k kVar, int i13, boolean z13) {
        if (this.f82332h == null) {
            return this.f82325a.e(kVar, i13, z13);
        }
        f(i13);
        int read = kVar.read(this.f82331g, this.f82330f, i13);
        if (read != -1) {
            this.f82330f += read;
            return read;
        }
        if (z13) {
            return -1;
        }
        throw new EOFException();
    }

    public final void f(int i13) {
        int length = this.f82331g.length;
        int i14 = this.f82330f;
        if (length - i14 >= i13) {
            return;
        }
        int i15 = i14 - this.f82329e;
        int max = Math.max(i15 * 2, i13 + i15);
        byte[] bArr = this.f82331g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f82329e, bArr2, 0, i15);
        this.f82329e = 0;
        this.f82330f = i15;
        this.f82331g = bArr2;
    }
}
