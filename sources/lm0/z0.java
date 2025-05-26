package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f83922a;

    /* renamed from: b, reason: collision with root package name */
    public final zo.c f83923b;

    public z0(c1 pinsFilter, zo.c viewType) {
        Intrinsics.checkNotNullParameter(pinsFilter, "pinsFilter");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f83922a = pinsFilter;
        this.f83923b = viewType;
    }

    public static z0 a(z0 z0Var, c1 pinsFilter, zo.c viewType, int i13) {
        if ((i13 & 1) != 0) {
            pinsFilter = z0Var.f83922a;
        }
        if ((i13 & 2) != 0) {
            viewType = z0Var.f83923b;
        }
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(pinsFilter, "pinsFilter");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        return new z0(pinsFilter, viewType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f83922a == z0Var.f83922a && this.f83923b == z0Var.f83923b;
    }

    public final int hashCode() {
        return this.f83923b.hashCode() + (this.f83922a.hashCode() * 31);
    }

    public final String toString() {
        return "AllSavesViewOptionsVMState(pinsFilter=" + this.f83922a + ", viewType=" + this.f83923b + ")";
    }
}
