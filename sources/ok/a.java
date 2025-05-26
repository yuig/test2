package ok;

/* loaded from: classes3.dex */
public final class a extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final a f95409a = new a();

    private Object readResolve() {
        return f95409a;
    }

    @Override // ok.v
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // ok.v
    public final boolean c() {
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
