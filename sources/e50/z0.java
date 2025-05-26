package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57477b;

    public z0(String str, String str2) {
        this.f57476a = str;
        this.f57477b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f57476a, z0Var.f57476a) && Intrinsics.d(this.f57477b, z0Var.f57477b);
    }

    public final int hashCode() {
        String str = this.f57476a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57477b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Footer(link=");
        sb3.append(this.f57476a);
        sb3.append(", text=");
        return a.a.p(sb3, this.f57477b, ")");
    }
}
