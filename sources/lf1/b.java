package lf1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83135a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f83136b;

    public b(String pinId, wy0 user) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f83135a = pinId;
        this.f83136b = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f83135a, bVar.f83135a) && Intrinsics.d(this.f83136b, bVar.f83136b);
    }

    public final int hashCode() {
        return this.f83136b.hashCode() + (this.f83135a.hashCode() * 31);
    }

    public final String toString() {
        return "BottomSheetAdsAttributionTapEvent(pinId=" + this.f83135a + ", user=" + this.f83136b + ")";
    }
}
