package s80;

/* loaded from: classes5.dex */
public final class n5 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111708a;

    public n5(boolean z13) {
        this.f111708a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5) && this.f111708a == ((n5) obj).f111708a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111708a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("NavigateBack(afterSuccessfulSave="), this.f111708a, ")");
    }
}
