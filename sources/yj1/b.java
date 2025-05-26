package yj1;

import kotlin.jvm.internal.Intrinsics;
import ni1.f0;

/* loaded from: classes5.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f139207a;

    public b(c favoriteDisplayState) {
        Intrinsics.checkNotNullParameter(favoriteDisplayState, "favoriteDisplayState");
        this.f139207a = favoriteDisplayState;
    }

    public final c e() {
        return this.f139207a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f139207a, ((b) obj).f139207a);
    }

    public final int hashCode() {
        return this.f139207a.hashCode();
    }

    public final String toString() {
        return "FavoriteButtonDisplayState(favoriteDisplayState=" + this.f139207a + ")";
    }
}
