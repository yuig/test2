package n91;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Map f90070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90071b;

    public u(String confirmationCode, Map priorRequestCache) {
        Intrinsics.checkNotNullParameter(priorRequestCache, "priorRequestCache");
        Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
        this.f90070a = priorRequestCache;
        this.f90071b = confirmationCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f90070a, uVar.f90070a) && Intrinsics.d(this.f90071b, uVar.f90071b);
    }

    public final int hashCode() {
        return this.f90071b.hashCode() + (this.f90070a.hashCode() * 31);
    }

    public final String toString() {
        return "SubmitVerificationCodeRequest(priorRequestCache=" + this.f90070a + ", confirmationCode=" + this.f90071b + ")";
    }
}
