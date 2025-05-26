package i51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f71597a;

    /* renamed from: b, reason: collision with root package name */
    public final zp.b f71598b;

    public m(String userId, zp.b allPinsVisibility) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(allPinsVisibility, "allPinsVisibility");
        this.f71597a = userId;
        this.f71598b = allPinsVisibility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f71597a, mVar.f71597a) && this.f71598b == mVar.f71598b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f71598b.hashCode() + (this.f71597a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LayoutBoardsSelected(userId=" + this.f71597a + ", allPinsVisibility=" + this.f71598b + ", showVisibilityTitles=false)";
    }
}
