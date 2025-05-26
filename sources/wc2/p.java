package wc2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.c0;
import ni1.b0;
import x91.g0;

/* loaded from: classes4.dex */
public final class p extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final p f129146i = new p(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        c0 subResult = (c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new g0(subResult, 17));
        createLens.h(new g0(subResult, 18));
        List list = subResult.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new m((b0) it.next()));
        }
        createLens.b(arrayList);
        return Unit.f80348a;
    }
}
