package sh0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public t82.a f112913b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f112914c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f112915d;

    /* renamed from: e, reason: collision with root package name */
    public int f112916e;

    /* renamed from: a, reason: collision with root package name */
    public String f112912a = null;

    /* renamed from: f, reason: collision with root package name */
    public List f112917f = q0.f80391a;

    public final Integer a() {
        Object obj;
        List list;
        boolean z13;
        int i13 = this.f112916e;
        boolean z14 = true;
        while (z14 && (i13 = i13 + 1) < this.f112917f.size()) {
            c cVar = (c) this.f112917f.get(i13);
            if (cVar.f112925d.isEmpty()) {
                return Integer.valueOf(i13);
            }
            Set<String> keySet = cVar.f112925d.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
            for (String str : keySet) {
                if (z14) {
                    Intrinsics.f(str);
                    Iterator it = this.f112917f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.d(((c) obj).f112922a, str)) {
                            break;
                        }
                    }
                    c cVar2 = (c) obj;
                    z14 = false;
                    if (cVar2 != null && (list = cVar2.f112924c) != null) {
                        ArrayList<b> arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((b) obj2).f112921d) {
                                arrayList.add(obj2);
                            }
                        }
                        while (true) {
                            z13 = false;
                            for (b bVar : arrayList) {
                                if (!z13) {
                                    List list2 = (List) cVar.f112925d.get(cVar2.f112922a);
                                    if (list2 != null) {
                                        z13 = list2.contains(StringsKt.toIntOrNull(bVar.f112918a));
                                    }
                                }
                            }
                        }
                        z14 = z13;
                    }
                }
            }
            if (z14 && i13 < this.f112917f.size()) {
                return Integer.valueOf(i13);
            }
        }
        return null;
    }

    public final HashMap b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        String bool2;
        Boolean bool3;
        String str8;
        Long l13;
        Long l14;
        HashMap hashMap = new HashMap();
        t82.a aVar = this.f112913b;
        String str9 = "";
        if (aVar == null || (str = aVar.f116755d) == null) {
            str = "";
        }
        hashMap.put("algorithmVersion", str);
        t82.a aVar2 = this.f112913b;
        if (aVar2 == null || (l14 = aVar2.f116754c) == null || (str2 = l14.toString()) == null) {
            str2 = "";
        }
        hashMap.put("creationTimestamp", str2);
        t82.a aVar3 = this.f112913b;
        if (aVar3 == null || (str3 = aVar3.f116757f) == null) {
            str3 = "";
        }
        hashMap.put("experiment", str3);
        t82.a aVar4 = this.f112913b;
        if (aVar4 == null || (str4 = aVar4.f116760i) == null) {
            str4 = "";
        }
        hashMap.put("experimentCell", str4);
        t82.a aVar5 = this.f112913b;
        if (aVar5 == null || (str5 = aVar5.f116758g) == null) {
            str5 = "";
        }
        hashMap.put("experimentGroup", str5);
        t82.a aVar6 = this.f112913b;
        if (aVar6 == null || (l13 = aVar6.f116756e) == null || (str6 = l13.toString()) == null) {
            str6 = "";
        }
        hashMap.put("expirationTimestamp", str6);
        String str10 = this.f112912a;
        if (str10 == null) {
            str10 = "";
        }
        hashMap.put("surveyId", str10);
        t82.a aVar7 = this.f112913b;
        if (aVar7 != null && (str8 = aVar7.f116753b) != null) {
            str9 = str8;
        }
        hashMap.put("surveySegmentId", str9);
        t82.a aVar8 = this.f112913b;
        String str11 = "false";
        if (aVar8 == null || (bool3 = aVar8.f116759h) == null || (str7 = bool3.toString()) == null) {
            str7 = "false";
        }
        hashMap.put("isHoldout", str7);
        t82.a aVar9 = this.f112913b;
        if (aVar9 != null && (bool = aVar9.f116761j) != null && (bool2 = bool.toString()) != null) {
            str11 = bool2;
        }
        hashMap.put("isTestRequest", str11);
        return hashMap;
    }

    public final boolean c() {
        boolean z13;
        boolean z14;
        List list = this.f112917f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((c) it.next()).f112929h == d.UNKNOWN) {
                    z13 = false;
                    break;
                }
            }
        }
        z13 = true;
        List list2 = this.f112917f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((c) obj).f112929h == d.MULTI_SELECT) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((c) it2.next()).f112924c.size() > 5) {
                    z14 = false;
                    break;
                }
            }
        }
        z14 = true;
        return z13 && z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f112912a, ((a) obj).f112912a);
    }

    public final int hashCode() {
        String str = this.f112912a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.k("ExpressSurvey(id=", this.f112912a, ")");
    }
}
