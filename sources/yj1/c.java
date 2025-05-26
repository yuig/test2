package yj1;

import kotlin.jvm.internal.Intrinsics;
import ni1.f0;

/* loaded from: classes5.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f139208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139209b;

    public c(String favoriteUserCount, boolean z13) {
        Intrinsics.checkNotNullParameter(favoriteUserCount, "favoriteUserCount");
        this.f139208a = z13;
        this.f139209b = favoriteUserCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f139208a == cVar.f139208a && Intrinsics.d(this.f139209b, cVar.f139209b);
    }

    public final int hashCode() {
        return this.f139209b.hashCode() + (Boolean.hashCode(this.f139208a) * 31);
    }

    public final String toString() {
        return "FavoriteDisplayState(displayFavoriteSelectedDrawable=" + this.f139208a + ", favoriteUserCount=" + this.f139209b + ")";
    }
}
