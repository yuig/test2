package d92;

/* loaded from: classes4.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final long f54195a;

    public w(long j13) {
        this.f54195a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f54195a == ((w) obj).f54195a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54195a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPDPLoadingStarted(timeStamp="), this.f54195a, ")");
    }
}
