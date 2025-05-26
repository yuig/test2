package r52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final a f106292a;

    public n(a itemPin) {
        Intrinsics.checkNotNullParameter(itemPin, "itemPin");
        this.f106292a = itemPin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f106292a, ((n) obj).f106292a);
    }

    public final int hashCode() {
        return this.f106292a.hashCode();
    }

    public final String toString() {
        return "PinSelectionChanged(itemPin=" + this.f106292a + ")";
    }
}
