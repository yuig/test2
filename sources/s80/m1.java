package s80;

/* loaded from: classes5.dex */
public final class m1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111673a;

    public m1(boolean z13) {
        this.f111673a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && this.f111673a == ((m1) obj).f111673a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111673a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnboardingDataProgress(inProgress="), this.f111673a, ")");
    }
}
