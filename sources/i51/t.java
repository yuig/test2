package i51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f71604a;

    /* renamed from: b, reason: collision with root package name */
    public final zp.b f71605b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71606c;

    public t(String userId, zp.b allPinsVisibility, boolean z13) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(allPinsVisibility, "allPinsVisibility");
        this.f71604a = userId;
        this.f71605b = allPinsVisibility;
        this.f71606c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f71604a, tVar.f71604a) && this.f71605b == tVar.f71605b && this.f71606c == tVar.f71606c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71606c) + ((this.f71605b.hashCode() + (this.f71604a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowManageVisibilityModalEffect(userId=");
        sb3.append(this.f71604a);
        sb3.append(", allPinsVisibility=");
        sb3.append(this.f71605b);
        sb3.append(", showVisibilityTitles=");
        return a.a.r(sb3, this.f71606c, ")");
    }
}
