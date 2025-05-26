package h8;

import d7.d0;
import d7.n0;
import q8.j0;
import q8.k0;

/* loaded from: classes.dex */
public final class d implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f68007a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.b f68008b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.r f68009c = new q8.r();

    /* renamed from: d, reason: collision with root package name */
    public androidx.media3.common.b f68010d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f68011e;

    /* renamed from: f, reason: collision with root package name */
    public long f68012f;

    public d(int i13, int i14, androidx.media3.common.b bVar) {
        this.f68007a = i14;
        this.f68008b = bVar;
    }

    @Override // q8.k0
    public final void a(long j13, int i13, int i14, int i15, j0 j0Var) {
        long j14 = this.f68012f;
        if (j14 != -9223372036854775807L && j13 >= j14) {
            this.f68011e = this.f68009c;
        }
        k0 k0Var = this.f68011e;
        int i16 = n0.f53866a;
        k0Var.a(j13, i13, i14, i15, j0Var);
    }

    @Override // q8.k0
    public final void b(androidx.media3.common.b bVar) {
        androidx.media3.common.b bVar2 = this.f68008b;
        if (bVar2 != null) {
            bVar = bVar.e(bVar2);
        }
        this.f68010d = bVar;
        k0 k0Var = this.f68011e;
        int i13 = n0.f53866a;
        k0Var.b(bVar);
    }

    @Override // q8.k0
    public final void d(int i13, int i14, d0 d0Var) {
        k0 k0Var = this.f68011e;
        int i15 = n0.f53866a;
        k0Var.d(i13, 0, d0Var);
    }

    @Override // q8.k0
    public final int e(a7.k kVar, int i13, boolean z13) {
        k0 k0Var = this.f68011e;
        int i14 = n0.f53866a;
        return k0Var.c(kVar, i13, z13);
    }
}
