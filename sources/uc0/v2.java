package uc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121873a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121874b;

    public v2(int i13, List tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        this.f121873a = i13;
        this.f121874b = tokens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f121873a == v2Var.f121873a && Intrinsics.d(this.f121874b, v2Var.f121874b);
    }

    public final int hashCode() {
        return this.f121874b.hashCode() + (Integer.hashCode(this.f121873a) * 31);
    }

    public final String toString() {
        return "TokenPageItemDisplayState(title=" + this.f121873a + ", tokens=" + this.f121874b + ")";
    }
}
