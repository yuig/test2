package n91;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f90025a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90026b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90027c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f90028d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90029e;

    public a(String newEmailAddress, boolean z13, boolean z14, i0 i0Var, boolean z15) {
        Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
        this.f90025a = newEmailAddress;
        this.f90026b = z13;
        this.f90027c = z14;
        this.f90028d = i0Var;
        this.f90029e = z15;
    }

    public static a e(a aVar, boolean z13, boolean z14, i0 i0Var, boolean z15, int i13) {
        String newEmailAddress = aVar.f90025a;
        if ((i13 & 2) != 0) {
            z13 = aVar.f90026b;
        }
        boolean z16 = z13;
        if ((i13 & 4) != 0) {
            z14 = aVar.f90027c;
        }
        boolean z17 = z14;
        if ((i13 & 8) != 0) {
            i0Var = aVar.f90028d;
        }
        i0 i0Var2 = i0Var;
        if ((i13 & 16) != 0) {
            z15 = aVar.f90029e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
        return new a(newEmailAddress, z16, z17, i0Var2, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f90025a, aVar.f90025a) && this.f90026b == aVar.f90026b && this.f90027c == aVar.f90027c && Intrinsics.d(this.f90028d, aVar.f90028d) && this.f90029e == aVar.f90029e;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f90027c, ep.b.e(this.f90026b, this.f90025a.hashCode() * 31, 31), 31);
        i0 i0Var = this.f90028d;
        return Boolean.hashCode(this.f90029e) + ((e13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EmailOTPConfirmationDisplayState(newEmailAddress=");
        sb3.append(this.f90025a);
        sb3.append(", submitButtonEnabled=");
        sb3.append(this.f90026b);
        sb3.append(", resendButtonEnabled=");
        sb3.append(this.f90027c);
        sb3.append(", errorMessage=");
        sb3.append(this.f90028d);
        sb3.append(", isLoading=");
        return a.a.r(sb3, this.f90029e, ")");
    }
}
