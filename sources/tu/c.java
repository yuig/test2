package tu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f119268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119269b;

    public c(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter("ads", "trafficSource");
        this.f119268a = pin;
        this.f119269b = "ads";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f119268a, cVar.f119268a) && Intrinsics.d(this.f119269b, cVar.f119269b);
    }

    public final int hashCode() {
        return this.f119269b.hashCode() + (this.f119268a.hashCode() * 31);
    }

    public final String toString() {
        return "SetupFloatingBottomActionBar(pin=" + this.f119268a + ", trafficSource=" + this.f119269b + ")";
    }
}
