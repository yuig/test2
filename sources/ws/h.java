package ws;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final xs.y f131058a;

    public h(xs.y inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f131058a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f131058a, ((h) obj).f131058a);
    }

    public final int hashCode() {
        return this.f131058a.hashCode();
    }

    public final String toString() {
        return "WrappedBottomSheetEvent(inner=" + this.f131058a + ")";
    }
}
