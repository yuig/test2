package nt;

/* loaded from: classes3.dex */
public final class y implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f92238a;

    public y(long j13) {
        this.f92238a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f92238a == ((y) obj).f92238a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f92238a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("CloseButtonClickEvent(timeStamp="), this.f92238a, ")");
    }
}
