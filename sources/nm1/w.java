package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f91498a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f91499b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f91500c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f91501d;

    public w(rm1.q leftIcon, rm1.q rightIcon, u50.i0 i0Var, u50.i0 i0Var2) {
        Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        this.f91498a = leftIcon;
        this.f91499b = rightIcon;
        this.f91500c = i0Var;
        this.f91501d = i0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f91498a == wVar.f91498a && this.f91499b == wVar.f91499b && Intrinsics.d(this.f91500c, wVar.f91500c) && Intrinsics.d(this.f91501d, wVar.f91501d);
    }

    public final int hashCode() {
        int hashCode = (this.f91499b.hashCode() + (this.f91498a.hashCode() * 31)) * 31;
        u50.i0 i0Var = this.f91500c;
        int hashCode2 = (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        u50.i0 i0Var2 = this.f91501d;
        return hashCode2 + (i0Var2 != null ? i0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DoubleIconButton(leftIcon=" + this.f91498a + ", rightIcon=" + this.f91499b + ", leftIconContentDescription=" + this.f91500c + ", rightIconContentDescription=" + this.f91501d + ")";
    }
}
