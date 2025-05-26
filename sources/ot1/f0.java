package ot1;

import java.util.ArrayList;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f97569a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f97570b;

    public f0(long j13, ArrayList sliceGroupIds) {
        Intrinsics.checkNotNullParameter(sliceGroupIds, "sliceGroupIds");
        this.f97569a = j13;
        this.f97570b = sliceGroupIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f97569a == f0Var.f97569a && Intrinsics.d(this.f97570b, f0Var.f97570b);
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return this.f97570b.hashCode() + (Long.hashCode(this.f97569a) * 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return "HeightBasedSlices(picSizeInMapUnits=" + c3.s0(this.f97569a) + ", sliceGroupIds=" + this.f97570b + ")";
    }
}
