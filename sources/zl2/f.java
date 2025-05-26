package zl2;

import am2.d0;
import dm2.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f142121i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 module = (d0) obj;
        Intrinsics.checkNotNullParameter(module, "module");
        List list = (List) l0.B0(((c0) module.H(g.f142124f)).f55403e, c0.f55400h[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof xl2.d) {
                arrayList.add(obj2);
            }
        }
        return (xl2.d) CollectionsKt.S(arrayList);
    }
}
