package bi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f22880a;

    public u(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f22880a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f22880a, ((u) obj).f22880a);
    }

    public final int hashCode() {
        return this.f22880a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PostMusicSheetModalShowEvent(pinId="), this.f22880a, ")");
    }
}
