package rg0;

import i32.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f108085a;

    public r(y0 y0Var) {
        this.f108085a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(r.class, obj.getClass())) {
            return false;
        }
        y0 y0Var = ((r) obj).f108085a;
        y0 y0Var2 = this.f108085a;
        return y0Var2 == null ? y0Var == null : y0Var2 == y0Var;
    }
}
