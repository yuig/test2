package lm0;

/* loaded from: classes5.dex */
public final class s0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f83897a;

    public s0(int i13) {
        this.f83897a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && this.f83897a == ((s0) obj).f83897a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83897a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ShowErrorToast(messageResId="), this.f83897a, ")");
    }
}
