package jk2;

/* loaded from: classes4.dex */
public final class s1 extends ek2.b {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76689a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76690b;

    /* renamed from: c, reason: collision with root package name */
    public long f76691c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76692d;

    public s1(uj2.v vVar, long j13, long j14) {
        this.f76689a = vVar;
        this.f76691c = j13;
        this.f76690b = j14;
    }

    @Override // dk2.i
    public final void clear() {
        this.f76691c = this.f76690b;
        lazySet(1);
    }

    @Override // xj2.c
    public final void dispose() {
        set(1);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() != 0;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f76691c == this.f76690b;
    }

    @Override // dk2.i
    public final Object poll() {
        long j13 = this.f76691c;
        if (j13 != this.f76690b) {
            this.f76691c = 1 + j13;
            return Integer.valueOf((int) j13);
        }
        lazySet(1);
        return null;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f76692d = true;
        return 1;
    }
}
