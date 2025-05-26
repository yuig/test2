package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class bh0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bh0 f2879a = new bh0();

    public bh0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.s jsonElement = (nm.s) obj;
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Iterable iterable = (Iterable) oh0.f9286j.invoke(jsonElement);
        ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return arrayList;
    }
}
