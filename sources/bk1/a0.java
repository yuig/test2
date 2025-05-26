package bk1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23151a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23152b;

    public a0(List list, boolean z13) {
        this.f23151a = z13;
        this.f23152b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f23151a == a0Var.f23151a && Intrinsics.d(this.f23152b, a0Var.f23152b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f23151a) * 31;
        List list = this.f23152b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final List j() {
        return this.f23152b;
    }

    public final String toString() {
        return "OnPinChipEvent(isParentPinPromoted=" + this.f23151a + ", pinChips=" + this.f23152b + ")";
    }
}
