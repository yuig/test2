package xm2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.s0;
import kotlin.collections.t0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import q5.x0;
import wm2.k;

/* loaded from: classes2.dex */
public final class h implements vm2.f {

    /* renamed from: d, reason: collision with root package name */
    public static final List f135406d;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f135407a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f135408b;

    /* renamed from: c, reason: collision with root package name */
    public final List f135409c;

    static {
        String Z = CollectionsKt.Z(f0.j('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62);
        List j13 = f0.j(a.a.C(Z, "/Any"), a.a.C(Z, "/Nothing"), a.a.C(Z, "/Unit"), a.a.C(Z, "/Throwable"), a.a.C(Z, "/Number"), a.a.C(Z, "/Byte"), a.a.C(Z, "/Double"), a.a.C(Z, "/Float"), a.a.C(Z, "/Int"), a.a.C(Z, "/Long"), a.a.C(Z, "/Short"), a.a.C(Z, "/Boolean"), a.a.C(Z, "/Char"), a.a.C(Z, "/CharSequence"), a.a.C(Z, "/String"), a.a.C(Z, "/Comparable"), a.a.C(Z, "/Enum"), a.a.C(Z, "/Array"), a.a.C(Z, "/ByteArray"), a.a.C(Z, "/DoubleArray"), a.a.C(Z, "/FloatArray"), a.a.C(Z, "/IntArray"), a.a.C(Z, "/LongArray"), a.a.C(Z, "/ShortArray"), a.a.C(Z, "/BooleanArray"), a.a.C(Z, "/CharArray"), a.a.C(Z, "/Cloneable"), a.a.C(Z, "/Annotation"), a.a.C(Z, "/collections/Iterable"), a.a.C(Z, "/collections/MutableIterable"), a.a.C(Z, "/collections/Collection"), a.a.C(Z, "/collections/MutableCollection"), a.a.C(Z, "/collections/List"), a.a.C(Z, "/collections/MutableList"), a.a.C(Z, "/collections/Set"), a.a.C(Z, "/collections/MutableSet"), a.a.C(Z, "/collections/Map"), a.a.C(Z, "/collections/MutableMap"), a.a.C(Z, "/collections/Map.Entry"), a.a.C(Z, "/collections/MutableMap.MutableEntry"), a.a.C(Z, "/collections/Iterator"), a.a.C(Z, "/collections/MutableIterator"), a.a.C(Z, "/collections/ListIterator"), a.a.C(Z, "/collections/MutableListIterator"));
        f135406d = j13;
        t0 M0 = CollectionsKt.M0(j13);
        int a13 = y0.a(g0.q(M0, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        Iterator it = M0.iterator();
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) x0Var.next();
            linkedHashMap.put((String) indexedValue.f80350b, Integer.valueOf(indexedValue.f80349a));
        }
    }

    public h(k types, String[] strings) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List list = types.f130410c;
        Set localNameIndices = list.isEmpty() ? s0.f80394a : CollectionsKt.J0(list);
        List<wm2.j> list2 = types.f130409b;
        Intrinsics.checkNotNullExpressionValue(list2, "getRecordList(...)");
        Intrinsics.checkNotNullParameter(list2, "<this>");
        ArrayList records = new ArrayList();
        records.ensureCapacity(list2.size());
        for (wm2.j jVar : list2) {
            int i13 = jVar.f130396c;
            for (int i14 = 0; i14 < i13; i14++) {
                records.add(jVar);
            }
        }
        records.trimToSize();
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f135407a = strings;
        this.f135408b = localNameIndices;
        this.f135409c = records;
    }

    @Override // vm2.f
    public final boolean a(int i13) {
        return this.f135408b.contains(Integer.valueOf(i13));
    }

    @Override // vm2.f
    public final String b(int i13) {
        return c(i13);
    }

    @Override // vm2.f
    public final String c(int i13) {
        String str;
        wm2.j jVar = (wm2.j) this.f135409c.get(i13);
        int i14 = jVar.f130395b;
        if ((i14 & 4) == 4) {
            Object obj = jVar.f130398e;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                zm2.g gVar = (zm2.g) obj;
                String t13 = gVar.t();
                if (gVar.j()) {
                    jVar.f130398e = t13;
                }
                str = t13;
            }
        } else {
            if ((i14 & 2) == 2) {
                List list = f135406d;
                int size = list.size();
                int i15 = jVar.f130397d;
                if (i15 >= 0 && i15 < size) {
                    str = (String) list.get(i15);
                }
            }
            str = this.f135407a[i13];
        }
        if (jVar.f130400g.size() >= 2) {
            List list2 = jVar.f130400g;
            Intrinsics.f(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            Intrinsics.f(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                Intrinsics.f(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
            }
        }
        if (jVar.f130402i.size() >= 2) {
            List list3 = jVar.f130402i;
            Intrinsics.f(list3);
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            Intrinsics.f(str);
            str = z.m(str, (char) num3.intValue(), (char) num4.intValue());
        }
        wm2.i iVar = jVar.f130399f;
        if (iVar == null) {
            iVar = wm2.i.NONE;
        }
        int i16 = i.f135410a[iVar.ordinal()];
        if (i16 == 2) {
            Intrinsics.f(str);
            str = z.m(str, '$', '.');
        } else if (i16 == 3) {
            if (str.length() >= 2) {
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            Intrinsics.f(str);
            str = z.m(str, '$', '.');
        }
        Intrinsics.f(str);
        return str;
    }
}
