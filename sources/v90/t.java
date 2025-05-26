package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final y62.g f124961a;

    public t(y62.g model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f124961a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f124961a, ((t) obj).f124961a);
    }

    public final int hashCode() {
        return this.f124961a.hashCode();
    }

    public final String toString() {
        return "SelectMaskModelUpdated(model=" + this.f124961a + ")";
    }
}
