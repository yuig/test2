package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16963a = new ArrayList();

    public static void b(ArrayList arrayList, int i13, int[] iArr, int i14) {
        if (i14 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (true) {
                if (i16 >= i14) {
                    iArr[i14] = i15;
                    b(arrayList, i13, iArr, i14 + 1);
                    break;
                } else if (i15 == iArr[i16]) {
                    break;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void a(l lVar) {
        this.f16963a.add(lVar);
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f16963a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        b(arrayList2, size2, new int[size2], 0);
        l[] lVarArr = new l[list.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            boolean z13 = true;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (iArr[i13] < list.size()) {
                    l lVar = (l) arrayList.get(i13);
                    l lVar2 = (l) list.get(iArr[i13]);
                    lVar.getClass();
                    z13 &= lVar2.f16902b.getId() <= lVar.f16902b.getId() && lVar2.f16901a == lVar.f16901a;
                    if (!z13) {
                        break;
                    }
                    lVarArr[iArr[i13]] = (l) arrayList.get(i13);
                }
            }
            if (z13) {
                return Arrays.asList(lVarArr);
            }
        }
        return null;
    }
}
