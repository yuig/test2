package y01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f136491a;

    public s(f30 currentPin) {
        Intrinsics.checkNotNullParameter(currentPin, "currentPin");
        this.f136491a = currentPin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f136491a, ((s) obj).f136491a);
    }

    public final int hashCode() {
        return this.f136491a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("ShowScreenshotUpsell(currentPin="), this.f136491a, ")");
    }
}
