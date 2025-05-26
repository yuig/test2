package bi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f22881a;

    public v(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f22881a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f22881a, ((v) obj).f22881a);
    }

    public final int hashCode() {
        return this.f22881a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PostPinItClickedEvent(pinId="), this.f22881a, ")");
    }
}
