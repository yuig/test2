package yp2;

/* loaded from: classes4.dex */
public abstract class e extends b {
    @Override // yp2.b
    public final e b() {
        return this;
    }

    public abstract boolean c(e eVar);

    public abstract void d(d dVar);

    public abstract int e();

    @Override // yp2.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && c(((b) obj).b());
    }

    public e f() {
        return this;
    }

    @Override // yp2.b
    public abstract int hashCode();
}
