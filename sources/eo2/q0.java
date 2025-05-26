package eo2;

import do2.f2;
import do2.r2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q0 extends f2 implements r2 {
    @Override // do2.r2
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f55787h;
            Intrinsics.f(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f55788i + ((int) ((p() + this.f55790k) - this.f55788i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i13) {
        synchronized (this) {
            Object[] objArr = this.f55787h;
            Intrinsics.f(objArr);
            b(Integer.valueOf(((Number) objArr[((int) ((this.f55788i + ((int) ((p() + this.f55790k) - this.f55788i))) - 1)) & (objArr.length - 1)]).intValue() + i13));
        }
    }
}
