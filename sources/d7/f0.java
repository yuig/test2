package d7;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f53820c = new f0(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f53821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53822b;

    static {
        new f0(0, 0);
    }

    public f0(int i13, int i14) {
        bf.b.i((i13 == -1 || i13 >= 0) && (i14 == -1 || i14 >= 0));
        this.f53821a = i13;
        this.f53822b = i14;
    }

    public final int a() {
        return this.f53822b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f53821a == f0Var.f53821a && this.f53822b == f0Var.f53822b;
    }

    public final int hashCode() {
        int i13 = this.f53821a;
        return ((i13 >>> 16) | (i13 << 16)) ^ this.f53822b;
    }

    public final String toString() {
        return this.f53821a + "x" + this.f53822b;
    }
}
