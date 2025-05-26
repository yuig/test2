package ed1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f58533a;

    public a(float f13) {
        this.f58533a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Float.compare(this.f58533a, ((a) obj).f58533a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58533a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("ContactsListScrollEvent(dy="), this.f58533a, ")");
    }
}
