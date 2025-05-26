package fa0;

/* loaded from: classes5.dex */
public final class w0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61541a;

    public w0(boolean z13) {
        this.f61541a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && this.f61541a == ((w0) obj).f61541a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61541a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("SourceCollageLoading(showProgress="), this.f61541a, ")");
    }
}
