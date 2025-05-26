package gk2;

/* loaded from: classes2.dex */
public abstract class z1 extends ok2.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f65714a;

    /* renamed from: b, reason: collision with root package name */
    public int f65715b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f65716c;

    public z1(int i13, int i14) {
        this.f65715b = i13;
        this.f65714a = i14;
    }

    public abstract void a();

    public abstract void b(long j13);

    @Override // xp2.c
    public final void cancel() {
        this.f65716c = true;
    }

    @Override // dk2.i
    public final void clear() {
        this.f65715b = this.f65714a;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f65715b == this.f65714a;
    }

    @Override // dk2.i
    public final Object poll() {
        int i13 = this.f65715b;
        if (i13 == this.f65714a) {
            return null;
        }
        this.f65715b = i13 + 1;
        return Integer.valueOf(i13);
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13) && d7.b.e(this, j13) == 0) {
            if (j13 == Long.MAX_VALUE) {
                a();
            } else {
                b(j13);
            }
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return 1;
    }
}
