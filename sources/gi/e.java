package gi;

/* loaded from: classes3.dex */
public final class e extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final e f65059a = new e();

    @Override // gi.n
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // gi.n
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
