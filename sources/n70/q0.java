package n70;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class q0 implements o82.i, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f89669a;

    public q0(p0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f89669a = function;
    }

    @Override // o82.i
    public final /* synthetic */ o82.j a(int i13, l82.i0 i0Var) {
        return (o82.j) this.f89669a.invoke(Integer.valueOf(i13), i0Var);
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return this.f89669a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o82.i) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(this.f89669a, ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f89669a.hashCode();
    }
}
