package w90;

/* loaded from: classes5.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f128582a;

    public x(boolean z13) {
        this.f128582a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f128582a == ((x) obj).f128582a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128582a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("MarkComposerNavigationSideEffectRequest(hasNavigated="), this.f128582a, ")");
    }
}
