package k92;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f78870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78871b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f78872c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f78873d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78874e;

    /* renamed from: f, reason: collision with root package name */
    public final do1.n f78875f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78876g;

    public c(i0 message, k0 k0Var, do1.n variant, boolean z13, int i13) {
        k0Var = (i13 & 4) != 0 ? null : k0Var;
        variant = (i13 & 32) != 0 ? do1.n.DEFAULT : variant;
        z13 = (i13 & 64) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f78870a = message;
        this.f78871b = null;
        this.f78872c = k0Var;
        this.f78873d = false;
        this.f78874e = null;
        this.f78875f = variant;
        this.f78876g = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f78870a, cVar.f78870a) && Intrinsics.d(this.f78871b, cVar.f78871b) && Intrinsics.d(this.f78872c, cVar.f78872c) && this.f78873d == cVar.f78873d && Intrinsics.d(this.f78874e, cVar.f78874e) && this.f78875f == cVar.f78875f && this.f78876g == cVar.f78876g;
    }

    public final int hashCode() {
        int hashCode = this.f78870a.hashCode() * 31;
        String str = this.f78871b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        i0 i0Var = this.f78872c;
        int e13 = ep.b.e(this.f78873d, (hashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31);
        String str2 = this.f78874e;
        return Boolean.hashCode(this.f78876g) + ((this.f78875f.hashCode() + ((e13 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ToastConfig(message=");
        sb3.append(this.f78870a);
        sb3.append(", imageUrl=");
        sb3.append(this.f78871b);
        sb3.append(", buttonText=");
        sb3.append(this.f78872c);
        sb3.append(", hasUser=");
        sb3.append(this.f78873d);
        sb3.append(", userId=");
        sb3.append(this.f78874e);
        sb3.append(", variant=");
        sb3.append(this.f78875f);
        sb3.append(", isBottomPosition=");
        return a.a.r(sb3, this.f78876g, ")");
    }
}
