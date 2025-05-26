package vn2;

import am2.b1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final y f126350i = new y(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ym2.b f13;
        pn2.b0 returnType;
        am2.x $receiver = (am2.x) obj;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        dm2.d A = $receiver.A();
        if (A == null) {
            A = $receiver.D();
        }
        List list = z.f126351g;
        if (A != null) {
            pn2.b0 returnType2 = $receiver.getReturnType();
            if (returnType2 != null) {
                pn2.b0 type = A.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (kotlin.jvm.internal.j.w(returnType2, type)) {
                    return null;
                }
            }
            jn2.f o03 = A.o0();
            Intrinsics.checkNotNullExpressionValue(o03, "getValue(...)");
            if (o03 instanceof jn2.d) {
                am2.g gVar = ((jn2.d) o03).f77128a;
                if (gVar.Z() && (f13 = fn2.d.f(gVar)) != null) {
                    am2.j d03 = l0.d0(fn2.d.j(gVar), f13);
                    b1 b1Var = d03 instanceof b1 ? (b1) d03 : null;
                    if (b1Var != null && (returnType = $receiver.getReturnType()) != null && kotlin.jvm.internal.j.w(returnType, ((nn2.u) b1Var).u0())) {
                        return null;
                    }
                }
            }
        }
        return "receiver must be a supertype of the return type";
    }
}
