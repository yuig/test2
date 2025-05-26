package b4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final g f21591a = new g("", null, 6);

    public static final ArrayList a(int i13, int i14, List list) {
        if (i13 > i14) {
            throw new IllegalArgumentException(("start (" + i13 + ") should be less than or equal to end (" + i14 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = list.get(i15);
            e eVar = (e) obj;
            if (c(i13, i14, eVar.f21543b, eVar.f21544c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            e eVar2 = (e) arrayList.get(i16);
            arrayList2.add(new e(Math.max(i13, eVar2.f21543b) - i13, Math.min(i14, eVar2.f21544c) - i13, eVar2.f21542a, eVar2.f21545d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(g gVar, int i13, int i14) {
        List list;
        if (i13 == i14 || (list = gVar.f21572b) == null) {
            return null;
        }
        if (i13 == 0 && i14 >= gVar.f21571a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = list.get(i15);
            e eVar = (e) obj;
            if (c(i13, i14, eVar.f21543b, eVar.f21544c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            e eVar2 = (e) arrayList.get(i16);
            arrayList2.add(new e(eVar2.f21542a, ql2.s.g(eVar2.f21543b, i13, i14) - i13, ql2.s.g(eVar2.f21544c, i13, i14) - i13));
        }
        return arrayList2;
    }

    public static final boolean c(int i13, int i14, int i15, int i16) {
        if (Math.max(i13, i15) < Math.min(i14, i16)) {
            return true;
        }
        if (i13 <= i15 && i16 <= i14) {
            if (i14 != i16) {
                return true;
            }
            if ((i15 == i16) == (i13 == i14)) {
                return true;
            }
        }
        if (i15 <= i13 && i14 <= i16) {
            if (i16 != i14) {
                return true;
            }
            if ((i13 == i14) == (i15 == i16)) {
                return true;
            }
        }
        return false;
    }
}
