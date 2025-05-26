package kv0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final float f81009a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81010b;

    public t(int i13, float f13) {
        this.f81009a = f13;
        this.f81010b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f81009a, tVar.f81009a) == 0 && this.f81010b == tVar.f81010b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81010b) + (Float.hashCode(this.f81009a) * 31);
    }

    public final String toString() {
        return "ProductRating(value=" + this.f81009a + ", reviewCount=" + this.f81010b + ")";
    }
}
