package cj0;

/* loaded from: classes5.dex */
public final class a1 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f27781a;

    public a1(int i13) {
        this.f27781a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.f27781a == ((a1) obj).f27781a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27781a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ShowErrorToast(messageResId="), this.f27781a, ")");
    }
}
