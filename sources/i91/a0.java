package i91;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f71795a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f71796b;

    public a0() {
        LinkedHashSet recipients = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f71795a = recipients;
        this.f71796b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f71795a, a0Var.f71795a) && this.f71796b == a0Var.f71796b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71796b) + (this.f71795a.hashCode() * 31);
    }

    public final String toString() {
        return "SendShareState(recipients=" + this.f71795a + ", navigatedToVerticalSearch=" + this.f71796b + ")";
    }
}
