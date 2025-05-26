package gz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f66357a;

    public t(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66357a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f66357a, ((t) obj).f66357a);
    }

    public final int hashCode() {
        return this.f66357a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Text(value="), this.f66357a, ")");
    }
}
