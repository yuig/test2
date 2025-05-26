package q8;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f102913c = new f0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f102914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102915b;

    public f0(long j13, long j14) {
        this.f102914a = j13;
        this.f102915b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f102914a == f0Var.f102914a && this.f102915b == f0Var.f102915b;
    }

    public final int hashCode() {
        return (((int) this.f102914a) * 31) + ((int) this.f102915b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[timeUs=");
        sb3.append(this.f102914a);
        sb3.append(", position=");
        return a.a.o(sb3, this.f102915b, "]");
    }
}
