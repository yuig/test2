package tu;

/* loaded from: classes3.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f119265a = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f119265a == ((a) obj).f119265a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119265a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("BindBrowserClient(shouldOverrideUrlLoading="), this.f119265a, ")");
    }
}
