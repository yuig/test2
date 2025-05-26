package pu;

/* loaded from: classes3.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f101340a;

    public e(boolean z13) {
        this.f101340a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f101340a == ((e) obj).f101340a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101340a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnBackPressed(isWebviewInRootUrlAddress="), this.f101340a, ")");
    }
}
