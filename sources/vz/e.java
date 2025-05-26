package vz;

import com.pinterest.api.model.ta;
import com.pinterest.api.model.ua;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;

/* loaded from: classes3.dex */
public final class e implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f126897a = new e();

    @Override // rz.d
    public final Object b(vd0.c cVar) {
        vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
        ArrayList arrayList = new ArrayList(g0.q(o13, 10));
        Iterator it = o13.iterator();
        while (it.hasNext()) {
            Object e13 = vd0.c.f125622b.e(((vd0.c) it.next()).f125623a, ta.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardVideoTemplate");
            arrayList.add((ta) e13);
        }
        return new ua(arrayList);
    }
}
