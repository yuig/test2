package nt;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92034a;

    /* renamed from: b, reason: collision with root package name */
    public final List f92035b;

    public f0(List elementsSaveCache, boolean z13) {
        Intrinsics.checkNotNullParameter(elementsSaveCache, "elementsSaveCache");
        this.f92034a = z13;
        this.f92035b = elementsSaveCache;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f92034a == f0Var.f92034a && Intrinsics.d(this.f92035b, f0Var.f92035b);
    }

    public final int hashCode() {
        return this.f92035b.hashCode() + (Boolean.hashCode(this.f92034a) * 31);
    }

    public final String toString() {
        return "SubmitSuccessEvent(hasSendSubmitSuccessEvent=" + this.f92034a + ", elementsSaveCache=" + this.f92035b + ")";
    }

    public f0() {
        this(kotlin.collections.q0.f80391a, false);
    }
}
