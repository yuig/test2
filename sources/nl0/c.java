package nl0;

import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ml0.t0;
import o82.l0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f91242i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicFeed modelListWithBookmark = (DynamicFeed) obj;
        Intrinsics.checkNotNullParameter(modelListWithBookmark, "modelListWithBookmark");
        List a13 = modelListWithBookmark.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getItems(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : a13) {
            if (obj2 instanceof f30) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!b40.F0((f30) next)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new t0((f30) it2.next(), false));
        }
        return new l0(arrayList3, modelListWithBookmark.f35556d);
    }
}
