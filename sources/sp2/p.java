package sp2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f114951a;

    /* renamed from: b, reason: collision with root package name */
    public final m f114952b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f114953c = true;

    public p(Object obj, m mVar) {
        this.f114951a = obj;
        this.f114952b = mVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f114951a == pVar.f114951a && this.f114952b.equals(pVar.f114952b);
    }

    public final int hashCode() {
        return this.f114952b.f114942f.hashCode() + this.f114951a.hashCode();
    }
}
