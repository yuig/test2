package im2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f72749i = new k0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(lb.l0.C0(fn2.d.l(it)));
    }
}
