package pc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: a */
    public final String f99582a;

    /* renamed from: b */
    public final b7.c f99583b;

    /* renamed from: c */
    public final String f99584c;

    /* renamed from: d */
    public final List f99585d;

    /* renamed from: e */
    public final List f99586e;

    /* renamed from: f */
    public final List f99587f;

    public m(String name, b7.c type, String str, List condition, List arguments, List selections) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections, "selections");
        this.f99582a = name;
        this.f99583b = type;
        this.f99584c = str;
        this.f99585d = condition;
        this.f99586e = arguments;
        this.f99587f = selections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    public final String a(ja.c0 variables) {
        Intrinsics.checkNotNullParameter(variables, "variables");
        ?? r03 = this.f99586e;
        Iterable iterable = (Iterable) r03;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((j) it.next()).f99572c) {
                    r03 = new ArrayList();
                    for (Object obj : iterable) {
                        if (!((j) obj).f99572c) {
                            r03.add(obj);
                        }
                    }
                }
            }
        }
        boolean isEmpty = r03.isEmpty();
        String str = this.f99582a;
        if (isEmpty) {
            return str;
        }
        Iterable iterable2 = (Iterable) r03;
        int a13 = y0.a(kotlin.collections.g0.q(iterable2, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Object obj2 : iterable2) {
            linkedHashMap.put(((j) obj2).f99570a, obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((j) entry.getValue()).f99571b);
        }
        Object d2 = o.d(linkedHashMap2, variables);
        try {
            wo2.j jVar = new wo2.j();
            tc.b bVar = new tc.b(jVar, null);
            bs1.c.z2(bVar, d2);
            bVar.close();
            return str + '(' + jVar.M() + ')';
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }

    public final l b() {
        Intrinsics.checkNotNullParameter(this, "compiledField");
        l lVar = new l(this.f99582a, this.f99583b);
        lVar.f99576c = this.f99584c;
        lVar.f99577d = this.f99585d;
        lVar.f99578e = this.f99586e;
        lVar.f99579f = this.f99587f;
        return lVar;
    }

    public final Object c(ja.c0 variables) {
        Object obj;
        Intrinsics.checkNotNullParameter("id", "name");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Iterator it = this.f99586e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((j) obj).f99570a, "id")) {
                break;
            }
        }
        j jVar = (j) obj;
        return o.d(jVar != null ? jVar.f99571b : null, variables);
    }
}
