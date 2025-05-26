package pc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b1;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f99595a = 0;

    static {
        Intrinsics.checkNotNullParameter("String", "name");
        Intrinsics.checkNotNullParameter("Int", "name");
        Intrinsics.checkNotNullParameter("Float", "name");
        Intrinsics.checkNotNullParameter("Boolean", "name");
        Intrinsics.checkNotNullParameter("ID", "name");
        Intrinsics.checkNotNullParameter("__Schema", "name");
        kotlin.collections.q0 embeddedFields = kotlin.collections.q0.f80391a;
        Intrinsics.checkNotNullParameter("__Schema", "name");
        Intrinsics.checkNotNullParameter(embeddedFields, "keyFields");
        Intrinsics.checkNotNullParameter(embeddedFields, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        Intrinsics.checkNotNullParameter("__Type", "name");
        Intrinsics.checkNotNullParameter("__Type", "name");
        Intrinsics.checkNotNullParameter(embeddedFields, "keyFields");
        Intrinsics.checkNotNullParameter(embeddedFields, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        Intrinsics.checkNotNullParameter("__Field", "name");
        Intrinsics.checkNotNullParameter("__Field", "name");
        Intrinsics.checkNotNullParameter(embeddedFields, "keyFields");
        Intrinsics.checkNotNullParameter(embeddedFields, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        Intrinsics.checkNotNullParameter("__InputValue", "name");
        Intrinsics.checkNotNullParameter("__InputValue", "name");
        Intrinsics.checkNotNullParameter(embeddedFields, "keyFields");
        Intrinsics.checkNotNullParameter(embeddedFields, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        Intrinsics.checkNotNullParameter("__EnumValue", "name");
        Intrinsics.checkNotNullParameter("__EnumValue", "name");
        Intrinsics.checkNotNullParameter(embeddedFields, "keyFields");
        Intrinsics.checkNotNullParameter(embeddedFields, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        Intrinsics.checkNotNullParameter("__Directive", "name");
        Intrinsics.checkNotNullParameter("__Directive", "name");
        Intrinsics.checkNotNullParameter(embeddedFields, "keyFields");
        Intrinsics.checkNotNullParameter(embeddedFields, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
    }

    public static final p a(b7.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new p(cVar);
    }

    public static final r b(b7.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new r(cVar);
    }

    public static final boolean c(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if ((qVar instanceof v0) || (qVar instanceof g0)) {
            return true;
        }
        return qVar instanceof m0;
    }

    public static final Object d(Object obj, ja.c0 variables) {
        Intrinsics.checkNotNullParameter(variables, "variables");
        if (obj == null) {
            return null;
        }
        if (obj instanceof t) {
            return variables.f75176a.get(((t) obj).f99603a);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), d(entry.getValue(), variables));
            }
            return z0.m(CollectionsKt.x0(b1.t(linkedHashMap), new s3.o(4)));
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), variables));
        }
        return arrayList;
    }
}
