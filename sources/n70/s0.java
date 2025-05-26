package n70;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o82.m3;

/* loaded from: classes5.dex */
public final /* synthetic */ class s0 implements m3, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f89674a;

    public s0(p0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f89674a = function;
    }

    @Override // o82.m3
    public final /* synthetic */ int a(int i13, l82.i0 i0Var) {
        return ((Number) this.f89674a.invoke(Integer.valueOf(i13), i0Var)).intValue();
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return this.f89674a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m3) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(this.f89674a, ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f89674a.hashCode();
    }
}
