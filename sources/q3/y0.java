package q3;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y0 extends u2.p implements s3.a0 {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f102276n;

    /* renamed from: o, reason: collision with root package name */
    public long f102277o = lb.l0.d(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public y0(Function1 function1) {
        this.f102276n = function1;
    }

    @Override // u2.p
    public final boolean A0() {
        return true;
    }

    @Override // s3.a0
    public final void n(long j13) {
        if (n4.j.a(this.f102277o, j13)) {
            return;
        }
        this.f102276n.invoke(new n4.j(j13));
        this.f102277o = j13;
    }
}
