package nv;

import kotlin.jvm.internal.Intrinsics;
import nm.u;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f92347a;

    /* renamed from: b, reason: collision with root package name */
    public final u f92348b;

    public d(String key, u value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f92347a = key;
        this.f92348b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f92347a, dVar.f92347a) && Intrinsics.d(this.f92348b, dVar.f92348b);
    }

    public final int hashCode() {
        return this.f92348b.f91366a.hashCode() + (this.f92347a.hashCode() * 31);
    }

    public final String toString() {
        return "PinValidationFailure(key=" + this.f92347a + ", value=" + this.f92348b + ")";
    }
}
