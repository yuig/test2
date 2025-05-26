package sx1;

import androidx.lifecycle.m1;
import ea1.t0;
import ea1.u0;
import kh2.a1;
import kh2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import tx1.d;
import tx1.e;
import tx1.f;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsx1/b;", "Lqx1/c;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: w0, reason: collision with root package name */
    public final m1 f115630w0;

    public b() {
        k a13 = m.a(n.NONE, new ax1.a(2, new t0(this, 25)));
        this.f115630w0 = a1.s(this, k0.f80436a.b(tx1.n.class), new u0(a13, 22), new ca1.m(a13, 23), new ca1.n(this, a13, 23));
    }

    @Override // qx1.c
    public final void g8() {
        j.x2((tx1.n) this.f115630w0.getValue(), d.f119686a);
    }

    @Override // qx1.c
    public final void h8() {
        j.x2((tx1.n) this.f115630w0.getValue(), e.f119687a);
    }

    @Override // qx1.c
    public final void i8(qx1.d tabPosition) {
        Intrinsics.checkNotNullParameter(tabPosition, "tabPosition");
        j.x2((tx1.n) this.f115630w0.getValue(), new f(tabPosition));
    }
}
