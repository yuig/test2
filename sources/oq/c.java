package oq;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f96974a;

    public c(f30 flashlightPin) {
        Intrinsics.checkNotNullParameter(flashlightPin, "flashlightPin");
        this.f96974a = flashlightPin;
    }

    public final f30 a() {
        return this.f96974a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f96974a, ((c) obj).f96974a);
    }

    public final int hashCode() {
        return this.f96974a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("FlashlightSearchButtonEvent(flashlightPin="), this.f96974a, ")");
    }
}
