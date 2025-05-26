package n91;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Map f90069a;

    public t(Map priorRequestCache) {
        Intrinsics.checkNotNullParameter(priorRequestCache, "priorRequestCache");
        this.f90069a = priorRequestCache;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f90069a, ((t) obj).f90069a);
    }

    public final int hashCode() {
        return this.f90069a.hashCode();
    }

    public final String toString() {
        return "ResendVerificationCodeRequest(priorRequestCache=" + this.f90069a + ")";
    }
}
