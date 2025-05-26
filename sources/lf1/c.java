package lf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f83137a;

    public c(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f83137a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f83137a, ((c) obj).f83137a);
    }

    public final int hashCode() {
        return this.f83137a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BottomSheetAdsCTAButtonTapEvent(pinId="), this.f83137a, ")");
    }
}
