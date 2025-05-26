package nt;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92000a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f92001b;

    public d0(boolean z13, LinkedHashMap answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f92000a = z13;
        this.f92001b = answers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f92000a == d0Var.f92000a && Intrinsics.d(this.f92001b, d0Var.f92001b);
    }

    public final int hashCode() {
        return this.f92001b.hashCode() + (Boolean.hashCode(this.f92000a) * 31);
    }

    public final String toString() {
        return "SubmitButtonClickEvent(hasAcceptedDisclosures=" + this.f92000a + ", answers=" + this.f92001b + ")";
    }
}
