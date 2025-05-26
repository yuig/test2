package j1;

/* loaded from: classes2.dex */
public final class m1 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74155a;

    public m1(int i13) {
        this.f74155a = i13;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m1) && ((m1) obj).f74155a == this.f74155a;
    }

    public final int hashCode() {
        return this.f74155a;
    }

    @Override // j1.n
    public final u2 a(p2 p2Var) {
        return new kp.n(this.f74155a);
    }
}
