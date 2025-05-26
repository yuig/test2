package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f90044a;

    public h(String verificationCode) {
        Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
        this.f90044a = verificationCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f90044a, ((h) obj).f90044a);
    }

    public final int hashCode() {
        return this.f90044a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnVerificationCodeInputChanged(verificationCode="), this.f90044a, ")");
    }
}
