package am2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e1 f15550i = new e1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m it = (m) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!(it instanceof l));
    }
}
