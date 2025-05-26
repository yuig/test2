package f31;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61017a;

    public k(boolean z13) {
        this.f61017a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f61017a == ((k) obj).f61017a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61017a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OptionsActionStateChanged(enable="), this.f61017a, ")");
    }
}
