package o21;

/* loaded from: classes5.dex */
public final class b extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final int f92799h;

    /* renamed from: i, reason: collision with root package name */
    public final int f92800i;

    public b(int i13, int i14) {
        this.f92799h = i13;
        this.f92800i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f92799h == bVar.f92799h && this.f92800i == bVar.f92800i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92800i) + (Integer.hashCode(this.f92799h) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FixedSizePinDimensions(width=");
        sb3.append(this.f92799h);
        sb3.append(", height=");
        return a.a.n(sb3, this.f92800i, ")");
    }
}
