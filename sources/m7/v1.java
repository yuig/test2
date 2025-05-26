package m7;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final v1 f86441c = new v1(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f86442a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86443b;

    public v1(int i13, boolean z13) {
        this.f86442a = i13;
        this.f86443b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f86442a == v1Var.f86442a && this.f86443b == v1Var.f86443b;
    }

    public final int hashCode() {
        return (this.f86442a << 1) + (this.f86443b ? 1 : 0);
    }
}
