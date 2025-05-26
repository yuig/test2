package im2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.collections.i1;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final re2.h f72765a = new re2.h(14, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f72766b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f72767c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f72768d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f72769e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f72770f;

    /* renamed from: g, reason: collision with root package name */
    public static final Set f72771g;

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f72772h;

    /* renamed from: i, reason: collision with root package name */
    public static final Map f72773i;

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f72774j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayList f72775k;

    /* renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f72776l;

    static {
        Set<String> f13 = h1.f("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(f13, 10));
        for (String str : f13) {
            re2.h hVar = f72765a;
            String desc = gn2.c.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(re2.h.e(hVar, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f72766b = arrayList;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n0) it.next()).f72758e);
        }
        f72767c = arrayList2;
        ArrayList arrayList3 = f72766b;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((n0) it2.next()).f72755b.b());
        }
        re2.h hVar2 = f72765a;
        String j13 = rm2.t.j("Collection");
        gn2.c cVar = gn2.c.BOOLEAN;
        String desc2 = cVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        n0 e13 = re2.h.e(hVar2, j13, "contains", "Ljava/lang/Object;", desc2);
        q0 q0Var = q0.FALSE;
        Pair pair = new Pair(e13, q0Var);
        String j14 = rm2.t.j("Collection");
        String desc3 = cVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        Pair pair2 = new Pair(re2.h.e(hVar2, j14, "remove", "Ljava/lang/Object;", desc3), q0Var);
        String j15 = rm2.t.j("Map");
        String desc4 = cVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        Pair pair3 = new Pair(re2.h.e(hVar2, j15, "containsKey", "Ljava/lang/Object;", desc4), q0Var);
        String j16 = rm2.t.j("Map");
        String desc5 = cVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        Pair pair4 = new Pair(re2.h.e(hVar2, j16, "containsValue", "Ljava/lang/Object;", desc5), q0Var);
        String j17 = rm2.t.j("Map");
        String desc6 = cVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Pair pair5 = new Pair(re2.h.e(hVar2, j17, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), q0Var);
        Pair pair6 = new Pair(re2.h.e(hVar2, rm2.t.j("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), q0.MAP_GET_OR_DEFAULT);
        n0 e14 = re2.h.e(hVar2, rm2.t.j("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        q0 q0Var2 = q0.NULL;
        Pair pair7 = new Pair(e14, q0Var2);
        Pair pair8 = new Pair(re2.h.e(hVar2, rm2.t.j("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), q0Var2);
        String j18 = rm2.t.j("List");
        gn2.c cVar2 = gn2.c.INT;
        String desc7 = cVar2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        n0 e15 = re2.h.e(hVar2, j18, "indexOf", "Ljava/lang/Object;", desc7);
        q0 q0Var3 = q0.INDEX;
        Pair pair9 = new Pair(e15, q0Var3);
        String j19 = rm2.t.j("List");
        String desc8 = cVar2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map g13 = z0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(re2.h.e(hVar2, j19, "lastIndexOf", "Ljava/lang/Object;", desc8), q0Var3));
        f72768d = g13;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(g13.size()));
        for (Map.Entry entry : g13.entrySet()) {
            linkedHashMap.put(((n0) entry.getKey()).f72758e, entry.getValue());
        }
        f72769e = linkedHashMap;
        LinkedHashSet i13 = i1.i(f72768d.keySet(), f72766b);
        ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(i13, 10));
        Iterator it3 = i13.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((n0) it3.next()).f72755b);
        }
        f72770f = CollectionsKt.J0(arrayList5);
        ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(i13, 10));
        Iterator it4 = i13.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((n0) it4.next()).f72758e);
        }
        f72771g = CollectionsKt.J0(arrayList6);
        re2.h hVar3 = f72765a;
        gn2.c cVar3 = gn2.c.INT;
        String desc9 = cVar3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        n0 e16 = re2.h.e(hVar3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f72772h = e16;
        String i14 = rm2.t.i("Number");
        String desc10 = gn2.c.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        Pair pair10 = new Pair(re2.h.e(hVar3, i14, "toByte", "", desc10), ym2.g.e("byteValue"));
        String i15 = rm2.t.i("Number");
        String desc11 = gn2.c.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        Pair pair11 = new Pair(re2.h.e(hVar3, i15, "toShort", "", desc11), ym2.g.e("shortValue"));
        String i16 = rm2.t.i("Number");
        String desc12 = cVar3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        Pair pair12 = new Pair(re2.h.e(hVar3, i16, "toInt", "", desc12), ym2.g.e("intValue"));
        String i17 = rm2.t.i("Number");
        String desc13 = gn2.c.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        Pair pair13 = new Pair(re2.h.e(hVar3, i17, "toLong", "", desc13), ym2.g.e("longValue"));
        String i18 = rm2.t.i("Number");
        String desc14 = gn2.c.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        Pair pair14 = new Pair(re2.h.e(hVar3, i18, "toFloat", "", desc14), ym2.g.e("floatValue"));
        String i19 = rm2.t.i("Number");
        String desc15 = gn2.c.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        Pair pair15 = new Pair(re2.h.e(hVar3, i19, "toDouble", "", desc15), ym2.g.e("doubleValue"));
        Pair pair16 = new Pair(e16, ym2.g.e("remove"));
        String i23 = rm2.t.i("CharSequence");
        String desc16 = cVar3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = gn2.c.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map g14 = z0.g(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(re2.h.e(hVar3, i23, "get", desc16, desc17), ym2.g.e("charAt")));
        f72773i = g14;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(g14.size()));
        for (Map.Entry entry2 : g14.entrySet()) {
            linkedHashMap2.put(((n0) entry2.getKey()).f72758e, entry2.getValue());
        }
        f72774j = linkedHashMap2;
        Map map = f72773i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            n0 n0Var = (n0) entry3.getKey();
            ym2.g name = (ym2.g) entry3.getValue();
            String internalName = n0Var.f72754a;
            Intrinsics.checkNotNullParameter(internalName, "classInternalName");
            Intrinsics.checkNotNullParameter(name, "name");
            String parameters = n0Var.f72756c;
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String returnType = n0Var.f72757d;
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(internalName, "classInternalName");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            String jvmDescriptor = name + '(' + parameters + ')' + returnType;
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(internalName + '.' + jvmDescriptor);
        }
        Set keySet = f72773i.keySet();
        ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(keySet, 10));
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((n0) it5.next()).f72755b);
        }
        f72775k = arrayList7;
        Set<Map.Entry> entrySet = f72773i.entrySet();
        ArrayList arrayList8 = new ArrayList(kotlin.collections.g0.q(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList8.add(new Pair(((n0) entry4.getKey()).f72755b, entry4.getValue()));
        }
        int a13 = y0.a(kotlin.collections.g0.q(arrayList8, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a13);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((ym2.g) pair17.f80347b, (ym2.g) pair17.f80346a);
        }
        f72776l = linkedHashMap3;
    }
}
