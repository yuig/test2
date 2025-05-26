package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57404b;

    public p0(String str, String str2) {
        this.f57403a = str;
        this.f57404b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f57403a, p0Var.f57403a) && Intrinsics.d(this.f57404b, p0Var.f57404b);
    }

    public final int hashCode() {
        String str = this.f57403a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57404b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Button(link=");
        sb3.append(this.f57403a);
        sb3.append(", text=");
        return a.a.p(sb3, this.f57404b, ")");
    }
}
