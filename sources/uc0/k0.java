package uc0;

/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121802a;

    /* renamed from: b, reason: collision with root package name */
    public final do2.t2 f121803b;

    /* renamed from: c, reason: collision with root package name */
    public final do2.a2 f121804c;

    public k0(int i13) {
        this.f121802a = i13;
        do2.t2 a13 = do2.u2.a("");
        this.f121803b = a13;
        this.f121804c = new do2.a2(a13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f121802a == ((k0) obj).f121802a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121802a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("TextFieldDisplayState(placeHolder="), this.f121802a, ")");
    }
}
