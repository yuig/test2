package m70;

import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.i0;
import n60.o;
import o82.l0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f86503j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f86504k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f86505l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f86506i = i13;
    }

    public final l0 b(vd0.c cVar) {
        i0 aVar;
        dl1.s e13;
        switch (this.f86506i) {
            case 0:
                vd0.a o13 = o.o(cVar, "modelListWithBookmark", "data", "optJsonArray(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it = o13.iterator();
                while (it.hasNext()) {
                    vd0.c json = (vd0.c) it.next();
                    PinDeserializer R = gh0.b.R();
                    Intrinsics.f(json);
                    R.getClass();
                    Intrinsics.checkNotNullParameter(json, "json");
                    f30 e14 = R.e(json, false, false);
                    if (e14 != null) {
                        arrayList.add(e14);
                    }
                }
                ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new o70.a((f30) it2.next(), false, false));
                }
                return new l0(arrayList2, cVar.o("bookmark", ""));
            case 1:
                vd0.a o14 = o.o(cVar, "modelListWithBookmark", "data", "optJsonArray(...)");
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = o14.iterator();
                while (it3.hasNext()) {
                    vd0.c json2 = (vd0.c) it3.next();
                    PinDeserializer R2 = gh0.b.R();
                    Intrinsics.f(json2);
                    R2.getClass();
                    Intrinsics.checkNotNullParameter(json2, "json");
                    f30 e15 = R2.e(json2, false, false);
                    if (e15 != null) {
                        arrayList3.add(e15);
                    }
                }
                ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new o70.a((f30) it4.next(), false, false));
                }
                return new l0(arrayList4, cVar.o("bookmark", ""));
            default:
                vd0.a o15 = o.o(cVar, "modelListWithBookmark", "data", "optJsonArray(...)");
                vd0.a k13 = cVar.k("one_bar_modules");
                Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = o15.iterator();
                while (it5.hasNext()) {
                    vd0.c json3 = (vd0.c) it5.next();
                    if (json3.e("story_type")) {
                        e13 = gh0.b.N().d(json3);
                    } else {
                        PinDeserializer R3 = gh0.b.R();
                        R3.getClass();
                        Intrinsics.checkNotNullParameter(json3, "json");
                        e13 = R3.e(json3, false, false);
                    }
                    if (e13 != null) {
                        arrayList5.add(e13);
                    }
                }
                List C2 = c0.d.C2(k13);
                if (C2 == null) {
                    C2 = q0.f80391a;
                }
                ArrayList arrayList6 = new ArrayList(g0.q(arrayList5, 10));
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    dl1.s sVar = (dl1.s) it6.next();
                    if (sVar instanceof vh) {
                        aVar = new o70.c((vh) sVar);
                    } else {
                        Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                        aVar = new o70.a((f30) sVar, false, false);
                    }
                    arrayList6.add(aVar);
                }
                ArrayList H0 = CollectionsKt.H0(arrayList6);
                H0.add(0, new o70.b(C2));
                return new l0(CollectionsKt.F0(H0), cVar.o("bookmark", ""));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f86506i) {
        }
        return b((vd0.c) obj);
    }
}
