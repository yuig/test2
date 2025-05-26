package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f93607a;

    /* renamed from: b, reason: collision with root package name */
    public final List f93608b;

    public h0(int i13, List sideEffectRequests) {
        Intrinsics.checkNotNullParameter(sideEffectRequests, "sideEffectRequests");
        this.f93607a = i13;
        this.f93608b = sideEffectRequests;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f93607a == h0Var.f93607a && Intrinsics.d(this.f93608b, h0Var.f93608b);
    }

    public final int hashCode() {
        return this.f93608b.hashCode() + (Integer.hashCode(this.f93607a) * 31);
    }

    public final String toString() {
        return "MultiSectionSideEffectRequest(sectionIndex=" + this.f93607a + ", sideEffectRequests=" + this.f93608b + ")";
    }
}
