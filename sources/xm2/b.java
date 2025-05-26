package xm2;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f135396a = CollectionsKt.Z(f0.j('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62);

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f135397b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List j13 = f0.j("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int u13 = ue.c.u(0, j13.size() - 1, 2);
        if (u13 >= 0) {
            int i13 = 0;
            while (true) {
                StringBuilder sb3 = new StringBuilder();
                String str = f135396a;
                sb3.append(str);
                sb3.append('/');
                sb3.append((String) j13.get(i13));
                int i14 = i13 + 1;
                linkedHashMap.put(sb3.toString(), j13.get(i14));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append('/');
                linkedHashMap.put(a.a.p(sb4, (String) j13.get(i13), "Array"), "[" + ((String) j13.get(i14)));
                if (i13 == u13) {
                    break;
                } else {
                    i13 += 2;
                }
            }
        }
        linkedHashMap.put(f135396a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : f0.j("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : f0.j("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(a.a.j("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i15 = 0; i15 < 23; i15++) {
            String d2 = a.a.d("Function", i15);
            StringBuilder sb5 = new StringBuilder();
            String str4 = f135396a;
            sb5.append(str4);
            sb5.append("/jvm/functions/Function");
            sb5.append(i15);
            a(d2, sb5.toString(), linkedHashMap);
            a("reflect/KFunction" + i15, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : f0.j("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(a.a.C(str5, ".Companion"), a.a.q(new StringBuilder(), f135396a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        f135397b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f135396a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f135397b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + z.m(classId, '.', '$') + ';';
    }
}
