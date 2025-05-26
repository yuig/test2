package n70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class r0 implements o82.p, kotlin.jvm.internal.m {
    public r0() {
        l0 function = l0.f89624k;
        Intrinsics.checkNotNullParameter(function, "function");
    }

    @Override // o82.p
    public final /* synthetic */ String a(int i13, l82.i0 i0Var) {
        return (String) l0.f89624k.invoke(Integer.valueOf(i13), i0Var);
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return l0.f89624k;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o82.p) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(l0.f89624k, ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return l0.f89624k.hashCode();
    }
}
