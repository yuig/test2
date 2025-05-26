package td;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f117447a;

    public w(String str) {
        this.f117447a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f117447a.equals(((w) obj).f117447a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f117447a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StringHeaderFactory{value='"), this.f117447a, "'}");
    }
}
