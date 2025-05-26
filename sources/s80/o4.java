package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final l62.w f111738a;

    public o4(l62.w composerViewEvent) {
        Intrinsics.checkNotNullParameter(composerViewEvent, "composerViewEvent");
        this.f111738a = composerViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4) && Intrinsics.d(this.f111738a, ((o4) obj).f111738a);
    }

    public final int hashCode() {
        return this.f111738a.hashCode();
    }

    public final String toString() {
        return "HandleViewEvent(composerViewEvent=" + this.f111738a + ")";
    }
}
