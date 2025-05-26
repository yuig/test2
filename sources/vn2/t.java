package vn2;

import am2.i1;
import ao2.m0;
import dm2.b1;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final t f126343a = new t();

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        List x13 = functionDescriptor.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
        List<i1> list = x13;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (i1 i1Var : list) {
            Intrinsics.f(i1Var);
            if (fn2.d.a(i1Var) || ((b1) i1Var).f55398j != null) {
                return false;
            }
        }
        return true;
    }

    @Override // vn2.e
    public final String b(am2.x xVar) {
        return m0.Q(this, xVar);
    }

    @Override // vn2.e
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
