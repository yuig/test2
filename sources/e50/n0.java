package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57398b;

    public n0(String str, String str2) {
        this.f57397a = str;
        this.f57398b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f57397a, n0Var.f57397a) && Intrinsics.d(this.f57398b, n0Var.f57398b);
    }

    public final int hashCode() {
        String str = this.f57397a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57398b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Tab(name=");
        sb3.append(this.f57397a);
        sb3.append(", tabType=");
        return a.a.p(sb3, this.f57398b, ")");
    }
}
