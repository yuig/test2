package xs;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f135696a;

    public a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f135696a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f135696a, ((a) obj).f135696a);
    }

    public final int hashCode() {
        return this.f135696a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("FetchCartingData(pin="), this.f135696a, ")");
    }
}
