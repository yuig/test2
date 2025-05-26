package v72;

import kotlin.jvm.internal.Intrinsics;
import ni1.b0;

/* loaded from: classes4.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f124455a;

    public v(b0 pinRepSER) {
        Intrinsics.checkNotNullParameter(pinRepSER, "pinRepSER");
        this.f124455a = pinRepSER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f124455a, ((v) obj).f124455a);
    }

    public final int hashCode() {
        return this.f124455a.hashCode();
    }

    public final String toString() {
        return "WrappedPinRepSER(pinRepSER=" + this.f124455a + ")";
    }
}
