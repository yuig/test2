package sb1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112238a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112239b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f112240c;

    public b(boolean z13, String parentEmail, boolean z14) {
        Intrinsics.checkNotNullParameter(parentEmail, "parentEmail");
        this.f112238a = z13;
        this.f112239b = parentEmail;
        this.f112240c = z14;
    }

    public static b e(b bVar, boolean z13) {
        String parentEmail = bVar.f112239b;
        boolean z14 = bVar.f112240c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(parentEmail, "parentEmail");
        return new b(z13, parentEmail, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f112238a == bVar.f112238a && Intrinsics.d(this.f112239b, bVar.f112239b) && this.f112240c == bVar.f112240c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112240c) + cb.d(this.f112239b, Boolean.hashCode(this.f112238a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PasscodeSummaryDisplayState(isLoading=");
        sb3.append(this.f112238a);
        sb3.append(", parentEmail=");
        sb3.append(this.f112239b);
        sb3.append(", isTurnOffParentalPasscodeToggleEnabled=");
        return a.a.r(sb3, this.f112240c, ")");
    }
}
