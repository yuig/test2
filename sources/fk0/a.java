package fk0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f62274a;

    public a(boolean z13) {
        this.f62274a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f62274a == ((a) obj).f62274a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62274a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("BoardCreateDisplayState(isCreateButtonEnabled="), this.f62274a, ")");
    }
}
