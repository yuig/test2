package rq;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f109127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f109128b;

    public d(int i13, int i14) {
        this.f109127a = i13;
        this.f109128b = i14;
    }

    public final int a() {
        return this.f109127a;
    }

    public final int b() {
        return this.f109128b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f109127a == dVar.f109127a && this.f109128b == dVar.f109128b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109128b) + (Integer.hashCode(this.f109127a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Dimensions(height=");
        sb3.append(this.f109127a);
        sb3.append(", width=");
        return a.a.n(sb3, this.f109128b, ")");
    }
}
