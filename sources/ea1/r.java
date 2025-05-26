package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58124a;

    public r(String errorString) {
        Intrinsics.checkNotNullParameter(errorString, "errorString");
        this.f58124a = errorString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f58124a, ((r) obj).f58124a);
    }

    public final int hashCode() {
        return this.f58124a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ErrorMessage(errorString="), this.f58124a, ")");
    }
}
