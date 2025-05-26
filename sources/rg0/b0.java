package rg0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f107964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(vd0.c json) {
        super(null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        vd0.a k13 = json.k("chat_bubbles");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = k13.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof vd0.c) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new c0((vd0.c) it2.next()));
        }
        this.f107964c = arrayList2;
    }
}
