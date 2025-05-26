package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements z {

    /* renamed from: a, reason: collision with root package name */
    public final c92.v f54154a;

    public j(c92.v event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f54154a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f54154a, ((j) obj).f54154a);
    }

    public final int hashCode() {
        return this.f54154a.hashCode();
    }

    public final String toString() {
        return "HandshakeBottomSheetEventWrapper(event=" + this.f54154a + ")";
    }
}
