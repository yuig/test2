package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111818b;

    public v(String str, boolean z13) {
        this.f111817a = z13;
        this.f111818b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f111817a == vVar.f111817a && Intrinsics.d(this.f111818b, vVar.f111818b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f111817a) * 31;
        String str = this.f111818b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SaveCompleted(success=");
        sb3.append(this.f111817a);
        sb3.append(", savedCollageId=");
        return a.a.p(sb3, this.f111818b, ")");
    }
}
