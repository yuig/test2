package pg0;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f100092a;

    public z(boolean z13) {
        this.f100092a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f100092a == ((z) obj).f100092a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100092a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ModifyAppContainerRowEvent(shouldShow="), this.f100092a, ")");
    }
}
