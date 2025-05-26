package ml0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f87460a;

    public i(t0 itemPin) {
        Intrinsics.checkNotNullParameter(itemPin, "itemPin");
        this.f87460a = itemPin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f87460a, ((i) obj).f87460a);
    }

    public final int hashCode() {
        return this.f87460a.hashCode();
    }

    public final String toString() {
        return "PinSelectionChanged(itemPin=" + this.f87460a + ")";
    }
}
