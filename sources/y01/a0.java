package y01;

/* loaded from: classes5.dex */
public final class a0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136383a;

    public a0(boolean z13) {
        this.f136383a = z13;
    }

    public final boolean a() {
        return this.f136383a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f136383a == ((a0) obj).f136383a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136383a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ChangeDragMode(isDragEnabled="), this.f136383a, ")");
    }
}
