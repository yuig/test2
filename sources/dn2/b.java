package dn2;

import am2.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes2.dex */
public class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f55619b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List value, Function1 computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.f55619b = computeType;
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        am2.j b13;
        Intrinsics.checkNotNullParameter(module, "module");
        b0 b0Var = (b0) this.f55619b.invoke(module);
        if (!xl2.l.z(b0Var) && (((b13 = b0Var.w0().b()) == null || xl2.l.s(b13) == null) && !xl2.l.D(b0Var, xl2.q.V.i()) && !xl2.l.D(b0Var, xl2.q.W.i()) && !xl2.l.D(b0Var, xl2.q.X.i()))) {
            xl2.l.D(b0Var, xl2.q.Y.i());
        }
        return b0Var;
    }
}
