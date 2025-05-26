package u52;

/* loaded from: classes4.dex */
public final class n0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120718a;

    public n0(int i13) {
        this.f120718a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.f120718a == ((n0) obj).f120718a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120718a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("TemplateSelectedEvent(templateIndex="), this.f120718a, ")");
    }
}
