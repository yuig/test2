package b02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f20776a;

    public f(String googleEmail) {
        Intrinsics.checkNotNullParameter(googleEmail, "googleEmail");
        this.f20776a = googleEmail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f20776a, ((f) obj).f20776a);
    }

    public final int hashCode() {
        return this.f20776a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GoToConfirmEmailScreenEvent(googleEmail="), this.f20776a, ")");
    }
}
