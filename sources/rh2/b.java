package rh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f108337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108338b;

    public b(int i13, String str) {
        this.f108337a = i13;
        this.f108338b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f108337a == bVar.f108337a && Intrinsics.d(this.f108338b, bVar.f108338b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f108337a) * 31;
        String str = this.f108338b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DomainSettings(limit=");
        sb3.append(this.f108337a);
        sb3.append(", suffix=");
        return ep.b.k(sb3, this.f108338b, ')');
    }
}
