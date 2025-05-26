package xs;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f135735a;

    /* renamed from: b, reason: collision with root package name */
    public final long f135736b;

    public h0(int i13, long j13) {
        this.f135735a = i13;
        this.f135736b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f135735a == h0Var.f135735a && this.f135736b == h0Var.f135736b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135736b) + (Integer.hashCode(this.f135735a) * 31);
    }

    public final String toString() {
        return "LastClickedData(lastClickedIndex=" + this.f135735a + ", lastClickedTime=" + this.f135736b + ")";
    }
}
