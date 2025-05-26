package py0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f101733a;

    public a(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f101733a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f101733a, ((a) obj).f101733a);
    }

    public final int hashCode() {
        return this.f101733a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RecordPinDeselected(pinId="), this.f101733a, ")");
    }
}
