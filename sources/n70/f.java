package n70;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f89608a;

    public f(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f89608a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f89608a, ((f) obj).f89608a);
    }

    public final int hashCode() {
        return this.f89608a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("OneTapSaveButtonClicked(pin="), this.f89608a, ")");
    }
}
