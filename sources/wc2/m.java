package wc2;

import kotlin.jvm.internal.Intrinsics;
import ni1.b0;

/* loaded from: classes4.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f129142a;

    public m(b0 pinRepSER) {
        Intrinsics.checkNotNullParameter(pinRepSER, "pinRepSER");
        this.f129142a = pinRepSER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f129142a, ((m) obj).f129142a);
    }

    public final int hashCode() {
        return this.f129142a.hashCode();
    }

    public final String toString() {
        return "WrappedPinRepSER(pinRepSER=" + this.f129142a + ")";
    }
}
