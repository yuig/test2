package vl1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f126108a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f126109b;

    public c(i0 primaryButtonText, i0 i0Var) {
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f126108a = primaryButtonText;
        this.f126109b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f126108a, cVar.f126108a) && Intrinsics.d(this.f126109b, cVar.f126109b);
    }

    public final int hashCode() {
        int hashCode = this.f126108a.hashCode() * 31;
        i0 i0Var = this.f126109b;
        return hashCode + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        return "ButtonGroupDisplayState(primaryButtonText=" + this.f126108a + ", secondaryButtonText=" + this.f126109b + ")";
    }
}
