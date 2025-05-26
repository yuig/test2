package ea1;

/* loaded from: classes5.dex */
public final class v implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58142a;

    public v(boolean z13) {
        this.f58142a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f58142a == ((v) obj).f58142a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58142a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("LoadConnectionStatus(isConnected="), this.f58142a, ")");
    }
}
