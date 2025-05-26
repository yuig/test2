package d92;

/* loaded from: classes4.dex */
public final class v implements z {

    /* renamed from: a, reason: collision with root package name */
    public final long f54194a;

    public v(long j13) {
        this.f54194a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f54194a == ((v) obj).f54194a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54194a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPDPLoadingFinished(timeStamp="), this.f54194a, ")");
    }
}
