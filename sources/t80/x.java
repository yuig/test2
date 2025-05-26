package t80;

/* loaded from: classes5.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f116746a;

    public x(boolean z13) {
        this.f116746a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f116746a == ((x) obj).f116746a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116746a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("NavigateToDraftsAndTemplates(openOnTemplates="), this.f116746a, ")");
    }
}
