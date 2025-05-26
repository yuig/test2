package g90;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final i f64528i = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        in1.b it = (in1.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        hn1.n nVar = it.f72831d;
        int i13 = eo1.c.space_0;
        return in1.b.e(it, null, false, new hn1.n(nVar.f69658a, i13, i13, nVar.f69661d), 7);
    }
}
