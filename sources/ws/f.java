package ws;

/* loaded from: classes3.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f131056a;

    public f(long j13) {
        this.f131056a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f131056a == ((f) obj).f131056a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131056a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnBackPressed(timeStamp="), this.f131056a, ")");
    }
}
