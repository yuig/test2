package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f90683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90684b;

    public g(String eventPinId, String stateTransformerPinId) {
        Intrinsics.checkNotNullParameter(eventPinId, "eventPinId");
        Intrinsics.checkNotNullParameter(stateTransformerPinId, "stateTransformerPinId");
        this.f90683a = eventPinId;
        this.f90684b = stateTransformerPinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f90683a, gVar.f90683a) && Intrinsics.d(this.f90684b, gVar.f90684b);
    }

    public final int hashCode() {
        return this.f90684b.hashCode() + (this.f90683a.hashCode() * 31);
    }

    public final String j() {
        return this.f90683a;
    }

    public final String k() {
        return this.f90684b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("KibanaLogIabDurationValidationFailure(eventPinId=");
        sb3.append(this.f90683a);
        sb3.append(", stateTransformerPinId=");
        return a.a.p(sb3, this.f90684b, ")");
    }
}
