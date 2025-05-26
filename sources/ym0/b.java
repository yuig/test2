package ym0;

import dl1.s;
import java.util.List;

/* loaded from: classes5.dex */
public final class b {
    public static a a(int i13, List list) {
        s sVar;
        s sVar2;
        String str = null;
        if (i13 >= 0 && i13 < list.size() && !qb0.b.o(list) && list.get(i13) != null) {
            s sVar3 = (s) list.get(i13);
            Class<?> cls = sVar3.getClass();
            int size = list.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    i14 = -1;
                    break;
                }
                s sVar4 = (s) list.get(i14);
                if (sVar4 != null && sVar4.getClass().equals(cls)) {
                    break;
                }
                i14++;
            }
            Class<?> cls2 = sVar3.getClass();
            int size2 = list.size() - 1;
            while (true) {
                if (size2 >= 0) {
                    s sVar5 = (s) list.get(size2);
                    if (sVar5 != null && sVar5.getClass().equals(cls2)) {
                        break;
                    }
                    size2--;
                } else {
                    size2 = -1;
                    break;
                }
            }
            if (i14 != -1 && size2 != -1) {
                String f39332b = (i13 <= i14 || (sVar2 = (s) list.get(i13 + (-1))) == null) ? null : sVar2.getF39332b();
                if (i13 < size2 && (sVar = (s) list.get(i13 + 1)) != null) {
                    str = sVar.getF39332b();
                }
                return new a(sVar3.getF39332b(), f39332b, str);
            }
        }
        return null;
    }
}
