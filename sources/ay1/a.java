package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final cy1.d f20657a;

    public a(cy1.d pinData) {
        Intrinsics.checkNotNullParameter(pinData, "pinData");
        this.f20657a = pinData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f20657a, ((a) obj).f20657a);
    }

    public final int hashCode() {
        return this.f20657a.hashCode();
    }

    public final String toString() {
        return "Loaded(pinData=" + this.f20657a + ")";
    }
}
