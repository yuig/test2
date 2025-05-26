package un2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pn2.v1;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f122918i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v1 v1Var = (v1) obj;
        Intrinsics.f(v1Var);
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        return Boolean.valueOf(v1Var.w0() instanceof cn2.b);
    }
}
