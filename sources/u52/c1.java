package u52;

/* loaded from: classes4.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120676b;

    public c1(int i13, int i14) {
        this.f120675a = i13;
        this.f120676b = i14;
    }

    public final int a() {
        return this.f120676b;
    }

    public final int b() {
        return this.f120675a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f120675a == c1Var.f120675a && this.f120676b == c1Var.f120676b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120676b) + (Integer.hashCode(this.f120675a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TemplatesIndicatorState(templatesCount=");
        sb3.append(this.f120675a);
        sb3.append(", selectedIndex=");
        return a.a.n(sb3, this.f120676b, ")");
    }
}
