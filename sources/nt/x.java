package nt;

/* loaded from: classes3.dex */
public final class x implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f92222a;

    public x(long j13) {
        this.f92222a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f92222a == ((x) obj).f92222a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f92222a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("BottomSheetClicked(timeStamp="), this.f92222a, ")");
    }
}
