package nt;

/* loaded from: classes3.dex */
public final class m1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92101a;

    public m1(int i13) {
        this.f92101a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && this.f92101a == ((m1) obj).f92101a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92101a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CustomTextField(id="), this.f92101a, ")");
    }
}
