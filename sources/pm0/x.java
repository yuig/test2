package pm0;

/* loaded from: classes5.dex */
public final class x implements t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f100706a;

    public x(boolean z13) {
        this.f100706a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f100706a == ((x) obj).f100706a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100706a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ConditionalInvite(hasPendingCollaboratorInvites="), this.f100706a, ")");
    }
}
