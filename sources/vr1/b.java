package vr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f126457a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f126458b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1.a f126459c;

    public b(String value, boolean z13, rr1.a passwordScore) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(passwordScore, "passwordScore");
        this.f126457a = value;
        this.f126458b = z13;
        this.f126459c = passwordScore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f126457a, bVar.f126457a) && this.f126458b == bVar.f126458b && Intrinsics.d(this.f126459c, bVar.f126459c);
    }

    public final int hashCode() {
        return this.f126459c.hashCode() + ep.b.e(this.f126458b, this.f126457a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PasswordInput(value=" + this.f126457a + ", isValid=" + this.f126458b + ", passwordScore=" + this.f126459c + ")";
    }
}
