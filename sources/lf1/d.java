package lf1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f83138a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f83139b;

    public d(String pinId, wy0 user) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f83138a = pinId;
        this.f83139b = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f83138a, dVar.f83138a) && Intrinsics.d(this.f83139b, dVar.f83139b);
    }

    public final int hashCode() {
        return this.f83139b.hashCode() + (this.f83138a.hashCode() * 31);
    }

    public final String toString() {
        return "BottomSheetAdsFollowTapEvent(pinId=" + this.f83138a + ", user=" + this.f83139b + ")";
    }
}
