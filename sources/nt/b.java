package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f91984a;

    public b(String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        this.f91984a = genderString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f91984a, ((b) obj).f91984a);
    }

    public final int hashCode() {
        return this.f91984a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CustomGender(genderString="), this.f91984a, ")");
    }
}
