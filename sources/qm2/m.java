package qm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final m f104432i = new m(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 returnType = it.getReturnType();
        Intrinsics.f(returnType);
        return returnType;
    }
}
