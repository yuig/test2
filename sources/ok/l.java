package ok;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: a, reason: collision with root package name */
    public final char f95437a;

    public l(char c13) {
        this.f95437a = c13;
    }

    @Override // ok.p
    public final boolean c(char c13) {
        return c13 == this.f95437a;
    }

    public final String toString() {
        return "CharMatcher.is('" + p.a(this.f95437a) + "')";
    }
}
