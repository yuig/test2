package um0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f122766i = new t0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        l82.c0 subResult = (l82.c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new il0.r(subResult, 20));
        createLens.h(new il0.r(subResult, 21));
        List list = subResult.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new e0((tk0.f0) it.next()));
        }
        createLens.b(arrayList);
        return Unit.f80348a;
    }
}
