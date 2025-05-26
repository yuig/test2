package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f71084a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f71085b;

    public c1(Integer num, Object obj) {
        this.f71084a = num;
        this.f71085b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.f71084a, c1Var.f71084a) && Intrinsics.d(this.f71085b, c1Var.f71085b);
    }

    public final int hashCode() {
        Object obj = this.f71084a;
        int i13 = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f71085b;
        if (obj2 instanceof Enum) {
            i13 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i13 = obj2.hashCode();
        }
        return i13 + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f71084a + ", right=" + this.f71085b + ')';
    }
}
