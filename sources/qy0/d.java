package qy0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f105352a;

    /* renamed from: b, reason: collision with root package name */
    public final long f105353b;

    public d(f30 pin, long j13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f105352a = pin;
        this.f105353b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f105352a, dVar.f105352a) && this.f105353b == dVar.f105353b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f105353b) + (this.f105352a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedPin(pin=" + this.f105352a + ", selectedTimestampMs=" + this.f105353b + ")";
    }
}
