package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.u0 f92041a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92042b;

    public g0(String str, h32.u0 elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f92041a = elementType;
        this.f92042b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f92041a == g0Var.f92041a && Intrinsics.d(this.f92042b, g0Var.f92042b);
    }

    public final int hashCode() {
        int hashCode = this.f92041a.hashCode() * 31;
        String str = this.f92042b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TypingOnQuestion(elementType=" + this.f92041a + ", customLabel=" + this.f92042b + ")";
    }
}
