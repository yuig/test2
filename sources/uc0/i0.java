package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f121793a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f121794b;

    public i0(k0 nameTextField, k0 emailTextField) {
        Intrinsics.checkNotNullParameter(nameTextField, "nameTextField");
        Intrinsics.checkNotNullParameter(emailTextField, "emailTextField");
        this.f121793a = nameTextField;
        this.f121794b = emailTextField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f121793a, i0Var.f121793a) && Intrinsics.d(this.f121794b, i0Var.f121794b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121794b.f121802a) + (Integer.hashCode(this.f121793a.f121802a) * 31);
    }

    public final String toString() {
        return "FeedBackPersonalDataDisplayState(nameTextField=" + this.f121793a + ", emailTextField=" + this.f121794b + ")";
    }
}
