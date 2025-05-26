package y01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f136489a;

    public r0(f30 currentPin) {
        Intrinsics.checkNotNullParameter(currentPin, "currentPin");
        this.f136489a = currentPin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f136489a, ((r0) obj).f136489a);
    }

    public final int hashCode() {
        return this.f136489a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("OnProcessScreenshot(currentPin="), this.f136489a, ")");
    }
}
