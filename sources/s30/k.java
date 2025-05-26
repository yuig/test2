package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f111038a;

    /* renamed from: b, reason: collision with root package name */
    public final j f111039b;

    public k(String str, j jVar) {
        this.f111038a = str;
        this.f111039b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f111038a, kVar.f111038a) && Intrinsics.d(this.f111039b, kVar.f111039b);
    }

    public final int hashCode() {
        String str = this.f111038a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        j jVar = this.f111039b;
        return hashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "Entity(actionUri=" + this.f111038a + ", image=" + this.f111039b + ")";
    }
}
