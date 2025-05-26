package do2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c2 implements ao2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f55744a;

    /* renamed from: b, reason: collision with root package name */
    public final long f55745b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f55746c;

    /* renamed from: d, reason: collision with root package name */
    public final bl2.c f55747d;

    public c2(f2 f2Var, long j13, Object obj, ao2.o oVar) {
        this.f55744a = f2Var;
        this.f55745b = j13;
        this.f55746c = obj;
        this.f55747d = oVar;
    }

    @Override // ao2.x0
    public final void dispose() {
        f2 f2Var = this.f55744a;
        synchronized (f2Var) {
            if (this.f55745b < f2Var.p()) {
                return;
            }
            Object[] objArr = f2Var.f55787h;
            Intrinsics.f(objArr);
            long j13 = this.f55745b;
            if (objArr[((int) j13) & (objArr.length - 1)] != this) {
                return;
            }
            g2.c(objArr, j13, g2.f55806a);
            f2Var.i();
            Unit unit = Unit.f80348a;
        }
    }
}
