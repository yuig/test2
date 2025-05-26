package sb1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f112242a;

    public d(i0 errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f112242a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f112242a, ((d) obj).f112242a);
    }

    public final int hashCode() {
        return this.f112242a.hashCode();
    }

    public final String toString() {
        return "LoadUserFailure(errorMessage=" + this.f112242a + ")";
    }
}
