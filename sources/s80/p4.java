package s80;

/* loaded from: classes5.dex */
public final class p4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111754a;

    public p4(boolean z13) {
        this.f111754a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4) && this.f111754a == ((p4) obj).f111754a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111754a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("Init(bypassImageUploadCheckEnabled="), this.f111754a, ")");
    }
}
