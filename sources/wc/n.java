package wc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.g0;
import pc.m0;
import pc.o;
import pc.q;

/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final n f129097a = new n();

    @Override // wc.d
    public final c r(Map obj, tb.e context) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(context, "context");
        q L = ((pc.m) context.f116963a).f99583b.L();
        int i13 = o.f99595a;
        Intrinsics.checkNotNullParameter(L, "<this>");
        Collection collection = L instanceof g0 ? ((g0) L).f99558h : L instanceof m0 ? ((m0) L).f99588h : q0.f80391a;
        if (!(!collection.isEmpty())) {
            return null;
        }
        String typename = String.valueOf(obj.get("__typename"));
        Collection collection2 = collection;
        ArrayList values = new ArrayList(kotlin.collections.g0.q(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            values.add(String.valueOf(obj.get((String) it.next())));
        }
        Intrinsics.checkNotNullParameter(typename, "typename");
        Intrinsics.checkNotNullParameter(values, "values");
        StringBuilder D = ep.b.D(typename, ":");
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            D.append((String) it2.next());
        }
        String sb3 = D.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return new c(sb3);
    }
}
