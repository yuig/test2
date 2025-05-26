package w80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f128286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128287b;

    public f1() {
        rm1.q icon = rm1.q.TRASH_CAN;
        int ordinal = icon.ordinal();
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f128286a = icon;
        this.f128287b = ordinal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f128286a == f1Var.f128286a && this.f128287b == f1Var.f128287b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128287b) + (this.f128286a.hashCode() * 31);
    }

    public final String toString() {
        return "Trash(icon=" + this.f128286a + ", id=" + this.f128287b + ")";
    }
}
