package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements b0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f74597d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f74598e;

    public c0(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74597d = __typename;
        this.f74598e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f74597d, c0Var.f74597d) && Intrinsics.d(this.f74598e, c0Var.f74598e);
    }

    public final int hashCode() {
        int hashCode = this.f74597d.hashCode() * 31;
        Boolean bool = this.f74598e;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("V3OrientationStatusV3OrientationStatusQuery(__typename=");
        sb3.append(this.f74597d);
        sb3.append(", data=");
        return a.c.h(sb3, this.f74598e, ")");
    }
}
