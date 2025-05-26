package c31;

/* loaded from: classes5.dex */
public final class c0 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25573a;

    public c0(boolean z13) {
        this.f25573a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f25573a == ((c0) obj).f25573a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25573a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("LoadViewTypeFromUserPrefs(isMe="), this.f25573a, ")");
    }
}
