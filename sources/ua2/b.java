package ua2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f121419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f121420b;

    public b(rm1.q icon, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f121419a = icon;
        this.f121420b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f121419a == bVar.f121419a && Intrinsics.d(this.f121420b, bVar.f121420b);
    }

    public final int hashCode() {
        int hashCode = this.f121419a.hashCode() * 31;
        String str = this.f121420b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CreatorStatsState(icon=" + this.f121419a + ", statsText=" + this.f121420b + ")";
    }
}
