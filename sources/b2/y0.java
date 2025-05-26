package b2;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import i2.q1;
import k1.i2;
import k1.k2;
import k1.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n4.b f21269j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q1 f21270k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(n4.b bVar, q1 q1Var, int i13) {
        super(1);
        this.f21268i = i13;
        this.f21269j = bVar;
        this.f21270k = q1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f21268i;
        q1 q1Var = this.f21270k;
        n4.b bVar = this.f21269j;
        switch (i13) {
            case 0:
                long j13 = ((n4.g) obj).f89178a;
                q1Var.setValue(new n4.j(lb.l0.d(bVar.R(n4.g.b(j13)), bVar.R(n4.g.a(j13)))));
                return Unit.f80348a;
            default:
                u2.n nVar = u2.n.f120041b;
                m1.e0 e0Var = new m1.e0(1, (Function0) obj);
                y0 y0Var = new y0(bVar, q1Var, 0);
                if (u1.a()) {
                    return u1.a() ? new MagnifierElement(e0Var, null, y0Var, Float.NaN, true, y2.h.f136670b, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? i2.f77889a : k2.f77915a) : nVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
