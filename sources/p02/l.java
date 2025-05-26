package p02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98436b;

    public l(String userId, boolean z13) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f98435a = z13;
        this.f98436b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f98435a == lVar.f98435a && Intrinsics.d(this.f98436b, lVar.f98436b);
    }

    public final int hashCode() {
        return this.f98436b.hashCode() + (Boolean.hashCode(this.f98435a) * 31);
    }

    public final String toString() {
        return "ReloadContentList(isYourAccountTab=" + this.f98435a + ", userId=" + this.f98436b + ")";
    }
}
