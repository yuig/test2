package w21;

/* loaded from: classes5.dex */
public final class r1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f127794a;

    public r1(int i13) {
        this.f127794a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.f127794a == ((r1) obj).f127794a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127794a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Refresh(phase="), this.f127794a, ")");
    }
}
