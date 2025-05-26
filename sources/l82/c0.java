package l82;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.o f82212a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f82213b;

    /* renamed from: c, reason: collision with root package name */
    public final List f82214c;

    public c0(u50.o displayState, i0 vmState, List sideEffectRequests) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        Intrinsics.checkNotNullParameter(sideEffectRequests, "sideEffectRequests");
        this.f82212a = displayState;
        this.f82213b = vmState;
        this.f82214c = sideEffectRequests;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f82212a, c0Var.f82212a) && Intrinsics.d(this.f82213b, c0Var.f82213b) && Intrinsics.d(this.f82214c, c0Var.f82214c);
    }

    public final int hashCode() {
        return this.f82214c.hashCode() + ((this.f82213b.hashCode() + (this.f82212a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Result(displayState=");
        sb3.append(this.f82212a);
        sb3.append(", vmState=");
        sb3.append(this.f82213b);
        sb3.append(", sideEffectRequests=");
        return a.c.j(sb3, this.f82214c, ")");
    }

    public c0(u50.o oVar, i0 i0Var) {
        this(oVar, i0Var, q0.f80391a);
    }
}
