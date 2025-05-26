package sf1;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f112507a;

    /* renamed from: b, reason: collision with root package name */
    public final float f112508b;

    public a0(int i13, float f13) {
        this.f112507a = i13;
        this.f112508b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f112507a == a0Var.f112507a && Float.compare(this.f112508b, a0Var.f112508b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f112508b) + (Integer.hashCode(this.f112507a) * 31);
    }

    public final String toString() {
        return "TargetProgress(index=" + this.f112507a + ", progress=" + this.f112508b + ")";
    }
}
