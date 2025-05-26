package n91;

import a.cb;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class b0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f90031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90032b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.i0 f90033c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90034d;

    public b0(Map priorRequestCache, String newEmailAddress, h32.i0 pinalyticsContext, String submittedVerificationCode) {
        Intrinsics.checkNotNullParameter(priorRequestCache, "priorRequestCache");
        Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(submittedVerificationCode, "submittedVerificationCode");
        this.f90031a = priorRequestCache;
        this.f90032b = newEmailAddress;
        this.f90033c = pinalyticsContext;
        this.f90034d = submittedVerificationCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f90031a, b0Var.f90031a) && Intrinsics.d(this.f90032b, b0Var.f90032b) && Intrinsics.d(this.f90033c, b0Var.f90033c) && Intrinsics.d(this.f90034d, b0Var.f90034d);
    }

    public final int hashCode() {
        return this.f90034d.hashCode() + ((this.f90033c.hashCode() + cb.d(this.f90032b, this.f90031a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "EmailOTPConfirmationVMState(priorRequestCache=" + this.f90031a + ", newEmailAddress=" + this.f90032b + ", pinalyticsContext=" + this.f90033c + ", submittedVerificationCode=" + this.f90034d + ")";
    }
}
