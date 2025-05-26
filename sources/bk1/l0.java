package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23254a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f23255b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23256c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23257d;

    public l0(int i13, f30 f30Var, long j13, boolean z13) {
        this.f23254a = i13;
        this.f23255b = f30Var;
        this.f23256c = j13;
        this.f23257d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f23254a == l0Var.f23254a && Intrinsics.d(this.f23255b, l0Var.f23255b) && this.f23256c == l0Var.f23256c && this.f23257d == l0Var.f23257d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f23254a) * 31;
        f30 f30Var = this.f23255b;
        return Boolean.hashCode(this.f23257d) + a.a.c(this.f23256c, (hashCode + (f30Var == null ? 0 : f30Var.hashCode())) * 31, 31);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23256c;
    }

    public final f30 j() {
        return this.f23255b;
    }

    public final int k() {
        return this.f23254a;
    }

    public final boolean l() {
        return this.f23257d;
    }

    public final String toString() {
        return "OnPinChipsTap(pressedIndex=" + this.f23254a + ", pressedChipPin=" + this.f23255b + ", clickThroughStartTimestamp=" + this.f23256c + ", isParentPinPromoted=" + this.f23257d + ")";
    }
}
