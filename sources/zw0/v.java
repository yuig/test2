package zw0;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.l0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final v f142937i = new v(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o12.b pinFeed = (o12.b) obj;
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        List list = pinFeed.f92783a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof f30) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new t((f30) it.next(), 0, null, null, 30));
        }
        return new l0(arrayList2, pinFeed.f92784b);
    }
}
