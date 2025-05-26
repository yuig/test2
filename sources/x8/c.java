package x8;

import q8.t;

/* loaded from: classes3.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f134150a;

    /* renamed from: b, reason: collision with root package name */
    public final long f134151b;

    public c(t tVar, long j13) {
        this.f134150a = tVar;
        bf.b.i(tVar.h() >= j13);
        this.f134151b = j13;
    }

    @Override // q8.t
    public final boolean c(byte[] bArr, int i13, int i14, boolean z13) {
        return this.f134150a.c(bArr, i13, i14, z13);
    }

    @Override // q8.t
    public final void g() {
        this.f134150a.g();
    }

    @Override // q8.t
    public final long getLength() {
        return this.f134150a.getLength() - this.f134151b;
    }

    @Override // q8.t
    public final long h() {
        return this.f134150a.h() - this.f134151b;
    }

    @Override // q8.t
    public final boolean i(byte[] bArr, int i13, int i14, boolean z13) {
        return this.f134150a.i(bArr, i13, i14, z13);
    }

    @Override // q8.t
    public final long k() {
        return this.f134150a.k() - this.f134151b;
    }

    @Override // q8.t
    public final void m(int i13) {
        this.f134150a.m(i13);
    }

    @Override // q8.t
    public final int n(int i13) {
        return this.f134150a.n(i13);
    }

    @Override // q8.t
    public final int o(byte[] bArr, int i13, int i14) {
        return this.f134150a.o(bArr, i13, i14);
    }

    @Override // q8.t
    public final void p(int i13) {
        this.f134150a.p(i13);
    }

    @Override // q8.t
    public final boolean q(int i13, boolean z13) {
        return this.f134150a.q(i13, z13);
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        return this.f134150a.read(bArr, i13, i14);
    }

    @Override // q8.t
    public final void readFully(byte[] bArr, int i13, int i14) {
        this.f134150a.readFully(bArr, i13, i14);
    }

    @Override // q8.t
    public final void s(byte[] bArr, int i13, int i14) {
        this.f134150a.s(bArr, i13, i14);
    }
}
