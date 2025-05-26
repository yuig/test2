package bx0;

/* loaded from: classes5.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f24090a;

    public v(int i13) {
        this.f24090a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f24090a == ((v) obj).f24090a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24090a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ScrollToItemAndShowCompleteTheLookStoryEffect(index="), this.f24090a, ")");
    }
}
