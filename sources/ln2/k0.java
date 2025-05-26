package ln2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tm2.s0;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f84095i = new k0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.f118454d.size());
    }
}
