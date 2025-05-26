package p7;

import d7.n0;
import g8.b1;

/* loaded from: classes.dex */
public final class r implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f99036a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f99038c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99039d;

    /* renamed from: e, reason: collision with root package name */
    public q7.g f99040e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99041f;

    /* renamed from: g, reason: collision with root package name */
    public int f99042g;

    /* renamed from: b, reason: collision with root package name */
    public final tb.e f99037b = new tb.e(3);

    /* renamed from: h, reason: collision with root package name */
    public long f99043h = -9223372036854775807L;

    public r(q7.g gVar, androidx.media3.common.b bVar, boolean z13) {
        this.f99036a = bVar;
        this.f99040e = gVar;
        this.f99038c = gVar.f102636b;
        a(gVar, z13);
    }

    public final void a(q7.g gVar, boolean z13) {
        int i13 = this.f99042g;
        long j13 = -9223372036854775807L;
        long j14 = i13 == 0 ? -9223372036854775807L : this.f99038c[i13 - 1];
        this.f99039d = z13;
        this.f99040e = gVar;
        long[] jArr = gVar.f102636b;
        this.f99038c = jArr;
        long j15 = this.f99043h;
        if (j15 == -9223372036854775807L) {
            if (j14 != -9223372036854775807L) {
                this.f99042g = n0.a(jArr, j14, false);
            }
        } else {
            int a13 = n0.a(jArr, j15, true);
            this.f99042g = a13;
            if (this.f99039d && a13 == this.f99038c.length) {
                j13 = j15;
            }
            this.f99043h = j13;
        }
    }

    @Override // g8.b1
    public final void b() {
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        int i14 = this.f99042g;
        boolean z13 = i14 == this.f99038c.length;
        if (z13 && !this.f99039d) {
            eVar.f57530b = 4;
            return -4;
        }
        if ((i13 & 2) != 0 || !this.f99041f) {
            cVar.f104884c = this.f99036a;
            this.f99041f = true;
            return -5;
        }
        if (z13) {
            return -3;
        }
        if ((i13 & 1) == 0) {
            this.f99042g = i14 + 1;
        }
        if ((i13 & 4) == 0) {
            byte[] b13 = this.f99037b.b(this.f99040e.f102635a[i14]);
            eVar.p(b13.length);
            eVar.f78454e.put(b13);
        }
        eVar.f78456g = this.f99038c[i14];
        eVar.f57530b = 1;
        return -4;
    }

    @Override // g8.b1
    public final boolean j() {
        return true;
    }

    @Override // g8.b1
    public final int o(long j13) {
        int max = Math.max(this.f99042g, n0.a(this.f99038c, j13, true));
        int i13 = max - this.f99042g;
        this.f99042g = max;
        return i13;
    }
}
