package nt;

/* loaded from: classes3.dex */
public final class c0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f91995a;

    public c0(long j13) {
        this.f91995a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f91995a == ((c0) obj).f91995a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91995a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("LeadGenBottomSheetExpanded(timeStamp="), this.f91995a, ")");
    }
}
