package ws;

/* loaded from: classes3.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f131055a;

    public e(long j13) {
        this.f131055a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f131055a == ((e) obj).f131055a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131055a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("ClickOnImage(timeStamp="), this.f131055a, ")");
    }
}
